package abstractfactory;

public class Huppari {
    private String factoryName;

    public Huppari(String name) {
        factoryName = name;
    }
    public String toString() {
        return factoryName + "-huppari";
    }
}
