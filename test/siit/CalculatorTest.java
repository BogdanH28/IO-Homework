package siit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void ShootingRangesAreConcatenatedCorrectlyTest() {
        final String firstS = "xox";
        final String secondS = "ooo";
        final String thirdS = "xxx";

        String concatString = firstS.concat(secondS).concat(thirdS);
        assertThat(concatString, is("xoxoooxxx"));
    }

    @Test
    public void ShootingRangesPenaltyPointsTotalSumTest() {
        Calculator calculator = new Calculator();
        Athlete athlete = new Athlete("1","Bogdan H","RO","30:15",
                "xoxxx","ooooo","xoxox");
        int sum = calculator.CalculatePenalties(athlete);

        assertThat(sum, is(80));
    }

    @Test
    public void SecondConvertIsCorrectTest() {
       int minutes = 1;
       int seconds = 10;
       Calculator calculator = new Calculator();
       assertThat(calculator.MinutesIntoSecondsConverter(minutes, seconds), is(70));
    }

    @Test
    public void TimeSplitterWorksCorrectly() {
        String resultTime = "30:15";
        Calculator calculator = new Calculator();
        String[] splittedTime = calculator.TimeSplitter(resultTime);

        assertThat(splittedTime[0], is("30"));
        assertThat(splittedTime[1], is("15"));
    }

    @Test
    public void TotalTimeWithPenaltiesCalculatorTest() {
        Athlete athlete = new Athlete("1","Bogdan H","RO","30:15",
                "xoxxx","ooooo","xoxox");
        Calculator calculator = new Calculator();
        int total = calculator.CalculateTotalTimeInSeconds(athlete);

        assertThat(total, is(1895));
    }
}
