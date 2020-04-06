package state;

public class Main {

    public static void main(String[]args) {
        Fan fan = new Fan();

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }
}
