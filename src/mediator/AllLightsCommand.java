package mediator;

public class AllLightsCommand implements Command {
    private Mediator mediator;

    public AllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
