public class Product {
    public String serial;
    public ProductType productType;

    public Product(String serial, ProductType productType) {
        this.serial = serial;
        this.productType = productType;
    }

    public String getSerial() {
        return this.serial;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public String toString() {
        return this.serial + " " + this.productType;
    }
}
