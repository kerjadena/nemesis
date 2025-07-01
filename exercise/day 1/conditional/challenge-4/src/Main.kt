fun main() {
    println("Menu Makan:")
    println("1. Nasi Goreng")
    println("2. Mie Ayam")
    println("3. Ayam Geprek")
    print("Pilihan (1–3): ")
    val pilihan = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val menu = when (pilihan) {
        1 -> "Nasi Goreng"
        2 -> "Mie Ayam"
        3 -> "Ayam Geprek"
        else -> return println("Pilihan harus 1–3")
    }

    println()
    println("Pilihan: $pilihan")
    println("Kamu memilih: $menu")
}
