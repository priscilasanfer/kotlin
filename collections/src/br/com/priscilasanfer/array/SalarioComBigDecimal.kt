package br.com.priscilasanfer.array

import java.math.BigDecimal
import java.math.RoundingMode


fun salarioComBigDecimal() {
    var salarios = bigDecimalArrayof("1500.55", "2000.00", "5623.0")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    val salariosComAumento: Array<BigDecimal> = salarios.map { salario ->
        calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoTotal)

}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}