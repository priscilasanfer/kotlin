fun testaCondicao() {
    var saldo = 10.0
    when {
        saldo > 0.0 -> println("conta.Conta é positiva")
        saldo == 0.0 -> println("conta.Conta é neutra")
        else -> println("conta.Conta Negativa")
    }
}