package rettangolo;

import static rettangolo.Rettangolo.stampaRettangolo;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(10, 5);
        Rettangolo rettangolo3 = new Rettangolo(5, 5);
        System.out.println(rettangolo.area());
        System.out.println(rettangolo.perimetro());

        System.out.println();

        stampaRettangolo(rettangolo);

        System.out.println();

        Rettangolo.stampaDueRettangoli(rettangolo, rettangolo2);

        System.out.println();

        Rettangolo.stampaDueRettangoli(rettangolo, rettangolo3);
    }
}
