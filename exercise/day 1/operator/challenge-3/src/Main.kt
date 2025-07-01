fun main() {
    print("Total belanja: ")
    val totalBelanja = readLine()?.toDoubleOrNull() ?: return println("Input tidak valid")

    val diskon = if (totalBelanja > 100000) totalBelanja * 0.10 else 0.0
    val bayar = totalBelanja - diskon

    println("Diskon: ${diskon.toInt()}")
    println("Total bayar: ${bayar.toInt()}")
}
