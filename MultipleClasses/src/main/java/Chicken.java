public class Chicken {

    private String name;
    private int eggs;

    public Chicken(String name, int eggs) {  //method signature then body, includes parameters you get-define, arguments= when use parameters
        this.name = name;   //pass in the 2 properties
        this.eggs = eggs;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {   //void as doesn't return anything, but set as a String
        this.name = name;
    }
    public int getEggs() {
        return this.eggs;
    }
    public void setEggs(int eggs) {
        this.eggs = eggs;
    }
}
