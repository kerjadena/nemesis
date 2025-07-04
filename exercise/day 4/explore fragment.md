## 👥 **Soal 1 – “Pendaftaran Akun Multi Langkah”**

### 📌 Deskripsi:

Buat aplikasi pendaftaran akun yang dibagi dalam **4 tahap**, di mana setiap tahap ditampilkan dalam fragment berbeda.

### 🧩 Requirement:

1. Gunakan **1 Activity** dan **4 Fragment**:

   - `NameFragment`: isi nama lengkap dan email
   - `UsernameFragment`: isi username & password
   - `SummaryFragment`: tampilkan ringkasan data yang sudah diisi
   - `SuccessFragment`: tampilkan pesan sukses & tombol kembali ke awal

2. Navigasi: `Next` dan `Back` antar fragment
3. Data harus dikirim antar fragment (gunakan `Bundle` atau simpan di `Activity`)

### 🧱 Komponen yang Digunakan:

- `EditText`, `Button`, `TextView`, `ConstraintLayout`
- `FragmentManager`, `FragmentTransaction`
- Navigasi antar fragment
- `setArguments()` dan `requireArguments()` / shared viewmodel

### 🎯 Tujuan:

- Latihan fragment berurutan + pengiriman data
- Navigasi dua arah antar fragment
- Fragment kompleks sebagai form multi-step

---

## 👥 **Soal 2 – “Marketplace Sederhana”**

### 📌 Deskripsi:

Buat aplikasi marketplace dengan **tampilan produk**, **detail**, dan **keranjang belanja (dummy)**.

### 🧩 Requirement:

1. Gunakan **1 Activity** dan **5 Fragment**:

   - `LoginFragment`: form login sederhana
   - `ProductListFragment`: tampilkan 5 produk (nama, harga, tombol detail)
   - `ProductDetailFragment`: tampilkan detail produk, tombol “Tambah ke Keranjang”
   - `CartFragment`: tampilkan list produk dummy yang "dibeli"
   - `AboutFragment`: tampilkan info tim

2. Navigasi:

   - Setelah login, pindah ke ProductListFragment
   - Klik produk → buka detail
   - Tombol “Keranjang” bisa dari toolbar/menu sederhana

3. Semua data dummy/hardcoded

### 🧱 Komponen:

- `RecyclerView`, `TextView`, `Button`, `ImageView`
- Fragment transaksi + komunikasi antar fragment
- Dummy produk di adapter

### 🎯 Tujuan:

- Simulasi alur aplikasi nyata
- Fragment banyak arah + kondisi berpindah
- List & detail fragment + cart logic sederhana

---

## 👥 **Soal 3 – “Kuis Interaktif Fragment”**

### 📌 Deskripsi:

Buat aplikasi kuis 5 soal, tiap soal di fragment sendiri, dengan halaman hasil di akhir.

### 🧩 Requirement:

1. Gunakan **1 Activity** dan **6 Fragment**:

   - `StartFragment`: halaman awal + tombol “Mulai Kuis”
   - `Question1Fragment` s/d `Question5Fragment`: masing-masing 1 pertanyaan + 4 pilihan (radio)
   - `ResultFragment`: menampilkan skor total benar

2. Navigasi dari soal ke soal harus urut, tombol “Next”

3. Simpan jawaban user di Activity (pakai variable sederhana)

4. Skor dihitung di akhir

### 🧱 Komponen:

- `RadioGroup`, `Button`, `TextView`
- Navigasi terstruktur
- Logika skor (if/else)

### 🎯 Tujuan:

- Navigasi linear + logika perhitungan
- Form interaktif antar fragment
- Menyusun alur panjang pakai fragment

---

## 👥 **Soal 4 – “Profil Pengguna + Edit”**

### 📌 Deskripsi:

Buat aplikasi untuk menampilkan profil pengguna dan mengedit datanya secara fragment-based.

### 🧩 Requirement:

1. Gunakan **1 Activity** dan **4–5 Fragment**:

   - `LoginFragment`: input nama pengguna
   - `ProfileFragment`: menampilkan nama dan deskripsi
   - `EditNameFragment`: ubah nama
   - `EditDescFragment`: ubah deskripsi
   - `AboutFragment`: tentang aplikasi

2. Navigasi:

   - Setelah login → ke ProfileFragment
   - Tombol edit nama / deskripsi → pindah ke fragment edit masing-masing
   - Setelah diedit, kembali ke ProfileFragment dan data berubah

3. Data bisa disimpan di Activity atau lewat `setArguments`

### 🧱 Komponen:

- `EditText`, `TextView`, `Button`
- Navigasi + pengembalian data antar fragment
- Penggunaan kondisi (jika nama kosong, tidak bisa lanjut)

### 🎯 Tujuan:

- Navigasi dua arah + update data
- Fragment sebagai pengganti “form page”
- Simulasi aplikasi profil edit yang umum digunakan

---
