import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterByPrice implements Filter {
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Product> filterProducts(List<Product> order) {
        System.out.println("Фильтрация по цене продукта: ");
        Double nameProduct = scanner.nextDouble();
        System.out.println("Нажмите 1, чтобы показать товары выше цены фильтрации, Нажмите 2, чтобы показать товары ниже цены фильтрации ");
        int num = scanner.nextInt();

        List<Product> filterOrder = new ArrayList<>();
        for (Product o : order) {
            if (num == 1) {
                if (o.getPrice() > nameProduct)
                    filterOrder.add(o);
            } else if (num == 2) {
                if (o.getPrice() < nameProduct)
                    filterOrder.add(o);
            } else
                System.out.println("Неверный ввод!");
        }

        order.clear();
        order.addAll(filterOrder);
        return order;
    }
}

