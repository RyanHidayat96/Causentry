# Causentry UI/UX Modernization & Performance Overhaul Plan

> **Target**: Mengubah UI/UX Causentry dari prototype/harness ad-hoc menjadi aplikasi kontrol root kelas dunia setara **KernelSU Manager**, **LSPosed/Vector**, dan **HMA-OSS** — responsif 120Hz, ringan, estetika Material 3 Expressive, dan arsitektur kode bersih standar senior developer.

---

## 1. Executive Summary & Root Cause Analysis

### Kenapa UI Sekarang "Sangat Berat" (Performance Bottlenecks)
1. **Synchronous Icon Loading di Main Thread (`UiActivity.java:1407`)**:
   - Setiap baris aplikasi memanggil `getPackageManager().getApplicationIcon(pkg)` secara sinkron di UI thread.
   - Pada HP dengan 150–300 aplikasi, ini memicu ratusan IPC binder calls ke `system_server` + decode PNG/AdaptiveIconDrawable. Hasil: **UI freeze 1.5 – 3 detik** saat buka aplikasi atau ganti tab.
2. **Tidak Ada List Virtualization (Zero View Recycling)**:
   - Aplikasi tidak menggunakan `RecyclerView` maupun `LazyColumn`. Seluruh 150+ aplikasi di-inflate sekaligus ke dalam satu vertical `LinearLayout` di dalam `ScrollView`.
   - 150 baris × ~7 Views = **1.050+ objek View aktif di memori**. Android harus me-measure dan me-layout seluruh hierarki ini pada setiap frame scroll.
3. **Search Bar Menghancurkan & Membuat Ulang Seluruh Hierarki (`UiActivity.java:622`)**:
   - Listener `afterTextChanged` langsung memanggil `populateAppRows()`.
   - Mengetik 3 huruf (misal "j-m-o") memanggil `removeAllViews()` 3 kali, mengalokasikan 3.000+ View baru, dan meload 450 icon secara sinkron. Inilah penyebab utama lag parah saat mencari aplikasi.
4. **Synchronous Disk I/O & JSON Parsing di Main Thread**:
   - Pembacaan snapshot `status.json`, `apps.json`, dan file command dilakukan langsung di UI thread tanpa background dispatcher.

### Kenapa UI Sekarang "Jelek & Berantakan" (Visual & UX Debt)
1. **Ad-Hoc Programmatic Views Tanpa Design System**:
   - Margin dan padding manual tersebar acak (8dp, 16dp, 20dp, 24dp) tanpa grid 4dp/8dp konsisten.
   - Warna hex hardcoded (`SURFACE`, `LINE`, `MUTED`) tanpa sistem peran warna Material 3 (Surface, SurfaceContainer, Primary, OutlineVariant).
2. **Tab Switcher Kasar**:
   - Tombol tab dibuat dari button biasa di dalam LinearLayout tanpa animasi indikator, tanpa swipe gesture, dan ukuran label sering terpotong.
3. **Hierarki Informasi Datar**:
   - Kartu metrik atas ("TARGETS", "TEMPLATES", "DAEMON") kaku dan tidak informatif.
   - Toggle fitur (devOff, mock, isolate) berupa baris switch lepas dengan garis pemisah tipis, bukan Material 3 SwitchCard yang rapi dengan deskripsi pendukung yang jelas.
4. **Feedback Operasi Lambat & Ambigu**:
   - Tombol "Apply" hanya menampilkan Toast atau menunggu polling snapshot tanpa visual progress/shimmer state.

---

## 2. Benchmark Terhadap Modul Root Profesional

| Kriteria | Causentry Lama | HMA-OSS (`frknkrc44`) | KernelSU Manager (`tiann`) | Causentry Baru (Target) |
|---|---|---|---|---|
| **UI Framework** | Programmatic Java Views | M3 XML + RecyclerView | Jetpack Compose (M3) | **Jetpack Compose / M3** |
| **List Virtualization** | ❌ Tidak ada (1000+ Views) | ✅ `RecyclerView` + `DiffUtil` | ✅ `LazyColumn` (items keyed) | ✅ `LazyColumn` virtualized |
| **Icon Loading** | ❌ Sync di Main Thread | ✅ Async via Coil / LruCache | ✅ Async via Coil | ✅ Async Coroutines + LruCache |
| **Search Latency** | ❌ Lag parah (rebuild all) | ✅ Smooth (List filter) | ✅ 120Hz (Debounced Flow) | ✅ Debounced Flow (150ms) |
| **Design Language** | Ad-hoc Dark | Material 3 / M3 Builder | Material You / Dynamic M3 | **Material 3 Expressive** |
| **Edge-to-Edge** | Setengah-setengah | Full WindowInsets | Full WindowInsets | **Full WindowInsets Padding** |
| **State Feedback** | Raw Toast / Polling | Progress dialog / Snackbar | Animated State Transitions | **Optimistic UI + Shimmer** |

