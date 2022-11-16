import java.util.ArrayList;

public class Farm {
    private String name;
    private int eggsForSale;
    private ArrayList<Chicken> chickens;

    public Farm(String name){
        this.name = name;
        this.eggsForSale = 0;
        this.chickens = new ArrayList<>();
    }
// getters & setters
    public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }
    public int getEggsForSale() {
        return this.eggsForSale;
    }
    public void setEggsForSale(int i) {
        this.eggsForSale = eggsForSale;
    }
    public ArrayList<Chicken> getChickens() {
        return this.chickens;
    }
    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
//methods getChickenCount- count number of chickens
    public int getChickenCount() {
        return this.chickens.size();
    }
    public void addChicken(Chicken chicken){ //add chickens to creates array
        this.chickens.add(chicken);
    }
}

