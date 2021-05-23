fun main() {
    println("Bem vindo ao Bytebanck")
    val malu = Funcionario(
        nome = "Malu",
        cpf = "23455655643",
        salario = 1000.00,
        tipo = 0
    )

    println("Nome: ${malu.nome}")
    println("CPF: ${malu.cpf}")
    println("Salario: ${malu.salario}")

    println("Calcula bonificação: ${malu.bonificacao()}")
}