---

## 3. Arsitektur Solusi: Dua Jalur Implementasi

Proyek Causentry memiliki fondasi yang siap di `android/app` (Kotlin, Jetpack Compose, Material 3, Hilt, Room, DataStore) yang sebelumnya belum dihubungkan ke build pipeline.

### Opsi A: Flagship Jetpack Compose Modern (`android/app`) — *Rekomendasi Utama*
- **Kelebihan**: Standar industri 2026 (sama persis dengan KernelSU Manager & Thanox), declarative state, animasi fluid 120Hz bawaan, dukungan Material You dynamic color, kode 70% lebih ringkas dan maintainable.
- **Teknologi**: Kotlin 2.x, Compose BOM, Material 3 Expressive, StateFlow, Coroutines IO, Coil/AsyncIcon.
- **Packaging**: Dikompilasi via Gradle `:app:assembleRelease`, di-sign dengan `causentry.keystore`, di-package otomatis oleh `build-causentry.ps1` ke `root-module/payload/Causentry.apk`.

### Opsi B: Ultralight High-Performance Native Java (`payload-src`)
- **Kelebihan**: Ukuran APK super kecil (~60 KB), tidak butuh Gradle untuk APK (hanya untuk zygote).
- **Teknologi**: `RecyclerView` + `ListAdapter` (`DiffUtil`), `AsyncIconLoader` (`ThreadPoolExecutor` + `LruCache<String, Bitmap>`), XML Material Design components.

> **Keputusan Arsitektur**: Kita pilih **Opsi A (Compose M3)** sebagai UI utama karena Gradle **sudah menjadi dependensi aktif** di `build-causentry.ps1` (untuk compile `:zygote`), sehingga memanfaatkan Gradle untuk `:app` tidak menambah overhead toolchain baru, namun melompatkan kualitas visual dan UX ke level top-tier.

---

## 4. Phase-by-Phase Execution Plan

```
┌────────────────────────────────────────────────────────────────────────┐
│                        ROADMAP OVERHAUL UI/UX                          │
├─────────────────┬──────────────────┬─────────────────┬─────────────────┤
│    PHASE 1      │     PHASE 2      │     PHASE 3     │     PHASE 4     │
│ Core Engine &   │ Design System &  │ Feature Screens │ Motion, Haptics │
│ Async Pipeline  │ Components (M3)  │ & UX Redesign   │ & Polish Pass   │
└─────────────────┴──────────────────┴─────────────────┴─────────────────┘
```

### Phase 1: Core Engine, Reactive IPC & Async Pipeline
*Tujuan: Menghilangkan 100% lag, freeze, dan memory pressure.*
1. **Asynchronous App & Icon Pipeline**:
   - Buat `AppRepository` berbasis Kotlin Coroutines & `Dispatchers.IO`.
   - Implementasikan memory cache untuk icon (`LruCache<String, ImageBitmap>` kapasitas 100 item).
   - Icon di-load hanya saat baris masuk ke viewport (lazy loading).
2. **Debounced Search Engine**:
   - Search query dibungkus dalam `MutableStateFlow<String>`.
   - Operator `.debounce(150.milliseconds)` dan filter dijalankan di background thread tanpa mengganggu komposisi UI.
3. **Reactive Daemon Bridge**:
   - Modelkan state daemon (`DaemonState`, `AppConfigState`) ke dalam `StateFlow`.
   - Polling file bridge berjalan di worker thread dengan inotify / interval 2 detik, hanya emit state saat file snapshot berubah (SHA-256 / mtime check).

### Phase 2: Design System & Reusable Components (Material 3 Expressive)
*Tujuan: Membangun identitas visual yang elegan, bersih, modern, dan profesional.*
1. **Color Palette & Theme Tokens**:
   - Skema warna Dark Cyber/OLED:
     - `Background`: `#0B1220` (Deep obsidian navy)
     - `SurfaceContainer`: `#131C2B` (Elevated card surface)
     - `SurfaceContainerHigh`: `#1B263B` (Dropdown/Modal surface)
     - `Primary`: `#3B82F6` (Electric cobalt accent)
     - `Success`: `#22C55E` (Emerald green untuk status RUNNING/PROTECTED)
     - `Warning`: `#F59E0B` (Amber untuk STANDBY/CLOAKED)
     - `Error`: `#EF4444` (Ruby red untuk STOPPED/CRITICAL)
