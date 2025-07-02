fun tambah(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber + secondNumber
}
fun kurang(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber - secondNumber
}
fun kali(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber * secondNumber
}
fun bagi(firstNumber: Double, secondNumber: Double): Double {
    return firstNumber / secondNumber
}

fun main() {
    println("Masukkan angka pertama: ")
    val firstNumber = readLine()?.toDoubleOrNull()?:0.0
    println("Masukkan angka kedua: ")
    val secondNumber = readLine()?.toDoubleOrNull()?:0.0
    println("Masukkan operator (+, -, *, /): ")
    val operation = readLine() ?: println("Operator tidak valid")

    val hasil = when (operation) {
        "+" -> tambah(firstNumber, secondNumber)
        "-" -> kurang(firstNumber, secondNumber)
        "*" -> kali(firstNumber, secondNumber)
        "/" -> if (secondNumber != 0.0) bagi(firstNumber, secondNumber) else return println("Error: pembagian dengan nol")
        else -> return println("Operator '$operation' tidak dikenali")
    }
    println("Hasil : $hasil")
}