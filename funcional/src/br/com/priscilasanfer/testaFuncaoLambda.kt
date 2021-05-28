package br.com.priscilasanfer

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }

    println(minhaFuncaoLambda)
    println(minhaFuncaoLambda(15, 10))
}