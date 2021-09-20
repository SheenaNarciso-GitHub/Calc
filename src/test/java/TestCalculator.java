import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {


    @Test
    public void testAdd(){
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(10, myCalc.addNumbers(5,5));
    }

    @Test
    public void testSub(){
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(15, myCalc.subNumbers(20,5));
    }

}
