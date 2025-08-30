fun main() {
    print("Por favor, digite o primeiro valor: ")
    val v1 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o segundo valor: ")
    val v2 = readLine()?.toIntOrNull() ?: 0

    print("Por favor, digite o terceiro valor: ")
    val v3 = readLine()?.toIntOrNull() ?: 0

    val soma: Int = if (v1 < v2 && v1 < v3) {
        v2 + v3
    } else if (v2 < v1 && v2 < v3) {
        v1 + v3
    } else {
        v1 + v2
    }

    println("A soma dos dois maiores valores é: $soma")
}
