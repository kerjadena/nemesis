### 📖 Cerita:

Kamu adalah pengembang untuk sebuah aplikasi bimbingan belajar yang ingin menyimpan data siswa dan nilai-nilainya untuk tiap mata pelajaran. Data bisa dianalisis dan ditampilkan dengan berbagai tampilan.

---

### 🎯 Fitur Wajib:

1. **Tambah Data Siswa**

   - Input nama siswa
   - Input mapel dan nilainya
   - Simpan dalam struktur data `Map<String, MutableList<Int>>`

2. **Lihat Semua Data Siswa**

   - Cetak semua nama siswa dan seluruh nilai-nya
   - Hitung rata-rata nilai per siswa

3. **Cari Siswa dengan Nilai Tertinggi**

   - Cetak nama siswa dan nilai tertingginya

4. **Cari Semua Siswa yang Lulus**

   - Tampilkan siswa dengan rata-rata nilai ≥ 75

5. **Keluar**

---

### 🧠 Contoh Struktur Data:

```kotlin
val dataNilai: MutableMap<String, MutableList<Int>> = mutableMapOf()

// Contoh:
dataNilai["Andi"] = mutableListOf(90, 85, 88)
dataNilai["Budi"] = mutableListOf(60, 70, 65)
```

---

### ✅ Ekspektasi Output:

```
=== MENU NILAI SISWA ===
1. Tambah Nilai Siswa
2. Lihat Semua Data
3. Cari Nilai Tertinggi
4. Siswa yang Lulus
5. Keluar

Pilih menu: 2

Nama: Andi
Nilai: 90, 85, 88
Rata-rata: 87.67

Nama: Budi
Nilai: 60, 70, 65
Rata-rata: 65.0
```

---

### 💡 Fitur Bonus (Opsional):

- Tambahkan validasi input
- Buat fungsi `fun hitungRataRata(nilai: List<Int>): Double`
- Tambahkan fitur edit nilai siswa
- Gunakan `groupBy`, `filter`, `maxByOrNull` untuk manipulasi data

---

Kalau kamu ingin, saya bisa bantu:

- 📄 Buat file `.md` untuk soal ini
- 🧾 Tambahkan dua proyek collection lain (Set & Map spesifik)
- 🧪 Buat rubrik penilaian final-nya

Ingin saya lanjut ke format markdown atau buat soal tambahan untuk Set/Map?
