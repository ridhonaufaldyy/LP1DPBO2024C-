class Human {
    private String name;
    private String id;
    private String nama_bidang;
    private String nama_partai;

    public Human(String name, String id, String nama_bidang, String nama_partai) {
        this.name = name;
        this.id = id;
        this.nama_bidang = nama_bidang;
        this.nama_partai = nama_partai;
    }


    public String get_name() {
        return name;
    }

    public String get_id() {
        return id;
    }

    public String get_nama_bidang() {
        return nama_bidang;
    }

    public String get_nama_partai() {
        return nama_partai;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_id(String id) {
        this.id = id;
    }

    public void set_nama_bidang(String nama_bidang) {
        this.nama_bidang = nama_bidang;
    }

    public void set_nama_partai(String nama_partai) {
        this.nama_partai = nama_partai;
    }
}