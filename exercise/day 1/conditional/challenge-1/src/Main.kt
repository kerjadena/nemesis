fun main() {
    print("Nilai ujian: ")
    val nilai = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val predikat = when (nilai) {
        in 85..100 -> "A"
        in 70..84  -> "B"
        in 60..69  -> "C"
        in 50..59  -> "D"
        in 0..49   -> "E"
        else       -> return println("Nilai harus di antara 0–100")
    }

    println()
    println("Nilai: $nilai")
    println("Predikat: $predikat")
}
