import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        List<Album> albums = new ArrayList<>();
        List<Quote> quotes = new ArrayList<>();
        List<Author> authors = new ArrayList<>();

        Album rumors = new Album();
        rumors.setId(1);
        rumors.setArtist("Fleetwood Mac");
        rumors.setName("Rumors");
        rumors.setGenre("Soft rock, folk rock, pop rock");
        rumors.setReleaseDate(1977);
        rumors.setSales(40f);

        albums.add(rumors);

        for (int i = 2; i < 11; i++) {
            Album album = new Album();
            album.setName("extrasound ultrasound");
            album.setArtist("unbecoming");
            album.setReleaseDate(2244);
            album.setSales(540234f);
            album.setGenre("future funk, three-step neo-garage anti-breakcore, experimental high frequency EM radiation");
            albums.add(album);
        }

        for (int i = 1; i < 12; i++) {
            Quote quote = new Quote();
            quote.setContent("something interesting, probably");
            quote.setId(i);
            Author author = new Author();
            author.setId(i);
            author.setFirstName("testy");
            author.setLastName("smith");
            quote.setAuthor(author);
            quotes.add(quote);
            authors.add(author);
        }

        albums.forEach(album -> System.out.println(album.getName()));
        quotes.forEach(quote -> System.out.println(quote.getContent()));
        quotes.forEach(quote -> System.out.println(quote.getAuthor().getFirstName() + ' ' + quote.getAuthor().getLastName()));
    }
}
