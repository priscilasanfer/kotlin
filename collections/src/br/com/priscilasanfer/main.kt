package br.com.priscilasanfer

fun main(){

    val banco = BancoDeNomes()
    banco.salva("Copo")
    println(banco.nomes)

    println(BancoDeNomes().nomes)


}

class BancoDeNomes{
    val nomes: Collection<String>get()= Companion.dados

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
