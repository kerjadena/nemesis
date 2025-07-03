---

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

```
1. Komponen Android yang digunakan untuk menampilkan teks adalah:
   C. TextView

2. Komponen UI yang digunakan untuk mengambil input teks dari pengguna adalah:
   C. EditText

3. Untuk menampilkan gambar, kita menggunakan komponen:
   B. ImageView

4. Layout yang memungkinkan penempatan elemen secara bebas dengan constraint disebut:
   C. ConstraintLayout

5. Manakah yang merupakan komponen UI untuk menampilkan daftar data besar secara efisien?
   C. RecyclerView

```
---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. `LinearLayout` hanya bisa digunakan untuk tata letak horizontal.(F)
7. `Button` bisa digunakan untuk menampilkan gambar.(F)
8. `ScrollView` hanya dapat memiliki satu child langsung.(F)
9. `Toast` digunakan untuk menampilkan notifikasi yang butuh interaksi pengguna.(F)
10. `findViewById()` digunakan untuk mengambil referensi UI dari layout XML.(T)

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa nama layout yang cocok untuk membuat UI kompleks dengan aturan posisi antar elemen?
ConstraintLayout
12. Sebutkan dua komponen UI untuk input pilihan pengguna!
ToggleButton, CheckBox
13. Fungsi dari `TextInputLayout` adalah untuk...?
membungkus EditText untuk menambahkan label animasi, hint, dan error message
14. Bagaimana cara menambahkan teks ke `TextView` di Kotlin?
menggunakan textview
15. Apa fungsi `RecyclerView.Adapter` dalam RecyclerView?
menghubungkan data dengan viewholder, , membuat viewholder dan bind pada tiap item di recylerview
16. Apa perbedaan utama antara `TextView` dan `EditText`?
textview hanya menampilkan, edittext bisa untuk input juga
17. Komponen apa yang digunakan untuk membuat notifikasi pop-up singkat di layar?
toast
18. Sebutkan satu perbedaan antara `LinearLayout` dan `RelativeLayout`!
linearlayout anaknya berurutan vertikal atau horizontal, relativelayout menata anaknya relatif terhadap sibling atau parent
19. Apa nama komponen UI untuk menampilkan teks dengan opsi "hint"?
edittext
20. Jika ingin menambahkan ikon di atas tombol, komponen apa yang sebaiknya digunakan?
imagebutton
---

## 🛠️ **Bagian 4: Perbaiki Kode (10 Soal)**

21.

```xml
<TextView
    android:layout_width="match_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```
match_content bukan nilai yang valid untuk layout_width
```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello">
```
22.

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text("Click Me")
```
salah penulisan btn.text
```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text = "Click me"
```
23.

```xml
<LinearLayout
    android:orientation="vertikal"
    ...>
```
android hanya menggunakan bahasa inggris
```xml
<LinearLayout
    android:orientation="vertical"
    ...>
```
24.

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.setText = "Hi"
```
salah penulisan text.text
```kotlin
val text = findViewById<TextView>(R.id.textView)
text.text = "Hi"
```
25.

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="image.png" />
```
android:src harus merujuk id resource bukan nama file langsung
```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="@drawable/image" />
```

26.

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.getText().toString
```
salah value 
```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.text.toString()
```

27.

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething()" />
```
onclick hanya berisi method tanpa ()
```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething" />
```
28.

```kotlin
Toast.makeText(this, "Saved!", LENGTH_LONG).show()
```
LENGTH_LONG adalah konstanta di kelas Toast, sehingga harus dipanggil sebagai Toast.LENGTH_LONG.
```kotlin
Toast.makeText(this, "Saved!", Toast.LENGTH_LONG).show()
```

29.

```xml
<EditText
    android:hintText="Enter name"
    ... />
```
atribut tidak valid
```xml
<EditText
    android:hint="Enter name"
    ...>
```
30.

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContent(layout)
```
harusnya menggunakan setcontentview bukan setcontent
```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContentView(layout)
```

---
