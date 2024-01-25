package composite;

import java.util.ArrayList;
import java.util.List;

public class Tuuletin implements Laiteosa{
    double hinta = 20;

    List<Laiteosa> lapset = new ArrayList<Laiteosa>();

    @Override
    public double getHinta() {
        double lopullinenHinta = hinta;

        for(Laiteosa lapsi : lapset) {
            lopullinenHinta += lapsi.getHinta();
        }
        return lopullinenHinta;
    }

    @Override
    public void lisaaLapsi(Laiteosa lapsi) {
        lapset.add(lapsi);
    }

}