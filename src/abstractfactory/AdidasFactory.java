package abstractfactory;

public class AdidasFactory implements AbstractFactory {
    public Lippis createLippis() {
        return new Lippis("Adidas");
    }

    public Huppari createHuppari() {
        return new Huppari("Adidas");
    }

    public Paita createPaita() {
        return new Paita("Adidas");
    }

    public Housut createHousut() {
        return new Housut("Adidas");
    }

    public Sukat createSukat() {
        return new Sukat("Adidas");
    }

    public Kengat createKengat() {
        return new Kengat("Adidas");
    }
}

