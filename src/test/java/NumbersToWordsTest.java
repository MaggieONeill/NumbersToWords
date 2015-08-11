import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {


  @Test
  public void numToWords_returnStringForSingleDigit_One() {
    String expected = "one";
    assertEquals(expected, App.numToWords(1));
  }

}
