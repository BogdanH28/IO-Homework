package siit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static TimeResultComparator timeResultComparator = new TimeResultComparator();
    private static Set<Athlete> athleteSet = new TreeSet<>(timeResultComparator);
    private static Repository repo = new Repository(athleteSet);

    public static void main(String[] args){
        try {
            ReadFromFile();
        } catch (Exception e) {
            e.getStackTrace();
        }

        repo.listFirstThreeAthletes(athleteSet);
    }

    public static void ReadFromFile() throws Exception {
        File file = new File("C:/Users/PC/Desktop/IO-Homework/in.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null) {
            String[] newString = st.split(",");
            Athlete athlete = new Athlete(newString[0], newString[1], newString[2], newString[3], newString[4], newString[5], newString[6]);

            Calculator calculator = new Calculator();
            athlete.setTotalTimeInSeconds(calculator.CalculateTotalTimeInSeconds(athlete));

            repo.addAthlete(athlete);
        }
    }
}