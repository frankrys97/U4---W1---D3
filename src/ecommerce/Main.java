package ecommerce;

public class Main {
    public static void main(String[] args) {

        Articolo articolo1 = new Articolo("Caffe", 10, 5);
        System.out.println(articolo1);
        Articolo articolo2 = new Articolo("Bicchierini", 3.50, 50);
        System.out.println(articolo2);
        Articolo articolo3 = new Articolo("Bastoncini", 1.50, 25);
        System.out.println(articolo3);
        Articolo articolo4 = new Articolo("Moka", 10, 0);
        System.out.println(articolo4);

        Cliente cliente1 = new Cliente("Pippo", "Pluto", "pippo@pluto");
        System.out.println(cliente1);
        Cliente cliente2 = new Cliente("Pluto", "Paperino", "pluto@paperino");
        System.out.println(cliente2);
        Cliente cliente3 = new Cliente("Paperino", "Topolino", "paperino@topolino");
        System.out.println(cliente3);

        Carrello carrello1 = new Carrello(new Articolo[]{articolo1, articolo2, articolo3}, cliente1);
        System.out.println(carrello1);
        System.out.println(carrello1.getTotale());

        Carrello carrello2 = new Carrello(new Articolo[]{articolo3, articolo4}, cliente2);
        System.out.println(carrello2);
        System.out.println(carrello2.getTotale());

    }
}
