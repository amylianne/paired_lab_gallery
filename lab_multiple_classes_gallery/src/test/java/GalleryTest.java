import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    private Gallery gallery;
    private Artwork artwork1;
    private Artist artist1;
    private Artwork artwork2;
    private Artist artist2;
    private Artwork artwork3;
    private Artist artist3;

    @BeforeEach
    public void setUp() {


        gallery = new Gallery("BNTA", 0);

    }

    @Test
    public void hasName(){
        String name = gallery.getName();
        assertThat(name).isEqualTo("BNTA");

    }

    @Test
    public void canSetName(){
        gallery.setName("Tate");
        String name = gallery.getName();
        assertThat(name).isEqualTo("Tate");

    }

    @Test
    public void hasTill(){
        int till = gallery.getTill();
        assertThat(till).isEqualTo(0);

    }

    @Test
    public void canSetTill(){
        gallery.setTill(100);
        int till = gallery.getTill();
        assertThat(till).isEqualTo(100);

    }

    @Test
    public void hasArtworks(){
        int number = gallery.getArtworkCount();
        assertThat(number).isEqualTo(0);

    }

    @Test
    public void canAddArtworks(){
        artist1 = new Artist("Amy");
        artwork1 = new Artwork("Trees", artist1, 20, "abcd");
        artist2 = new Artist("Shawn");
        artwork2 = new Artwork("Sky", artist1, 30, "efgh");
        artist3 = new Artist("Bob");
        artwork3 = new Artwork("Water", artist1, 30, "ijkl");
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);
        gallery.addArtwork(artwork3);
        int number = gallery.getArtworkCount();
        assertThat(number).isEqualTo(3);

    }




}
