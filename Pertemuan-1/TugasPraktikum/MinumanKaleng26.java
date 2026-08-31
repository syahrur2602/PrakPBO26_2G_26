package P1.TugasPraktikum;

public class MinumanKaleng26 extends Minuman26{
    
    private String bahanKaleng;
    private boolean statusBuka;

    MinumanKaleng26() {
        super();
    }

    MinumanKaleng26(String nama, int harga, String bahanKaleng, boolean statusBuka) {
        super.setNama(nama);
        super.setHarga(harga);
        this.bahanKaleng = bahanKaleng;
        this.statusBuka = statusBuka;
    }

    public void bukaKaleng() {
        this.statusBuka = true;
        System.out.println("Kaleng berhasil dibuka");
    }

    public void setBahanKaleng(String bahanKaleng) {
        this.bahanKaleng = bahanKaleng;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Status: " + (statusBuka ? "Sudah Dibuka" : "Kaleng masih tersegel"));
        System.out.println("Bahan Kaleng: " + bahanKaleng);
    }

}
