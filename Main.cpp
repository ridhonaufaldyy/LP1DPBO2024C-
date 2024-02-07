#include <iostream>
#include <list>
#include "Human.cpp"

using namespace std;

int main()
{
    list<Human> llist;

    int pilihan;
    string name, id, nama_bidang, nama_partai;

    do
    {
        cout << "pilihan menu :" << endl;
        cout << "1.Tambah Anggota" << endl;
        cout << "2.Edit Anggota" << endl;
        cout << "3.Hapus Anggota" << endl;
        cout << "4.Keluar" << endl;
        cin >> pilihan;

        if (pilihan == 1)
        {
            int n;
            cout << "Jumlah Tambah Anggota" << endl;
            cin >> n;
            cout << "Format Masukan : nama,id,bidang,partai" << endl;
            for (int i = 0; i < n; i++)
            {
                Human temp;
                cin >> name >> id >> nama_bidang >> nama_partai;

                temp.set_name(name);
                temp.set_id(id);
                temp.set_nama_bidang(nama_bidang);
                temp.set_nama_partai(nama_partai);

                llist.push_back(temp);
            }

            cout << "Iteration Output : " << endl;
            int i = 0;
            for (list<Human>::iterator it = llist.begin(); it != llist.end(); it++)
            {
                cout << (i + 1) << "." << it->get_name() << " | " << it->get_id() << " | " << it->get_nama_bidang() << " | " << it->get_nama_partai() << '\n';
                i++;
            }
        }
        else if (pilihan == 2)
        {
            cout << "Masukkan nama anggota yang ingin diedit: ";
            cin >> name;
            for (auto &it : llist)
            {
                if (it.get_name() == name)
                {
                    cout << "Masukkan data baru: ";
                    cin >> name >> id >> nama_bidang >> nama_partai;
                    it.set_name(name);
                    it.set_id(id);
                    it.set_nama_bidang(nama_bidang);
                    it.set_nama_partai(nama_partai);
                    cout << "Anggota berhasil diedit." << endl;
                    break; 
                }
            }
        }
        else if (pilihan == 3)
        {
            cout << "Masukkan nama anggota yang ingin dihapus: ";
            cin >> name;
            for (auto it = llist.begin(); it != llist.end(); ++it)
            {
                if (it->get_name() == name)
                {
                    it = llist.erase(it);
                    cout << "Anggota berhasil dihapus." << endl;
                    break; 
                }
            }
        }
        else if (pilihan == 4)
        {
            break;
        }
        else
        {
            cout << "Pilihan tidak valid." << endl;
        }
    } while (true);

    return 0;
}
