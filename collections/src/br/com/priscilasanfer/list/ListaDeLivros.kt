package br.com.priscilasanfer.list

fun main() {
    val livro1 = Livro(
        titulo = "Livro 1",
        autor = "Autor livro 1",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Livro 2",
        autor = "Autor livro 2",
        anoPublicacao = 1942,
        editora = "Editora livro 2"
    )

    val livro3 = Livro(
        titulo = "Livro 3",
        autor = "Autor livro 3",
        anoPublicacao = 1942,
    )

    val livro4 = Livro(
        titulo = "Livro 4",
        autor = "Autor livro 4",
        anoPublicacao = 1942,
        editora = "Editora livro 4"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Livro 5",
            autor = "Autor livro 5",
            anoPublicacao = 1850,
            editora = "Editora livro 5"
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()


    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("João") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}