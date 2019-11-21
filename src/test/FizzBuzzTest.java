import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testTen() throws Exception {
        Assert.assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }

    @Test
    public void testSix() throws Exception {
        Assert.assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
    }

    @Test
    public void testFifteen() throws Exception {
        Assert.assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @Test
    public void testEight() throws Exception {
        Assert.assertEquals("8", FizzBuzz.fizzbuzz(8));
    }
}
