package SweetGift;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        box.add(new Cake("Наполеон",2150.00, 560.00,"Слоенный"));
        box.add(new Cake("Захер",1800.00, 700.00,"Шоколадный"));
        box.add(new Pie("Клубничный пирог",400.00,200.00,"Дешевый"));
        box.add(new Cookie("Овсянное печенье",331.00,120.00,"Полезное"));
        box.add(new Jellybean("Жевательный мармелад",600.00,614,"Очень вкусно"));
        box.add(new Candy("Ferrero Rocher",300.00,989,"Цельный орех внутри") );


        System.out.println("Общий вес подарка: "+box.getTotalWeight()+" г.");
        System.out.println("Общая цена подарка: "+box.getTotalPrice() + " руб.");
box.getAllInfo();
box.reducePrice(2000);//входной параметр для цены
        System.out.println(" ");
box.reduceWeight(1000);//входной параметр для веса

        int n = 1; //сколько удаляем элементов
        for (int i = 0; i < n; i++) {

            box.remove();
        }

        box.getAllInfo();
    }
}