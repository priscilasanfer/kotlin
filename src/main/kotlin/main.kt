fun main() {
    println("Bem vindo ao Bytebanck")

    val contaCorrente = ContaCorrente(
        titular = "Pri",
        numero = 1
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Meg",
        numero = 2
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.00, contaPoupanca)
    println("Saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência : ${contaPoupanca.saldo}")
}





