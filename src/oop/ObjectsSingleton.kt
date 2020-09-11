package oop

//Object Declaration -> Singleton: you can only have ONE INSTANCE of it
//it can have properties, methods, etc,
//You cannot create an object from it, since this is already an object.
//Because a Kotlin object can't have any constructor, you can't pass any argument to it
//However, you can have a init method for some initialization
object Cache {
    val someproperty = "any"
    fun anyFunctionInAnObject(): String {return "anything"}
    init {
        println("init complete")
    }
}