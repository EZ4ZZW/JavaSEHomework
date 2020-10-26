public class Product {
    private String ID;
    private String Name;
    private int Stock;

    public String toString() {
        return "ID: " + ID + " Name: " + Name + " Stock: " + Stock;
    }

    public Product(String ID, String Name, int Stock) {
        this.ID = ID;
        this.Name = Name;
        this.Stock = Stock;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getStock() {
        return Stock;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public void increaseQuantity(int adder) {
        Stock += adder;
    }

    public void SellOne() {
        if (Stock == 0) {
            System.out.println("Error: 该产品库存已经为0，无法减少库存");
        } else {
            Stock--;
        }

    }


}
