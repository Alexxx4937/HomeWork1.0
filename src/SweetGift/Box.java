package SweetGift;

import java.util.Arrays;
import java.util.Comparator;

public class Box implements Do {


    private static Sweets[] sweets = new Sweets[0];


    /**
     * Функция добавления объекта класса Sweet в массив sweets.
     */
    @Override
    public void add(Sweets sweet) {


        if (sweet == null) {
            System.out.println("Вы ввели null");
        } else {
            sweets = Arrays.copyOf(sweets, sweets.length + 1);
            sweets[sweets.length - 1] = sweet;
        }
    }


    /**
     * Функция удаления последнего объекта из массива sweets.
     */


    @Override
    public void remove() {
        if (sweets.length > 0) {
            sweets = Arrays.copyOf(sweets, sweets.length - 1);
        } else {

            System.out.println("В массиве нет элементов для удаления");


        }
    }

    /**
     * Функция получения значения поля totalWeight
     *
     * @return возвращает суммарный вес всех объектов массива
     */
    @Override
    public double getTotalWeight() {
        double x = 0;
        for (int i = 0; i < sweets.length; i++) {
            x = x + sweets[i].weight;
        }
        return x;
    }

    /**
     * Функция получения значения поля totalPrice
     *
     * @return возвращает суммарную стоимость всех объектов массива
     */
    @Override
    public double getTotalPrice() {
        double x = 0;
        for (int i = 0; i < sweets.length; i++) {
            x = x + sweets[i].price;
        }
        return x;
    }

    /**
     * Функция выводит на экран каждый элемент массива sweets.
     */
    @Override
    public void getAllInfo() {
        System.out.println("\nИнформация обо всех сладостях в подарке:");
        for (Sweets sweet : sweets) {
            System.out.println(sweet.toString());
        }


        /**
         * Функция удаляет из массива элемент с меньшим весом пока вес не станет меньше входного параметра.
         */
    }

    public void reduceWeight(double weight) {
        sweets = Arrays.copyOf(sweets, sweets.length);
        double x = getTotalWeight();
        Comparator weightComparator = new ComparatorMaxWeight();
        Arrays.sort(sweets, weightComparator);
        for (Sweets sweet : sweets) {
            System.out.println(sweet.toString());
        }


        while (x > weight) {
            if (sweets.length == 1) {
                System.out.println("Коробочка пуста");
                break;
            }
            System.out.println("\n Вес коробочки " + x + " больше входного параметра " + weight);
            System.out.println("Удаляем сладость с наименьшим весом " + sweets[sweets.length - 1].weight);
            x = x - sweets[sweets.length - 1].weight;
            sweets = Arrays.copyOf(sweets, sweets.length - 1);


        }
        System.out.println("Вес коробочки " + x + " меньше входного параметра (>" + weight + ")");

    }

    /**
     * Функция удаляет из массива элемент с меньшей ценой пока цена не станет меньше входного параметра.
     */


    public void reducePrice(int price) {
        sweets = Arrays.copyOf(sweets, sweets.length);
        double x = getTotalPrice();


        Comparator priceComparator = new ComparatorMaxPrice();
        Arrays.sort(sweets, priceComparator);
        for (Sweets sweet : sweets) {
            System.out.println(sweet.toString());
        }


        while (x > price) {
            if (sweets.length == 1) {
                System.out.println("Коробочка пуста");
                break;
            }
            System.out.println("\n Цена коробочки " + x + " больше входного параметра " + price);
            System.out.println("Удаляем сладость с наименьшей ценой " + sweets[sweets.length - 1].price);
            x = x - sweets[sweets.length - 1].price;
            sweets = Arrays.copyOf(sweets, sweets.length - 1);


        }
        System.out.println("Цена коробочки " + x + " меньше входного параметра (>" + price + ")");

    }
}
