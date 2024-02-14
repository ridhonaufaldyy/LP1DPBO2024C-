# Import kelas Human dari modul Human
from Human import Human

# Fungsi untuk mencetak garis putus-putus dalam tabel
def print_dashed_line(panjangId, panjangNama, panjangBidang, panjangPartai):
    print("+", end="")
    print("-" * (panjangId + 2), end="")
    print("+", end="")
    print("-" * (panjangNama + 2), end="")
    print("+", end="")
    print("-" * (panjangBidang + 2), end="")
    print("+", end="")
    print("-" * (panjangPartai + 2), end="")
    print("+")


# Fungsi utama untuk mengelola aplikasi
def main():
    member_list = []  # List untuk menyimpan anggota

    choice = 0  # Variabel untuk menyimpan pilihan pengguna

    # Loop utama untuk menampilkan menu dan menerima input pengguna
    while choice != 5:
        print("Menu:")
        print("1. Tambah Anggota")
        print("2. Edit Anggota")
        print("3. Hapus Anggota")
        print("4. Tampilkan Data")
        print("5. Keluar")
        choice = int(input("Pilihan: "))

        # Pilihan 1: Menambahkan anggota baru
        if choice == 1:
            name = input("Nama: ")
            id = input("ID: ")
            bidang = input("Bidang: ")
            partai = input("Partai: ")

            new_member = Human(name, id, bidang, partai)  # Membuat objek Human baru
            member_list.append(new_member)  # Menambahkan objek ke dalam list

        # Pilihan 2: Mengedit anggota
        elif choice == 2:
            name = input("Masukkan nama anggota yang ingin diedit: ")
            for member in member_list:
                if member.get_name() == name:
                    name = input("Nama baru: ")
                    id = input("ID baru: ")
                    bidang = input("Bidang baru: ")
                    partai = input("Partai baru: ")

                    # Mengatur ulang atribut anggota sesuai input baru
                    member.set_name(name)
                    member.set_id(id)
                    member.set_nama_bidang(bidang)
                    member.set_nama_partai(partai)

                    print("Anggota berhasil diedit.")
                    break

        # Pilihan 3: Menghapus anggota
        elif choice == 3:
            name = input("Masukkan nama anggota yang ingin dihapus: ")
            for member in member_list:
                if member.get_name() == name:
                    member_list.remove(member)
                    print("Anggota berhasil dihapus.")
                    break

        # Pilihan 4: Menampilkan data anggota
        elif choice == 4:
            if len(member_list) > 0:
                # Menentukan panjang kolom untuk tata letak tabel
                panjangId = 3
                panjangNama = 5
                panjangBidang = 6
                panjangPartai = 5

                # Menghitung panjang maksimum dari setiap atribut anggota
                for member in member_list:
                    panjangId = max(panjangId, len(member.get_id()))
                    panjangNama = max(panjangNama, len(member.get_name()))
                    panjangBidang = max(panjangBidang, len(member.get_nama_bidang()))
                    panjangPartai = max(panjangPartai, len(member.get_nama_partai()))

                # Menyesuaikan panjang kolom jika diperlukan
                panjangId = max(panjangId, 2)
                panjangNama = max(panjangNama, 4)
                panjangBidang = max(panjangBidang, 7)
                panjangPartai = max(panjangPartai, 6)

                # Mencetak judul tabel dan header kolom
                print("Daftar Anggota:")
                print_dashed_line(panjangId, panjangNama, panjangBidang, panjangPartai)
                print(f"| {'ID':<{panjangId}} | {'Nama':<{panjangNama}} | {'Bidang':<{panjangBidang}} | {'Partai':<{panjangPartai}} |")
                print_dashed_line(panjangId, panjangNama, panjangBidang, panjangPartai)

                # Mencetak baris data untuk setiap anggota
                for member in member_list:
                    print(f"| {member.get_id():<{panjangId}} | {member.get_name():<{panjangNama}} | {member.get_nama_bidang():<{panjangBidang}} | {member.get_nama_partai():<{panjangPartai}} |")

                print_dashed_line(panjangId, panjangNama, panjangBidang, panjangPartai)
            else:
                print("Belum ada anggota.")

        # Pilihan 5: Keluar dari program
        elif choice == 5:
            print("Terima kasih!")

        # Pilihan tidak valid
        else:
            print("Pilihan tidak valid.")


# Memanggil fungsi main saat file dieksekusi langsung
main()
