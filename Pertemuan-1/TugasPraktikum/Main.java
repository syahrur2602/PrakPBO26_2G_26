package P1.TugasPraktikum;

public class Main {

    public static void main(String[] args) {
        MinumanBotol26 minuman1 = new MinumanBotol26("Aqua", 3500, 600, "plastik");
        MinumanKaleng26 minuman2 = new MinumanKaleng26("Nescafe", 9000, "Stainless", false);
        Snack26 snack1 = new Snack26("Chitato", 14);
        Biskuit26 biskuit1 = new Biskuit26("Strawberry", 4);

        minuman1.cetakInfo();
        minuman2.cetakInfo();
        snack1.cetakInfo();
        biskuit1.cetakInfo();
    }
    
}
