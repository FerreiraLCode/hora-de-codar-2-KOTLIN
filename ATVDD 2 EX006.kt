fun main() {
    print("Por favor digite o primeiro valor: ")
    val v1 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o segundo valor: ")
    val v2 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o terceiro valor: ")
    val v3 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o quarto valor: ")
    val v4 = readLine()?.toIntOrNull() ?: 0

    val valores = listOf(v1, v2, v3, v4)

    val primeiro = valores.first()
    val ultimo = valores.last()
    val maior = valores.maxOrNull() ?: 0

    println("\nResultado: ")
    println("Primeiro valor: $primeiro")
    println("Ultimo valor: $ultimo")
    println("Maior valor: $maior")
}
