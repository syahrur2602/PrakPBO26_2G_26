package P1.TugasPraktikum;

public class MinumanBotol26 extends Minuman26{

    private int volumeMl;
    private String jenisTutup;

    MinumanBotol26() {
        super();
    }

    MinumanBotol26(String nama, int harga, int volumeMl, String jenisTutup) {
        super.setNama(nama);
        super.setHarga(harga);
        this.volumeMl = volumeMl;
        this.jenisTutup = jenisTutup;
    }

    public void setVolumeMl(int volume) {
        this.volumeMl = volume;
    }

    public void setJenisTutup(String jenisTutup) {
        this.jenisTutup = jenisTutup;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Berat bersih: " + volumeMl + " ml");
        System.out.println("Jenis tutup: " + jenisTutup);
    }
    
}
