package br.com.priscilasanfer.bytebank.testes

import br.com.priscilasanfer.bytebank.modelo.*

fun testaAutenticacaoTiposDiferentes() {
    //analista implementando Autenticavel
    val presidente = Presidente(
        nome = "Alex",
        cpf = "",
        salario = 1000.0,
        senha = 1000
    )

    //gerente herda de FuncionarioAdmin que implementa Autenticavel
    val gerente = Gerente(
        nome = "Fran",
        cpf = "",
        salario = 2000.0,
        senha = 2000
    )

    val cliente = Cliente(
        nome = "Fran",
        cpf = "",
        senha = 3000
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(presidente, 1000)
    sistemaInterno.entra(gerente, 2000)
    sistemaInterno.entra(cliente, 3000)
}