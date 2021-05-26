package br.com.priscilasanfer.array

fun operacoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 60)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media: Double = idades.average()
    println("Média: $media")

    val todosMaioresDeIdade = idades.all { it >= 18 }
    println("Todos sao maiores de idade? $todosMaioresDeIdade")

    val existeMaiorIdade = idades.any { it >= 18 }
    println("Existe alguem maior de idade? $existeMaiorIdade")

    val maiores = idades.filter { it >= 18 }
    println("Quem sao os que sao maiores de 18: $maiores")

    val busca = idades.find { it == 18 }
    println("Busca valor: $busca")


}