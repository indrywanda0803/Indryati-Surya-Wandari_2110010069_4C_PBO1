# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi **pembelian pulsa** menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input dari pengguna berupa nama pembeli, nomor HP, pilihan operator kartu (XL, Telkomsel, Axis), dan nominal pulsa yang ingin dibeli. Aplikasi akan menampilkan **nota pembelian** dengan rincian data dan menambahkan biaya tambahan sebesar **Rp3.000** sebagai biaya layanan.

Aplikasi ini mengimplementasikan berbagai konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah blueprint dari objek. Pada proyek ini, `PembelianPulsa`, `NotaPembelian`, dan `ProgramUtama` adalah contoh class.

```java
public class PembelianPulsa {
    ...
}

public class NotaPembelian {
    ...
}

public class ProgramUtama {
    ...
}
```

2. **Object** adalah instance dari class. Misalnya:

```java
PembelianPulsa pembelian = new PembelianPulsa(nama, nomor, kartu, nominal);
```

3. **Atribut** adalah variabel dalam class. Contohnya:

```java
private String nama, noHP, kartu;
private int nominal;
```

4. **Constructor** adalah method khusus yang dijalankan saat object dibuat:

```java
public PembelianPulsa(String nama, String noHP, String kartu, int nominal) {
    this.nama = nama;
    this.noHP = noHP;
    this.kartu = kartu;
    this.nominal = nominal;
}
```

5. **Mutator (setter)** untuk mengubah nilai atribut (bisa ditambahkan jika diperlukan):

```java
public void setNominal(int nominal) {
    this.nominal = nominal;
}
```

6. **Accessor (getter)** untuk mengambil nilai atribut:

```java
public String getNama() { return nama; }
public int getTotalBayar() { return nominal + 3000; }
```

7. **Encapsulation** diterapkan dengan menjadikan atribut `private` dan mengaksesnya via getter/setter.

8. **Inheritance** bisa diterapkan jika aplikasi dikembangkan lebih lanjut, misalnya membuat class `Transaksi` sebagai superclass.

9. **Polymorphism** terlihat dari penggunaan method `cetakNota()` yang dapat diubah polanya jika ada jenis nota lain.

10. **Seleksi** digunakan untuk memilih operator kartu berdasarkan input:

```java
switch(pilihan) {
    case 1: kartu = "XL"; break;
    case 2: kartu = "Telkomsel"; break;
    case 3: kartu = "Axis"; break;
    default: kartu = "Tidak Diketahui";
}
```

11. **Perulangan** digunakan untuk input lebih dari satu transaksi jika dikembangkan.

12. **Input Output Sederhana**:

```java
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nama Pembeli: ");
String nama = input.nextLine();
```

13. **Array** bisa digunakan untuk menyimpan banyak transaksi:

```java
PembelianPulsa[] daftarPembelian = new PembelianPulsa[10];
```

14. **Error Handling** diterapkan untuk mengantisipasi kesalahan input:

```java
try {
    int nominal = input.nextInt();
} catch (Exception e) {
    System.out.println("Input tidak valid!");
}
```

## Usulan nilai

| No | Materi         | Nilai   |
| -- | -------------- | ------- |
| 1  | Class          | 5       |
| 2  | Object         | 5       |
| 3  | Atribut        | 5       |
| 4  | Constructor    | 5       |
| 5  | Mutator        | 5       |
| 6  | Accessor       | 5       |
| 7  | Encapsulation  | 5       |
| 8  | Inheritance    | 5       |
| 9  | Polymorphism   | 10      |
| 10 | Seleksi        | 5       |
| 11 | Perulangan     | 5       |
| 12 | IO Sederhana   | 10      |
| 13 | Array          | 15      |
| 14 | Error Handling | 15      |
|    | **TOTAL**      | **100** |

## Pembuat

Nama: Indryati Surya Wandari  
NPM: 2110010069
