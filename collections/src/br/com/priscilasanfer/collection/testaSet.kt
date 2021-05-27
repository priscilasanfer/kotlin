package br.com.priscilasanfer.collection

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Meg", "Malu", "Alex", "Rafael")
    val assistiramCursoKotlin: Set<String> = setOf("Meg", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin


    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    assistiramAmbos.add("Ana")
    println(assistiramAmbos)


    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)
    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)
    println(assistiramCursoKotlin - assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Meg")
    println(assistiramList.toSet())
}
