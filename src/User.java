public class User {//принцип единственной ответственности
    protected String name;
    protected String numberPhone;
    protected Order order;

    public User(String name, String numberPhone, Order order) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.order = order;
    }

    public void addToOrder(Product product) {
        order.addProductsInToOrder(product);
    }
}
