package factory;

public class Main {
    public static void main(String[]args) {

        Factory<Circle> factory1 = () -> new Circle();

        Circle circle1 = factory1.newInstance();
        Circle circle2 = factory1.newInstance();

        System.out.println(circle1);
        System.out.println(circle2);

        Factory<Circle> factory2 = Factory.createFactory(Circle::new);

        Circle circle3 = factory2.newInstance();

        Circle circle4 = factory2.newInstance();

        System.out.println(circle3);
        System.out.println(circle4);
    }
}
