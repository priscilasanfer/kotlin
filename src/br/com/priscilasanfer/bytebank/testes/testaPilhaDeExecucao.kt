package br.com.priscilasanfer.bytebank.testes

import br.com.priscilasanfer.bytebank.modelo.Endereco
import java.lang.ClassCastException

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
    for (i in 1..5) {
        println(i)
        val endereco = Any()

        try {
            endereco as Endereco
        } catch (e: ClassCastException) {
            e.printStackTrace()
            println("ClassCastException foi pegada")
        }
    }
    println("fim função 2")
}