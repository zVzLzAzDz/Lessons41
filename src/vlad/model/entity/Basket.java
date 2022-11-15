package vlad.model.entity;

public class Basket implements Container {
    private Product[] products;

    public Basket() {
        products = new Product[0];
    }


    @Override
    public void add(Product product) {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }
        temp[products.length] = product;
        products = temp;
    }

    @Override
    public Product get(int index) {
        //fool-proof
        return products[index];
    }

    @Override
    public int size() {
        return products.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of products:\n");

        for (int i = 0; i < products.length; i++) {
            builder.append(products[i]).append("\n");

        }

        return  builder + "";

    }
}
