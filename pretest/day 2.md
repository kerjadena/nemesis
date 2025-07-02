## 📄 **Pretest: Activity Lifecycle di Android (30 Soal)**

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

**Pilih satu jawaban yang paling benar.**

1. Method lifecycle manakah yang pertama kali dipanggil ketika Activity baru dimulai?
   b. `onCreate()`

2. Method `onPause()` biasanya dipanggil ketika...
   c. Activity lain muncul di atas Activity saat ini

3. Method `onDestroy()` akan selalu dipanggil jika...
   c. Aplikasi ditutup melalui recent apps

4. Saat rotasi layar terjadi, method apa yang umumnya **tidak** dipanggil kembali secara otomatis?
   d. `onRestart()`

5. Lifecycle `onRestart()` akan dipanggil saat...
   b. Setelah `onStop()` dan Activity dibuka lagi

6. Saat user menekan tombol home, urutan method yang dipanggil adalah:
   b. `onPause()`, `onStop()`

7. Untuk menyimpan data sementara sebelum Activity di-_recreate_, gunakan:
   c. `onSaveInstanceState()`

8. Jika ingin mencegah Activity di-_recreate_ saat rotasi, properti apa yang ditambahkan?
   c. `android:configChanges="orientation|screenSize"`

9. Lifecycle method mana yang dipanggil tepat setelah `onCreate()`?
   c. `onStart()`

10. Fungsi dari `onResume()` adalah...
   b. Menjalankan logika utama setelah tampilan muncul


---

### ❓ **Bagian B – True/False (10 Soal)**

**Tulis T (True) atau F (False) untuk setiap pernyataan.**

11. `onStart()` dipanggil hanya sekali selama siklus hidup Activity.(T)
12. `onPause()` dipanggil sebelum `onStop()`.(T)
13. `onDestroy()` selalu dipanggil jika Activity berpindah ke Activity lain. (F)
14. Rotasi layar akan memanggil kembali `onCreate()`. (T)
15. `onResume()` menandakan bahwa Activity sedang tampil dan aktif.(T)
16. `onSaveInstanceState()` digunakan untuk menampilkan notifikasi.(F)
17. Setelah `onStop()`, Activity akan langsung `onDestroy()` tanpa pengecualian.(F)
18. Method `onRestart()` tidak akan pernah dipanggil jika aplikasi ditutup total.(F)
19. `onCreate()` hanya digunakan untuk menampilkan layout.(F)
20. Android menjamin bahwa semua lifecycle dipanggil secara berurutan.(F)

---

### ✍️ **Bagian C – Isian Singkat (5 Soal)**

21. Sebutkan 3 method utama yang dipanggil ketika Activity pertama kali diluncurkan.
onCreate, onStart, onResume

22. Apa fungsi utama dari method `onSaveInstanceState()`?
menyimpan status UI aktivitas saat dimusnahkan

23. Apa perbedaan `onPause()` dan `onStop()` dalam siklus Activity?
onPause digunanakan ketika aktivitas tidak memiliki fokus tapi masih terlihat, onStop digunakan ketika aktivitasnya sudah tidak terlihat

24. Apa dampak dari tidak menambahkan `configChanges` saat orientasi berubah?
setiap rotasi akan membuat Activity dihancurkan dan dibuat ulang, sehingga state UI bisa hilang dan terjadi overhead recreating

25. Sebutkan satu kondisi di mana `onDestroy()` **tidak** dipanggil oleh sistem Android.
ketika sistem memaksa kill process (low memory) atau user “Force Stop” di Settings, tanpa memanggil callback lifecycle


---

### 🔧 **Bagian D – Koreksi Kode (5 Soal)**

**Perbaiki dan jelaskan kesalahan pada cuplikan kode berikut.**

26.

```kotlin
override fun onCreate() {
  super.onCreate()
  setContentView(R.layout.activity_main)
}
```
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
}
```
Harus override onCreate(savedInstanceState: Bundle?) dan panggil super.onCreate(savedInstanceState)

27.

```kotlin
override fun onStop(savedInstanceState: Bundle?) {
  super.onStop(savedInstanceState)
  Log.d("LIFECYCLE", "Stopped")
}
```

```kotlin
override fun onStop() {
    super.onStop()
    Log.d("LIFECYCLE", "Stopped")
}
```
onStop() tidak menerima Bundle—hilangkan parameter dan panggil super.onStop()

28.

```kotlin
override fun onResume() {
  setContentView(R.layout.activity_main)
  super.onResume()
}
```
```kotlin
override fun onResume() {
    super.onResume()
}
```
Panggil super.onResume() terlebih dahulu, setContentView hanya di onCreate()

29.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  Log.d("LIFECYCLE", "Created")
}
```
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.d("LIFECYCLE", "Created")
}
```
Harus memanggil super.onCreate(savedInstanceState) sebelum logic logging

30.

```kotlin
override fun onSaveInstanceState() {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}
```
```kotlin
override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)
    outState.putString("username", "admin")
}

```
Method signature harus onSaveInstanceState(outState: Bundle), panggil super.onSaveInstanceState(outState) dan kemudian tambahkan data ke outState.
---
