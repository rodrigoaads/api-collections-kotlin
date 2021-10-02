package me.rodrigo

fun main() {
    val nomes = Array (3) {""}

    nomes[0] = "Maria"
    nomes[1] = "ZZ"
    nomes[2] = "José"

    nomes.forEach {
        println(it)
    }

    println("-----------")

    nomes.sort()
    for (nome in nomes){
        println(nome)
    }

    println("-----------")

    nomes.forEachIndexed { index, nome ->
        nomes[index] = "$nome $index"
    }

    for (nome in nomes){
        println(nome)
    }

    println("-----------")

    val nomes2 = arrayOf("Maria", "ZZ", "José")
    nomes2.sort()
    for (nomee in nomes2){
        println(nomee)
    }
}