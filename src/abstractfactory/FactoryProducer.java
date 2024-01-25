package abstractfactory;

public class FactoryProducer {
    private String factoryName;

    public FactoryProducer(String name) {
        factoryName = name;
    }

    public AbstractFactory getFactory() {
        switch (factoryName){
            case "Adidas":
                return new AdidasFactory();
            case "Boss":
                return  new BossFactory();
        }
        return null;
    }

}