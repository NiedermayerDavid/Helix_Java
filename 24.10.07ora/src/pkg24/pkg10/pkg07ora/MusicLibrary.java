package pkg24.pkg10.pkg07ora;

import java.util.ArrayList;

public class MusicLibrary {

    private static ArrayList<Music> library = new ArrayList<>();

    public boolean addMusic(Music music) {
        if (!library.contains(music)) {
            library.add(music);
            System.out.println("ADDED: " + music.getDetails());
            return true;

        } else {
            System.out.println("Music already in library");
            return false;
        }

    }

    public boolean deleteMusic(Music music) {
        if (library.contains(music)) {
            library.remove(music);
            System.out.println("DELETED: " + music.getDetails());
            return true;

        } else {
            System.out.println("Music not found");
            return false;
        }

    }

    public String getLibraryLength() {
        Integer totalSec = 0;
        for (Music music : library) {
            totalSec += music.getLengthInSec();
        }
        String formattedTotalSec = "" + totalSec % 60;
        if (totalSec % 60 < 10) {
            formattedTotalSec = "0" + totalSec % 60;
        }
        return totalSec / 60 + ";" + totalSec % 60;
    }

    public static String getLibraryDetails() {
        String details = "";
        for (Music music : library) {
            details += music.getDetails() + "\n";

        }
        return details.strip();
    }
    
    public static String getFilteredLibraDetails(String artist){
        String details = "";
        ArrayList<Music> filteredLibrary = library;
        filteredLibrary.removeIf(r -> !r.getArtist().equals(artist));
        for (Music music : filteredLibrary) {
            details += music.getDetails() + "\n";

        }
        return details.strip();
    }
}
