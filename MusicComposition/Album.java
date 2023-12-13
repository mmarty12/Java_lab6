package MusicComposition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Album class that consists of a collection of songs
 */
public class Album {
    private List<Song> compositions = new ArrayList<>();

    /**
     * Method to add a song to the list.
     *
     * @param composition represents a song to add.
     */
    public void addComposition(Song composition) {
        compositions.add(composition);
    }

    /**
     * Method to calculate the general length of the album by summing up the duration property.
     */
    public int calculateAlbumDuration() {
        int totalDuration = 0;
        for (Song composition : compositions) {
            totalDuration += composition.getDuration();
        }
        return totalDuration;
    }

    /**
     * Sorting method by style field.
     */
    public void sortByStyle() {
        compositions.sort(Comparator.comparing(Song::getStyle));
    }

    public List<Song> findCompositionsInLengthRange(int min, int max) {
        List<Song> result = new ArrayList<>();
        for (Song composition : compositions) {
            if (composition.getDuration() >= min && composition.getDuration() <= max) {
                result.add(composition);
            }
        }
        return result;
    }

    /**
     * Method to display each song of the album list.
     */
    public void displayAlbumContent() {
        for (Song composition : compositions) {
            System.out.println(composition);
        }
    }
}