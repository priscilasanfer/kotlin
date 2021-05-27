package br.com.priscilasanfer

fun main() {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    println(pedidos)

    val pedido = pedidos[3]

    pedido?.let {
        println("pedido ${it}")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Numero do p ${p.key}")
        println("Valor do p ${p.value}")
    }

    pedidos[3] = 70.0
    println(pedidos)
    pedidos.put(4,80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6,200.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(1, 50.0)
    println(pedidos)


}

