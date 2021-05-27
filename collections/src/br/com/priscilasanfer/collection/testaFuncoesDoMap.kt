package br.com.priscilasanfer.collection

fun testaFuncoesDoMap() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )

    println(pedidos)

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50
    }
    println(pedidosFreteGratis)

    println(pedidosFreteGratis[Pedido(numero = 1, valor = 20.0)])

// é uma possibilidade mas falha
//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)

    val pedidosFreteAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteAgrupados)
    println(pedidosFreteAgrupados[true])

    val nomes = listOf("Meg", "Malu", "Rafael", "Regina", "Gustavo", "Vinicius", "Miguel", "Celso")

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }

    println(nomes)
    println(agenda)
    println(agenda['M'])

}