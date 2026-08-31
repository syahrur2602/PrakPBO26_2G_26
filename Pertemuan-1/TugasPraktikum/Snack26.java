package P1.TugasPraktikum;

public class Snack26 {

    private String merk;
    private int beratGram;

    Snack26(String merk, int beratGram) {
        this.merk = merk;
        this.beratGram = beratGram;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setBerat(int beratGram) {
        this.beratGram = beratGram;
    }

    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Berat: " + beratGram);
    }
    
}
