package ecommerce;

import java.util.Arrays;

public class Carrello {
    private Articolo[] articoli;
    private Cliente cliente;


    public Carrello(Articolo[] articoli, Cliente cliente) {
        this.articoli = articoli;
        this.cliente = cliente;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotale() {
        double totale = 0;
        for (int i = 0; i < articoli.length; i++) {
            int disponibile = articoli[i].getQuantitaDisponibile();
            if (disponibile == 0) {

                System.out.println("Non ci sono quantita disponibili per l'articolo: " + articoli[i].getDescrizione());
                continue;
            } else {
                totale += articoli[i].getPrezzo();
            }
        }
        return totale;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "articoli=" + Arrays.toString(articoli) +
                ", cliente=" + cliente +
                '}';
    }
}
