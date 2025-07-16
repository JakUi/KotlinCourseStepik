package org.example.moduleFiveFunctionalProgramming

fun <T, R> transform(parameters: List<T>, operation: (T) -> R) : List<R> {
    val result = mutableListOf<R>()
    for (parameter in parameters) {
        result.add(operation(parameter))
    }
    return result
}
