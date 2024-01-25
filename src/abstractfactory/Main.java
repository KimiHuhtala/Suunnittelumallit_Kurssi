package abstractfactory;

public class Main {
    public static void main(String[] args) {
        Jasper jasper = new Jasper();
        System.out.println("Jasper on vielä köyhä opiskelija ja joutuu pitämään Adidas-vaatteita.");
        jasper.printtaaVaatteet("Adidas");

        System.out.println("Nyt jasper on valmistunut insinööriksi. Nyt hän pitää Boss-vaatteita.");
        jasper.printtaaVaatteet("Boss");
    }
}