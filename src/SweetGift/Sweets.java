package SweetGift;

abstract class Sweets {
    String name;
    public double weight;
    public double price;

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название: " + name + "; Вес: " + weight + "; Цена: " + price;
    }
}

