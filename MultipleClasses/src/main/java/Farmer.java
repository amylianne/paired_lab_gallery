import java.util.ArrayList;

public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String name) {
        this.name = name;
        this.collectedEggs = 0;
    }
    //getters and setters
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
    public int getCollectedEggs() {
        return this.collectedEggs;
    }
    public void setCollectedEggs(){
        this.collectedEggs = collectedEggs;
    }

//+ collectEggs(Farm) : void
    public void collectEggs(Farm farm) {
        //keep track of found eggs
        int totalEggs = 0;                   // running total
        //look are farm's collection of chickens
        //collect eggs from each chicken
        ArrayList<Chicken> chickens = farm.getChickens();       //use getChickens array and store as chickens - change how you like
        for (Chicken chicken : chickens) {        //enhanced for loop, looks at all chickens
            //update running total
            //set chicken's egg count to 0
            if (chicken.getEggs() > 0){
                totalEggs += chicken.getEggs();
                chicken.setEggs(0);
            }
        }
        //update collectedEggs property
        this.collectedEggs = totalEggs;
    }


//+ AssignEggsForSale(Farm) : void
    public void assignEggsForSale(Farm farm) {
        farm.setEggsForSale(this.collectedEggs - 2); // farmer keeps 2 eggs for himself
        this.collectedEggs = 2;


    }


}
