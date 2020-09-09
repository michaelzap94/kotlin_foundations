package loops

fun main(args: Array<String>) {
    //for loops -> in
    for (i in 1..10) {//0 until 10
        print(i)//each number 1 to 10
    }

    //You can control the increment with step:
    for (x in 0 until 10 step 2) println(x) // Prints 0, 2, 4, 6, 8
    for (x in 10 downTo 0 step 2) println(x) // Prints 10, 8, 6, 4, 2, 0

    val numbers = (0..9).toList()

    var someList = listOf("first", "second", "third")
    for (i in someList) {
        println(i)//each element
    }

    for ((index, value) in someList.withIndex()) {//someList.withIndex() -> return value and index
        if(index % 2 == 0) continue
        println("Element at $index is $value")
    }

    //while is the same as java
    //A plain continue or break works the same way as in Python

    //However, you can also label your loops and reference the label in the continue or break statement in order to indicate which loop you want to affect.
    //A label is an identifier followed by @, e.g. outer@ (possibly followed by a space). For example, to generate primes:

    outer@ for (n in 2..10) {
        for (d in 2 until n) {
            if (n % d == 0) continue@outer
        }
        println("$n is prime")
    }
    //Note that there must be no space between continue/break and @.

}