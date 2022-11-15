package vlad.model.entity;

import java.util.Objects;

public class BreadEntity {

    private String color;
    private String flour;
    private double price;

    public BreadEntity() {
    }

    public BreadEntity(String color, String flour, double price) {
        this.color = color;
        this.flour = flour;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws Exception {
        if (price > 0) {
            this.price = price;
        } else {
            throw new Exception();
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BreadEntity bread = (BreadEntity) object;
        return Double.compare(bread.price, price) == 0 && Objects.equals(color, bread.color) && Objects.equals(flour, bread.flour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flour, price);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", flour='" + flour + '\'' +
                ", price=" + price +
                '}';
    }
}


