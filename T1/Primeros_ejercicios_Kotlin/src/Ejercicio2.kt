// Escribe un programa que pida el radio de un círculo y calcule su area
fun main(){
    println("Introdice el radio del círculo para calcular su área")
    val radio: Double  = (readln()?.toDouble() ?: 0) as Double
    val resultado = calcularArea(radio)
    println("El resultado del área de un círculo con radio $radio es $resultado")
}

fun calcularArea(valorRadio: Double): Double{
    return Math.PI*Math.pow(valorRadio, 2.0)

}