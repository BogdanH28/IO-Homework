package siit;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TimeResultComparatorTest {

    @Test
    public void ResultsAreSortedCorrectlyTest() {
        TimeResultComparator timeResultComparator = new TimeResultComparator();
        Set<Athlete> athleteSet = new TreeSet<>(timeResultComparator);
        Repository repo = new Repository(athleteSet);

        Athlete athlete1 = new Athlete("1", "A H", "HU", "30:30",
                "xo", "xo", "xo");
        Athlete athlete2 = new Athlete("2", "B H", "RO", "30:15",
                "xx", "xx", "xx");
        Athlete athlete3 = new Athlete("3", "C H", "BG", "30:20",
                "oo", "oo", "oo");

        athlete1.setTotalTimeInSeconds(1900);
        athlete2.setTotalTimeInSeconds(1800);
        athlete3.setTotalTimeInSeconds(1950);

        athleteSet.add(athlete1);
        athleteSet.add(athlete2);
        athleteSet.add(athlete3);

        Athlete[] athleteArray = new Athlete[3];
        athleteArray = athleteSet.toArray(athleteArray);

        assertThat(athleteArray[0], is(athlete2));
        assertThat(athleteArray[1], is(athlete1));
        assertThat(athleteArray[2], is(athlete3));
    }
}
