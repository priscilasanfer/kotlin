package br.com.priscilasanfer.bytebank.testes

fun testaPilhaDeExecucao() {
    println("inicio main")
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao 1")
    funcao2()
    println("fim função 1")
}

fun funcao2() {
    println("inicio funcao 2")
    for (i in 1..5){
        println(i)
    }
    println("fim função 2")
}