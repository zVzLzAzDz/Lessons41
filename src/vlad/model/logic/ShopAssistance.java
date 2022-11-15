package vlad.model.logic;

import vlad.model.entity.Container;
import vlad.model.entity.Product;

public class ShopAssistance {
    public static double calculateTotalPrice(Container container) {
        if (container == null  || container.size() == 0 ){
            return -1;
        }

        double total = 0;

        for (int i = 0; i < container.size(); i++) {
            Product  product = container.get(i);

            total += product.getPrice();
        }

        return total;
    }
}
