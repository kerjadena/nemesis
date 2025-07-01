fun main() {
    print("Umur pasien: ")
    val umur = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val kategori = when {
        umur in 0..13   -> "Anak-anak"
        umur in 13..19  -> "Remaja"
        umur in 20..59  -> "Dewasa"
        umur >= 60      -> "Lansia"
        else            -> "Sudah dipangkuan Tuhan"
    }

    println()
    println("Umur: $umur")
    println("Kategori: $kategori")

}