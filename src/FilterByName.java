import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterByName implements Filter {
    int numberOrder = 1;
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Product> filterProducts(List<Product> order) {
        System.out.println("Фильтрация по названию продукта: ");
        String nameProduct = scanner.nextLine();
        List<Product> filterOrder = new ArrayList<>();
        for (Product o : order){
                if(o.getName().equals(nameProduct)){
                    filterOrder.add(o);
                }

        }
        for (Product p : filterOrder) {
            System.out.println(numberOrder++ + ". " + filterOrder);
        }
        return filterOrder;
    }
}
