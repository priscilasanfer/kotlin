package conta.testes

import conta.modelo.Cliente
import java.lang.String as StringJava
import conta.novomodelo.Cliente as NovoCliente

fun testaApelidoNoImport(){

    val palavra: kotlin.String = ""
    val palavraJava : StringJava = StringJava("")

    val cliente = Cliente(nome = "Lulu", cpf = "452.632.658-45", senha = 1)
    val novoCliente = NovoCliente()
}