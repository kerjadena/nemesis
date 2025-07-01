fun main() {
    print("Angka A: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0
    print("Angka B: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    val maks = if (a >= b) a else b

    println("Angka lebih besar: $maks")
}
