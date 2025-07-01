//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nilai ujian (0–100): ")
    val nilai = readLine()?.toDoubleOrNull() ?: 0.0

    val skala4 = nilai / 25.0
    val skala4Formatted = String.format("%.2f", skala4)

    println()
    println("Nilai $nilai → skala 4.0 = $skala4Formatted")
}