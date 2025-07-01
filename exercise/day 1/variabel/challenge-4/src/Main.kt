//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Nama barang: ")
    val barang = readLine() ?: ""
    print("Jumlah barang: ")
    val jumlah = readLine()?.toIntOrNull() ?: 0
    print("Harga satuan: ")
    val hargaSatuan: Double = readLine()?.toDoubleOrNull() ?: 0.0

    val total = jumlah * hargaSatuan

    println()
    println("Barang: $barang")
    println("Jumlah: $jumlah")
    println("Harga satuan: $hargaSatuan")
    println("Total: $total")
}