fun main(){
     println("Por favor, introduzca un número para calcular su factorial:")
    val numero: Int = readln()?.toInt() ?: 0

    if (numero<0){
        println("Número no válido, introduzca un número positivo.")
    }else{
        val factorial= calculaFactorial(numero)

        println("El factorial de $numero es: $factorial")
    }


}

fun calculaFactorial(num: Int): Long {
    var resultado: Long = 1

    for(i in 1..num){
        resultado *= i
    }
    return resultado
}