package filereader;

import java.io.*;

public class FileReader {

    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = null; // nem tudjuk milyen hosszú lesz

        try {
            raf = new RandomAccessFile("nevek.txt", "rw");

            int db = 0;
            
            //Végig megy a fileon és megszámolja a sorok számát
            for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {
                db++;
            }
            System.out.println("A fájl sorainak száma: " + db);

            nevek = new String[db];// pont akkora a tömb mint a sorok száma

            raf.seek(0); // a raf-ban ezzel a metódussal lehet a fájlban bárhová ugrani elejére, végére, stb

            db = 0;
            
            for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {
                nevek[db] = sor;
                db++;
            }

            raf.close();
        } catch (IOException e) {
            System.out.println("HIBA");
        }

        for (String str : nevek) {
            System.out.println(str);
        }

    }

}
