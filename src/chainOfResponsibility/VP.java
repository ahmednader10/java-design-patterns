package chainOfResponsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 150)
                System.out.println("vp can approve ");
            else {
                successor.handleRequest(request);
            }
        }
    }
}