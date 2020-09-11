package oop//once you publish your project you should make it unique worldwide -> com.uniquedomain.oop
//IMPORTS -> packages names must be UNIQUE
//you can import any TOP LEVEL function
//import functions.checkAge
//you can import any function inside an object(singleton), this is something you can't do with Classes
//this is possible in objects and not classes because a class needs to be INSTANTIATED to init properties and methods
//import oop.Cache.anyFunctionInAnObject//this is in file ObjectsSingleton.kt
//you can import enums too so you don't need to do Color.Red, etc and just use RED


//Enums when you need to use a FINATE set of values, IT GIVES you type safety as it creates DISTINCT values
//avoid typing mistakes for values in properties -> "blue" is not the same as "BLUE"
//string comparison is expensive,instead, compare constants using enum

//enum class Color{ RED, GREEN, BLUE }//SIMPLE, used in most cases

enum class Color (val rgb: Int) {//you need to add () and pass the values inside it using val or var
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);//Color.RED -> return 0xFF0000
    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0//    // 0x01CAFE and 0xFF0000 == 0x010000 IF not all 0, then it contains red, it will be 0 for blue and green
    }
}



fun main(args: Array<String>) {
    //Hexadecimals: -> start with "0x"
    // 0..9 -> 2137 (decimal)
    // 0..9,A,B,C,D,E,F -> 0x10
    println(0x10) // 16 -> 1*16^1 + 0*16^0 -> 16
    println(0x1F) // 31 -> 1*16^1 + 15*16^0 -> 16 + 15*1 = 31
    println(0xFF) // 255
    println(0xCAFEBABE)

    println(0x000000)  // black
    println(0xFFFFFF)  // white
    println(0xFF0000)  // red
    println(0x00FF00)  // green
    println(0x0000FF)  // blue
    println(0x000088)  // dark blue

    // binary numbers -> start with "0b"
    // 0..1 -> 0b1010 = 10 -> 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 -> 8*1+4*0+2*1+1*0
    println(0b1010)
    println(0b00001010)
    println(0b11111111 == 0xFF)  // = 255
    println(0b11111111_00000000_00000000 == 0xFF0000)

    // Bitwise
    // AND only if both are 1 then 1
    // 1 and 1 == 1
    // 1 and 0 == 0
    // 0 and 1 == 0
    // 0 and 0 == 0
    //     1101 -> 13
    // and 1011 -> 11
    // ----------
    //   = 1001 -> 9
    println(0b1101 and 0b1011)// -> 1001 = 9

    // 0x01CAFE and 0xFF0000 == 0x010000
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

    //OR if any is true(1) then true(1)
    //    1101
    // or 1000
    //  = 1101
    println(0b1101 or 0b1000)  // 13

    //XOR only ONE is allowed to be true(1), if both are true(1) then 0
    //     1101
    // xor 1000
    //   = 0101
    println(0b1101 xor 0b1000)  // 5

    // inverse -> inverts each and every bit
    // 0b10011.inv() == 0b...01100
    // 0x0000001F == 0b0000.manyzeros..0011111
    println(0b10011.inv() and 0x0000001F)  // 0b01100//use and and a hex to use a bit mask to cast it to the first 5 digits
}