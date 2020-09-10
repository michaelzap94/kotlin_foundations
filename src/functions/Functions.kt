package functions

import java.util.*

//Functions are declared with the fun keyword.
//For the parameters, you must declare not only their names, but also their types, and you must declare the type of the value the function is intending to return.
//If a function never needs to return anything, the function should have the return type Unit
//Unit is both a singleton object (which None in Python also happens to be) and the type of that object,
//and it represents "this function never returns any information" (rather than "this function sometimes returns information, but this time, it didn't", which is what null does)

//Signature system is the same as JAVA, you cannot use the return type for overloading differentiation

fun _printDate() {
    var newDate:Date = Date()
    println(newDate)
}

//defaults----------------------------------------------------------------
fun returnLength(text: String, myDefault: Int = 5): Int {
    return text.length + myDefault
}
//If a default parameter precedes a parameter with no default value, the default value can only be used by calling the function with named arguments:
fun foo(bar: Int = 0, baz: Int) { /*...*/ }
//foo(baz = 1) // The default value bar = 0 is used,     foo(1) is not allowed
//------------------------------------------------------------------------
//optionals, name can be null
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}

//However, you can also make a oneliner function, where the body simply is the expression whose result is to be returned.
//In that case, the return type is inferred, and an equals sign is used to indicate that it's a oneliner:
fun square(number: Int) = number * number

//-------------------------------------------------------------------------

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
//    for (i in 0 until list.size - 1) {
//        result.add(list[list.size - 1 - i])
//    }
    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}

//-------------------------------------------------------------------------
//Nothing type
//Nothing type can be used as a return type for a function that always throws an exception.
// When you call such a function, the compiler uses the information that it throws an exception.
fun failWithWrongAge(age: Int?):Nothing    {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int? = 0) {//it can be null, but if not provided it will be 0
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}
//-------------------------------------------------------------------------

fun main(args: Array<String>) {
    _printDate()
    println(returnLength("any"))//3
    printHello(null)
    println(reverse((1..10).toList<Int>()))
    checkAge()
    checkAge(null)
}