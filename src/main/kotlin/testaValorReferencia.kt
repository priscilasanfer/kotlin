fun testaValorReferencia() {
    val contaMeg = Conta("Meg", 3)

    var contaMalu = contaMeg
    contaMalu.titular = "Malu"

    println(contaMalu)
    println(contaMeg)
    println("Titula Conta Meg: ${contaMeg.titular}")
    println("Titula Conta Malu: ${contaMalu.titular}")
}