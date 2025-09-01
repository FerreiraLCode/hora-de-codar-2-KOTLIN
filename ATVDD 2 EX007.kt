fun main() {
    print("Por favor digite o primeiro valor: ")
    val v1 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o segundo valor: ")
    val v2 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o terceiro valor: ")
    val v3 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o quarto valor: ")
    val v4 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o quinto valor: ")
    val v5 = readLine()?.toIntOrNull() ?: 0

    print("Por favor digite o sexto valor: ")
    val v6 = readLine()?.toIntOrNull() ?: 0

    val valores = listOf(v1, v2, v3, v4, v5, v6)

    val soma = valores.filter {it < 72 }.sum()

    println("\nResultado: ")
    println("Valores digitados: $valores")
    println("Soma dos valores menores que 72: $soma")

}
