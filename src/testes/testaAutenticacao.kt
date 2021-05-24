import conta.modelo.Cliente
import conta.modelo.Diretor
import conta.modelo.Gerente
import conta.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Malu",
        cpf = "123.456.789.12",
        salario = 3500.00,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Meg",
        cpf = "234.674.235.43",
        salario = 3500.00,
        senha = 5322,
        plr = 200.00
    )

    val cliente = Cliente(
        nome = "Papagaio",
        cpf = "854.658.965-45",
        senha = 5236
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 5322)
    sistema.entra(cliente, 5236)
}