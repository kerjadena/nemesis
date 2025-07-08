
---
## MULTIMEDIA 

1. Komponen bawaan Android yang digunakan untuk memutar video dari URL adalah:
   * B. VideoView

2. Untuk menampilkan video YouTube dengan cara termudah, kita bisa menggunakan:
   * A. Intent ke browser atau YouTube app

3. Metode `setVideoURI()` digunakan pada:
   * B. VideoView

4. Apa tujuan dari `start()` setelah `setVideoURI()`?
   * C. Mulai pemutaran

5. Library yang sering digunakan untuk video streaming dengan kontrol lebih lengkap adalah:
   * C. ExoPlayer


6. Sebutkan 2 cara menampilkan video YouTube dalam aplikasi Android.
Menggunakan Intent ke aplikasi YouTube
Menggunakan YouTube Android Player API atau WebView

7. Bagaimana Anda membuka link video YouTube secara langsung ke browser?
Gunakan Intent dengan ACTION_VIEW dan Uri dari link YouTube.


8. Apa perbedaan `VideoView` dan `WebView` saat menampilkan konten video?
VideoView: khusus untuk video, lebih ringan, tidak bisa tampilkan HTML.
WebView: bisa tampilkan video dalam HTML, lebih berat dan kompleks.

9. Perbaiki kode berikut agar dapat memutar video dari URL:

```kotlin
val videoView = findViewById<VideoView>(R.id.videoView)
videoView.setVideoPath("https://youtube.com/videoid")
videoView.play()
```
setVideoPath() tidak cocok untuk YouTube URL. YouTube memerlukan API khusus, bukan streaming langsung.

```kotlin
val videoView = findViewById<VideoView>(R.id.videoView)
val uri = Uri.parse("https://www.example.com/video.mp4") // gunakan URL langsung ke file video
videoView.setVideoURI(uri)
videoView.start()
```

10. Kode berikut digunakan untuk membuka video via browser. Namun tidak bekerja. Perbaiki:

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = "https://youtu.be/abc123"
startActivity(intent)
```
intent.data seharusnya diisi dengan Uri, bukan String.

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = "https://youtu.be/abc123"
startActivity(intent)
```

---

##  SHARED PREFERENCES
  
11. SharedPreferences digunakan untuk menyimpan:
* C. Data sederhana seperti token, nama

12. SharedPreferences hanya bisa diakses oleh:
* B. Aplikasi yang sama

13. Untuk menulis ke SharedPreferences, Anda membutuhkan:
* A. Editor

14. Fungsi untuk menyimpan `String` ke SharedPreferences:
* C. putString()

15. Fungsi `apply()` digunakan untuk:
* B. Menyimpan secara async

16. Bagaimana cara menyimpan nama pengguna ke SharedPreferences?
Gunakan SharedPreferences.Editor dan metode putString().

17. Bagaimana cara menghapus semua data SharedPreferences?
Gunakan metode clear() di SharedPreferences.Editor.

18. Sebutkan 2 jenis data yang bisa disimpan di SharedPreferences.
String, Boolean
19. Perbaiki kode berikut agar dapat menyimpan token:

```kotlin
val pref = getSharedPreferences("MyApp", MODE_WORLD_WRITEABLE)
val editor = pref.edit()
editor.save("token", "abc123")
```
save() bukan method valid di SharedPreferences.Editor. Yang benar adalah putString() + apply()

```kotlin
val pref = getSharedPreferences("MyApp", MODE_PRIVATE)
val editor = pref.edit()
editor.putString("token", "abc123")
editor.apply()
```

20. Kode berikut digunakan untuk membaca data dari SharedPreferences namun error. Perbaiki:

```kotlin
val pref = getPreferences()
val name = pref.getString("username")
```
getString() butuh 2 argumen: key dan default value.

```kotlin
val pref = getPreferences(MODE_PRIVATE)
val name = pref.getString("username", null)
```

---
##  ROOM DATABASE
21. Room adalah library untuk:
* C. Database SQLite wrapper

22. Setiap entitas dalam Room harus ditandai dengan:
* B. @Entity

23. DAO digunakan untuk:
* C. Akses ke database

24. Untuk menjalankan query di DAO, kita bisa gunakan:
* D. Semua benar

25. Room membutuhkan apa agar bisa berjalan?
* C. Database dan DAO

26. Sebutkan 3 komponen utama dari Room.
Entity, DAO, Database
27. Apa itu `@PrimaryKey` dalam Room?
Menandai kolom sebagai primary key atau kunci utama dari tabel

28. Sebutkan 1 contoh fungsi DAO untuk mendapatkan seluruh data.
@Query("SELECT * FROM user")
fun getAll(): List<User>


29. Perbaiki entitas berikut agar bisa digunakan oleh Room:

```kotlin
data class User(
   val id: Int,
   val name: String
)
```
Tidak diberi anotasi @Entity, tidak ada @PrimaryKey untuk id
```kotlin
@Entity
data class User(
   @PrimaryKey val id: Int,
   val name: String
)
```

30. Kode berikut menampilkan error saat menjalankan `insert`. Perbaiki:

```kotlin
@Dao
interface UserDao {
    fun insertUser(user: User)
}
```
Fungsi tidak diberi anotasi @Insert
```kotlin
@Dao
interface UserDao {
    @Insert
    fun insertUser(user: User)
}
```
---
