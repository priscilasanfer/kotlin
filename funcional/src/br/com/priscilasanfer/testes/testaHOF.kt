package br.com.priscilasanfer.testes

import br.com.priscilasanfer.modelo.Autenticavel
import br.com.priscilasanfer.modelo.SistemaInterno


fun testaHOF() {
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
