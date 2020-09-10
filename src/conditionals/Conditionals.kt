package conditionals

fun main(args: Array<String>) {
    var age: Int = 1;
    //IF, ELSE IF, ELSE
    if (age < 18) {
        println("you cannot register");
    } else if (age >= 18) {
        println("you can register");
    } else  {
        println("unexpected");
    }

    //WHEN
    when(age) {
        1 -> println("first")
        2 -> {
            println("second")
        }
        3 -> println("third")
        else -> {
            //default:
            println("default")
        }
    }

    //Conditionals as Expressions:

    // the result stored here, is always the LAST expression stored in each of this blocks,
    // the block that matches the condition first, will be used.
    //ONLY ONE BLOCK CAN -> BE ASSIGNED and/or BE EXECUTED
    var position:String = when(++age) {
        1 -> "first"
        2,3 -> {//2 or 3
            "this is not returned"
            var anything = if (true) "anything" else "anything else"
            var anything2 = if (false) {
                "something"
            } else {
                "something else"
            }
            println(anything2)
            "second"//IN Kotlin -> this is an expression
            anything//IN Kotlin -> this is an expression too, the last element is returned in this block
        }
        3 * 2 -> "six"
        //range:
        in 1..10 -> { println("between 1 and 10"); "final"}//; semi-colon is used to separate expressions on the same line
        !in 11..13 -> "not in 1 to 13"
        is Int -> {println("is int"); "is int" }
        else -> {
            //default:
            "default"
        }
    }
    println(position)//anything

    //NULLABLES:======================================================================
    class PersonalInfo(val email: String?)
    class Client(val personalInfo: PersonalInfo?)
    fun sendMessageToClient( client: Client?, message: String?) {
        //if client is not null -> if client.personalInfo is not null -> get the email from client.personalInfo.email
        val email = client?.personalInfo?.email
        if (email != null && message != null) {
            //do something
        }
    }


}