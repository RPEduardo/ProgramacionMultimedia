fun main (){

    println("Introduce el primer número:")
    val numero1: Int = (readln()?.toInt() ?: 0) as Int
    println("Introduce el segundo número:")
    val numero2: Int = readln()?.toInt() ?: 0
    val resultado = esMayor(numero1, numero2)

}

fun esMayor(numero1: Int, numero2: Int){
    if (numero1>numero2){
        println("El número mayor es $numero1")
    }else if (numero2>numero1){
        println ("El número mayor es $numero2")
    }else if (numero1==numero2){
        println("Los números son iguales")
    }
}