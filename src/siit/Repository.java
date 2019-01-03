package siit;

import java.util.Set;
import java.util.TreeSet;

public class Repository {

    private Set<Athlete> athleteSet = new TreeSet<>();

    public Repository(Set<Athlete> athleteSet) {
        this.athleteSet = athleteSet;
    }

    public void addAthlete(Athlete athlete) { //, Set<Athlete> athleteSet
        athleteSet.add(athlete);
    }

    public void listAthlete(Athlete athlete) {
        System.out.println(athlete);
    }

    public void listFirstThreeAthletes(Set<Athlete> athleteSet) {
        int i = 1;
        for(Athlete athlete: athleteSet) {
            System.out.println(i++ + ".place: " + athlete);
        }

        if(i == 3) {
            return;
        }
    }

}
