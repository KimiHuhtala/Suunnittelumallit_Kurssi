package ChainOfResponsibility;

public class CEO implements Handler{

    @Override
    public void setNextHandler(Handler nextHandler) {
        System.out.println("Toimitusjohtaja on viimeinen hyväksyjä");
    }

    @Override
    public void handleRequest(double percentage) {
        if(percentage > 5) {
            System.out.println("Toimitusjohtaja hyväksyy " + percentage + " prosentin korotuspyynnöt");
        }
    }
}