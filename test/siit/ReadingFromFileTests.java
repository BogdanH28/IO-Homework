package siit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReadingFromFileTests {

    @Test
    public void SplitCommasTest() {
        final String testString = "A,B,C,AA,BBB,CCCC";
        String[] testArrayString = testString.split(",");
        String[] expectedArrayString = {"A", "B", "C", "AA", "BBB", "CCCC"};

        assertThat(testArrayString.length, is(expectedArrayString.length));
        for(int i = 0; i < testArrayString.length; i++) {
            assertThat(testArrayString[i], is(expectedArrayString[i]));
        }
    }

    @Test
    public void AthleteIsCreatedCorrectlyWithSplitArrayData() {
        final String[] testString = {"1","Bogdan H","RO","30:15","xoxxx","ooooo","xoxox"};
        Athlete athleteTest = new Athlete(testString[0], testString[1], testString[2], testString[3],
                testString[4], testString[5], testString[6]);

        assertThat(athleteTest.getAthleteNumber(), is(testString[0]));
        assertThat(athleteTest.getAthleteName(), is(testString[1]));
        assertThat(athleteTest.getCountryCode(), is(testString[2]));
        assertThat(athleteTest.getSkiTimeResult(), is(testString[3]));
        assertThat(athleteTest.getFirstShooting(), is(testString[4]));
        assertThat(athleteTest.getSecondShooting(), is(testString[5]));
        assertThat(athleteTest.getThirdShooting(), is(testString[6]));
    }

}
