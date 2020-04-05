package chainOfResponsibility;

public class Main {

    public static void main(String[]args) {
        Director a = new Director();
        VP b = new VP();
        CEO c = new CEO();

        a.setSuccessor(b);
        b.setSuccessor(c);

        Request request1 = new Request(RequestType.CONFERENCE, 100);
        Request request2 = new Request(RequestType.PURCHASE, 100);
        Request request3 = new Request(RequestType.PURCHASE, 170);

        a.handleRequest(request1);
        a.handleRequest(request2);
        a.handleRequest(request3);

    }
}
