package level2;
class Product {

    String productName;
    int price;

    static int totalProducts = 0;

    Product(String productName, int price)
    {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() 
    {
        System.out.println(productName);
        System.out.println(price);
    }

    static void displayTotalProducts()
    {
        System.out.println(totalProducts);
    }
}


public class ProductInventory {
	 public static void main(String[] args) 
	 {

	        Product p1 = new Product("Pen", 10);
	        Product p2 = new Product("Book", 50);

	        p1.displayProductDetails();
	        p2.displayProductDetails();

	        Product.displayTotalProducts();
	    }
}
