import java.util.ArrayList;
import java.util.List;

public class Order { //принцип единственной ответственности
    protected int numberOrder = 1; //магические числа
    List<Product> order = new ArrayList<>();

    protected void addProductsInToOrder(Product product) {
        order.add(product);
    }

    protected void printAllProducts() {
        System.out.println("В КОРЗИНЕ:");
        if (!order.isEmpty()) {
            for (Product p : order) {
                System.out.println(numberOrder++ + ". " + p);
            }
        }
    }

    public List<Product> filterProducts(Filter filter) {
       return filter.filterProducts(order);
    }
}
