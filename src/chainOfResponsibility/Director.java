package chainOfResponsibility;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("directors can approve ");
        }
        else {
            successor.handleRequest(request);
        }
    }
}
