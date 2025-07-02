fun sapa (nama :String) : String {
    return "Halo, $nama!"
}

fun main() {
    println("Masukkan nama: ")
    val namaSatu = readLine() ?: ""
    println("Masukkan nama: ")
    val namaDua = readLine() ?: ""
    println(sapa(namaSatu))
    println(sapa(namaDua))
}