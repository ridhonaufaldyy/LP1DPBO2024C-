#include <string>
#include <iostream>

using namespace std;

class Human{
    private:
    string name;
    string id;
    string nama_bidang;
    string nama_partai;

    public:
    
    Human(){
        this->name = "";
        this->id = "";
        this->nama_bidang = "";
        this->nama_partai = "";

        // this->gender = '-';
    }

    Human(string name, string id, string nama_bidang, string nama_partai){
        this->name = name;
        this->id = id;
        this->nama_bidang = nama_bidang;
        this->nama_partai = nama_partai;
    }

    string get_name()
    {
        return this->name;
    }

    string get_id()
    {
        return this->id;
    }

    string get_nama_bidang()
    {
        return this->nama_bidang;
    }

    string get_nama_partai()
    {
        return this->nama_partai;
    }

    void set_name(string name)
    {
        this->name = name;
    }

    void set_id(string id)
    {
        this->id = id;
    }

    void set_nama_bidang(string nama_bidang)
    {
        this->nama_bidang = nama_bidang;
    }

    void set_nama_partai(string nama_partai)
    {
        this->nama_partai = nama_partai;
    }

    void eat()
    {
        cout << this->name << "is eating" << '\n';
    }
    void sleep()
    {
        cout << this->name << "is sleeping" << '\n';
    }

    ~Human()
    {

    }
};

