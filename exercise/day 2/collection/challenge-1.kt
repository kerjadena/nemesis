fun main() {
    val dataNilai = mutableMapOf<String, MutableList<Int>>()
    
    while (true) {
        println("\n=== MENU NILAI SISWA ===")
        println("1. Tambah Nilai Siswa")
        println("2. Lihat Semua Data")
        println("3. Cari Nilai Tertinggi")
        println("4. Siswa yang Lulus")
        println("5. Keluar")
        print("Pilih menu: ")
        
        when (readLine()?.toIntOrNull()) {
            1 -> {
                // Tambah data siswa
                print("Nama siswa: ")
                val nama = readLine().orEmpty().trim()
                if (nama.isEmpty()) {
                    println("Nama tidak boleh kosong.")
                    continue
                }
                print("Berapa banyak nilai yang akan dimasukkan? ")
                val count = readLine()?.toIntOrNull() ?: 0
                val listNilai = mutableListOf<Int>()
                for (i in 1..count) {
                    print("Nilai ke-$i: ")
                    val n = readLine()?.toIntOrNull()
                    if (n != null) listNilai.add(n)
                }
                dataNilai[nama] = listNilai
                println("Data siswa '$nama' tersimpan.")
            }
            
            2 -> {
                // Lihat semua data
                if (dataNilai.isEmpty()) {
                    println("Belum ada data siswa.")
                    continue
                }
                for ((nama, nilaiList) in dataNilai) {
                    print("Nama: $nama\nNilai: ")
                    for (i in nilaiList.indices) {
                        print(nilaiList[i])
                        if (i < nilaiList.size - 1) print(", ")
                    }
                    // Hitung rata-rata
                    var sum = 0
                    for (v in nilaiList) sum += v
                    val avg = if (nilaiList.isNotEmpty()) sum.toDouble() / nilaiList.size else 0.0
                    println("\nRata-rata: ${"%.2f".format(avg)}\n")
                }
            }
            
            3 -> {
                // Cari siswa dengan nilai tertinggi
                if (dataNilai.isEmpty()) {
                    println("Belum ada data siswa.")
                    continue
                }
                var terbaikNama = ""
                var terbaikNilai = -1
                for ((nama, nilaiList) in dataNilai) {
                    for (v in nilaiList) {
                        if (v > terbaikNilai) {
                            terbaikNilai = v
                            terbaikNama = nama
                        }
                    }
                }
                println("Siswa dengan nilai tertinggi: $terbaikNama → $terbaikNilai")
            }
            
            4 -> {
                // Daftar siswa yang lulus (rata ≥ 75)
                var ada = false
                for ((nama, nilaiList) in dataNilai) {
                    var sum = 0
                    for (v in nilaiList) sum += v
                    val avg = if (nilaiList.isNotEmpty()) sum.toDouble() / nilaiList.size else 0.0
                    if (avg >= 75.0) {
                        if (!ada) {
                            println("Daftar siswa yang lulus (rata-rata ≥ 75):")
                            ada = true
                        }
                        println("- $nama: ${"%.2f".format(avg)}")
                    }
                }
                if (!ada) {
                    println("Belum ada siswa yang lulus.")
                }
            }
            
            5 -> {
                println("Keluar dari program.")
                break
            }
            
            else -> println("Pilihan tidak valid.")
        }
    }
}
