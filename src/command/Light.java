package command;

//receiver
public class Light {

    private boolean isOn = false;

    public void toggle(){
        if (isOn) {
            off();
            isOn = false;
        }
        else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println("light is on");
    }

    public void off() {
        System.out.println("light is off");
    }
}
