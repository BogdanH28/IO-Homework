package siit;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses( {
        ReadingFromFileTests.class,
        CalculatorTest.class,
        TimeResultComparatorTest.class
})

public class TestSuite {
}
