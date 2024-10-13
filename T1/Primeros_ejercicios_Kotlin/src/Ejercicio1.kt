// Escribe un programa que pida al usuario dos números enteros y calcule su suma
fun main () {

println("Introduce un número:")
    val numero1: Int = readln()?.toInt() ?: 0
println("Introduce otro número:")
    val numero2: Int = readln()?.toInt() ?: 0
    val resultado = suma (numero1, numero2)
    println("El resultado de sumar $numero1 y $numero2 es $resultado")
}

fun suma (N1: Int, N2: Int): Int {
    return N1 + N2
}