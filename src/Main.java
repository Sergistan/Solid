public class Main {
    public static void main(String[] args) {
        Product phone1 = new Phones("Oneplus", 37899, "Android",true);
        Product phone2 = new Phones("Iphone", 79000, "Apple", false);
        Product tv1 = new TV("Samsung", 55699.55, 25, true);
        Product tv2 = new TV("Xiaomi", 35000, 17, true);
        Product pc = new PC("Айрис", 100000,6, true);

        pc.setPrice(89000);

        Order order = new Order();

        User user1 = new User("Сергей", "12345", "Москва, ул. Декабристов, д. 5, кв. 10", order);

        user1.addToProductInToBasket(phone1);
        user1.addToProductInToBasket(phone2);
        user1.addToProductInToBasket(tv1);
        user1.addToProductInToBasket(tv2);
        user1.addToProductInToBasket(pc);

        user1.deleteToProductInToBasket(tv2);

        order.printAllProductsInToBasket();

        order.filter(new FilterByPrice());

        order.printAllProductsInToBasket();

        user1.createOrder(user1, order);

    }
}
