package filmsorsolooop;
//OBJECT == CLASS

import java.util.Locale;


public class FilmsorsoloOOP {

    public static void main(String[] args) {
        Movie elsoAkcioFilm = new Movie("Pókember", 123, "Non pacek rendező", 5.0, "Akció", 9);
        String cim = elsoAkcioFilm.getTitle();
        System.out.println("A film címe: " + cim);

        //kiiratjuk az aktuális ratinget
        Double rating = elsoAkcioFilm.getRating();
        System.out.println("A fil értékelése: " + rating);

        //átírjuk a film értékelését
        elsoAkcioFilm.setRating(9.9);
        System.out.println("A fil értékelése: " + elsoAkcioFilm.getRating());
        
        Movie masodikAkcoiFilm = new Movie("Harry Potter", -10, "Fullos rendező", 8.9, "Horror", 89);
        System.out.println("Második film hossza: " + masodikAkcoiFilm.getLength());
        System.out.println("Második film értékelése: "+ masodikAkcoiFilm.getRating());
        System.out.println("Második film műfaja:" + masodikAkcoiFilm.getGerne());
        
        Boolean categoryAdded = Movie.addCategory("Thriller");
        if (categoryAdded) {
            System.out.println("Kategória sikeresen hozzá lett adva");
            
        }else{
            System.out.println("A kategória már létezik");
        }
        
        System.out.println("Tömb elemei: "+ Movie.kiir());
        System.out.println(elsoAkcioFilm);

    }

}
