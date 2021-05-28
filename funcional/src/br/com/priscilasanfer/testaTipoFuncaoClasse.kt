package br.com.priscilasanfer

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse)
    println(minhaFuncaoClasse(5, 6)) // Lazy - so invoca quando é chamada
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}