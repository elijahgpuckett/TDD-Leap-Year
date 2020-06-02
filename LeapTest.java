import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class LeapTest {

    @Test
    public void isYearDivisibleBy4() {
        Leap leapyear = new Leap();
        assertEquals(true, leapyear.isLeapYear(1992));
        assertEquals(false, leapyear.isLeapYear(1999));
    }

    @Test 
    public void isYearDivisibleBy400(){
        Leap leapyear = new Leap();
        assertEquals(true, leapyear.isLeapYear(2000));  
        assertEquals(false, leapyear.isLeapYear(1800));  
    }
}