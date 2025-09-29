# Posttest4pbo
## posttest 4 Pemrograman berbasis objek 
## Zidan Daffa Ramadhan 
## 2409116056
## Tema : Manajemen Pendataan Warga Rt 41

<img width="328" height="150" alt="image" src="https://github.com/user-attachments/assets/b512e682-9a1b-401d-a504-264790384665" />

disini, di file main saya, saya menggunakan 3 model yang saya buat file berbeda, dan akan saya jelaskan 1 per 1

## Penjelasan Program
### Person

<img width="531" height="604" alt="image" src="https://github.com/user-attachments/assets/c739b9bc-89ae-4d31-8c06-a410492594a6" />

berbeda dengan posstest sebelumnya, saya membuat 1 class baru yaitu person, yang dimana class ini dibuat bertujuan untuk menambahkan inheritance pada class warga sebagai pewaris class.
di class ini berisi untuk input nama dan umur, yang dimana menggunakan program constructor, dan getter setter
protected berfungsi agar dapat diakses oleh seluruh class

### Warga

disini saya menggunakan extends sebagai pewaris class, di class warga ini saya membuat string baru yaitu setatus keluarga, apakah beliau sebagai kepala keluarga atau anggota.

<img width="860" height="417" alt="image" src="https://github.com/user-attachments/assets/792815bf-0a71-4615-b73c-b33b3fd4f4fb" />

Override sebagai subclass yang menimpa method dari superclass, jadi di override ini fungsinya untuk menimpa superclass ketika di tampilan output.

### ServisWarga

<img width="729" height="493" alt="image" src="https://github.com/user-attachments/assets/cee4cdf8-cc3d-4f98-96d6-aadb3d140cc7" />

Tidak jauh berbeda dengan sistem Create, Read, Update, dan Delete pada posttest sebelumnya.

<img width="676" height="594" alt="image" src="https://github.com/user-attachments/assets/9edc72ca-d882-4db5-91c3-f1042622d9c5" />

dan saya masih menggunakan fitur search

<img width="591" height="309" alt="image" src="https://github.com/user-attachments/assets/275f3a35-bfd8-4fa2-a430-eefb0fc0b9dd" />

### MainClass

disini saya menggunakan perintah do and while untuk program menampilkan output yang diinginkan oleh user itu aendiri. Dan juga, saya telah menambahkan fitur jika user menginput umur dengan huruf.

<img width="777" height="625" alt="image" src="https://github.com/user-attachments/assets/bb6571d3-7675-402c-9a06-fa9abf734225" />

disini saya menggunakan tanda -> (Switch rule) agar tidak perlu menambah break di setiap 1 line.


## Penjelasan alur program/ output

Disini saya meng-run File Mainapp saya

<img width="389" height="174" alt="image" src="https://github.com/user-attachments/assets/06eda44f-bfdc-4b85-b335-ddce04e774f6" />

ketika di run, output akan menjalankan program yang saya buat, dan menampilkan list list menu yang dapat dijalankan oleh program. Dan, bentuk output harus integer.

<img width="397" height="213" alt="image" src="https://github.com/user-attachments/assets/6995adff-55f1-48ef-8939-1f55f8732936" />

### Fitur Tambah

untuk menu create, user hanya perlu memasukkan nama, umur, dan status yang ingin di input.

<img width="574" height="260" alt="image" src="https://github.com/user-attachments/assets/a137f945-ba1f-4ce4-bc8d-6b684d9946c4" />

### Sistem Lihat/Read

ketika user menginput angka 2 (lihat data) maka sistem akan otomatis menampilkan daftar warga yang telah diinput.

<img width="442" height="198" alt="image" src="https://github.com/user-attachments/assets/8cb82964-7fb7-4ab1-b76a-2939c9b0bc75" />

### Sistem Update

ketika user menginput angka 3 (update data) maka sistem akan meminta input kembali kepada user. Yaitu, berupa id dari data yang ingin diubah, nama baru, umur baru, dan status baru.

<img width="442" height="305" alt="image" src="https://github.com/user-attachments/assets/d7679e9a-cfe3-4ed1-b4ce-395782c20262" />

<img width="439" height="200" alt="image" src="https://github.com/user-attachments/assets/aec30c83-8d62-4d29-b999-a0f37d1b799c" />


### Sistem Hapus/Delete

<img width="427" height="230" alt="image" src="https://github.com/user-attachments/assets/88d8dc48-00f2-48c9-9ef9-b2e57662f5f9" />

ketika user menginput angka 3 (Hapus data) maka sistem akan meminta user untuk input angka dari id data yang ingin dihapus.

<img width="349" height="198" alt="image" src="https://github.com/user-attachments/assets/7f1d6372-90d5-4ac9-8f59-bec63cb84b1a" />

### Fitur Search

disini saya sudah menambahkan 5 nama yang berbeda untuk pengimplementasian fitur search.

<img width="511" height="286" alt="image" src="https://github.com/user-attachments/assets/15d2e4a3-002a-4271-b923-769de7f9f9b5" />

implementasi :

misalnya disini ada 5 data, kemudian saya ingin mencari yang nama awalnya ada huruf t
maka otomatis sistem akan menampilkannya.

<img width="558" height="221" alt="image" src="https://github.com/user-attachments/assets/0932b4d8-81d4-4dc7-b9fd-4bfdf15f575d" />


===========================================================================================

# POSTTEST 4

## Abstract Class --> Person

Person dibuat sebagai abstract class yang berisi: Atribut dasar (id, nama, umur).

