package simCard;

public class Main {
    public static void main(String[] args) {

        SIM sim = new SIM("123456789");
        sim.aggiungihiamata(new Chiamata("3334499555", 20));
        sim.aggiungihiamata(new Chiamata("3445566789", 35));
        sim.aggiungihiamata(new Chiamata("3334499888", 20));
        sim.aggiungihiamata(new Chiamata("3445566789", 35));
        sim.aggiungihiamata(new Chiamata("3334499888", 20));
        sim.aggiungihiamata(new Chiamata("3445566890", 35));

        sim.datiSim(sim);
    }
}
