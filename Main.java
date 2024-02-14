import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Fungsi untuk mencetak garis putus-putus
    public static void printDashedLine(int panjangId, int panjangNama, int panjangBidang, int panjangPartai) {
        System.out.print("+");
        tabelGaris(panjangId);
        System.out.print("+");
        tabelGaris(panjangNama);
        System.out.print("+");
        tabelGaris(panjangBidang);
        System.out.print("+");
        tabelGaris(panjangPartai);
        System.out.println("+");
    }

    // Fungsi untuk mencetak garis putus
    public static void tabelGaris(int width) {
        for (int i = 0; i < width + 2; i++) { // Menambah 2 untuk batas sisi
            System.out.print("-");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Human> memberList = new ArrayList<>();

        int choice;
        String name, id, bidang, partai;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Edit Anggota");
            System.out.println("3. Hapus Anggota");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nama: ");
                    name = scanner.next();
                    System.out.print("ID: ");
                    id = scanner.next();
                    System.out.print("Bidang: ");
                    bidang = scanner.next();
                    System.out.print("Partai: ");
                    partai = scanner.next();

                    Human newMember = new Human(name, id, bidang, partai);
                    memberList.add(newMember);
                    break;
                case 2:
                    System.out.print("Masukkan nama anggota yang ingin diedit: ");
                    name = scanner.next();
                    for (Human member : memberList) {
                        if (member.get_name().equals(name)) {
                            System.out.print("Nama baru: ");
                            name = scanner.next();
                            System.out.print("ID baru: ");
                            id = scanner.next();
                            System.out.print("Bidang baru: ");
                            bidang = scanner.next();
                            System.out.print("Partai baru: ");
                            partai = scanner.next();

                            member.set_name(name);
                            member.set_id(id);
                            member.set_nama_bidang(bidang);
                            member.set_nama_partai(partai);

                            System.out.println("Anggota berhasil diedit.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nama anggota yang ingin dihapus: ");
                    name = scanner.next();
                    for (int i = 0; i < memberList.size(); i++) {
                        if (memberList.get(i).get_name().equals(name)) {
                            memberList.remove(i);
                            System.out.println("Anggota berhasil dihapus.");
                            break;
                        }
                    }
                    break;
                case 4:
                    // Menampilkan data
                    if (memberList.size() > 0) {
                        int panjangId = 3; // Panjang awal untuk kolom ID
                        int panjangNama = 5; // Panjang awal untuk kolom Nama
                        int panjangBidang = 6; // Panjang awal untuk kolom Bidang
                        int panjangPartai = 5; // Panjang awal untuk kolom Partai
                        
                        // Menentukan panjang maksimum untuk setiap atribut
                        for (Human member : memberList) {
                            panjangId = Math.max(panjangId, member.get_id().length());
                            panjangNama = Math.max(panjangNama, member.get_name().length());
                            panjangBidang = Math.max(panjangBidang, member.get_nama_bidang().length());
                            panjangPartai = Math.max(panjangPartai, member.get_nama_partai().length());
                        }
                        
                        // Menyesuaikan lebar kolom jika panjang maksimum lebih besar dari panjang awal
                        panjangId = Math.max(panjangId, 2); // Menetapkan minimal lebar kolom ID
                        panjangNama = Math.max(panjangNama, 4); // Menetapkan minimal lebar kolom Nama
                        panjangBidang = Math.max(panjangBidang, 7); // Menetapkan minimal lebar kolom Bidang
                        panjangPartai = Math.max(panjangPartai, 6); // Menetapkan minimal lebar kolom Partai
                        
                        // Mencetak tabel
                        System.out.println("Daftar Anggota:");
                        printDashedLine(panjangId, panjangNama, panjangBidang, panjangPartai);
                        System.out.printf("| %-"+(panjangId)+"s | %-"+(panjangNama)+"s | %-"+(panjangBidang)+"s | %-"+(panjangPartai)+"s |\n", "ID", "Nama", "Bidang", "Partai");
                        printDashedLine(panjangId, panjangNama, panjangBidang, panjangPartai);
                        
                        for (int i = 0; i < memberList.size(); i++) {
                            Human member = memberList.get(i);
                            System.out.printf("| %-"+(panjangId)+"s | %-"+(panjangNama)+"s | %-"+(panjangBidang)+"s | %-"+(panjangPartai)+"s |\n",
                                              member.get_id(), member.get_name(), member.get_nama_bidang(), member.get_nama_partai());
                        }
                        printDashedLine(panjangId, panjangNama, panjangBidang, panjangPartai);
                    } else {
                        System.out.println("Belum ada anggota.");
                    }                
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
