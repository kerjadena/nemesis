fun luasPersegi(sisi: Int): Int {
    return sisi * sisi
}

fun main() {
    print("Input sisi: ")
    val sisi = readLine()?.toIntOrNull() ?: 0
    val luas = luasPersegi(sisi)
    println("Luas persegi: $luas")
}
