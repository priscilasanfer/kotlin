package br.com.priscilasanfer.array

fun range() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    println()
    val numerosPares = 2..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()
    val numerosImpares = 1.until(100) step 2
    for (numeroImpar in numerosImpares) {
        print("$numeroImpar ")
    }

    println()
    val numerosParesReversis = 100 downTo 0 step 2
    numerosParesReversis.forEach { print("$it ") }

    println()
    val intervalo = 1500.0..5000.0
    val salario = 6000.0
    if (salario in intervalo) {
        println("O salario esta dentro do intervalo")
    } else {
        println("O salario não esta dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)


}