/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor.pkgwhile.függvények.tömbök;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author nidid
 */
public class ForWhileFüggvényekTömbök {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> gyumiList = new ArrayList();
        System.err.println("A lista elemei: " + gyumiList);
        
        //Lista elemek hozzáadása
        gyumiList.add("Alma");
        gyumiList.add("Körte");
        gyumiList.add("Banán");
        gyumiList.add("Eper");
        gyumiList.add("Kivi");
        System.out.println("A lista elemekkel: "+ gyumiList);
        
        ArrayList<String> nevek = new ArrayList(
                Arrays.asList("Olivér", "Dávid", "János")
        );
        System.out.println(nevek);
        gyumiList.remove(0);
        System.out.println(gyumiList);
        
        gyumiList.remove("Kivi");
        System.out.println(gyumiList);
        
        ArrayList<String> szamok = new ArrayList(
                Arrays.asList(1,2,3,4,5)
        );
        Integer szam = 1;
        szamok.remove(szam);
        System.out.println("Szam lista " + szamok);
        
        // tömbök
        /*int[] intTomb = {1,2,3,4,5};
        System.out.println("int tömb" + Arrays.toString(intTomb));
        for (int i = 0; i <= intTomb.length; i++) {
            int aktualisElem = intTomb[i];
            System.out.print(aktualisElem + " ");
        }*/
        
        //Foreach ciklus
        int[] intTomb = {1,2,3,4,5};
        for (int j : intTomb) {
            int aktualisElem = j;
            System.out.println(aktualisElem + ", ");
        }
        
        //üres tömb létrehozása
        int ujszam = 0;
        int[] uresTomb = new int[10];
        for (int i = 0; i < 10; i++) {
            ujszam+=2;
            uresTomb[i] = ujszam;
        }
         System.out.println(Arrays.toString(uresTomb));
        
         //while
         int szamlalo = 0;
         int toAdd = 0;
         while (szamlalo != uresTomb.length) {            
             if (toAdd % 2 == 0) {
                 uresTomb[szamlalo] = toAdd;
                 szamlalo++;
             }
             toAdd++;
        }
         System.out.println("urestömb while ciklussal: " + Arrays.toString(uresTomb));
    }
    
}
