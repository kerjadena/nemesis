//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Masukkan angka pertama: ")
    val firstNumber = readLine()?.toDoubleOrNull()?:0.0
    println("Masukkan operator (+, -, *, /): ")
    val operation = readLine() ?: println("Operator tidak valid")
    println("Masukkan angka kedua: ")
    val secondNumber = readLine()?.toDoubleOrNull()?:0.0

    val hasil = when (operation) {
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber-secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> if (secondNumber != 0.0) firstNumber / secondNumber else return println("Error: pembagian dengan nol")
        else -> return println("Operator '$operation' tidak dikenali")
    }
    println("Hasil : $hasil")


}