package MethodsClassesObjects;
import org.apache.log4j.Logger;
public class Product {

    String name;
    double regularPrice;
    double discount;

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Product(String name) {
        this.name = name;
    }

    static Logger logger = Logger.getLogger(Product.class);
    public static void main(String[] args) {
        var product = new Product("Milk");
        product.setDiscount(20);
        product.setRegularPrice(0.8);
        product.printInformation();
    }
    double actualPrice(){
        return discount*regularPrice;
    }
    void printInformation(){
        logger.info("Product : name = "+name+", regular price = "+regularPrice+" EUR, discount = "
                +discount+"%, actual price = "+actualPrice()+" EUR");
    }
}
