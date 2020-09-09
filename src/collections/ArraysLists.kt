package collections

fun main(args: Array<String>) {

    //Use Arrays if you know in advance how many elements you need, and this will not change
    val arr1 = arrayOf("first", "immutable", 14, false)//multiple types array
    val numbers = intArrayOf(1,2,3,4,5)//array of Ints
    numbers[0] = 14
    println(numbers[0])//14
    println("any"[0])//a

    //concatenate Arrays
    val numbers2 = intArrayOf(1,2,3,4,5)//array of Ints
    val allArrays = numbers + numbers2// you can concat arrays using "+" if they are of the same type
    println(allArrays.size)//10


    //contains
    arr1.contains("first")
    arr1.isEmpty()
    //============================================================================================
    //this list is immutable so no element can change.
    val list = listOf("first", "immutable")

    //============================================================================================
    //Use ArrayList if you want to ADD or DELETE elements
    val arrayList = arrayListOf("first", "second", "third","mutable")
    //return a boolean if success
    val didItChang1 = arrayList.add("new element")
    val didItChange2 = arrayList.add(3, "new one")
    val wasItRemoved1 = arrayList.remove("first")
    val wasItRemoved2 = arrayList.removeAt(0)
    println(arrayList)//[third, new one, mutable, new element]

    val subList = arrayList.subList(1,2)//start, end but not including-> same as JS slice
    println(subList)
}

