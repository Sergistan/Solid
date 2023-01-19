public class Product { //принцип единственной ответственности (класс отвечает только за продукты)
    protected String name;
    protected double price;
    protected boolean isAvailability;

    public Product(String name, double price, boolean isAvailability) {
        this.name = name;
        this.price = price;
        this.isAvailability = isAvailability;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailability() {
        return isAvailability;
    }
}
