package ecommerce;

import java.util.Random;

public class Articolo {

    private int codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int quantitaDisponibile;


    public Articolo(String descrizione, double prezzo, int quantitaDisponibile) {
        Random rand = new Random();
        this.codiceArticolo = rand.nextInt(1, 1000);
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }


    public double getCodiceArticolo() {
        return codiceArticolo;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantitaDisponibile() {
        return quantitaDisponibile;
    }

    public void setQuantitaDisponibile(int quantitaDisponibile) {
        this.quantitaDisponibile = quantitaDisponibile;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", quantitaDisponibile=" + quantitaDisponibile +
                '}';
    }
}
