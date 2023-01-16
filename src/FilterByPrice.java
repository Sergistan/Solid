import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterByPrice implements Filter {
    int numberOrder = 1;
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Product> filterProducts(List<Product> order) {
        System.out.println("Фильтрация по цене продукта: ");
        double nameProduct = scanner.nextDouble();
        System.out.println("Нажмите 1, чтобы показать товары выше цены фильтрации, Нажмите 2, чтобы показать товары ниже цены фильтрации ");
        int num = scanner.nextInt();
        List<Product> filterOrder = new ArrayList<>();
            if (num == 1) {
                for (Product o : order) {
                    if (o.getPrice() > nameProduct) {
                        filterOrder.add(o);
                    } else
                        System.out.println("Таких товаров нет!");
                }
            }
             else if (num == 2) {
                for (Product o : order) {
                    if (o.getPrice() < nameProduct) {
                        filterOrder.add(o);
                        System.out.println("Таких товаров нет!");
                    }
                }
            }else
                System.out.println("Не верный ввод!");

        for (Product p : filterOrder) {
            System.out.println(numberOrder++ + ". " + filterOrder);
        }
        return filterOrder;
    }
}
