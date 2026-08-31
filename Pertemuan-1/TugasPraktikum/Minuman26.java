package P1.TugasPraktikum;

public class Minuman26 {
    private String nama;
    private int harga;

    Minuman26(){}

    Minuman26(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public  void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Input harga yang sesuai");
        }
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp." + harga);
    }
}
