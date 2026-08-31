package P1.TugasPraktikum;

public class Biskuit26 {

    private String rasa;
    private int jumlahKeping;

    Biskuit26(String rasa, int jumlahKeping) {
        this.rasa = rasa;
        this.jumlahKeping = jumlahKeping;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setJumlah(int jumlahKeping) {
        this.jumlahKeping = jumlahKeping;
    }

    public void cetakInfo() {
        System.out.println("Rasa: " + rasa);
        System.out.println("Jumlah Keping: " + jumlahKeping);
    }
    
}
