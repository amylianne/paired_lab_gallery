import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FarmTest {
    private Farm farm;

    @BeforeEach
    public void setUp() {
        farm = new Farm("BNTA farm");
    }

    @Test
    public void canCountChickens() {
        //arrange
        //act
        int chickenCount = farm.getChickenCount();
        //assert
        assertThat(chickenCount).isEqualTo(0);
    }

    @Test
    public void canAddChicken(){
        //arrange
        Chicken ginger = new Chicken("Ginger", 3);
        Chicken bob = new Chicken("Bob", 3);
        Chicken chris = new Chicken("Chris", 3);
        //act
        farm.addChicken(ginger); // add 3 chickens into farm
        farm.addChicken(bob);
        farm.addChicken(chris);
        //assert
        int chickenCount = farm.getChickenCount();
        assertThat(chickenCount).isEqualTo(3); //count number of chickens you have now
    }
}
