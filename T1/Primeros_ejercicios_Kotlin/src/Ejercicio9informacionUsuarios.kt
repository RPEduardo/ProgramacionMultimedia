fun main (){

    val nombre = pedirNombre() // Obligatorio
    val apellido = pedirApellido() // Obligatorio
    val edad = pedirEdad() // Opcional - Añadir valor por defecto

    println("""
        Sus datos son:
        $nombre
        $apellido
        $edad
       
    """.trimIndent())
}

fun pedirNombre(): String? {

    var nombre: String?

    do {
        println("Por favor, introduce tu nombre:")
        nombre = readLine()

        if(nombre.isNullOrEmpty()){
            println("Error, campo obligatorio.")
        }

    }while(nombre.isNullOrEmpty())
    return nombre
}

fun pedirApellido(): String? {

    var apellido: String?

    do {
        println("Por favor, introduce tu apellido:")
        apellido = readLine()

        if(apellido.isNullOrEmpty()){
            println("Error, campo obligatorio.")
        }

    }while(apellido.isNullOrEmpty())
    return apellido
}

fun pedirEdad(): Int {
     println("Por favor, introduce tu edad (opcional):")
    val edad: Int = readln()?.toIntOrNull() ?: 18
    return edad
}