package br.com.priscilasanfer.collection

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0,
        7 to 100.0
    )

//    val valorPedidos = pedidos.getValue(5)
//    println(valorPedidos)

    val mensagem: Double? = pedidos.getOrElse(1) {
        null
    }
    println(mensagem)

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)


    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valores $valor")
    }


    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)


    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + Pair(7, 90.0))
    println(pedidos)
    println(pedidos + mapOf(8 to 90.0, 9 to 25.0))
    println(pedidos)

    println(pedidos - 6)
    println(pedidos)

    println(pedidos - listOf(5, 6))
    println(pedidos)

    pedidos.putAll(setOf<Pair<Int, Double>>(8 to 90.0, 9 to 25.0))
    println(pedidos)

    pedidos.putAll(listOf<Pair<Int, Double>>(8 to 90.0, 9 to 25.0))
    println(pedidos)

    pedidos += listOf<Pair<Int, Double>>(8 to 90.0, 9 to 25.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}