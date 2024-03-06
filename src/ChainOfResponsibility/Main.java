package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler supervisor = new Supervisor();
        Handler headOfUnit = new HeadOfUnit();
        Handler ceo = new CEO();

        supervisor.setNextHandler(headOfUnit);
        headOfUnit.setNextHandler(ceo);

        double[] raises = {2, 2.5, 6, 2, 0.5, 20};

        for(double raise: raises) {
            supervisor.handleRequest(raise);
        }
    }
}