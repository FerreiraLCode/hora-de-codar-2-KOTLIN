fun main() {
    print("Digite o ano do seu nascimento: ")
    val anoNascimento = readLine()?.toIntOrNull() ?: 0

    val anoAtual = 2025  
    val idade = anoAtual - anoNascimento

    if (idade >= 16) {
        println("Você poderá votar este ano! (Idade: $idade anos)")
    } else {
        println("Você NÃO poderá votar este ano. (Idade: $idade anos)")
    }
}
