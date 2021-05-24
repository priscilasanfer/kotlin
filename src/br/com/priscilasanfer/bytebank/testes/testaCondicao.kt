fun testaCondicao() {
    var saldo = 10.0
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta Negativa")
    }
}