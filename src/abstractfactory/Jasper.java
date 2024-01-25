package abstractfactory;

public class Jasper {

    public void printtaaVaatteet(String merkki){
        FactoryProducer factoryProducer = new FactoryProducer(merkki);
        AbstractFactory factory = factoryProducer.getFactory();

        Lippis lippis = factory.createLippis();
        Paita paita = factory.createPaita();
        Huppari huppari = factory.createHuppari();
        Housut housut = factory.createHousut();
        Sukat sukat = factory.createSukat();
        Kengat kengat = factory.createKengat();

        System.out.println("Jasperilla on päällä:");
        System.out.println(lippis.toString() + "\n" + paita.toString() + "\n" + huppari.toString() + "\n" + housut.toString() + "\n" + sukat.toString() + "\n" + kengat.toString());
    }
}
