public class Phones extends Product { //принцип открытости-закрытости (расширяем класс наследник новым полем),
    // принцип замены Барбары Лисков (при создании объекта мы заменям общий класс более конкретным, следовательно мы играем роль предка)

    protected String nameOs;

    public Phones(String name, double price, String nameOs, boolean isAvailability) {
        super(name, price, isAvailability);
        this.nameOs = nameOs;
    }

    @Override
    public void setPrice(double price) { // принцип инверсии зависимостей
        this.price = price;
        System.out.println("Новая стоимость " + getName() + " " + price + " руб.");
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
