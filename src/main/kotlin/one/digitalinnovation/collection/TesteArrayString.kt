package one.digitalinnovation.collection

fun main() {
    val nomes = arrayOf("Jose", "Maria", "Joao")

    nomes.forEach {
        println(it)
    }

    println("----------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }


}