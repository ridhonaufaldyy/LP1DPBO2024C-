# LP1DPBO2024C-
/*Saya [Ridho Alif Naufaldy] mengerjakan tugas praktikum 1 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/

# Kelas Human
name: Menyimpan nama anggota.
id: Menyimpan ID anggota.
nama_bidang: Menyimpan nama bidang dari anggota.
nama_partai: Menyimpan nama partai dari anggota.
Kelas ini memiliki sebuah konstruktor yang digunakan untuk menginisialisasi objek-objek anggota. Selain itu, kelas ini juga
memiliki setter dan getter untuk masing-masing atributnya, yang memungkinkan untuk mengakses dan mengubah nilai atribut dari luar kelas.
________________________________________
# Kelas Main
Kelas Main merupakan kelas utama yang berfungsi sebagai pengendali utama program. Di dalam kelas Main, terdapat fungsi-fungsi untuk menambah, mengubah, dan menghapus data anggota, serta untuk menampilkan data anggota dalam format tabel.
Program ini memiliki alur kerja sebagai berikut:
1.	User menjalankan program.
2.	User melihat menu pilihan yang tersedia, yaitu:
•	Tambah Anggota
•	Edit Anggota
•	Hapus Anggota
•	Tampilkan Data
•	Keluar
3.	User memilih salah satu menu pilihan.
4.	Sesuai dengan pilihan user, program akan melakukan aksi yang sesuai, seperti menambah, mengubah, atau menghapus data anggota.
5.	Jika user memilih untuk menampilkan data, program akan menampilkan data anggota dalam format tabel.
6.	Proses di atas akan terus berulang hingga user memilih untuk keluar dari program.
7.	jika user memiliih selain 1,2,3,4,5 maka program akan mengeluarkan pesan "Pilihan tidak valid."

Menu Diatas Hanya terdapat pada program cpp,java,python sedangkan dalam bahasa php langsung di hardcode
   
Program ini menggunakan ArrayList untuk menyimpan objek-objek anggota yang telah dibuat. Setiap kali user menambahkan anggota baru, objek anggota tersebut akan dimasukkan ke dalam ArrayList.
Untuk menampilkan data anggota dalam format tabel, program menghitung panjang maksimum dari setiap kolom (ID, Nama, Bidang, Partai), kemudian menyesuaikan lebar kolom sesuai dengan panjang maksimum tersebut. Setelah itu, program mencetak data anggota dalam format tabel yang telah ditentukan.

