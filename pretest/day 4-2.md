
```
#### 1. Library paling umum digunakan untuk HTTP Client di Android Kotlin modern:
c. Retrofit

---

#### 2. Fungsi dari `@GET("users")` dalam Retrofit:
c. Mengirim permintaan HTTP GET ke endpoint `users`

---

#### 3. Mengapa kita menggunakan Coroutine atau `Call.enqueue()` saat Retrofit dipakai?
b. Untuk menjaga agar UI tidak macet saat HTTP call

---

#### 4. Untuk mengkonversi JSON ke objek Kotlin, kita menggunakan:
b. GsonConverterFactory

---

#### 5. Fungsi utama `baseUrl` di Retrofit:
c. Menentukan endpoint utama API

---

#### 6. Kapan kita perlu menambahkan `@Query` di Retrofit?
c. Saat menambahkan parameter URL


---

#### 7. `Response.body()` akan bernilai `null` jika:
c. Response tidak sesuai format

---

#### 8. Untuk membuat POST request dengan Retrofit, anotasi yang digunakan adalah:
b. @POST

---

#### 9. Apa yang terjadi jika kita lupa menambahkan `.create()` pada GsonConverterFactory?
c. Retrofit akan error saat parsing

---

#### 10. Manakah dari berikut ini yang merupakan cara **asynchronous** memanggil API dengan Retrofit?
b. `.enqueue()`

---
```

#### 11. Jelaskan perbedaan antara Retrofit dan OkHttp dalam arsitektur Android.
retrofit dalah library untuk mengakses API dan mengkonversi data, sementara OkHttp adalah library untuk menangani koneksi HTTP
---

#### 12. Sebutkan dua cara menangani response API di Retrofit!
onResponse() callbck  untuk menangani response sukses dan onFailure() untuk menangani kegagalan.

---

#### 13. Bagaimana cara mengecek apakah response dari server berhasil atau tidak?
Gunakan response.isSuccessful untuk memeriksa apakah status code adalah 2xx.

---

#### 14. Apa fungsi `@Header("Authorization")` dalam Retrofit?
Digunakan untuk menambahkan header otentikasi, misalnya token, dalam permintaan HTTP.

---

#### 15. Apa itu suspend function dan mengapa sering digunakan bersama Retrofit?
suspend function adalah fungsi yang dapat dijeda sementara dan digunakan untuk operasi asinkron. Dalam Retrofit, digunakan untuk mempermudah penggunaan coroutine untuk memanggil API secara asinkron.

---

#### 16. Sebutkan satu contoh kasus nyata di mana HTTP client dibutuhkan dalam aplikasi Android.
Mengambil data pengguna dari server, seperti profil pengguna dari aplikasi media sosial.

---

#### 17. Jika API kamu lambat dan pengguna harus menunggu lama, bagaimana solusi teknisnya?
Gunakan caching untuk menyimpan respons yang sudah diterima, atau terapkan background threads untuk menghindari pengaruh terhadap UI.

---

#### 18. Bagaimana cara menangani `TimeoutException` saat HTTP call?
tangani dengan try-catch block atau atur timeout pada konfigurasi OkHttp.

---

#### 19. Mengapa penting untuk menangani error code seperti 401 atau 500?
Agar aplikasi dapat merespons dengan cara yang sesuai, seperti mengarahkan pengguna ke halaman login atau menampilkan pesan kesalahan yang informatif.

---

#### 20. Apa itu DTO dalam konteks komunikasi dengan API?
DTO adalah objek yang digunakan untuk mentransfer data antara aplikasi dan API, biasanya berupa objek sederhana yang berisi data yang dibutuhkan oleh klien.

---

### 🛠️ ** FIX CODE **

#### 21. Perbaiki kode Retrofit interface ini agar valid:

```kotlin
interface ApiService {
    @GET
    fun getUser(): Call<User>
}
```
@GET harus diikuti dengan endpoint URL atau path yang lengkap agar Retrofit tahu ke URL mana harus mengirimkan permintaan
```kotlin
interface ApiService {
    @GET("users")
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
Pada Retrofit, addConverterFactory() memerlukan parameter berupa GsonConverterFactory.create()
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
memerlukan dua model: satu untuk ApiResponse yang menangani status dan data, dan satu lagi untuk User
```kotlin
data class User(
    val id: Int,
    val name: String
)

data class ApiResponse(
    val status: String,
    val data: User
)

```
---

#### 24. Lengkapi kode Retrofit untuk mengirim data JSON:

```kotlin
@POST("user/add")
fun createUser(@Body user: ???): Call<User>
```
harus menyertakan objek sebagai body dengan anotasi @Body
```kotlin
@POST("user/add")
fun createUser(@Body user: User): Call<User>
```
---

#### 25. Perbaiki fungsi berikut agar memanggil API secara asynchronous:

```kotlin
val call = apiService.getUser()
val result = call.execute()
```
memanggil API secara asynchronous, harus menggunakan enqueue()
```kotlin
val call = apiService.getUser()
call.enqueue(object: Callback<User> {
    override fun onResponse(call: Call<User>, response: Response<User>) {
        // handle response
    }
    override fun onFailure(call: Call<User>, t: Throwable) {
        // handle failure
    }
})

```
---

#### 26. Perbaiki parameter Retrofit berikut agar bisa mengirim `id` lewat query:

```kotlin
@GET("user")
fun getUser(@Param("id") id: Int): Call<User>
```
harus menggunakan anotasi @Query bukan @Param
```kotlin
@GET("user")
fun getUser(@Query("id") id: Int): Call<User>
```
---

#### 27. Perbaiki kode berikut agar response-nya bisa langsung digunakan di ViewModel coroutine:

```kotlin
@GET("user")
fun getUser(): Call<User>
```
 perlu mendeklarasikan fungsi sebagai suspend function
 ```kotlin
 @GET("user")
suspend fun getUser(): User
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
menggunakan Callback yang terdiri dari dua metode: onResponse dan onFailure
```kotlin
val user = api.getUser()
user.enqueue(object: Callback<User> {
    override fun onResponse(call: Call<User>, response: Response<User>) {
        // handle response
    }
    override fun onFailure(call: Call<User>, t: Throwable) {
        // handle failure
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
perlu menambahkan pengecekan untuk status kode respons dalam onResponse
```kotlin
val call = api.getUser()
call.enqueue(object: Callback<User> {
    override fun onFailure(call: Call<User>, t: Throwable) {
        // handle failure
    }
    override fun onResponse(call: Call<User>, response: Response<User>) {
        if (response.isSuccessful) {
            // handle success
        } else {
            // handle error
        }
    }
})
```
---

#### 30. Perbaiki kode pemanggilan API ini agar menggunakan `suspend` function dan `try-catch`:

```kotlin
val result = api.getUser()
val data = result.body()
```
menangani exceptions menggunakan try-catch untuk menangkap kesalahan yang terjadi saat pemanggilan API
```kotlin
try {
    val data = api.getUser()  // API call as a suspend function
    // handle the data
} catch (e: Exception) {
    // handle the error
}
```
---
