package observer;

public class Main {

    public static void main(String[]args) {
        Subject subject = new MessageStream();

        TabletClient tabletClient = new TabletClient(subject);
        PhoneClient phoneClient = new PhoneClient(subject);
        phoneClient.addMessage("new message");
        phoneClient.addMessage("another message");

        tabletClient.addMessage("new message");
        tabletClient.addMessage("another message");


    }
}
