package br.com.priscilasanfer.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem)