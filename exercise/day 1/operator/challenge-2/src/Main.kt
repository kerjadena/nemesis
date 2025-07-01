fun main() {
    print("Nomor kursi: ")
    val nomor = readLine()?.toIntOrNull() ?: return println("Input tidak valid")

    val status = if (nomor % 2 == 0) "Genap" else "Ganjil"

    println("Status: $status")
}
