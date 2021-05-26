package br.com.priscilasanfer.list

class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>,
) {

    fun organizaPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun organizaPorAnoPuplicacao(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}