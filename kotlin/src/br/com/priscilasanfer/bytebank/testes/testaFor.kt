package br.com.priscilasanfer.bytebank.testes

fun testaFor() {
    for (i in 1..5) {
        val titular: String = "Priscila $i"
        val numeroCOnta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroCOnta")
        println("Saldo da Conta: $saldo")

        println("----------------------------------")
    }
}