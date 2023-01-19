public class User {
    protected String name;
    protected String numberPhone;
    protected String address;
    protected Order order;
    protected Delivery delivery = new Delivery();

    public User(String name, String numberPhone, String address, Order order) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
        this.order = order;
    }

    public void addToProductInToBasket(Product product) {
        order.addProductsInToBasket(product);
    }

    public void deleteToProductInToBasket(Product product) {
        order.deleteProductsInToBasket(product);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    protected void createOrder(User user, Order order) {
        if (order.isEmpty()) { // принцип DRY (нет повтора кода)
            System.out.println("Корзина пуста, заказ не сформирован!");
        } else {
            System.out.println("Заказ создан!");
            delivery.dataDelivery(user);
        }
    }
}
