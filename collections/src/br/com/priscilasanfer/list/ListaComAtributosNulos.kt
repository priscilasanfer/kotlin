package br.com.priscilasanfer.list

fun main(){
    listaDeLivros
        .groupBy { it.editora ?: "Edita Desconhecida"}
        .forEach{(editora: String?, livro: List<Livro>) ->
            println("${editora}: ${livro.joinToString { it.titulo }}")
        }
}