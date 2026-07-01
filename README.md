# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data **Service Handphone** menggunakan Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pelanggan, nomor handphone, merk handphone, jenis kerusakan, dan biaya service. Program kemudian menyimpan data tersebut, menampilkan seluruh data service, mencari data pelanggan berdasarkan nama, menghitung total biaya service, serta menghapus data service apabila telah selesai.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berbasis Objek (PBO) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding), Seleksi, Perulangan, Input Output Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang berkaitan dengan konsep PBO :

1. **Class** adalah blueprint atau cetakan untuk membuat object. Pada program ini terdapat tiga class yaitu `Pelanggan`, `ServiceHP`, dan `Main`.

```bash
public class Pelanggan {
    ...
}

public class ServiceHP extends Pelanggan {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah hasil instansiasi dari sebuah class. Pada program ini, object dibuat ketika pengguna menambahkan data service handphone.

```bash
ServiceHP service = new ServiceHP(
    nama,
    noHp,
    merkHp,
    kerusakan,
    biaya
);
```

3. **Atribut** adalah variabel yang terdapat di dalam class dan digunakan untuk menyimpan data. Pada program ini terdapat atribut nama, noHp, merkHp, kerusakan, dan biaya.

```bash
private String nama;
private String noHp;
private String merkHp;
private String kerusakan;
private int biaya;
```

4. **Constructor** adalah method yang pertama kali dijalankan ketika object dibuat. Constructor terdapat pada class `Pelanggan` dan `ServiceHP`.

```bash
public Pelanggan(String nama,String noHp,String merkHp){

    this.nama=nama;
    this.noHp=noHp;
    this.merkHp=merkHp;

}

public ServiceHP(String nama,String noHp,String merkHp,
                 String kerusakan,int biaya){

    super(nama,noHp,merkHp);

    this.kerusakan=kerusakan;
    this.biaya=biaya;

}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai atribut. Pada kode ini, `setNama`,`setNoHp`,`setMerkHp`,`setKerusakan`,dan`setBiaya` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setNoHp(String noHp) {
        this.noHp = noHp;
}

public void setMerkHp(String merkHp) {
        this.merkHp = merkHp;
}

public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
}
public void setBiaya(int biaya){
    this.biaya=biaya;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai atribut. Pada kode ini, `getNama`, `getNoHp`, `getMerkHp`, `getKerusakan`,dan `getBiaya`. adalah contoh method accessor.

```bash
public String getNama(){
    return nama;
}

public String getNoHp(){
    return noHp;
}

public String getMerkHp(){
    return merkHp;
}

public String getKerusakan(){
    return kerusakan;
}

public int getBiaya(){
    return biaya;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`,`noHp`,`merkHp`,`kerusakan`, dan `biaya`.dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String noHp;
private String merkHp;
private String kerusakan;
private int biaya;
```

8. **Inheritance** adalah pewarisan class. Pada program ini class `ServiceHP` mewarisi class `Pelanggan`.

```bash
public class ServiceHP extends Pelanggan{

}
```

9. **Polymorphism** adalah konsep dimana method yang sama dapat memiliki perilaku yang berbeda. Pada program ini digunakan **Method Overriding** pada method `toString()`.

```bash
@Override
public String toString(){

    return "Nama : "+getNama()+
           "\nNo HP : "+getNoHp()+
           "\nMerk HP : "+getMerkHp()+
           "\nKerusakan : "+kerusakan+
           "\nBiaya : Rp"+biaya;

}
```

10. **Seleksi** digunakan untuk mengambil keputusan berdasarkan kondisi. Pada program ini digunakan `switch` dan `if`.

```bash
switch(pilih){

    case 1:
        break;

    case 2:
        break;

    default:
        System.out.println("Menu tidak tersedia.");

}

if(data.isEmpty()){

    System.out.println("Data masih kosong.");

}else{

    System.out.println("Menampilkan data...");

}
```

11. **Perulangan** digunakan untuk menjalankan kode secara berulang. Pada program ini digunakan `for` dan `do while`.

```bash
for(ServiceHP s : data){

    System.out.println(s);

}

do{

    ....

}while(pilih!=6);
```

12. **Input Output Sederhana** Program menggunakan class `Scanner` untuk menerima input dari pengguna dan `System.out.println()` untuk menampilkan output.


```bash
Scanner input = new Scanner(System.in);

System.out.print("Nama  : ");
String nama = input.nextLine();

System.out.println(service);
```

13. **Array** Program menggunakan **ArrayList** untuk menyimpan banyak data service handphone.

```bash
ArrayList<ServiceHP> data = new ArrayList<>();
```

14. **Error Handling** Program menggunakan `try catch` untuk menangani kesalahan ketika pengguna memasukkan input yang tidak sesuai.

```bash
try{

    pilih=input.nextInt();

}catch(Exception e){

    System.out.println("Input harus berupa angka!");

    input.nextLine();

}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Fitri
NPM: 2410010204
