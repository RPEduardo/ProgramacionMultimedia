fun main(){

    println("Introduce un número para saber si es primo: ")
    val numero: Int = readLine()?.toInt() ?: 0

    if (calcularPrimo(numero)){
        println("$numero es un número primo.")
    }else{
        println("$numero no es un número primo.")
    }

}

fun calcularPrimo(num: Int): Boolean {
    if (num <= 1) return false

    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
