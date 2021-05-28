package br.com.priscilasanfer.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem)