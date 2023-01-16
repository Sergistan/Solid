public class Phones extends Product { //принцип открытости-закрытости, принцип замены Барбары Лисков

    protected String nameOs;

    public Phones(String name, double price, String nameOs) {
        super(name, price);
        this.nameOs = nameOs;
    }

    @Override
    public void setPrice(double price) { // принцип инверсии зависимостей
        this.price = price;
        System.out.println("Новая стоимость телефона - " + price + " руб.");
    }

    @Override
    public String toString() {
        return "Телефон{" +
                "модель:'" + name + '\'' +
                ", цена: " + price + " руб." +
                ", название операционной системы: " + nameOs +
                '}';
    }
}
