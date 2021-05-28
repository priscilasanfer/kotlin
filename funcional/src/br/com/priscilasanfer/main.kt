package br.com.priscilasanfer

fun main() {
    val minhaFuncao = ::teste
    println(minhaFuncao)
    println(minhaFuncao())

    println()
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses)
    println(minhaFuncaoClasses()) // Lazy - so invoca quando é chamada
}

fun teste() {
    println("Executa teste")
}


class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke")
    }

}