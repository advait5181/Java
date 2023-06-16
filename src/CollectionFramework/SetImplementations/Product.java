package CollectionFramework.SetImplementations;

public class Product {

     private int ProductId;
     private int ProductQuantity;
     private int ProductPrice;
     private String ProductTitle;

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + ProductId +
                ", ProductQuantity=" + ProductQuantity +
                ", ProductPrice=" + ProductPrice +
                ", ProductTitle='" + ProductTitle + '\'' +
                '}';
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        this.ProductId = productId;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.ProductQuantity = productQuantity;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        this.ProductPrice = productPrice;
    }

    public String getProductTitle() {
        return ProductTitle;
    }

    public void setProductTitle(String productTitle) {
        this.ProductTitle = productTitle;
    }
    public Product(int productId, int productQuantity, int productPrice, String productTitle) {
        this.ProductId = productId;
        this.ProductQuantity = productQuantity;
        this.ProductPrice = productPrice;
        this.ProductTitle = productTitle;
    }
}
