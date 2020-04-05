package iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[]args) {
        BikeRepository repository = new BikeRepository();

        repository.addBike("a");
        repository.addBike("b");
        repository.addBike("c");

        Iterator<String> bikeIterator = repository.iterator();

        while (bikeIterator.hasNext())
            System.out.println(bikeIterator.next());
    }
}
