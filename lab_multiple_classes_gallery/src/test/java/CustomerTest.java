import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    private Gallery gallery;
    private Artwork tree;
    private Artist amy;
    private Artwork sky;
    private Artist shawn;
    private Artwork water;
    private Artist bob;
    private Customer zed;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("BNTA", 0);
        amy = new Artist("Amy");
        tree = new Artwork("Tree", amy, 20, "abcd");
        shawn = new Artist("Shawn");
        sky = new Artwork("Sky", shawn, 30, "efgh");
        bob = new Artist("Bob");
        water = new Artwork("Water", bob, 30, "ijkl");
        gallery.addArtwork(tree);
        gallery.addArtwork(sky);
        gallery.addArtwork(water);
        zed = new Customer("Zed");

    }

    @Test
    public void canBuy(){
        zed.buyArtwork(gallery, water);
        int till = gallery.getTill();
        assertThat(till).isEqualTo(30);
        int wallet = zed.getWallet();
        assertThat(wallet).isEqualTo(70);
    }
}
