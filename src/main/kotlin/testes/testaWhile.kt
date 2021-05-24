fun testaWhile() {
    var i = 0
    while (i < 5) {
        val titular: String = "Priscila $i"
        val numeroCOnta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroCOnta")
        println("Saldo da conta.Conta: $saldo")

        println("----------------------------------")
        i++
    }
}