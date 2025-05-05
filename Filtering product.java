
public class ProductFilter {

    // Filter by category
    public void filterProducts(String category) {
        System.out.println("Filtering products by category: " + category);
    }

    // Filter by price range
    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products with price between $" + minPrice + " and $" + maxPrice);
    }

    // Filter by brand
    public void filterProducts(String brand1, String brand2) {
        System.out.println("Filtering products by brand: " + brand1);
        System.out.println("Filtering product by brand:  "+brand2);
    }

    // Filter by category and price range
    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products by category: " + category + " and price between $" + minPrice + " and $" + maxPrice);
    }

    // Filter by category, price range, and brand
    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products by category: " + category + ", price between $" + minPrice + " and $" + maxPrice + ", and brand: " + brand);
    }

    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();

        pf.filterProducts("Electronics");                               
        pf.filterProducts(100.0, 500.0);                                
        pf.filterProducts("Nike","Apple");                              
        pf.filterProducts("Fashion", 50.0, 300.0);                       
        pf.filterProducts("Electronics", 200.0, 1000.0, "Apple");       
    }
}
