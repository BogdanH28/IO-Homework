package siit;

import java.util.Comparator;

public class TimeResultComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete a1, Athlete a2) {
        return a1.getTotalTimeInSeconds() - a2.getTotalTimeInSeconds();
    }
}
