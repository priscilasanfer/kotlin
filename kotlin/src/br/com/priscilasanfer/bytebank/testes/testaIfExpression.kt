package br.com.priscilasanfer.bytebank.testes;

fun testaIfExpression() {
    val valorComTaxa: Double? = valorComTaxa(100.0)
}

fun valorComTaxa(valorRecebido: Double?): Double? {
    if (valorRecebido != null) {
        return valorRecebido + 0.1
    }
    return null
}