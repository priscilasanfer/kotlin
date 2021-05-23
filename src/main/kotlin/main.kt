fun main() {
    println("Bem vindo ao Bytebanck")
    val malu = Funcionario(
        nome = "Malu",
        cpf = "23455655643",
        salario = 1000.00,
    )

    println("Nome: ${malu.nome}")
    println("CPF: ${malu.cpf}")
    println("Salario: ${malu.salario}")

    println("Calcula bonificação: ${malu.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }
}



