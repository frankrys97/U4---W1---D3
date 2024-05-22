package simCard;

public class Chiamata {

    private int durata;
    private String numero;

    public Chiamata(String numero, int durata) {
        this.durata = durata;
        this.numero = numero;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
