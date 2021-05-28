package br.com.priscilasanfer

fun TestaFuncaoLambdaComMultiplosRetornos() {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100.0
    }

    println(calculaBonificacao(1001.0))
}