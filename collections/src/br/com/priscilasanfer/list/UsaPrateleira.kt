package br.com.priscilasanfer.list

fun main() {

    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizaPorAutor()
    val porAnoPuplicacao = prateleira.organizaPorAnoPuplicacao()


    porAutor.imprimeComMarcadores()
    porAnoPuplicacao.imprimeComMarcadores()
}
/*
A nossa prateleira tem a lista de livros do tipo “MutableList”, então toda vez que ordenamos os nossos livros,
estamos ordenando os livros da prateleira, é a mesma lista de livros.

Então usamos um “sortBy”, ele ordenou por autor, usou um “sortBy”, ordenou por ano de publicação.
Toda vez que rodamos essas funções, estamos reordenando a mesma lista de livros, que é essa “listaDeLivros” aqui.

Então mesmo que atribuamos para uma variável diferente, por “autor” e por “anoPublicacao”, essas duas variáveis estão
apontando para a mesma lista de livros, que essa “listaDeLivros” aqui - que é a que criamos no começo do código.

Essa “listaDeLivros”é uma “MutableList” também, como vocês podem ver aqui.
A “MutableList”é, como o próprio nome diz, mutável. Ela muda.
Quando usamos a função “sortBy” é isso que estamos fazendo, estamos alterando a lista internamente.

E quando chamamos aqui primeiro “prateleira.organizarPorAutor()” e depois “prateleira.organizarPorAnoPublicacao()”,
quando essa executamos essa função aqui, “prateleira.organizarPorAnoPublicacao()”, estamos reordenando essa lista
por “prateleira.organizarPoAnoPublicacao()”.

O que acaba afetando essa aqui também, porque essas duas variáveis apontam para o mesmo objeto.
No final, estamos reordenando o mesmo objeto e temos duas variáveis apontando para o mesmo objeto.

O que acontece aqui, quando imprimimos tudo de uma vez, no final? Estamos reimprimindo a mesma lista.
Como a última função que chamamos foi “organizarPorAnoPublicacao”, as duas listas, que são as duas variáveis,
apontam para a mesma lista - que está organizada por “AnoPublicacao”.


pra resolver basta usar o List ao inves do MultableList
 */