Abstract method displayInfo() yang tidak punya isi di class ini. Karena abstract, maka Warga wajib meng-override method displayInfo() untuk menampilkan data sesuai kebutuhan.

Letak penerapan:

<img width="287" height="74" alt="image" src="https://github.com/user-attachments/assets/e6dff395-321d-45e2-b3c8-7b4f77b5cd51" />

<img width="333" height="58" alt="image" src="https://github.com/user-attachments/assets/3cd2daff-35e9-47e9-ad37-69fcd58cb2ca" />


## Interface --> ValidasiData

Disini saya membuat 1 class lagi yaitu berupa file java interface
Dibuat untuk mendefinisikan aturan validasi. Berisi method boolean validasiUmur(int umur); tanpa implementasi. Class Warga yang implements ValidasiData wajib membuat implementasi method ini.

Letak penerapan:

<img width="315" height="74" alt="image" src="https://github.com/user-attachments/assets/ae247aeb-8d8c-4f1e-9295-3169988cfb3b" />


## Kombinasi Abstract Class + Interface

Class Warga extends Person (abstract class) sekaligus implements ValidasiData (interface). Guna membuktikan penerapan abstraction ganda.

Letak penerapan:

<img width="447" height="36" alt="image" src="https://github.com/user-attachments/assets/8b3b9305-c046-48b6-ad2e-b671af4f0969" />


## Penjelasan Polymorphism

## Overriding

Terjadi ketika subclass (Warga) mengubah implementasi method dari superclass (Person). Method displayInfo() didefinisikan abstrak di Person, lalu dioverride di Warga dengan isi yang spesifik.

Letak :

<img width="803" height="88" alt="image" src="https://github.com/user-attachments/assets/5ccf7590-dd3a-4097-8912-35296a767d1f" />

<img width="397" height="83" alt="image" src="https://github.com/user-attachments/assets/2075dc31-e838-4e47-ba45-b5e8313ab55a" />

<img width="744" height="75" alt="image" src="https://github.com/user-attachments/assets/0e61a1e3-bd96-4ad0-bdfc-893d26581667" />


## Overloading

Terjadi ketika ada dua method dengan nama sama, tapi parameter berbeda.
Di class WargaService, ada 2 versi cariWarga: cariWarga(String keyword) --> cari berdasarkan nama. cariWarga(int umur) --> cari berdasarkan umur.

Letak Penerapan:

<img width="617" height="216" alt="image" src="https://github.com/user-attachments/assets/73d958b2-b117-4755-9cac-30ec6c8cf16a" />

<img width="595" height="212" alt="image" src="https://github.com/user-attachments/assets/8cf5d181-988b-4bb6-bd19-02a10004fdc0" />


# OUTPUT

<img width="398" height="194" alt="image" src="https://github.com/user-attachments/assets/677e1b3b-5563-450b-bf1a-6c458f832c88" />

Tampilan menu ketika baru di-run.


## Tambah Warga

disini sistem akan meminta untuk menginput nama, umur dan status keluarga yaitu kepala keluarga atau anggota.

<img width="570" height="278" alt="image" src="https://github.com/user-attachments/assets/62a29ac0-321a-45a7-9c8a-da1c23706712" />


## Lihat Warga

Disini sistem akan menampilkan nama-nama Warga yang telah ditambahkan sebelumnya

<img width="464" height="213" alt="image" src="https://github.com/user-attachments/assets/e70b7a09-a695-426a-a862-836ca58b3928" />


## Update Warga

Disini sistem akan meminta input id dari daftar warga yang ingin di update, kemudian menginput nama, umur, dan status keluarga yang baru.

<img width="420" height="312" alt="image" src="https://github.com/user-attachments/assets/03037ca9-9300-4181-b27a-53d9befaaee9" />

<img width="528" height="216" alt="image" src="https://github.com/user-attachments/assets/57f64f11-a4e0-4bae-b670-45daa4fe7479" />


## Hapus Warga

Disini sistem akan meminta user untuk menginput id warga yang ingin dihapus.

<img width="508" height="258" alt="image" src="https://github.com/user-attachments/assets/aee2ae18-1c2d-4219-9af6-cc0dbcf2c60d" />

<img width="341" height="207" alt="image" src="https://github.com/user-attachments/assets/659a0705-af37-4ecc-80e3-a90b772882bf" />


## Mencari Warga (berdasarkan Nama)

Disini saya sudah menambahkan 5 warga dengan nama dan umur yang berbeda untuk menguji sistem Search yang sudah saya buat

<img width="572" height="305" alt="image" src="https://github.com/user-attachments/assets/a42e0278-cfa5-49e6-888e-0d70ae9829d0" />

disini sistem akan meminta memasukkan identitas huruf nama yang ingin dicari. Misalnya, disini yang saya input hanya huruf R, maka sistem akan menampilkan nama yang mengandung huruf r.

<img width="510" height="274" alt="image" src="https://github.com/user-attachments/assets/93b2157a-3a62-4e9a-a413-2b420c86f86b" />


## Mencari Warga (berdasarkan umur)

Disini sistem akan meminta identitas variabel umur dari warga yang ingin dicari. Misalnya disini yang saya input adalah string, maka sistem akan error. Dan, otomatis program akan terhenti

<img width="922" height="334" alt="image" src="https://github.com/user-attachments/assets/83864ff8-dd52-44a1-bd1a-87f0a8ac95c4" />

Jika saya memasukkan angka 3, maka sistem akan menampilkan warga yang umurnya hanya mengandung angka 3.

<img width="537" height="239" alt="image" src="https://github.com/user-attachments/assets/f272446b-0787-4e37-a43c-58bd6d38c0cc" />
