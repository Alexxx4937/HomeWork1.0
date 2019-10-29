package SweetGift;

import java.util.Comparator;

public class ComparatorMaxWeight implements Comparator<Sweets> {



    @Override
    public int compare(Sweets o1, Sweets o2) {
        double dif =  (o1.weight - o2.weight);
        return (dif < 0.0) ? 1 : (dif > 0.0) ? -1 : 0;
    }
}
