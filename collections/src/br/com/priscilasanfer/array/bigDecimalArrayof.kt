package br.com.priscilasanfer.array

import java.math.BigDecimal

fun bigDecimalArrayof(vararg valores: String): Array<BigDecimal> {

    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }

}