package br.com.priscilasanfer.bytebank.testes;

fun testaIfExpression() {

    val valorRecebido = 10.0
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }
}