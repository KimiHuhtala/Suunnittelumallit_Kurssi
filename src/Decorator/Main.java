package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Jauheliha(new Mozzarella(new Kinkku(new PizzaImplements())));
        Pizza pizza2 = new Tonnikala(new Salami(new PizzaImplements()));
        Pizza pizza3 = new Salami(new Jauheliha(new Kinkku(new PizzaImplements())));

        System.out.println("Täytteet: " + pizza1.getDescription() + "\nHinta: " + pizza1.getPrice() + "€");
        System.out.println("Täytteet: " + pizza3.getDescription() + "\nHinta: " + pizza2.getPrice() + "€");
        System.out.println("Täytteet: " + pizza2.getDescription() + "\nHinta: " + pizza3.getPrice() + "€");
    }
}
