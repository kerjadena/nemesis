//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Tahun lahir: ")
    val tahunLahir = readLine()?.toIntOrNull() ?: 0
    print("Tahun sekarang: ")
    val tahunNow = readLine()?.toIntOrNull() ?: 0
    val umur = tahunNow - tahunLahir

    println("Tahun lahir: $tahunLahir")
    println("Tahun sekarang: $tahunNow")
    println("Usia Anda: $umur tahun")
}