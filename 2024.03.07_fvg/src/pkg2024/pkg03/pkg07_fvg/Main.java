package pkg2024.pkg03.pkg07_fvg;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        int fuggvenyEredmeny = osszead(3, 5);
        System.out.println("Eredmény: " + fuggvenyEredmeny);
    }

    /**
     * Ez a függvény összead 2 számot
     *
     * @param szam1IN
     * @param szam2IN
     * @return a számok összege
     */
    public static int osszead(int szam1IN, int szam2IN) {
        int osszeg = szam1IN + szam2IN;
        return osszeg;
    }
}
