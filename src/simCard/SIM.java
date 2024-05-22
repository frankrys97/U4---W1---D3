package simCard;

public class SIM {

    private String numeroDiTelefono;
    private int creditoCorrente;
    private String[] ultime5Chiamate;

    public SIM(String numeroDiTelefono) {
        this.numeroDiTelefono = "+39 " + numeroDiTelefono;
        this.creditoCorrente = 0;
        this.ultime5Chiamate = new String[5];
        System.out.println("Sim card" + numeroDiTelefono + " attiva");
    }

    public void datiSim(SIM sim) {
        System.out.println("Numero di telefono:" + numeroDiTelefono);
        System.out.println("Credito corrente:" + creditoCorrente);
        System.out.println("Ultime 5 chiamate:");

        boolean chiamatePresenti = false;

        for (int i = 0; i < ultime5Chiamate.length; i++) {
            if (ultime5Chiamate[i] != null) {
                chiamatePresenti = true;
            }
        }

        if (!chiamatePresenti) {
            System.out.println("Nessuna chiamata");
        } else {
            for (int i = 0; i < ultime5Chiamate.length; i++) {
                if (ultime5Chiamate[i] != null) {
                    System.out.println(ultime5Chiamate[i]);
                }
            }
        }
    }

    public void aggiungihiamata(Chiamata chiamata) {

        // ogni chiamata che aggiungo deve riempire l'array ultime5Chiamate
        // in modo da avere lo storico delle ultime 5 chiamate effettuate e l'ultima chiamata deve essere
        // messa sempre in cima

        for (int i = ultime5Chiamate.length - 1; i > 0; i--) {
            ultime5Chiamate[i] = ultime5Chiamate[i - 1];
        }
        ultime5Chiamate[0] = chiamata.getNumero() + " - " + chiamata.getDurata() + " secondi";

    }

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public int getCreditoCorrente() {
        return creditoCorrente;
    }

    public void setCreditoCorrente(int creditoCorrente) {
        this.creditoCorrente = creditoCorrente;
    }

    public String[] getUltime5Chiamate() {
        return ultime5Chiamate;
    }

    public void setUltime5Chiamate(String[] ultime5Chiamate) {
        this.ultime5Chiamate = ultime5Chiamate;
    }
}

