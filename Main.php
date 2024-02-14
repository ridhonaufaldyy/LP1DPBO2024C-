<?php

require_once 'Human.php';

// Inisialisasi array memberList untuk menyimpan data anggota
$memberList = [];

// Tambah anggota secara hard-coded
$newMember1 = new Human("Haris", "1", "Menhan", "Gerindra");
$newMember2 = new Human("Fahreza", "3", "BIBD", "PP(Partai Penguin)");
$memberList[] = $newMember1;
$memberList[] = $newMember2;

// Menampilkan tabel setelah penambahan anggota
echo "<h2>Data Anggota Setelah Penambahan</h2>";
showMemberTable($memberList);

// Edit anggota secara hard-coded
foreach ($memberList as $member) {
    if ($member->get_name() === "Haris") {
        $member->set_nama_bidang("PP");
        $member->set_nama_partai("Banteng");
        echo "<p>Anggota Haris berhasil diedit.</p>";
    }
}

// Menampilkan tabel setelah pengeditan anggota
echo "<h2>Data Anggota Setelah Pengeditan</h2>";
showMemberTable($memberList);

// Hapus anggota secara hard-coded
foreach ($memberList as $key => $member) {
    if ($member->get_name() === "Fahreza") {
        unset($memberList[$key]);
        echo "<p>Anggota Jane berhasil dihapus.</p>";
    }
}

// Menampilkan tabel setelah penghapusan anggota
echo "<h2>Data Anggota Setelah Penghapusan</h2>";
showMemberTable($memberList);

// Fungsi untuk menampilkan tabel anggota
function showMemberTable($members) {
    if (count($members) > 0) {
        echo "<table border='1' cellpadding='5' cellspacing='0'>";
        echo "<tr><th>ID</th><th>Nama</th><th>Bidang</th><th>Partai</th></tr>";
        foreach ($members as $member) {
            echo "<tr>";
            echo "<td>".$member->get_id()."</td>";
            echo "<td>".$member->get_name()."</td>";
            echo "<td>".$member->get_nama_bidang()."</td>";
            echo "<td>".$member->get_nama_partai()."</td>";
            echo "</tr>";
        }
        echo "</table>";
    } else {
        echo "<p>Belum ada anggota.</p>";
    }
}

?>
