import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FarmerTest {
    private Farmer farmer;

    @BeforeEach
    public void setUp() {
        farmer = new Farmer("Colin");
    }

    @Test
    public void canCollectEggs() {
        //arrange
        Chicken ginger = new Chicken("Ginger", 3);
        Chicken bob = new Chicken("Bob", 1);
        Chicken chris = new Chicken("Chris", 0);
        Chicken steve = new Chicken("Steve",6);
        Farm farm = new Farm("BNTA Farm");
        farm.addChicken(ginger);
        farm.addChicken(bob);
        farm.addChicken(chris);
        farm.addChicken(steve);

        //act
        farmer.collectEggs(farm);
        //assert
        int collectEggs = farmer.getCollectedEggs();
        assertThat(collectEggs).isEqualTo(10);
    }
}
