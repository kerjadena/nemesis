fun main() {
    print("Umur: ")
    val umur = readLine()?.toIntOrNull() ?: 0
    print("Member (true/false): ")
    val isMember = readLine()?.toBoolean() ?: return println("Input tidak valid")

    val boleh = umur > 21 && isMember

    val status = if (boleh) "Boleh masuk" else "Tidak boleh masuk"
    println("Status: $status")
}
