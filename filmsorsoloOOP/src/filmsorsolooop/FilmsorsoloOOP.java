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
        try {
            elsoAkcioFilm.setRating(9.9);
        } catch (InvalidRatingException ex) {
//            System.err.println("Hiba: (localized message)" + ex.getLocalizedMessage());
            System.err.println("Hiba: ( message)" + ex.getMessage());
        } finally {
            System.out.println("ez mindenképp lefut");
        }

        try {
            elsoAkcioFilm.setRating(10.1);
        } catch (InvalidRatingException ex) {
            System.err.println("Hiba: " + ex.getMessage());
        }

        System.out.println("A fil értékelése: " + elsoAkcioFilm.getRating());
//
//        Movie masodikAkcoiFilm = new Movie("Harry Potter", -10, "Fullos rendező", 8.9, "Horror", 89);
//        System.out.println("Második film hossza: " + masodikAkcoiFilm.getLength());
//        System.out.println("Második film értékelése: " + masodikAkcoiFilm.getRating());
//        System.out.println("Második film műfaja:" + masodikAkcoiFilm.getGerne());

        try {
            Boolean categoryAdded = Movie.addCategory("Horror");
            if (categoryAdded) {
                System.out.println("Kategória sikeresen hozzá lett adva");

            }
        } catch (InvalidGerneException ex) {
            System.err.println("Hiba: " + ex.getMessage());
        }
        
        try {
            Boolean categoryAdded = Movie.addCategory("Triller");
            if (categoryAdded) {
                System.out.println("Kategória sikeresen hozzá lett adva");

            }
        } catch (InvalidGerneException ex) {
            System.err.println("Hiba: " + ex.getMessage());
                    
        }
//        System.out.println("Tömb elemei: " + Movie.kiir());
//        System.out.println(elsoAkcioFilm);

    }

}
