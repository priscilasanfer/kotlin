package br.com.priscilasanfer.bytebank.modelo

import br.com.priscilasanfer.bytebank.exception.SaldoInsuficiente

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor) {
            throw SaldoInsuficiente()
        }
        saldo -= valor
        destino.deposita(valor)
    }
}