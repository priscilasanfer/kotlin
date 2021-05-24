import br.com.priscilasanfer.bytebank.modelo.Endereco
import conta.modelo.Cliente
import conta.modelo.ContaCorrente
import conta.modelo.ContaPoupanca
import conta.modelo.ContaSalario

fun testaContasDiferentes() {
    val priscila = Cliente(
        nome = "Priscila",
        cpf = "123.658.985-45",
        senha = 1,
        endereco = Endereco(
            logradouro = "Rua x",
            numero = 17,
            bairro = "Vila Adrade",
            cidade = "São Paulo",
            estado = "São Paulo",
            cep = "1235-090",
            complemento = ""
        )
    )
    val contaCorrente = ContaCorrente(
        titular = priscila,
        numero = 1,
    )

    println("--------------------------------------------")
    println("Titular: ${contaCorrente.titular}")
    println("nome do titular: ${contaCorrente.titular.nome}")
    println("cpf do titular: ${contaCorrente.titular.cpf}")
    println("endereço do titular: ${contaCorrente.titular.endereco.logradouro}")

    val meg = Cliente(nome = "Meg", cpf = "456.789.444-45", senha = 2)
    val contaPoupanca = ContaPoupanca(
        titular = meg,
        numero = 2
    )

    val gui = Cliente(nome = "Gui", cpf = "478.777.777-77", senha = 3)
    val contaSalario = ContaSalario(
        titular = gui,
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)
    println("--------------------------------------------")
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta salario: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)
    println("--------------------------------------------")
    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")
    println("Saldo conta salario após saque: ${contaSalario.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)
    println("--------------------------------------------")
    println("Saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência : ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)
    println("--------------------------------------------")
    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")

    contaCorrente.transfere(100.0, contaSalario)
    println("--------------------------------------------")
    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

    contaPoupanca.transfere(200.0, contaSalario)
    println("--------------------------------------------")
    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

//    contaSalario.transfere(200.0, contaCorrente)
//    contaSalario.transfere(200.0, contaPoupanca)
}