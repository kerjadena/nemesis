fun halo(nama: String = "Pengunjung"){
    print ("Halo, $nama!")
}

fun main() {
    println("Masukkan nama: ")
    val nama = readLine()
    if (nama.isNullOrBlank()) {
        halo()
    } else {
        halo(nama)           
    }
} 


  