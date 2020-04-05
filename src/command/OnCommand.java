package command;

//concrete command
public class OnCommand implements Command{
    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    public void undo() {
        this.light.off();
    }
}
