fun main() {
    print("Escreva o primeiro número: ")
    val n1 = readLine()?.toIntOrNull() ?: 0
    val resultado = n1
    println("O primeiro número é: $n1! Digite o segundo número: ")
    val n2 = readLine()?.toIntOrNull() ?: 0
    val resultado2 = n2

    if (n1 > n2) {
        println("O maior número é: $n1")
    } else if (n2> n1) {
        println("O maior número é: $n2")
    } else {
        println("Os dois números são iguais: $n1")
    }
}
