package br.com.priscilasanfer

import java.util.*

fun main() {
//    val endereco = Endereco(logradouro = "Rua Um", numero = 3258)
//    val enderecoEmMaisculo = "${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
//    println(enderecoEmMaisculo)

    Endereco(logradouro = "Rua Um", numero = 3258)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
        }
        .let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { endereco ->
            endereco.complemento.isNotEmpty()
        }.let(::println)


}

