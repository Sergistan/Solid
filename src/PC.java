public class PC extends Product {//принцип открытости-закрытости, принцип замены Барбары Лисков
    protected int countUsbPort;

    public PC(String name, double price, int countUsbPort) {
        super(name, price);
        this.countUsbPort = countUsbPort;
    }

    @Override
    public void setPrice(double price) { // принцип инверсии зависимостей
        this.price = price;
        System.out.println("Новая стоимость ПК - " + price + " руб.");
    }

    @Override
    public String toString() {
        return "Компьютер{" +
                "модель:'" + name + '\'' +
                ", цена: " + price + "руб." +
                ", количество USB-портов: " + countUsbPort +
                '}';
    }
}
