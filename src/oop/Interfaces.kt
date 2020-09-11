package oop

//they behave just like they do in JAVA
//Define a contract with methods and properties that must be implemented by the class that decides to sign this contract(implement it)

interface Drivable{
    val type: String
    fun drive()
}

interface Buildable{
    val timeRequired: Int
    fun build()
}

class Car(override val type: String, override val timeRequired: Int = 10) : Drivable, Buildable {
    override fun drive() {
        println("driving $type")
    }
    override fun build() {
        println("building $type in $timeRequired seconds")
    }
}

class MotorBike(timeRequired: Int = 5) : Buildable {
    override val timeRequired = timeRequired//alternative syntax to the Car override fields
    override fun build() {
        println("building  bike in $timeRequired seconds")
    }
}

fun main(args: Array<String>) {
    //type Car so it can access everything Car has access to
    val car: Car = Car("ferrari")
    car.timeRequired
    car.type
    car.drive()
    car.build()

    //type Drivable so it can ONLY access the methods that Car has in common with Drivable
    val car2: Drivable = Car("ferrari")
    car2.type
    car2.drive()

}
