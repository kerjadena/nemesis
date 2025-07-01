fun main() {
    var total = 0

    for (i in 1..5) {
        print("Nilai ke-$i: ")
        val nilai = readLine()?.toIntOrNull() ?: 0
        total += nilai
    }

    val rataRata = total / 5.0

    println()
    println("Total: $total")
    println("Rata-rata: $rataRata")
}
