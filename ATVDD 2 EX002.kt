fun main() {
print("Por favor, escreva um valor: ")
    val valor= readLine()?.toIntOrNull() ?: 0
    if (valor > 0) {
        println("O valor é positivo!")
    } else if (valor < 0) {
        println("O valor é negativo!")
    } else {
        println("O valor é zero! ")
    }
}
