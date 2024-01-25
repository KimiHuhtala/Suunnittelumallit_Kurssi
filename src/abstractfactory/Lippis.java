package abstractfactory;

public class Lippis {
    private String factoryName;

    public Lippis(String name) {
        factoryName = name;
    }
    public String toString() {
        return factoryName + "-lippis";
    }
}
