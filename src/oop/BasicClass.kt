package oop

//we put constructors parameters here next to the class name
class BasicClass(name: String, age: Int) {
    //we can access them in Instance Variables OR inside init{} BUT not inside functions
    var birthYear = 2016 - age
    //for this we need to declare them outside like in JAVA because of SCOPE AND initialize the values in constructor INIT
    var name: String
    var age: Int
    //called only once when object is created CONSTRUCTOR, you can initialize some initial properties
    init {
        this.name = name
        this.age = age
        println("init name: ${name} and age: ${this.age}")
    }

    fun getYearOfBirth(): Int{
        //now you can access 'age' inside a function
        return 2016 - age//or this.age since "age" belongs to the instance
    }
}

//write less boiler plate by initializing variables in the class parenthesis as Instance Variables
class BasicClassShort(val name: String, var age: Int) {
    //we can access them in Instance Variables OR inside init{} BUT not inside functions
    var birthYear = 2016 - age
    init { println("init name: ${name} and age: ${this.age}") }
    fun getYearOfBirth(): Int{
        return 2016 - age//or this.age since "age" belongs to the instance
    }
}

fun main(args: Array<String>) {
    val person = BasicClass("mike", 26)
    println(person.getYearOfBirth())
    val person1 = BasicClassShort("mike", 26)
    println(person1.getYearOfBirth())
}