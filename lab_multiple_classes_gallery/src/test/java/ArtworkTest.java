import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    private Artwork artwork;
    private Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Amy");
        artwork = new Artwork("Trees", artist,20,"abcd");
    }
    @Test
    public void hasTitle(){
        String title= artwork.getTitle();
        assertThat(title).isEqualTo("Trees");

    }
    @Test
    public void canSetTitle(){
        artwork.setTitle("Sky");
        String title= artwork.getTitle();
        assertThat(title).isEqualTo("Sky");
    }

    @Test
    public void hasArtist(){
        Artist artist1 =artwork.getArtist();
        String name= artist1.getName();
        assertThat(name).isEqualTo("Amy");

    }
    @Test
    public void canSetArtist(){
        Artist artist = new Artist("Shawn");
        artwork.setArtist(artist);
        Artist artist1 =artwork.getArtist();
        String name= artist1.getName();
        assertThat(name).isEqualTo("Shawn");
    }

    @Test
    public void hasPrice() {
        int price = artwork.getPrice();
        assertThat(price).isEqualTo(20);
    }
    @Test
    public void canSetPrice() {
        artwork.setPrice(10);
        int price = artwork.getPrice();
        assertThat(price).isEqualTo(10);
    }
    @Test
    public void hasToken() {
        String nft = artwork.getNft();
        assertThat(nft).isEqualTo("abcd");
    }
    @Test
    public void canSetToken() {
        artwork.setNft("xyz");
        String nft = artwork.getNft();
        assertThat(nft).isEqualTo("xyz");
    }


}