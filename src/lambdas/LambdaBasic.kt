package lambdas

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any() { number -> number % 2 == 0 }

// Parameter types in a lambda are optional if they can be inferred:
//collection.any { it % 2 == 0 }