package state;

public class FanOffState extends State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("turning fan on to Low");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "fan is off";
    }
}
