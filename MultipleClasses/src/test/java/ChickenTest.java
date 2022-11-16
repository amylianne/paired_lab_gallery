import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ChickenTest {
    Chicken ginger;

    @BeforeEach
    public void setUp() {
        ginger = new Chicken("Ginger",4);
    }

    @Test
    public void hasName() {
        //arrange - do any setup for out test - done ny creating Ginger
        //act - do the thing we're testing - get the chicken's name
        String name = ginger.getName();
        //assert - check that it happened correctly
        assertThat(name).isEqualTo("Ginger");
    }

    @Test
    public void hasEggs(){
        int eggs = ginger.getEggs();
        assertThat(eggs).isEqualTo(4);
    }

    @Test
    public void canSetEggs() {
       ginger.setEggs(5);
       assertThat(ginger.getEggs()).isEqualTo(5);
    }
}
