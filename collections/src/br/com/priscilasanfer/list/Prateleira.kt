package br.com.priscilasanfer.list

class Prateleira(
    val genero: String,
    val livros: List<Livro>,
) {

    fun organizaPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizaPorAnoPuplicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}