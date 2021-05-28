package br.com.priscilasanfer.modelo

import br.com.priscilasanfer.exception.FalhaAutenticacaoException
import br.com.priscilasanfer.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor")
        }

        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)
    }
}