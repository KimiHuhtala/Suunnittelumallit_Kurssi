package abstractfactory;

public class Kengat {
    private String factoryName;

    public Kengat(String name) {
        factoryName = name;
    }
    public String toString() {
        return factoryName + "-kengät";
    }
}
