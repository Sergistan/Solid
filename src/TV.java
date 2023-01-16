public class TV extends Product {//принцип открытости-закрытости, принцип замены Барбары Лисков

    protected int countTvChannels;

    public TV(String name, double price, int countTvChannels) {
        super(name, price);
        this.countTvChannels = countTvChannels;
    }

    @Override
    public void setPrice(double price) { // принцип инверсии зависимостей
        this.price = price;
        System.out.println("Новая стоимость телевизора - " + price + " руб.");
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
