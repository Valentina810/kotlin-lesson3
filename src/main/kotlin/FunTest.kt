package org.example

fun main() {
    println("Hello")

    val initList = listOf(1, 5, 10, 22, 3)
    println(initList.mySum())
    println(initList.lastElem())
}

// есть массив целых чисел,
// написать функцию-расширение, которая вернет его сумму
fun List<Int>.mySum() = reduce { accumulator, number ->
    accumulator + number
}

//написать свойство-расширение, которое отдает последний элемент list
fun List<Int>.lastElem(): Int = get(size - 1)