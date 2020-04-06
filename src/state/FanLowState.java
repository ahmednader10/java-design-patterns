package state;

public class FanLowState extends State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("turning fan on to medium");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "fan is low";
    }
}
