package me.rodrigo

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 5
    values[4] = 10

    /*for(valor in values){
        println(valor)
    }*/

    values.forEach {
        println(it)
    }

    values.sort()
    for(valor in values){
        println(valor)
    }
}