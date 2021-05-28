package br.com.priscilasanfer.testes

import br.com.priscilasanfer.modelo.Autenticavel
import br.com.priscilasanfer.modelo.SistemaInterno


fun testaHOF() {
    somar(1, 2, resultado = { valor ->
        println(valor)
    })
    somaReceiver(1, 2, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()

    sistema.entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
    sistema.entraReceiver(autenticavel, 123, autenticado = {
        pagamento()
    })

}

fun somar(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    val total = a + b
    total.resultado()
}