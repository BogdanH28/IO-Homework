package siit;

public class Athlete {

    private String AthleteNumber;
    private String AthleteName;
    private String CountryCode;
    private String SkiTimeResult;
    private String FirstShooting;
    private String SecondShooting;
    private String ThirdShooting;
    private int TotalTimeInSeconds;

    public Athlete(String athleteNumber, String athleteName, String countryCode, String skiTimeResult, String firstShooting, String secondShooting, String thirdShooting) {
        AthleteNumber = athleteNumber;
        AthleteName = athleteName;
        CountryCode = countryCode;
        SkiTimeResult = skiTimeResult;
        FirstShooting = firstShooting;
        SecondShooting = secondShooting;
        ThirdShooting = thirdShooting;
    }

    public void setTotalTimeInSeconds(int totalTimeInSeconds) {
        TotalTimeInSeconds = totalTimeInSeconds;
    }

    public void setAthleteNumber(String athleteNumber) {
        AthleteNumber = athleteNumber;
    }

    public void setAthleteName(String athleteName) {
        AthleteName = athleteName;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public void setSkiTimeResult(String skiTimeResult) {
        SkiTimeResult = skiTimeResult;
    }

    public void setFirstShooting(String firstShooting) {
        FirstShooting = firstShooting;
    }

    public void setSecondShooting(String secondShooting) {
        SecondShooting = secondShooting;
    }

    public void setThirdShooting(String thirdShooting) {
        ThirdShooting = thirdShooting;
    }

    public String getAthleteNumber() {
        return AthleteNumber;
    }

    public String getAthleteName() {
        return AthleteName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getSkiTimeResult() {
        return SkiTimeResult;
    }

    public String getFirstShooting() {
        return FirstShooting;
    }

    public String getSecondShooting() {
        return SecondShooting;
    }

    public String getThirdShooting() {
        return ThirdShooting;
    }

    public int getTotalTimeInSeconds() {
        return TotalTimeInSeconds;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "AthleteNumber='" + AthleteNumber + '\'' +
                ", AthleteName='" + AthleteName + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", SkiTimeResult='" + SkiTimeResult + '\'' +
                ", FirstShooting='" + FirstShooting + '\'' +
                ", SecondShooting='" + SecondShooting + '\'' +
                ", ThirdShooting='" + ThirdShooting + '\'' +
                ", TotalTimeInSeconds='" + TotalTimeInSeconds + '\'' +
                '}';
    }
}
