import java.util.List;
import MusicComposition.*;

public class Main {
    /**
     * The main method of the program.
     * It creates an array of various songs, calculates the total duration, sorts by style, and prints the songs
     * in specified range.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Album album = new Album();

        album.addComposition(new PopSong("Song 1", 240));
        album.addComposition(new RockSong("Song 2", 360));
        album.addComposition(new RockSong("Song 3", 300));
        album.addComposition(new JazzSong("Song 4", 400));

        System.out.println("Album Contents:");
        album.displayAlbumContent();

        int albumDuration = album.calculateAlbumDuration();
        System.out.println("\nAlbum Duration: " + albumDuration + "s");

        album.sortByStyle();
        System.out.println("\nAlbum Contents sorted by Style:");
        album.displayAlbumContent();
        
        int minDuration = 160;
        int maxDuration = 350;
        System.out.println("\nLength Range (" + minDuration + "s - " + maxDuration + "s)");
        List<Song> compositionsInLengthRange = album.findCompositionsInLengthRange(minDuration, maxDuration);
        System.out.println("\nAlbum songs in specified range:");
        for (Song composition : compositionsInLengthRange) {
            System.out.println(composition.getTitle());
        }
    }
}