2. **Reusable Component Library**:
   - **`HeroStatusCard`**: Menampilkan ringkasan status proteksi (Zygisk backend, Hooks active, Target count, Daemon status, Heartbeat).
   - **`AppItemCard`**: Baris aplikasi dengan icon ter-cache, label, package monospace, status chips (Protected / Cloaked / Hardened), dan ripple feedback.
   - **`SwitchCard`**: Card terpadu untuk toggle fitur (Developer Options, Mock Location, App-Zygote) lengkap dengan icon, judul, dan penjelasan fungsi.
   - **`FilterChipRow`**: Baris chip filter modern ("Semua", "Aktif", "User", "System") dengan badge angka.
   - **`TemplateCard`**: Card manajemen template dengan daftar ringkasan paket yang disembunyikan.

### Phase 3: Screen-by-Screen UX Redesign
*Tujuan: Navigasi intuitif, mudah digunakan pemula, powerful untuk power user.*
1. **Screen 1: Dashboard & App Directory (Tab Utama)**:
   - Sticky Top Bar: Search bar terpadu yang mengecil saat di-scroll (collapsing toolbar).
   - Hero Banner status runtime.
   - `LazyColumn` dengan sticky headers ("Aplikasi Terlindungi", "Aplikasi Terpasang").
2. **Screen 2: App Detail & Per-App Bypass**:
   - Header aplikasi: Icon besar, nama aplikasi, package name, tombol quick launch.
   - Card Group:
     - *Bypass Deteksi Pengembang* (devOff, adb_enabled, adb_wifi)
     - *Bypass Lokasi Palsu* (mock_location per-app appop)
     - *Blokir Pemeriksaan App-Zygote* (isolate toggle)
     - *Template Aplikasi Tersembunyi* (dropdown selector)
   - Bottom Bar: Tombol "Simpan & Terapkan" mengambang (Floating Pill) dengan animasi loading.
3. **Screen 3: Template Management**:
   - Tampilan visual template yang ada.
   - Dialog pembuatan/pengeditan template dengan multi-select checkbox yang responsif dan pencarian cepat.
4. **Screen 4: Status & Diagnostics**:
   - Visualisasi log Zygisk & Daemon live viewer (dengan filter warna log).
   - Tombol "Re-sync Engine", "Cek SELinux", dan "Restore Default".

### Phase 4: Motion, Micro-interactions & Polish
*Tujuan: Rasa sentuhan "native premium" (haptic & motion).*
1. Animasi transisi antar tab menggunakan `AnimatedContent` / crossfade.
2. Expand/collapse animasi yang halus pada accordion detail.
3. Haptic feedback (`HapticFeedbackConstants.CLOCK_TICK` / `CONFIRM`) saat toggle switch diubah.
4. Shimmer loading placeholder saat membaca database aplikasi pertama kali.

### Phase 5: Pipeline Build & Quality Gates
*Tujuan: Sekali klik build, otomatis teroptimasi dan teruji.*
1. Perbarui `scripts/build-causentry.ps1`:
   - Kompilasi `:app:assembleRelease` menggunakan Gradle yang sudah ada.
   - R8/ProGuard minification aktif untuk memangkas ukuran APK.
   - Salin output release APK ke `root-module/payload/Causentry.apk`.
2. Tes regresi performa:
   - Ukur waktu render awal (< 300ms).
   - Ukur frame time saat scrolling list 150+ aplikasi (harus konsisten 60–120 FPS tanpa frame drop).

---

## 5. Timeline & Milestone Execution

| Phase | Fokus | Deliverables |
|---|---|---|
| **Phase 1** | Performance & Async Foundation | `AppRepository`, `IconLoader` off-thread, `LazyColumn` state, reactive bridge |
| **Phase 2** | Design Tokens & Base Components | Material 3 Theme, ColorScheme, `HeroStatusCard`, `AppItemCard`, `SwitchCard` |
| **Phase 3** | Screen Flow & Layout Assembly | Home list, App Detail screen, Template manager, Diagnostics screen |
| **Phase 4** | Motion, Polish & Edge-to-Edge | Transitions, Insets, Haptics, Search debounce, Optimistic updates |
| **Phase 5** | Build Pipeline & Device Verification | Gradle packaging integration, R8 ProGuard, 120Hz test on device |
