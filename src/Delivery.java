import java.time.LocalDateTime;

public class Delivery {
    protected LocalDateTime localDateTime = LocalDateTime.now();

    public void dataDelivery(User user) {
        System.out.println(user.getName() + ", заказ будет доставлен: " + localDateTime.plusDays(5) + " по адресу " + user.getAddress());
    }

}
