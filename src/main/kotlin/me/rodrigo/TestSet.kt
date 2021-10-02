package me.rodrigo

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultado = funcionarios1.union(funcionarios2)

    resultado.forEach {
        println(it)
    }

    println("-----------------------")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultadoSubtracao = funcionarios3.subtract(funcionarios2)

    resultadoSubtracao.forEach {
        println(it)
    }

    println("-----------------------")

    val resultadoIntersect = funcionarios3.intersect(funcionarios2)

    resultadoIntersect.forEach {
        println(it)
    }
}