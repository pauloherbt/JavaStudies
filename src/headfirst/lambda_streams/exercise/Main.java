package headfirst.lambda_streams.exercise;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    /*The data in the updated song list contains the genre of the song. Lou’s noticed that the
    diner’s clientele seem to prefer variations on rock music, and he wants to see a list of all
    the songs that fall under some genre of “rock.”*/
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();
        List<Song> rockSongs = songs.stream().filter(s -> s.getGenre().contains("Rock") || s.getGenre().contains("rock")).collect(Collectors.toList()); //filtrando por qualquer tipo de rock

        /*Can you write a filter operation that can select
        songs: By The Beatles, That start with “H”, More recent than 1995*/
        Predicate<Song> byTheBeatles = s -> s.getArtist().equals("The Beatles");
        Predicate<Song> startsWithH = s -> s.getTitle().startsWith("H");
        Predicate<Song> moreRecent = s -> s.getYear() > 1995;
        /*He wants a list of all the genres of the songs that have been played. so usar map*/
        List<String> genres = songs.stream().map(Song::getGenre).collect(Collectors.toList()); //problema que os generos se repetem
        genres = genres.stream().distinct().collect(Collectors.toList());
        genres.forEach(System.out::println);

        //System.out.println(songs.stream().filter(moreRecent).toList());

    }
}
