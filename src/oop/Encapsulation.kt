package oop

class GettersAndSetters {

    //----------------------------------------
    //"field" is a keyword that can only be used by built-in get() and set() methods and they must be underneath the variable
    private var age:Int = 0
    get() = field
    set(value) {
        if(value >= 0) {
            field = value
        }
    }
    //----------------------------------------
    //val cannot have setters
}

open class Animal {
    //same as java
    private var age: Int = 0
    protected var name = "Sam"
    //restricted to the Module -> Basics-> all the packages in this whole project
    internal val isDangerous = true

    public fun isOld(): Boolean {
        return age > 12
    }
}

class Vertebrate : Animal() {
    fun introduceYourself() {
        println(this.name)//possible since it was marked as protected, so it is restricted to the package
        //println(this.age)//not possible since it was marked as private, so it is restricted to the class
        println(this.isDangerous)//possible since "internal" so it is accessible to the whole Project/Module
    }
}

fun main(args: Array<String>) {
    val animal = Animal()

}
