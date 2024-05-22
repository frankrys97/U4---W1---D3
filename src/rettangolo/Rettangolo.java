package rettangolo;

public class Rettangolo {

    private double larghezza;
    private double lunghezza;


    public Rettangolo(double lung, double larg) {
        this.larghezza = larg;
        this.lunghezza = lung;

    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("L'area del rettangolo è: " + r.area());
        System.out.println("Il perimetro del rettangolo è: " + r.perimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("L'area del primo rettangolo è: " + r1.area());
        System.out.println("L'area del secondo rettangolo è: " + r2.area());
        System.out.println("Il perimetro del primo rettangolo è: " + r1.perimetro());
        System.out.println("Il perimetro del secondo rettangolo è: " + r2.perimetro());
        System.out.println("La somma delle area dei due rettangoli è: " + (r1.area() + r2.area()));
        System.out.println("La somma dei perimetri dei due rettangoli è: " + (r1.perimetro() + r2.perimetro()));
    }

    public double area() {
        return larghezza * lunghezza;
    }

    public double perimetro() {
        return (larghezza + lunghezza) * 2;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }
}
