package me.rodrigo

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k, Valor: $v") }

    val map2 = mapOf(
        "Rodrigo" to 3000.0,
        "Fulano" to 2000.0)

    map2.forEach { (k, v) -> println("Chave: $k, Valor: $v") }
}