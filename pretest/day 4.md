```

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

1. Fragment digunakan untuk: 
   C. Membagi antarmuka aplikasi ke dalam bagian modular

2. Kelas dasar untuk membuat fragment adalah:  
   C. `Fragment`

3. Metode untuk menambahkan fragment ke activity adalah:  
   B. `beginTransaction().add()`

4. Untuk mengelola fragment, kita menggunakan: 
   C. `FragmentManager`

5. Layout container yang umum digunakan untuk menempatkan fragment di XML adalah:
   C. `FrameLayout`


```

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity.(F)
7. Satu activity bisa menampilkan lebih dari satu fragment.(T)
8. Kita tidak bisa mengganti fragment yang sedang ditampilkan.(F)
9. Fragment bisa mengakses komponen UI dari activity langsung.(T)
10. Fragment tidak bisa hidup tanpa activity.(T)

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android?
mengelola fragment, contohnya menambah, mengganti, atau hapus fragment dalam activity
12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment?
metode onCreateView
13. Sebutkan dua metode lifecycle penting pada fragment!
onCreate yang dipanggil pertama kali dan onDestroy untuk menghancurkan
14. Bagaimana cara mengirim data dari activity ke fragment?
menggunakan object Bundle untuk menyimpan data kemudia setArguments() pada fragment untuk kirim datanya
15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?
lebih sederhana dan fleksibel untuk menampung fragment
16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?
replace() mengganti fragment yang sudah ada, add() menambahkan tanpa menghapus
17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.
tidak bisa karena butuh activity sebagai host nya
18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?
menggunakan popBackStack() pada FragmentManager()
19. Apa tujuan dari `setArguments(Bundle)` di fragment?
mengirimkan data sebelum fragment dibuat, data yang disimpan di Bundle akan ready saat fragment di recreate
20. Sebutkan alasan menggunakan fragment dibanding activity!
memungkinkan komponen untuk digunakan berulang, dan pengelolaan layar yang lebih efisien

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction.add(R.id.container, fragment).commit()
```
tidak ada () pada beginTransaction
```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
```

22.

```kotlin
class MyFragment : Fragment {
    override fun onCreateView(...) { ... }
}
```
class MyFragment tidak ada ()
```kotlin
class MyFragment : Fragment () {
    override fun onCreateViw(...){...}
}
```

23.

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />
```
typo pada layout_height
```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments(bundle)
```
tidak perlu menggunakan () untuk memanggil arguments
```kotlin
val bundle = Bundle().apply {
bundle.putString("key","value")
} 
fragment.arguments = bundle
```

25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()
```
addToBackStack() butuh parameter name, jadi kasih null kalau gaada nama
```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack(null)
    .commit
```

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```


27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle(args)
```
tidak ada metode setBundle() pada fragment
```kotlin
val fragment = MyFragment()
val args = Bundle().apply{putInt("id",10)}
fragment.arguments = args
```
28.

```kotlin
supportFragmentManager.pop()
```
gaada popBackStack()
```kotlin
supportFragmentManager.popBackStack()
```


29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()
```
menggunakan commit() agar lebih aman dan mencegah kehilangan data
```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commit()
```

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)
```
menambahkan container dan false pada metode inflate()
```kotlin
val view = inflater.inflate(R.layout.fragment_home, container, false)

```
---
