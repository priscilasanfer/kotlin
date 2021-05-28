package br.com.priscilasanfer

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
    testaFuncaoLambda()
    testaFuncaoAnonima()
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = {
        println("Executa função lambda")
    }

    println(minhaFuncaoLambda)
    println(minhaFuncaoLambda())
}

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa função anonima")
    }

    println(minhaFuncaoAnonima)
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse)
    println(minhaFuncaoClasse()) // Lazy - so invoca quando é chamada
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::teste
    println(minhaFuncao)
    println(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}


class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke")
    }

}