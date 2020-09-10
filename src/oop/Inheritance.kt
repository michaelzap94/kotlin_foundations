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

    open fun speak(){println("I can speak")}

    open fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age
}

class Student(override val name: String, override var age: Int, val studentId: Long): PersonSuperClass(name, age) {

    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, I'm a student! and I am ${super.getYearOfBirth()} same as ${this.getYearOfBirth()}")
    }

    override fun greet(name: String) {
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