package br.com.priscilasanfer.collection

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Alex")
    banco.salva("Copo")
    println(nomesSalvos)
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes{
    val nomes: Collection<String>get()= Companion.dados.toList()

    fun salva(nome: String){
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: List<String> = listOf(
        "Meg",
        "Malu",
        "Rafael",
        "Regina"
    )

    println(nomes)

    println("Tem Nome Rafael? ${nomes.contains("Rafael")}")
    println("tAMANHo da Lista: ${nomes.size}")
}