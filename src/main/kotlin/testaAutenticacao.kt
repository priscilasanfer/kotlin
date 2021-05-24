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

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 5322)
}