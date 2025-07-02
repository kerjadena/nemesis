## 📌 ** Eksplorasi Lifecycle Activity**

### 👥 Tim 1 – **Rotasi Layar**

1. Buat 1 Activity sederhana (misal: MainActivity).
2. Tambahkan log di setiap lifecycle method (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`, `onRestart`).
3. Jalankan aplikasi dan lakukan **rotasi layar** (portrait ke landscape dan sebaliknya).
4. Catat urutan method yang dipanggil di Logcat.
5. Jelaskan kenapa terjadi pemanggilan ulang `onCreate()`.
6. Opsional: Tambahkan `android:configChanges="orientation"` di manifest, lalu bandingkan behavior-nya.

---

### 👥 Tim 2 – **Pindah antar Activity**

1. Buat 2 Activity: `MainActivity` dan `SecondActivity`.
2. Tambahkan log di semua lifecycle method di kedua Activity.
3. Tambahkan tombol di `MainActivity` untuk pindah ke `SecondActivity`.
4. Jalankan aplikasi, klik tombol ke `SecondActivity`, lalu tekan tombol back.
5. Catat urutan pemanggilan lifecycle method di Logcat.
6. Jelaskan behavior lifecycle ketika berpindah antar activity dan saat kembali.

---

### 👥 Tim 3 – **Minimize dan Restore**

1. Buat 1 Activity sederhana (misal: MainActivity).
2. Tambahkan log di semua lifecycle method.
3. Jalankan aplikasi, lalu tekan tombol Home (aplikasi dimasukkan ke background).
4. Buka kembali aplikasi dari recent apps.
5. Catat urutan method lifecycle yang dipanggil saat minimize dan saat restore.
6. Jelaskan perbedaan antara `onPause`, `onStop`, dan `onDestroy` dalam konteks ini.

---

## 📋 **Catatan untuk Semua Tim**

- Gunakan `Log.d("LIFECYCLE", "onCreate dipanggil")` di setiap method untuk observasi di Logcat.
- Pastikan setiap tim membuat **catatan urutan lifecycle** dan **penjelasan singkat** tentang kenapa method tersebut dipanggil.
- persentasikan dalam bentuk PPT dan running code
---
