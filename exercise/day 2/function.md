Berikut adalah **5 challenge Kotlin dengan storytelling** dari kategori **Fungsi (Functions)**. Setiap soal didesain untuk melatih keterampilan membuat dan menggunakan fungsi (`fun`), parameter, return value, dan default arguments.

---

# 🧮 Kategori: Fungsi (Functions)

**Total Soal: 5** | **Level: Pemula–Menengah**

---

### 🧩 Challenge 1 – **"Hitung Luas Persegi"**

**📖 Cerita**:
Kamu membantu adikmu menghitung luas bangun datar menggunakan fungsi.

**🎯 Tugas**:

* Buat fungsi `luasPersegi(sisi: Int): Int`
* Panggil fungsi dengan input user
* Tampilkan hasil

**⚙️ Requirement**:

* Fungsi dengan parameter dan return
* Tipe data `Int`

**✅ Ekspektasi Output**:

```
Input sisi: 5  
Luas persegi: 25
```

---

### 🧩 Challenge 2 – **"Halo, Dunia Kotlin!"**

**📖 Cerita**:
Kamu membuat fungsi untuk menyapa nama peserta bootcamp.

**🎯 Tugas**:

* Buat fungsi `sapa(nama: String)`
* Tampilkan pesan: "Halo, \[nama]!"
* Panggil fungsi 2 kali dengan nama berbeda

**⚙️ Requirement**:

* Fungsi tanpa return
* Tipe data `String`

**✅ Ekspektasi Output**:

```
Halo, Rina!  
Halo, Wahyu!
```

---

### 🧩 Challenge 3 – **"Konversi Suhu"**

**📖 Cerita**:
Kamu sedang membuat alat konversi suhu dari Celcius ke Fahrenheit.

**🎯 Tugas**:

* Buat fungsi `konversiSuhu(celcius: Double): Double`
* Rumus: Fahrenheit = (celcius × 9/5) + 32
* Cetak hasil konversi

**⚙️ Requirement**:

* Fungsi dengan return
* Gunakan `String.format` jika ingin 2 desimal

**✅ Ekspektasi Output**:

```
Suhu dalam Fahrenheit: 98.60
```

---

### 🧩 Challenge 4 – **"Kalkulator Modular"**

**📖 Cerita**:
Kamu diminta membuat kalkulator yang memanggil fungsi berbeda untuk tiap operasi.

**🎯 Tugas**:

* Buat 4 fungsi: `tambah`, `kurang`, `kali`, `bagi`
* Input dua angka dan operator
* Panggil fungsi sesuai pilihan

**⚙️ Requirement**:

* Gunakan `when` untuk pemilihan fungsi

**✅ Ekspektasi Output**:

```
Masukkan angka pertama: 10  
Masukkan angka kedua: 5  
Pilih operasi: +  
Hasil: 15
```

---

### 🧩 Challenge 5 – **"Sapa Dengan Nama Default"**

**📖 Cerita**:
Saat tidak tahu nama user, program tetap bisa menyapa dengan nama default.

**🎯 Tugas**:

* Buat fungsi `halo(nama: String = "Pengunjung")`
* Cetak: `Halo, [nama]!`
* Uji fungsi tanpa argumen dan dengan nama

**⚙️ Requirement**:

* Parameter default di fungsi

**✅ Ekspektasi Output**:

```
Halo, Pengunjung!  
Halo, Anisa!
```

---
