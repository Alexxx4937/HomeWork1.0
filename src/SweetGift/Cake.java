package SweetGift;

public class Cake extends Sweets {
    private String uniqueParameter;

    public Cake(String name, double weight, double price, String uniqueParameter) {
        super(name, weight, price);
        this.uniqueParameter = uniqueParameter;
    }

    @Override
    public String toString() {
        return super.toString() + " Уникальный Параметр = " + uniqueParameter;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
