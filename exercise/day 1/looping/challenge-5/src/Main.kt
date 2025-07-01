fun main() {
    println("Input: ")
    val input = readLine() ?: ""
    println("Jumlah: ")
    val jumlah = readLine()?.toIntOrNull() ?: 0
    
    for (i in 1..jumlah) {
        println(input)
    }


}
