import conta.ContaPoupanca

fun testaValorReferencia() {
    val contaMeg = ContaPoupanca("Meg", 3)

    var contaMalu = contaMeg
    contaMalu.titular = "Malu"

    println(contaMalu)
    println(contaMeg)
    println("Titula conta.Conta Meg: ${contaMeg.titular}")
    println("Titula conta.Conta Malu: ${contaMalu.titular}")
}