
```
#### 1. Library paling umum digunakan untuk HTTP Client di Android Kotlin modern:

a. OkHttp
b. Volley
c. Retrofit
d. Alamofire

---

#### 2. Fungsi dari `@GET("users")` dalam Retrofit:

a. Menyimpan data pengguna
b. Mengirim form ke server
c. Mengirim permintaan HTTP GET ke endpoint `users`
d. Menghapus pengguna dari server

---

#### 3. Mengapa kita menggunakan Coroutine atau `Call.enqueue()` saat Retrofit dipakai?

a. Untuk mempermudah syntax Kotlin
b. Untuk menjaga agar UI tidak macet saat HTTP call
c. Agar data disimpan ke SharedPreferences
d. Agar aplikasi bisa offline

---

#### 4. Untuk mengkonversi JSON ke objek Kotlin, kita menggunakan:

a. JsonParser
b. GsonConverterFactory
c. JSONTokener
d. JSONBuilder

---

#### 5. Fungsi utama `baseUrl` di Retrofit:

a. Mengatur authentication
b. Menentukan response type
c. Menentukan endpoint utama API
d. Menentukan ukuran file

---

#### 6. Kapan kita perlu menambahkan `@Query` di Retrofit?

a. Saat upload file
b. Saat mengirim body JSON
c. Saat menambahkan parameter URL
d. Saat menyimpan token

---

#### 7. `Response.body()` akan bernilai `null` jika:

a. API berhasil dipanggil
b. Status HTTP adalah 200
c. Response tidak sesuai format
d. Retrofit tidak digunakan

---

#### 8. Untuk membuat POST request dengan Retrofit, anotasi yang digunakan adalah:

a. @GET
b. @POST
c. @PUT
d. @FETCH

---

#### 9. Apa yang terjadi jika kita lupa menambahkan `.create()` pada GsonConverterFactory?

a. Program tetap jalan
b. Data akan disimpan sebagai string
c. Retrofit akan error saat parsing
d. File JSON akan corrupt

---

#### 10. Manakah dari berikut ini yang merupakan cara **asynchronous** memanggil API dengan Retrofit?

a. `.execute()`
b. `.enqueue()`
c. `.get()`
d. `.await()`

---
```

#### 11. Jelaskan perbedaan antara Retrofit dan OkHttp dalam arsitektur Android.

---

#### 12. Sebutkan dua cara menangani response API di Retrofit!

---

#### 13. Bagaimana cara mengecek apakah response dari server berhasil atau tidak?

---

#### 14. Apa fungsi `@Header("Authorization")` dalam Retrofit?

---

#### 15. Apa itu suspend function dan mengapa sering digunakan bersama Retrofit?

---

#### 16. Sebutkan satu contoh kasus nyata di mana HTTP client dibutuhkan dalam aplikasi Android.

---

#### 17. Jika API kamu lambat dan pengguna harus menunggu lama, bagaimana solusi teknisnya?

---

#### 18. Bagaimana cara menangani `TimeoutException` saat HTTP call?

---

#### 19. Mengapa penting untuk menangani error code seperti 401 atau 500?

---

#### 20. Apa itu DTO dalam konteks komunikasi dengan API?

---

### 🛠️ ** FIX CODE **

#### 21. Perbaiki kode Retrofit interface ini agar valid:

```kotlin
interface ApiService {
    @GET
    fun getUser(): Call<User>
}
```

---

#### 22. Ada kesalahan dalam Retrofit builder berikut. Apa yang salah?

```kotlin
val retrofit = Retrofit.Builder()
    .baseUrl("https://api.example.com")
    .addConverterFactory(GsonConverterFactory)
    .build()
```

---

#### 23. Diberikan JSON seperti ini:

```json
{
  "status": "ok",
  "data": {
    "id": 10,
    "name": "Anna"
  }
}
```

Perbaiki model Kotlin-nya:

```kotlin
data class User(
    val id: Int,
    val fullName: String
)
```

---

#### 24. Lengkapi kode Retrofit untuk mengirim data JSON:

```kotlin
@POST("user/add")
fun createUser(@Body user: ???): Call<User>
```

---

#### 25. Perbaiki fungsi berikut agar memanggil API secara asynchronous:

```kotlin
val call = apiService.getUser()
val result = call.execute()
```

---

#### 26. Perbaiki parameter Retrofit berikut agar bisa mengirim `id` lewat query:

```kotlin
@GET("user")
fun getUser(@Param("id") id: Int): Call<User>
```

---

#### 27. Perbaiki kode berikut agar response-nya bisa langsung digunakan di ViewModel coroutine:

```kotlin
@GET("user")
fun getUser(): Call<User>
```

---

#### 28. Lengkapi kode penggunaan Retrofit di Android ViewModel:

```kotlin
val user = api.getUser()
user.enqueue(object: ??? {
    override fun onResponse(...) {
        // handle
    }
})
```

---

#### 29. Lengkapi `DataRepository` berikut agar bisa meng-handle error response:

```kotlin
val call = api.getUser()
call.enqueue(object: Callback<User> {
    override fun onFailure(call: Call<User>, t: Throwable) { }
    override fun onResponse(call: Call<User>, response: Response<User>) {
        // handle success
    }
})
```

---

#### 30. Perbaiki kode pemanggilan API ini agar menggunakan `suspend` function dan `try-catch`:

```kotlin
val result = api.getUser()
val data = result.body()
```

---
