package oop
//Data classes are classes whose main purpose is to hold data, they require "data" and all its parameters to have "val" or "var"
//Data classes cannot be abstract, open, sealed or inner;
//They automatically implement the toString(),equals()/hashCode(),copy(newValueForSomeProperty="value") method for you, so no need to implement it
//You can compare 2 data classes by using c1.equals(c2)

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double)


fun main(args: Array<String>) {
    val book = Book("Super Book", "John Doe", 2017, 99.99)
    val book2 = Book("Super Book", "John Doe", 2017, 99.99)
    val dataBook = DataBook("Super Book", "John Doe", 2017, 99.99)
    val dataBook2 = DataBook("Super Book", "John Doe", 2017, 99.99)
    //you can copy the same data from another data class but change some of its properties by passing named arguments
    val dataBook3 = dataBook.copy(price = 89.99)
    //you can destructure the object easily
    val (title, author, year, price) = dataBook
    //create set of Data Classes, it will remove duplicates as it is a set
    val set = hashSetOf(dataBook, dataBook2, dataBook3)//return set with 2 objects, since dataBook2.equals(dataBook)
    val set2 = hashSetOf(book, book2)//return set with 2 objects, even though the hold the same data, they are normal objects so different.
    println(set)
    println(set2)

    println(book)
    println(dataBook)
    println(dataBook3)
    println(title)
    println(author)

    println(book.equals(book2))//false -> they have the same values, but since they are normal objects, they are different
    println(dataBook.equals(dataBook2))//true -> they are equal since they are both data classes
}