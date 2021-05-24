package conta.modelo

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Sistema ByteBank")
        } else {
            println("Falha na autenticação")
        }
    }
}