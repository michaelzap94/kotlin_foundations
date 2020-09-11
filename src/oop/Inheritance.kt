package oop

//If a superclass you have to make class "open" OR "abstract", and its parameters "open" if they should be overridable
//You also need to be explicit about methods and properties you want to make overridable, also marked with "open".
//The open keyword means “open for extension“:
//The open annotation on a class is the opposite of Java's final: it allows others to inherit from this class.
//By default, all classes in Kotlin are final

//"abstract" REQURIRES methods and properties TO BE OVERRIDEN, while "open" is optional, it just allows overriding
abstract class PersonSuperClassAbstract(open val name: String, open var age: Int) {

    abstract fun speak()

    open fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age
}

open class PersonSuperClass(open val name: String, open var age: Int) {

    open fun speak(){println("Super class can speak")}

    open fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age
}

interface PersonInterface{
    fun speak(){println("Interface can speak")}
}


open class Student(override val name: String, override var age: Int, val studentId: Long = 0): PersonSuperClass(name, age), PersonInterface {

    fun isIntelligent() = true

    override fun speak() {
        //super.speak() NORMAL BUT, since we inherit a Super Class and an Interface AND both have a method with the same name and signature, you need to specify, which method you want to call
        super<PersonInterface>.speak()
        super<PersonSuperClass>.speak()
        println("Hi there, I'm a student! and I am ${super.getYearOfBirth()} same as ${this.getYearOfBirth()}")
    }

    override final fun greet(name: String) {
        println("My custom greeting: $name")
    }

}

class Employee(override val name: String, override var age: Int): PersonSuperClass(name, age) {


    override fun speak() {
        println("Hi I'm an employee")
    }

    fun receivePayment() {
        println("Received payment.")
    }

}

class StudentChild(override val name: String, override var age: Int): Student(name, age) {
    //we can still override speak() since, Student extends from PersonSuperClass, where speak() is open
    override fun speak() {
        println("Hi I'm an employee")
    }
    //since this function was made final in the Student object, it cannot be Inherited again by its children
//    override fun greet(name: String) {
//        println("My custom greeting: $name")
//    }
}

fun main(args: Array<String>) {
    val student = Student("John", 25, 3647284)
    student.speak()

    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()

    employee.receivePayment()
    employee.speak()
    employee.greet("mike")
}