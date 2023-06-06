
class Product {
    private String name;
    private double price;
    private int quantity;
    private static int totalSold;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + "(s) sold.");
        } else {
            System.out.println("Insufficient quantity of " + name + " to sell.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }
}

public class ProductMain {
    public static void main(String[] args) {
        // Create instances of Product
        Product product1 = new Product("Product 1", 10.99, 50);
        Product product2 = new Product("Product 2", 15.99, 30);
        Product product3 = new Product("Product 3", 5.99, 20);

        // Sell some products
        product1.sell(20);
        product2.sell(10);
        product3.sell(15);

        // Print the total quantity of products sold
        System.out.println("Total quantity of products sold: " + Product.getTotalSold());
    }
}
