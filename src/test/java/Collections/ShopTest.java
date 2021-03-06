package Collections;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop = new Shop();
    Logger logger = Logger.getLogger(ShopTest.class);

   // @BeforeEach
    public void setProducts(){
        shop.addProduct("Apples", new BigDecimal("7.35"));
        shop.addProduct("Bananas", new BigDecimal("8.75"));
        shop.addProduct("Pears", new BigDecimal("8"));
        shop.addProduct("Oranges", new BigDecimal("9.20"));
        shop.addProduct("Pineapples", new BigDecimal("13.94"));
        shop.addProduct("Strawberries", new BigDecimal("6.60"));
    }

    @Test
    public void addProduct() {
        setProducts();
        String product = "Cherries";
        BigDecimal price = new BigDecimal("13.55");
        assertEquals(7,shop.addProduct(product,price).size());
        logger.info(shop.products.toString());
    }

    @Test
    public void deleteProduct() {
        setProducts();
        Product product = (shop.products.get(5));
        assertEquals(5,shop.deleteProduct(product).size());
    }

    @Test
    public void findByName() {
        setProducts();
        String name = "Pears";
        assertEquals(shop.products.get(2), shop.findByName(name));
    }

    @Test
    public void findProduct() {
        setProducts();
        BigDecimal minPriceRange = new BigDecimal("8"), maxPriceRange = new BigDecimal("10");
        assertEquals(List.of(shop.products.get(1),shop.products.get(2),shop.products.get(3)),
                shop.findProduct(minPriceRange, maxPriceRange));
    }
}