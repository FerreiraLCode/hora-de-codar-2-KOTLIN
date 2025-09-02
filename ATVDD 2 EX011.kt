fun main() {
    println("==MINI CALCULADORA==")

    println("Opção 1 ADIÇÃO: ")
    println("Opção 2 SUBTRAÇÃO: ")
    println("Opção 3 DIVISÃO: ")
    println("Opção 4 MULTIPLICAÇÃO: ")

    val opcao = readLine()?.toIntOrNull() ?: -1
    var resultado: Double

    when (opcao) {
        1 -> {
            print("Informe o primeiro valor: ")
            val v1 = readLine()!!.toDouble()

            print("Informe o segundo valor: ")
            val v2 = readLine()!!.toDouble()
            resultado = v1 + v2
            println("O resultado da conta é: $resultado")
        }

        2 -> {
            print("Informe o primeiro valor: ")
            val v1 = readLine()!!.toDouble()

            print("Informe o segundo valor: ")
            val v2 = readLine()!!.toDouble()
            resultado = v1 - v2
            println("O resultado da conta é: $resultado")
        }

        3 -> {
            print("Informe o primeiro valor: ")
            val v1 = readLine()!!.toDouble()

            print("Informe o segundo valor: ")
            val v2 = readLine()!!.toDouble()
            resultado = v1 / v2
            println("O resultado da conta é: $resultado")
        }

        4 -> {
            print("Informe o primeiro valor: ")
            val v1 = readLine()!!.toDouble()

            print("Informe o segundo valor: ")
            val v2 = readLine()!!.toDouble()
            resultado = v1 * v2
            println("O resultado da conta é: $resultado")
        }
    }
}
