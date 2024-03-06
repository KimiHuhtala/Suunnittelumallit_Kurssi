package ChainOfResponsibility;

public class Supervisor implements Handler{
    private Handler nextHandler;


    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(double percentage) {
        if(percentage <= 2) {
            System.out.println("Lähiesimies hyväksyy " + percentage + " prosentin korotuspyynnöt");
        } else {
            this.nextHandler.handleRequest(percentage);
        }
    }
}
