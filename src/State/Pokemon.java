package State;

import java.util.Timer;
import java.util.TimerTask;

public class Pokemon {
    private PokemonState currentState;
    
    private int xp;

    public Pokemon() {
        currentState = new CharmanderState();
        xp = 0;
    }
    public void attack() {
        currentState.attack();
    }

    public void run() {
        currentState.run();
    }

    public void rest() {
        currentState.rest();
    }

    public void performActions() {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int xpEarned = (int) (Math.random() * 10) + 1;
                xp += xpEarned;
                System.out.println("Pokemon sai " + xpEarned + " XP!");

                if (xp >= 25 && currentState instanceof CharmanderState) {
                    System.out.println("Charmander kehittyy Charmeleoniksi!");
                    currentState = new CharmeleonState();
                } else if (xp >= 50 && currentState instanceof CharmeleonState) {
                    System.out.println("Charmeleon kehittyy Charizardiksi!");
                    currentState = new CharizardState();
                }
            }
        };
        timer.schedule(task, 0, 2000);
    }
}