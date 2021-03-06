package Collections;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    final String name;
    final BigDecimal cost;

    public String getName() {
        return name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public Product(String name, BigDecimal cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(cost, product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
