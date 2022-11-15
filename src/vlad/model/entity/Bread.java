package vlad.model.entity;

import java.util.Objects;

public class Bread extends BreadEntity {

    private String color;
    private String flour;


    public Bread() {
        color = "";
    }

    public Bread (String color, String flour, double price) {
        super(price);
        this.color = color;
        this.flour = flour;

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


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        vlad.model.entity.BreadEntity bread = (vlad.model.entity.BreadEntity) object;
        return super.equals() == 0 && Objects.equals(color, bread.color) && Objects.equals(flour, bread.flour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, flour, getPrice);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", flour='" + flour + '\'' +
                supertoString() + '}';
    }
}



}
