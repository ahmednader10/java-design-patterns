package state;

public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("turning fan on to high");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "fan is medium";
    }

}
