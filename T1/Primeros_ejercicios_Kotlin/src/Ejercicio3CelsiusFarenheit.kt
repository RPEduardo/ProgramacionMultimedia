fun main(){

    println("Introduce los grados Celsius para transformar en grados Farenheit")
    val gradosCelsius:Double = (readln()?.toDouble() ?: 0) as Double
    val resultado = calculaGradosFarenheit(gradosCelsius)
    println("$gradosCelsius grados Celsius son $resultado grados Farenheit")
}

fun calculaGradosFarenheit (gradosC: Double) : Double {
    return gradosC*9/5 + 32
}
