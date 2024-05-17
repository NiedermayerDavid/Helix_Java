package niedermayer_dávid_oop_dolgozat;

import java.util.ArrayList;
import java.util.Random;
//import niedermayer_dávid_oop_dolgozat.Music;

public class MusicLibrary {

    private ArrayList<Music> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    // Method to add a song to the library
    public void addMusic(Music song) {
        if (song == null) {
            System.out.println("Invalid song. Cannot add null.");
            return;
        }

        if (songs.contains(song)) {
            System.out.println("Song already exists in the library. Cannot add duplicates.");
            return;
        }

        songs.add(song);
        System.out.println("Successfully added the following song to the library: " + song);
    }

    // Method to remove a song from the library
    public void removeMusic(String songName) {
        if (songName == null || songName.isEmpty()) {
            System.out.println("Invalid song name. Cannot remove null or empty.");
            return;
        }

        boolean removed = false;
        for (Music song : songs) {
            if (song.getTitle().equals(songName)) {
                songs.remove(song);
                System.out.println("Successfully removed the following song from the library: " + song);
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Song '" + songName + "' not found in the library. Cannot remove.");
        }
    }

    // Method to play a random song from the library
    public void playRandom() {
        if (songs.isEmpty()) {
            System.out.println("Library is empty. Cannot play a random song.");
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());
        Music randomSong = songs.get(randomIndex);
        System.out.println("Playing random song:");
        System.out.println(randomSong);
    }

    // Method to display all songs in the library
    public void getLibrary() {
        if (songs.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("Music Library:");
        songs.forEach(song -> {
            System.out.println(song);
        });
    }

    public void getLength() {
        int totalSeconds = 0;
        for (int i = 0; i < songs.size(); i++) {
            totalSeconds += songs.get(i).getMinute() * 60 + songs.get(i).getSecond();
        }

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println("Total length of the library: " + minutes + " minutes and " + seconds + " seconds.");
    }

}
