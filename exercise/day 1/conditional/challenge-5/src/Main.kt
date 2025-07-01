fun main() {
    print("Umur: ")
    val umur = readLine()?.toIntOrNull() ?:0
    print("Member VIP (true/false): ")
    val isVip = readLine()?.toBoolean() ?: return println("Input tidak valid")

    val status = if (umur > 18 && isVip) {
        "Diperbolehkan masuk"
    } else {
        "Tidak diperbolehkan masuk"
    }

    println()
    println("Umur: $umur")
    println("Member VIP: $isVip")
    println("Status: $status")
}
