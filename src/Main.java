public class Main {
    public static void main(String[] args) {
        Product phone1 = new Phones("Oneplus", 37899, "Android");
        Product phone2 = new Phones("Iphone", 79000, "Apple");
        Product tv = new TV("Samsung", 55699.55, 25);
        Product pc = new PC("Айрис", 100000,6);
        pc.setPrice(89000);

        Order order = new Order();

        User user1 = new User("Sergey", "12345", order);
        user1.addToOrder(phone1);
        user1.addToOrder(phone2);
        user1.addToOrder(tv);
        user1.addToOrder(pc);
        order.printAllProducts();
        order.filterProducts(new FilterByPrice());
    }
}
