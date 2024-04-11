package filmsorsolooop;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    static String kiir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Tulajdonságok
    private String title;
    private Integer length; //perc
    private String director;
    private Double rating;
    private String gerne;
    private Integer ageLimit;

    private static ArrayList<String> avalibeGerne = new ArrayList(
            Arrays.asList("horror", "comedy", "akció")
    );

    //Konstruktor
    public Movie(String title, Integer length, String director, Double rating, String gerne, Integer ageLimit) {

        //Műfaj enum vizsgálat
        this.title = title;
        this.length = length < 0 ? 0 : length;
        this.director = director;
        this.rating = rating < 1.0 || rating > 10.0 ? 1.0 : rating;
        this.gerne = this.avalibeGerne.contains(gerne.toLowerCase()) ? gerne.toLowerCase() : "Invalid category";
        this.ageLimit = ageLimit;
    }

    //getterek
    public String getTitle() {
        return this.title;
    }

    public Integer getLength() {
        return this.length;
    }

    public String getDirector() {
        return this.director;
    }

    public Double getRating() {
        return this.rating;
    }

    public String getGerne() {
        return this.gerne;
    }

    public Integer getAgeLimit() {
        return this.ageLimit;
    }

    public static ArrayList<String> getAvalibeGerne() {
        return avalibeGerne;
    }

    //setterek
    /**
     *
     * @param newRating
     * @throws InvalidRatingException
     */
    public void setRating(Double newRating) throws InvalidRatingException {
        if (newRating < 1.0) {
            throw new InvalidRatingException("Túl kicsi a rating");
        } else if (newRating > 10.0) {
            throw new InvalidRatingException("Túl nagy a rating");
        } else {
            this.rating = newRating;
        }
    }

    public static Boolean addCategory(String category) throws InvalidGerneException{
        category = category.toLowerCase();
        Boolean toReturn = false;

        if (!avalibeGerne.contains(category)) {
            avalibeGerne.add(category);
            toReturn = true;
        } else{
            throw new InvalidGerneException("Ilyen műfaj már létezik");
        }

        return toReturn;
    }

//    public static void kiir(String kiiratas) {
//        kiiratas = kiiratas.toLowerCase();
//        for (int i = 0; i < avalibeGerne.size(); i++) {
//            System.out.print(avalibeGerne.get(i) + ", ");
//        }
//    }

}
