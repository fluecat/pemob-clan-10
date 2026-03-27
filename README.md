# 🏃‍♂️ Aplikasi Catat Lari (Laritrack)

Aplikasi berbasis Android untuk membantu pengguna mencatat aktivitas lari mereka. Aplikasi ini dilengkapi dengan fitur registrasi pengguna, beranda informasi, profil, dan form pencatatan progres lari.

## 👥 Informasi Clan & Pembagian Tugas

### Anggota Clan

| No | NPM | Nama |
|----|-----|------|
| 1 | 170 | Cutrin Joy M.T Sihombing |
| 2 | 171 | Kaka Dimas Soehendra Putra |
| 3 | 175 | Lutfia Nur Sabrina |
| 4 | 178 | Gratia Novelin Tamba |

### Pembagian Pengerjaan Fragment

* **Welcome dan Beranda**
    * **Kontributor:** Gratia Novelin Tamba (178)
    * **Nama File Logic:** `WelcomeFragment.kt` & `BerandaFragment.kt`
    * **Nama File Layout:** `fragment_welcome.xml` & `fragment_beranda.xml`

* **Registrasi Akun**
    * **Kontributor:** Lutfia Nur Sabrina (175)
    * **Nama File Logic:** `RegisterFragment.kt`
    * **Nama File Layout:** `fragment_register.xml`

* **Profil**
    * **Kontributor:** Cutrin Joy M.T Sihombing (170)
    * **Nama File Logic:** `ProfilFragment.kt`
    * **Nama File Layout:** `fragment_profil.xml`

* **Form Pencatat Lari**
    * **Kontributor:** Kaka Dimas Soehendra Putra (171)
    * **Nama File Logic:** `CatatLariFragment.kt`
    * **Nama File Layout:** `fragment_catat_lari.xml`

## 🆕 Fitur Quest Terbaru

### Data Class
- **`UserRegistration`** — Menampung data form registrasi (nama, email, password) tanpa re-type password
- **`RunData`** — Menampung data form catat lari (tanggal, jarak KM, waktu, catatan)

### Perpindahan Object Antar Fragment (Safe Args)
- **Register → Login**: Object `UserRegistration` dikirim dari `RegisterFragment` ke `LoginFragment`. Email otomatis terisi di form login setelah registrasi berhasil.
- **Catat Lari → Profil**: Object `RunData` dikirim dari `CatatLariFragment` ke `ProfilFragment`. Ringkasan data lari ditampilkan via Toast setelah penyimpanan.

### Icon Aplikasi
- Icon aplikasi custom bergambar orang berlari dengan warna hijau accent app (`#13EC5B`) dan background gelap (`#102216`)
- Icon dibuat sendiri menggunakan **Android Vector Drawable** (bukan diambil dari sumber luar)

### Icon di Menu
- Bottom navigation menggunakan icon bawaan Android:
  - Beranda: `ic_menu_myplaces`
  - Aktivitas: `ic_menu_sort_by_size`
  - Rute: `ic_dialog_map`
  - Profil: `ic_menu_info_details`

## 🖼️ Referensi Gambar & Aset

| Aset | Sumber | Lisensi |
|------|--------|---------|
| Icon Aplikasi (foreground) | Dibuat sendiri (Vector Drawable) | — |
| Icon Aplikasi (background) | Dibuat sendiri (Vector Drawable) | — |
| Icon Bottom Navigation | Android System Icons (`@android:drawable/*`) | Apache 2.0 |
| Icon lainnya dalam UI | Android System Icons (`@android:drawable/*`) | Apache 2.0 |

## 🛠️ Teknologi yang Digunakan
* **Platform:** Android
* **Bahasa Pemrograman:** Kotlin
* **Desain Antarmuka:** XML Layouts
* **Navigation:** Jetpack Navigation Component + Safe Args
* **Data Passing:** Parcelable Data Class + Safe Args
