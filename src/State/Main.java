package State;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        pokemon.performActions();

        while (true) {
            int action = (int) (Math.random() * 3);
            switch (action) {
                case 0:
                    pokemon.attack();
                    break;
                case 1:
                    pokemon.run();
                    break;
                case 2:
                    pokemon.rest();
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}