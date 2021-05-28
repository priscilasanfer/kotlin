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
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse)
    println(minhaFuncaoClasse(5, 6)) // Lazy - so invoca quando é chamada
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao)
    println(minhaFuncao(2, 2))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}