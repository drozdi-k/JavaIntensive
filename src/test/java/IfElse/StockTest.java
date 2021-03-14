package IfElse;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class StockTest {

    @Test
    public void updatePrice() {
        Stock google = new Stock("Google", new BigDecimal(8));
    google.updatePrice(new BigDecimal(5));
    assertEquals(google.getMinPrice(),new BigDecimal(5));
    }
}