package br.com.priscilasanfer.bytebank.modelo

interface Autenticavel {
      fun autentica(senha: Int): Boolean
}