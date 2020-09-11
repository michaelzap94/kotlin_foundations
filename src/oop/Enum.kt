package oop

//Enums when you need to use a FINATE set of values, IT GIVES you type safety as it creates DISTINCT values
//avoid typing mistakes for values in properties -> "blue" is not the same as "BLUE"
//string comparison is expensive,instead, compare constants using enum

enum class Color{
    RED, GREEN, BLUE
}