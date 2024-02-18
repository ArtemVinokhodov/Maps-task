package entity;

public class Product {
    private final String name;
    private final String quantity;
    private final String price;

    public Product(String name, String quantity, String price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                " name='" + name + '\'' +
                ", has quantity='" + quantity + '\'' +
                ", has price'" + price + '\'' +
                '}';
    }
}
