package br.com.priscilasanfer.bytebank.testes

fun testaWhenExpression (){
    val valorRecebido = 10.0

    val valorComTaxa: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }
}


