public class TV extends Product {//принцип открытости-закрытости (расширяем класс наследник новым полем)
    // принцип замены Барбары Лисков (при создании объекта мы заменям общий класс более конкретным, следовательно мы играем роль предка)

    protected int countTvChannels;

    public TV(String name, double price, int countTvChannels, boolean isAvailability) {
        super(name, price, isAvailability);
        this.countTvChannels = countTvChannels;
    }

    @Override
    public void setPrice(double price) { // принцип инверсии зависимостей
        this.price = price;
        System.out.println("Новая стоимость " + getName() + " " + price + " руб.");
    }

    @Override
    public String toString() {
        return "Телевизор{" +
                "модель:'" + name + '\'' +
                ", цена: " + price + " руб." +
                ", кол-во каналов:" + countTvChannels +
                '}';
    }
}
