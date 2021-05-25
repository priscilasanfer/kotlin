package br.com.priscilasanfer.bytebank.testes

import br.com.priscilasanfer.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco()

    val objeto: Any = Any()

    imprime(objeto)

    imprime(1)
    imprime(1.0)
    val teste: Any = imprime(endereco)
    println(teste)
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}
