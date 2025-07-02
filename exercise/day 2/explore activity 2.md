## 🔹 **1. Aplikasi: LoginApp – Simulasi Login dan Home**

### 🎯 **Tujuan Pembelajaran**

- Memahami perpindahan antar Activity (`LoginActivity` → `HomeActivity`)
- Memahami behavior lifecycle saat `finish()` dan back button
- Membedakan `onCreate()`, `onResume()`, `onPause()` saat pindah halaman

### 📱 **Fitur Utama**

- `LoginActivity`: Form login (username, password) + tombol Login
- Jika login berhasil → pindah ke `HomeActivity`
- `HomeActivity`: Menampilkan “Selamat Datang” + tombol Logout (kembali ke `LoginActivity`)

### ✅ **Requirement Teknis**

- Gunakan 2 Activity: `LoginActivity`, `HomeActivity`
- Tambahkan log di semua method lifecycle
- Gunakan `Intent` untuk berpindah Activity
- Gunakan `finish()` saat logout

### 🔍 **Eksplorasi Lifecycle**

- Apa yang terjadi ketika berpindah dari Login → Home?
- Apa perbedaan back vs tombol logout (`finish()` vs backstack)?
- Apakah `LoginActivity` tetap hidup saat di-back dari `HomeActivity`?

---

## 🔹 **2. Aplikasi: FormApp – Multi-Page Form (Activity 1, 2, dan 3)**

### 🎯 **Tujuan Pembelajaran**

- Mengelola perpindahan antar banyak Activity secara berurutan
- Memahami urutan lifecycle ketika berpindah secara berantai dan kembali
- Menyimpan dan menampilkan data antar halaman

### 📱 **Fitur Utama**

- `FormStep1Activity`: Form nama
- `FormStep2Activity`: Form umur
- `FormStep3Activity`: Tampilkan hasil input nama + umur
- Tombol "Back" bisa kembali ke langkah sebelumnya

### ✅ **Requirement Teknis**

- Gunakan 3 Activity: `FormStep1Activity`, `FormStep2Activity`, `FormStep3Activity`
- Tambahkan log lifecycle di semua Activity
- Gunakan `Intent` untuk kirim data antar Activity (`putExtra`)
- Gunakan tombol “Selesai” di akhir untuk menutup semua Activity (`finishAffinity()`)

### 🔍 **Eksplorasi Lifecycle**

- Saat kembali ke step sebelumnya, apa yang terjadi dengan lifecycle?
- Apakah data tetap ada atau perlu dikirim ulang?
- Apa perbedaan `startActivity()` vs `finish()` vs `finishAffinity()`?

---

## 🔹 **3. Aplikasi: ProfileUpdateApp – Edit dan Preview Profile**

### 🎯 **Tujuan Pembelajaran**

- Memahami lifecycle saat berpindah ke Activity untuk edit, lalu kembali
- Membedakan behavior jika Activity di-_finish_ vs tetap di backstack
- Menerapkan `startActivityForResult()` / `registerForActivityResult` (modern)

### 📱 **Fitur Utama**

- `ProfileActivity`: Menampilkan nama, umur, email
- Tombol Edit → pindah ke `EditProfileActivity`
- Di `EditProfileActivity`, user bisa ubah data → klik Save → kembali ke `ProfileActivity` dengan data baru

### ✅ **Requirement Teknis**

- Gunakan 2 Activity: `ProfileActivity`, `EditProfileActivity`
- Gunakan `startActivityForResult()` atau modern `ActivityResultLauncher`
- Tampilkan log lifecycle untuk semua perpindahan
- Update tampilan setelah menerima hasil dari Activity lain

### 🔍 **Eksplorasi Lifecycle**

- Apakah `ProfileActivity` tetap aktif saat berpindah ke Edit?
- Lifecycle apa yang terpanggil saat kembali dari Edit?
- Bagaimana data dikirim kembali setelah Activity selesai?

---
