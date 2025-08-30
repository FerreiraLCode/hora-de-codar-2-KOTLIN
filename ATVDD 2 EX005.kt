fun main() {
    print("Por favor, digite o primeiro valor: ")
    val v1 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o segundo valor: ")
    val v2 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o terceiro valor: ")
    val v3 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o quarto valor: ")
    val v4 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o quinto valor: ")
    val v5 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o sexto valor: ")
    val v6 = readLine()?.toIntOrNull() ?: 0

    val soma = v1 + v2 + v3 + v4 + v5 + v6
    val media = soma / 6

    println("A soma dos valores é: $soma")
    println("A média aritmética é: $media")


}
