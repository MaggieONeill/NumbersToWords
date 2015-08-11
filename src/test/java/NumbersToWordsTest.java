import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {


  @Test
  public void numToWords_returnStringForSingleDigit_One() {
    String expected = "one";
    assertEquals(expected, App.numToWords(1));
  }


  @Test
  public void numToWords_returnStringForDoubleDigit_Twelve() {
    String expected = "twelve";
    assertEquals(expected, App.numToWords(12));
  }

  @Test
  public void numToWords_returnStringForDoubleDigitOverTwenty_TwentyOne(){
    String expected ="twentyone";
    assertEquals(expected, App.numToWords(21));
  }
}
