package conta.modelo

var totalDeContas = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set


    init {
        totalDeContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

}