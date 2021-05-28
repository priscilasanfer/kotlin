package br.com.priscilasanfer

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
    testaFuncaoLambda()
    testaFuncaoAnonima()
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }

    println(minhaFuncaoLambda)
    println(minhaFuncaoLambda(15, 10))
}

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }

    println(minhaFuncaoAnonima)
    println(minhaFuncaoAnonima(10, 20))
    /*
    A função anônima nós vamos considerar em situações nas quais nós queremos deixar bem claro o que nós queremos
    colocar como parâmetro. Como estamos vendo aqui, o que queremos colocar como retorno e também qual o escopo de
    execução do código. Por quê? Porque aqui no escopo de execução de código nós podemos executar o que quisermos,
    mas também somos obrigados a falar quem retorna o quê.
    Ele não vai retornar a última expressão, assim como nós vemos na expressão lambda.
     */
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