package conta.modelo

interface Autenticavel {
      fun autentica(senha: Int): Boolean
}