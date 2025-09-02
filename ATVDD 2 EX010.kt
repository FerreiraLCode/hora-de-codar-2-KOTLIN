fun main() {
    print("Digite a sua altura em metros (ex: 1.75): ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o gênero (1 - Feminino | 2 - Masculino): ")
    val genero = readLine()?.toIntOrNull() ?: 0

    if (altura > 0) {
        val pesoIdeal = when (genero) {
            1 -> (62.1 * altura) - 44.7  
            2 -> (72.7 * altura) - 58    
            else -> null                 
        }

        if (pesoIdeal != null) {
            println("Seu peso ideal é: %.2f kg".format(pesoIdeal))
        } else {
            println("Gênero inválido! Digite 1 para feminino ou 2 para masculino.")
        }
    } else {
        println("Altura inválida!")
    }
}
