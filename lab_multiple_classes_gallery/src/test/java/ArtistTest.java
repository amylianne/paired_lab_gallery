import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    private Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Amy");

    }
    @Test
    public void canName() {
        String name=artist.getName();
        assertThat(name).isEqualTo("Amy");
    }

    @Test
    public void canSetName() {
        artist.setName("Shawn");
        String name=artist.getName();
        assertThat(name).isEqualTo("Shawn");
    }

}
