package br.com.priscilasanfer.bytebank.testes

fun testaValorCopiaTipoPrimitivo() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println(numeroX)
    println(numeroY)
}