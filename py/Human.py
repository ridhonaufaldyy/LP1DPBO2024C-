class Human:
    def __init__(self, name="", id="", nama_bidang="", nama_partai=""):
        self.__name = name
        self.__id = id
        self.__nama_bidang = nama_bidang
        self.__nama_partai = nama_partai

    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_id(self):
        return self.__id

    def set_id(self, id):
        self.__id = id

    def get_nama_bidang(self):
        return self.__nama_bidang

    def set_nama_bidang(self, nama_bidang):
        self.__nama_bidang = nama_bidang

    def get_nama_partai(self):
        return self.__nama_partai

    def set_nama_partai(self, nama_partai):
        self.__nama_partai = nama_partai
