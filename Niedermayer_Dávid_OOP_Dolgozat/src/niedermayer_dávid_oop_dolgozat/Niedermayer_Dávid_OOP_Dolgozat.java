package niedermayer_dávid_oop_dolgozat;


public class Niedermayer_Dávid_OOP_Dolgozat {

    public static void main(String[] args) {
        
        MusicLibrary library = new MusicLibrary();

        // Adding some sample songs
        library.addMusic(new Music("Song 1", "Artist 1", "contributor 1", 3, 20, "property 1"));
        library.addMusic(new Music("Song 2", "Artist 2", "contributor 2", 2, 10, "property 1"));
        library.addMusic(new Music("Song 3", "Artist 3", "contributor 3", 3, 30, "property 1"));
        library.addMusic(new Music("Song 4", "Artist 4", "contributor 4", 4, 20, "property 1"));
        library.addMusic(new Music("Song 5", "Artist 5", "contributor 5", 1, 50, "property 1"));
        

        library.playRandom();

        library.getLibrary();

        library.getLength();
        
        library.removeMusic("Song 2");
        
        library.getLibrary();
        
        library.removeMusic("Song 6");
    }

}
