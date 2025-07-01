fun main() {
    while (true) {
        println("Menu:")
        println("1. Lihat menu")
        println("2. Beli")
        println("3. Keluar")
        print("Pilih: ")

        val pilihan = readLine()?.toIntOrNull() ?: continue

        when (pilihan) {
            1 -> println("Menu: Nasi Goreng, Mie Ayam\n")
            2 -> println("Silakan lakukan pemesanan...\n")
            3 -> {
                println("Terima kasih!")
                break
            }
            else -> println("Pilihan tidak tersedia.\n")
        }
    }
}
