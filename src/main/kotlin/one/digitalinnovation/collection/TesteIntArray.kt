package one.digitalinnovation.collection

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        print(valor)
    }
    print("\n")

    values.forEach {
        print(it)
    }
    print("\n")

    for(index in values.indices){
        print(values[index])
    }
    print("\n")
    values.sort()

    values.forEach {
        print(it)
    }
}