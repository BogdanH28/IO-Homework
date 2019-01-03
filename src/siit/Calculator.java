package siit;

public class Calculator {

    public int CalculatePenalties(Athlete athlete) {
        String firstShooting = athlete.getFirstShooting();
        String secondShooting = athlete.getSecondShooting();
        String thirdShooting = athlete.getThirdShooting();
        String totalShooting = firstShooting.concat(secondShooting).concat(thirdShooting);

        int sum = 0;
        for(int i = 0; i < totalShooting.length(); i++) {
            if(totalShooting.charAt(i) == 'o') {
                sum += 10;
            }
        }
        return sum;
    }

    public int CalculateTotalTimeInSeconds(Athlete athlete) {
        String[] splitString = TimeSplitter(athlete.getSkiTimeResult());
        int minutesSkiTimeResult = Integer.parseInt(splitString[0]);
        int secondsSkiTimeResult = Integer.parseInt(splitString[1]);
        int totalTimeInSeconds = MinutesIntoSecondsConverter(minutesSkiTimeResult, secondsSkiTimeResult);
        return totalTimeInSeconds + CalculatePenalties(athlete);
    }

    public int MinutesIntoSecondsConverter(int minutes, int seconds) {
        return minutes*60 + seconds;
    }

    public String[] TimeSplitter(String skiTimeResult) {
        return skiTimeResult.split(":");
    }

}
