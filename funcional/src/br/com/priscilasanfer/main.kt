package br.com.priscilasanfer

import br.com.priscilasanfer.modelo.Autenticavel
import br.com.priscilasanfer.modelo.Endereco
import br.com.priscilasanfer.modelo.SistemaInterno
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

    somar(1, 2, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234) {
        println("Realizar pagamento")
    }
}

fun somar(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}

