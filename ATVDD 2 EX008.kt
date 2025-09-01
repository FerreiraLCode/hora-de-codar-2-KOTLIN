fun main() {
    print("Por favor, digite o primeiro valor: ")
    val v1 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o segundo valor: ")
    val v2 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o terceiro valor: ")
    val v3 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o quarto valor: ")
    val v4 = readLine()?.toIntOrNull() ?: 0

    val valores = listOf(v1, v2, v3, v4)
    
    val validos = valores.filter { it > 0 && it < 10 }

    if (validos.isNotEmpty()) {
        val media = validos.average()
        println("\nMédia: $media")

        if (media > 5) {
            println("Você passou no teste")
        } else {
            println("Tente novamente")
        }
    } else {
        println("Nenhum valor válido foi digitado")
    }
}
