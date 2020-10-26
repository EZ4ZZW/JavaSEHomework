public class StockDemo {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        stockManager.addProduct(new Product("001", "Apple", 10));
        stockManager.addProduct(new Product("002", "Banana", 2));
        stockManager.addProduct(new Product("003", "Pear", 4));
        stockManager.printProductDetails();
        stockManager.printLowStockProducts(3);
        Product product = stockManager.findProduct("003");
        product.SellOne(); product.SellOne(); product.SellOne(); product.SellOne(); product.SellOne();
        stockManager.printLowStockProducts(3);
        product = stockManager.findProductByName("Apple");
        System.out.println(product.toString());
        product = stockManager.findProductByName("Test");
        if (product == null) {
            System.out.println("Product not exist");
        }
        System.out.println("The stock before delivery: " + stockManager.numberInStock("001"));
        stockManager.delivery("001", 50);
        System.out.println("The stock before delivery: " + stockManager.numberInStock("001"));

    }
}
