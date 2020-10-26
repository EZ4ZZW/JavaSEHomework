import java.util.ArrayList;

public class StockManager {
    private final ArrayList<Product> Products = new ArrayList<Product>();

    public void addProduct(Product adder) {
        Product temp = getProductByID(adder.getID());
        if (check(temp)) {
            System.out.println("This ID is already exist!");
            return;
        }
        Products.add(adder);
    }

    public void printProductDetails() {
        System.out.println("The Products will be shown as follow:");
        System.out.println("=======================================");
        for (Product product : Products) {
            System.out.println(product.toString());
        }
        if (Products.size() == 0) {
            System.out.println("None Product");
        }
        System.out.println("=======================================");
    }

    public void printLowStockProducts(int Key) {
        System.out.println("库存低于" + Key + "的产品如下:");
        System.out.println("=======================================");
        boolean Flag = false;
        for (Product product : Products) {
            if (product.getStock() < Key) {
                Flag = true;
                System.out.println(product.toString());
            }
        }
        if (Flag == false) {
            System.out.println("没有库存低于" + Key + "的产品");
        }
        System.out.println("=======================================");
    }

    private Product getProductByID(String ID) {
        for (Product product : Products) {
            if (product.getID().equals(ID)) {
                return product;
            }
        }
        return null;
    }

    public Product findProductByName(String Name) {
        for (Product product : Products) {
            if (product.getName().equals(Name)) {
                return product;
            }
        }
        return null;
    }


    public Product findProduct(String ID) {
        Product res = getProductByID(ID);
        return res;
    }

    private boolean check(Product product) {
        return product != null;
    }

    public int numberInStock(String ID) {
        Product res = getProductByID(ID);
        int i = res == null ? res.getStock() : 0;
        return i;
    }

    public void delivery(String ID, int adder) {
        Product res = getProductByID(ID);
        if (!check(res)) {
            System.out.println("This product not Found!");
            return;
        }
        res.increaseQuantity(adder);
    }

}
