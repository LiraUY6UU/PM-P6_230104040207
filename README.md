# StudentLog - SQLite & Room ORM Lab (Praktikum 6)

Repository ini berisi source code aplikasi **StudentLog**, sebuah aplikasi Android yang dikembangkan sebagai bagian dari **Praktikum Mobile Programming Minggu ke-6**. Fokus utama praktikum ini adalah implementasi penyimpanan data lokal yang terstruktur dan persisten menggunakan **Room Database** (lapisan abstraksi di atas SQLite).

## 📌 Identitas Mahasiswa
* **Nama:** Lira Anggraini
* **NIM:** 230104040207
* **Kelas:** TI23A
* **Mata Kuliah:** Mobile Programming

---

## 📖 Deskripsi Proyek
**StudentLog** adalah aplikasi manajemen data mahasiswa sederhana yang memungkinkan pengguna untuk melakukan operasi **CRUD** (*Create, Read, Update, Delete*) secara persisten tanpa bergantung pada koneksi internet.

Aplikasi ini mendemonstrasikan penggunaan arsitektur **MVVM (Model-View-ViewModel)** dengan **Repository Pattern** untuk memisahkan logika bisnis, akses data, dan antarmuka pengguna, menjadikan kode lebih bersih, modular, dan mudah diuji.

---

## 🚀 Fitur Utama

### 1. Manajemen Data Mahasiswa (CRUD)
* **Tambah Data:** Input Nama, NIM, dan Email mahasiswa baru.
* **Lihat Daftar:** Menampilkan seluruh data mahasiswa yang tersimpan dalam `RecyclerView` / `LazyColumn`.
* **Edit Data:** Memperbarui informasi mahasiswa yang sudah ada.
* **Hapus Data:** Menghapus data mahasiswa dari database.

### 2. Pencarian & Filter (Advanced)
* **Search:** Pencarian data mahasiswa berdasarkan nama secara *real-time*.
* **Sort:** Mengurutkan daftar mahasiswa (A-Z atau Z-A).
* **Validation:** Validasi input untuk memastikan data Nama dan NIM tidak boleh kosong.

### 3. Arsitektur & Performa
* **Room Database:** Menggunakan Entity, DAO, dan Database class untuk akses SQLite yang aman (compile-time verification).
* **Asynchronous Operation:** Menggunakan **Kotlin Coroutines** dan **Flow** untuk menjalankan operasi database di *background thread* agar UI tidak macet (ANR).
* **ViewModel & Repository:** Memastikan data tetap aman saat konfigurasi perangkat berubah (misal: rotasi layar).

---

## 🛠️ Tech Stack & Libraries

* **Bahasa:** Kotlin
* **UI Toolkit:** Jetpack Compose (Material 3)
* **Database:** Android Room (SQLite Abstraction)
* **Concurrency:** Kotlin Coroutines & Flow
* **Architecture:** MVVM (Model-View-ViewModel) + Repository Pattern
* **Dependency Injection:** Manual Injection / Hilt (sesuaikan dengan implementasi)

---

## 📸 Screenshots
<img width="1080" height="2400" alt="Screenshot_20260105_075500" src="https://github.com/user-attachments/assets/db77a01a-eed5-4d7e-828f-0b5464a0d7c0" />
<img width="1080" height="2400" alt="Screenshot_20260105_075518" src="https://github.com/user-attachments/assets/46d14ab8-d375-4553-802e-dd11d96a5c0b" />
<img width="1080" height="2400" alt="Screenshot_20260105_075528" src="https://github.com/user-attachments/assets/4b86c169-8159-4192-86b0-f14a753197ea" />
<img width="1080" height="2400" alt="Screenshot_20260105_075544" src="https://github.com/user-attachments/assets/c5e478c2-ee68-4545-9159-8c56d8f4404e" />
<img width="1080" height="2400" alt="Screenshot_20260105_075605" src="https://github.com/user-attachments/assets/b8ca4a9f-3dd8-4bf7-81a2-f182c0820c81" />
<img width="1080" height="2400" alt="Screenshot_20260105_075700" src="https://github.com/user-attachments/assets/63737f42-c431-41e1-9a5b-2c1776967694" />
<img width="1080" height="2400" alt="Screenshot_20260105_075723" src="https://github.com/user-attachments/assets/3a037817-208f-46ed-902c-8edc50439615" />
<img width="1080" height="2400" alt="Screenshot_20260105_075730" src="https://github.com/user-attachments/assets/6b89cd13-51cc-4848-9499-3f587d2eb2ca" />
<img width="1080" height="2400" alt="Screenshot_20260105_075744" src="https://github.com/user-attachments/assets/a58fe4fd-630d-4ea7-9206-c47cea73f8e3" />
<img width="1080" height="2400" alt="Screenshot_20260105_075753" src="https://github.com/user-attachments/assets/2c6cfc5f-cafe-47ce-8423-5799c9fd014f" />
<img width="1080" height="2400" alt="Screenshot_20260105_075800" src="https://github.com/user-attachments/assets/e881da51-d4b1-476c-bad6-3aa11846dd0d" />
<img width="1080" height="2400" alt="Screenshot_20260105_075806" src="https://github.com/user-attachments/assets/f07cb377-7acb-45fe-a4c9-6697ceff1a0b" />

---

## 💻 Cara Menjalankan Project
1.  **Clone** repository ini ke komputer lokal Anda.
2.  Buka **Android Studio**.
3.  Biarkan proses **Gradle Sync** selesai (pastikan koneksi internet stabil untuk mengunduh library Room).
4.  Pastikan plugin **KSP (Kotlin Symbol Processing)** sudah terkonfigurasi dengan benar di `build.gradle.kts`.
5.  Jalankan aplikasi pada **Emulator** atau **Perangkat Fisik**.

---

## 📝 Catatan Penting
* **Database Inspector:** Anda dapat melihat isi database secara langsung saat aplikasi berjalan menggunakan fitur *App Inspection* di Android Studio.
* **Validasi:** Pastikan NIM bersifat unik (Primary Key) untuk menghindari konflik data.

---

**Dosen Pengampu:** Muhayat, M.IT
