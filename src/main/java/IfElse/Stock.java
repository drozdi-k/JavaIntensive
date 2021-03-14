package IfElse;

import java.math.BigDecimal;

public class Stock {
    /*Необходимо реализовать класс Stock ("акция") таким образом, чтобы была возможность узнать
    текущую цену акции, а также ее максимальную и минимальную стоимость за период существования.
Класс Stock должен обладать следующими характеристиками:
Свойства
Имя компании
Текущая стоимость
Минимальная стоимость
Максимальная стоимость

Имя компании и начальную стоимость необходимо задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость должны меняться только через метод updatePrice().*/
    private String name;
    private BigDecimal currentPrice;

    public Stock() {
    }

    private BigDecimal maxPrice;
    private BigDecimal minPrice;

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", currentPrice=" + currentPrice +
                ", maxPrice=" + maxPrice +
                ", minPrice=" + minPrice +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public Stock(String name, BigDecimal currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public void updatePrice(BigDecimal newPrice){
        this.currentPrice = newPrice;
        if(this.maxPrice.compareTo(newPrice)<= 0){
            this.maxPrice = newPrice;
        }
        else if(this.minPrice.compareTo(newPrice)>= 0){
            this.minPrice = newPrice;
        }
    }
}
