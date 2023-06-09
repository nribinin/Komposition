import java.util.*;
public class Warehouse {
    private Map<Product, LocationDescriptor> products;

    public Warehouse() {
        products = new TreeMap<>();
    }

    public void addProduct(Product product, LocationDescriptor locationDescriptor) {
        products.put(product, locationDescriptor);
    }

    public int getStock(ProductType product) {


    }

    public StoredProduct takeProduct(ProductType product) {

    }
}
