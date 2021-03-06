package Collections;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class Shop {

    List<Product> products = new LinkedList<>();
    Logger logger = Logger.getLogger(Shop.class);

    public List<Product> addProduct(String product, BigDecimal price) {
        products.add(new Product(product, price));
        return products;
    }

    public List<Product> deleteProduct(Product product) {
        if (product.getName() != null) {
            products.remove(product);
        }
        logger.info(products);
        return products;
    }

    public Product findByName(String name) {
        Product findByName = null;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                findByName = product;
                break;
            }
        }
        if (findByName == null) {
            return null;
        } else {
            logger.info(findByName);
            return findByName;
        }
    }

    public List<Product> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange){
        List<Product> find = new LinkedList<>();
        for (Product product: products) {

            if (product.getCost().compareTo(minPriceRange) >= 0 &&
                    product.getCost().compareTo(maxPriceRange) <= 0) {
                find.add(product);
            }
        }
        logger.info(find);
        return find;
    }
}
