public class Customer{
    private int wallet;
    private String name;

    public  Customer(String name) {
        this.name = name;
        this.wallet = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }


    public void buyArtwork(Gallery gallery, Artwork artwork){
        //save price of artwork
        //add the price to the gallery till
        //subtract the price from the wallet
        int price = artwork.getPrice();
        gallery.addTill(price);
        this.wallet = (wallet -price);




    }

}
