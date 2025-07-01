fun main() {
    print("Masukkan angka rahasia: ")
    val input = readLine()
    val secret = input?.toIntOrNull()
    if (secret == null) {
        println("Input tidak valid.")
    } else {
        var guess: Int? = null
        var attempts = 0
        while (guess != secret) {
            print("Tebak angka: ")
            guess = readLine()?.toIntOrNull()
            attempts++
        }
        println("Tebakan Anda benar! Jumlah percobaan: $attempts")
    }
}