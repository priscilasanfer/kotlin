package br.com.priscilasanfer.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel by titular {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

}