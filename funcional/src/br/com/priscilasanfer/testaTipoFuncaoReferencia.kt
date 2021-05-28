package br.com.priscilasanfer

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao)
    println(minhaFuncao(2, 2))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}