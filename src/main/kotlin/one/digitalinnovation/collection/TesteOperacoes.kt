package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("---------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500 }
    println("---------------")
    salariosMaiorque2500.forEach { println(it)}






}