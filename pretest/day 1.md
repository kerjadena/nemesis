---
# 📄 **Pretest Kotlin & Basic Android Development (30 Soal)**
---

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

1. Apa tipe data untuk menyimpan teks di Kotlin?
   - c. `String`

2. Kata kunci `val` digunakan untuk:
   - b. Variabel tetap (tidak bisa diubah)

3. Apa hasil dari `println(5 + 3 * 2)`?
   - b. 11

4. Fungsi utama program Kotlin adalah:
   - b. `main()`

5. Di Android Studio, layout antarmuka ditulis dengan:
   - c. XML

6. Apa hasil dari kode berikut?

   ```kotlin
   val x = "4"
   println(x + 1)
   ```
   - b. 41

7. Fungsi `readLine()` dalam Kotlin digunakan untuk:
   - c. Membaca input

8. Apa hasil dari perbandingan berikut: `5 > 3 && 2 < 1`?
   - b. false

9. Android Studio adalah tools untuk:
   - c. Membuat aplikasi Android

10. Untuk berpindah dari satu activity ke activity lain di Android, digunakan:
    - a. Intent

---

### ✅ **Bagian B – Jawaban Penjelasan Singkat (15 Soal)**

11. Jelaskan perbedaan `val` dan `var` di Kotlin.
`val` digunakan untuk mendeklarasikan variabel yang nilainya tetap (immutable), artinya tidak bisa diubah setelah diinisialisasi. Sedangkan `var` digunakan untuk mendeklarasikan variabel yang nilainya bisa diubah (mutable).

13. Sebutkan dua tipe data numerik dalam Kotlin.
integer (`Int`) dan floating-point (`Double`).

13. Apa kegunaan fungsi `println()`?
mencetak output ke konsol.

14. Bagaimana cara mengambil input angka dari pengguna dan mengubahnya ke tipe `Int` secara aman?
toIntOrNull() menghindari exception dengan mengembalikan null jika gagal, lalu operator Elvis (?:) memberi nilai default.

15. Sebutkan satu contoh layout yang sering digunakan dalam Android dan fungsinya.
`LinearLayout` digunakan untuk mengatur tampilan komponen secara vertikal atau horizontal.

16. Apa itu `Intent` dalam Android?
`Intent` adalah objek yang digunakan untuk memulai activity baru, mengirim data antar activity.

17. Bagaimana cara menampilkan teks di layar Android menggunakan Kotlin dan XML?
Menggunakan `TextView` di XML untuk mendefinisikan tampilan teks, lalu mengaksesnya di kode Kotlin dengan `findViewById()`.

19. Apa arti dari null safety dalam Kotlin?
Null safety adalah fitur Kotlin yang mencegah NullPointerException dengan memastikan bahwa variabel tidak dapat diinisialisasi dengan nilai null kecuali secara eksplisit dinyatakan sebagai nullable (dengan tanda `?`).

19. Apa perbedaan antara `toInt()` dan `toIntOrNull()`?
`toInt()` akan melempar exception jika konversi gagal, sedangkan `toIntOrNull()` akan mengembalikan null jika konversi tidak berhasil, sehingga lebih aman untuk digunakan saat input tidak pasti.

20. Sebutkan minimal satu keunggulan Kotlin dibandingkan Java dalam pengembangan Android.
Kotlin memiliki sintaks yang lebih ringkas dan modern, mendukung fitur seperti null safety, extension functions, dan coroutines untuk pemrograman asinkron.

21. Dalam Android Studio, di folder mana biasanya file `activity_main.xml` disimpan?
`res/layout`.

22. Bagaimana struktur dasar fungsi utama (`main`) dalam Kotlin? Tuliskan contohnya.
Fungsi utama dalam Kotlin dimulai dengan kata kunci `fun`, diikuti dengan nama fungsi `main`, dan parameter `args` yang merupakan array dari string. Contohnya:

fun main() {
println("Hello, Kotlin!")
}

23. Apa yang dimaksud dengan `String interpolation` dalam Kotlin?
String interpolation adalah cara untuk menyisipkan nilai variabel ke dalam string dengan menggunakan tanda `$` diikuti nama variabel atau `${}` untuk ekspresi yang lebih kompleks.

24. Apa arti `?.` dan `?:` dalam penulisan kode Kotlin?
?. (safe call) memanggil hanya jika objek tidak null. 
?: (Elvis) menyediakan nilai pengganti jika yang kiri null

25. Bagaimana Kotlin menangani error saat input dari user tidak sesuai tipe data?
Gunakan toIntOrNull()/toDoubleOrNull() + ?: atau try/catch untuk menangkap exception.
        
---

### ✅ **Bagian C – Perbaiki Kode (5 Soal)**

26. Perbaiki dan jelaskan:

```kotlin
fun main() {
    val umur = readLine()
    println("Umur anda adalah " + umur + 5)
}
```
```kotlin

fun main() {
print("Masukkan umur: ")
val input = readLine()
val umur = input?.toIntOrNull() ?: run {
println("Input tidak valid, menggunakan 0.")
0
}
val umurMendatang = umur + 5
println("Umur Anda 5 tahun lagi adalah $umurMendatang tahun.")
}
```
readLine() mengembalikan String?, perlu toIntOrNull() untuk konversi aman.
Elvis ?: menangani null dan memberikan default.
---

27. Perbaiki:

```kotlin
val nama: String
println("Halo $nama")
```
```kotlin
fun main() {
   val nama: String = "Budi"
   println("Halo $nama")
}
```
Variabel belum di inisialisasi
---

28. Perbaiki dan jalankan:

```kotlin
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: umur tahun")
}
```
```kotlin
fun main() {
   print("Masukkan nama: ")
   val nama = readLine() ?: ""
   print("Masukkan umur: ")
   val umur = readLine()?.toIntOrNull() ?: 0
   println("Nama saya: $nama, umur: $umur tahun")
}
```
Prompt sebelum readLine().
toIntOrNull() untuk konversi aman.
Gunakan $umur (bukan literal "umur").
---

29. Perbaiki kode berikut agar tidak error:

```kotlin
val angka = "20"
val hasil = angka + 5
println(hasil)
```
```kotlin
fun main() {
   val angka = "20"
   val hasil = angka.toInt() + 5
   println(hasil) // Output: 25
}
```
konversi string ke int sebelum penjumlahan.

---

30. Debug:

```kotlin
fun main() {
  val tinggi = readLine().toDouble()
  println("Tinggi kamu adalah $tinggi")
}
```
```kotlin
fun main() {
   print("Masukkan tinggi Anda (cm): ")
   val input = readLine()
   val tinggi = input?.toDoubleOrNull() ?: run {
      println("Input tidak valid, menggunakan 0.0.")
      0.0
   }
   println("Tinggi kamu adalah $tinggi cm")
}
```
Safe call ?.toDoubleOrNull() mencegah exception.
Elvis ?: untuk nilai default.
---
