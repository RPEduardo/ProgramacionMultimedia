fun main (){
    println("Introduce el operando 1:")
    val operando1: Double = (readln()?.toDouble() ?: 0.0) as Double
    println("Introduce el operando 2:")
    val operando2: Double = (readln()?.toDouble() ?: 0.0) as Double

    val resultado = calculadora (operando1, operando2)

}

fun calculadora (operando1: Double, operando2: Double){

    println("Selecciona la operación que quieres realizar:")
    println("""
        1. Sumar 
        2. Restar 
        3. Multiplicar 
        4. Dividir   
    """.trimIndent())
    val opcion = readLine()?.toIntOrNull() ?: 0
    var resultadoOperación: Double

    when (opcion){
            1 -> {
                resultadoOperación = operando1 + operando2
                return println("El resultado de la suma de $operando1 y $operando2 es $resultadoOperación")
            }
            2 -> {
                resultadoOperación = operando1 - operando2
                return println("El resultado de la resta de $operando1 y $operando2 es $resultadoOperación")
            }
            3 -> {
                resultadoOperación = operando1 * operando2
                return println("El resultado de la multiplicación de $operando1 y $operando2 es $resultadoOperación")
            }
            4 -> {
                resultadoOperación = operando1 / operando2
                return println("El resultado de la división de $operando1 y $operando2 es $resultadoOperación")
            }
        else -> {
            println("Opción no válida.")
        }
    }
}