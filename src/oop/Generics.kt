package oop

//Rather than having one Class and extending it multiple times in other subclasses
//e.g: class Stack{methods};
// class StackOfShoes: Stack();
// class StackOfCars: Stack();
// class StackOfClothes: Stack();
// We can make the super class Stack GENERIC and use ONLY the super class by passing a subclass type and use only that type for that instance created
// class Stack<E> {methods}
// DRY = don't repeat yourself
class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()//return the vararg items array as a list, so we can add elements to it

    fun push(element: E) {
        elements.add(element)
        val list = arrayListOf("a", "Hello", "C")//arrayListOf(vararg items: String) -> same thing
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

//generic function, you just need to add <T> next to fun
fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack<T>(*elements) //spread elements: so in [vararg elements: T] elements will be an array so you need to spread it
}

fun main(args: Array<String>) {
    val stack = Stack(3, 5, 2, 8)
    stack.push(11)

    val stack2 = stackOf("Hi", "Hey", "Hello")
    for (i in 1..3) {
        println(stack2.pop())
    }

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}