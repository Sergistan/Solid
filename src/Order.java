import java.util.ArrayList;
import java.util.List;

public class Order { //принцип единственной ответственности (класс Order отвечает только за заказ)
    protected int numberOrder = 1; //магические числа (используется число 1, для начала подсчета количества товаров в корзине/заказе)
    List<Product> order = new ArrayList<>();

    protected void addProductsInToBasket(Product product) {
        if (product.isAvailability()) {
            order.add(product);
        } else
            System.out.println(product + " в наличии нет!");
    }

    public void deleteProductsInToBasket(Product product) {
        if (order.contains(product)) {
            order.remove(product);
        } else
            System.out.println(product + " не добавляли в корзину изночально!");
    }

    protected void printAllProductsInToBasket() {
        System.out.println("В КОРЗИНЕ:");
        if (!isEmpty()) {  // принцип DRY (нет повтора кода)
            for (Product p : order) {
                System.out.println(numberOrder++ + ". " + p); //магические числа
            }
        } else {
            System.out.println("Корзина пуста!");
        }
    }

    public List<Product> filter(Filter typeFilter) { // принцип инверсии зависимостей (зависим то интерфейса Filter, а не от его реализаций)
        numberOrder = 1;
        return typeFilter.filterProducts(order);
    }

    public boolean isEmpty() {  // принцип DRY (используется в классах Order и User)
        return order.isEmpty();
    }
}
