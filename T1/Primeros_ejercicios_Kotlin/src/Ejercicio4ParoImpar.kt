fun main(){
    println("Introduce un número y te diré si es pas o impar")
    val numero: Int = (readln()?.toInt() ?: 0) as Int
    val resultado = calculaPar(numero)

}

fun calculaPar (valor: Int){
    if (valor%2 != 0){
        return println("Es un número impar")
    }else{
        return println("Es un número par")
    }
}