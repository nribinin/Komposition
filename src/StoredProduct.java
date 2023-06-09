public class StoredProduct implements Comparable<StoredProduct> {
    private Product product;
    private LocationDescriptor location;

    public StoredProduct(Product product, LocationDescriptor location) {
        this.product = product;
        this.location = location;
    }
    public Product getProduct() {
        return this.product;
    }
    public LocationDescriptor getLocation() {
        return this.location;
    }

    @Override
    public int compareTo(StoredProduct o) {
        return this.location.compareTo(o.location);
    }
}