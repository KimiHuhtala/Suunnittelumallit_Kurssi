package composite;

import java.util.ArrayList;
import java.util.List;

public class Naytonohjain implements Laiteosa {
    double hinta = 700;

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