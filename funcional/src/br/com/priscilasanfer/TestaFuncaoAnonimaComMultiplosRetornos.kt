package br.com.priscilasanfer

fun TestaFuncaoAnonimaComMultiplosRetornos() {
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }

    println(calculaBonificacaoAnonima(1001.0))
}