<?php

class Human {
    private $name;
    private $id;
    private $nama_bidang;
    private $nama_partai;

    public function __construct($name, $id, $nama_bidang, $nama_partai) {
        $this->name = $name;
        $this->id = $id;
        $this->nama_bidang = $nama_bidang;
        $this->nama_partai = $nama_partai;
    }

    public function get_name() {
        return $this->name;
    }

    public function get_id() {
        return $this->id;
    }

    public function get_nama_bidang() {
        return $this->nama_bidang;
    }

    public function get_nama_partai() {
        return $this->nama_partai;
    }

    public function set_name($name) {
        $this->name = $name;
    }

    public function set_id($id) {
        $this->id = $id;
    }

    public function set_nama_bidang($nama_bidang) {
        $this->nama_bidang = $nama_bidang;
    }

    public function set_nama_partai($nama_partai) {
        $this->nama_partai = $nama_partai;
    }
}

?>
