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

enum class Color{
    RED, GREEN, BLUE
}