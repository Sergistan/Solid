public class PC extends Product {//принцип открытости-закрытости (расширяем класс наследник новым полем),
    // принцип замены Барбары Лисков (при создании объекта мы заменям общий класс более конкретным, следовательно мы играем роль предка)

    protected int countUsbPort;

    public PC(String name, double price, int countUsbPort, boolean isAvailability) {
        super(name, price, isAvailability);
        this.countUsbPort = countUsbPort;
    }

    @Override
    public void setPrice(double price) { // принцип инверсии зависимостей
        this.price = price;
        System.out.println("Новая стоимость " + getName() + " " + price + " руб.");
    }

    @Override
    public String toString() {
        return "Компьютер{" +
                "модель:'" + name + '\'' +
                ", цена: " + price + " руб." +
                ", количество USB-портов: " + countUsbPort +
                '}';
    }
}
