import java.util.HashMap;

public class App {
  public static void main(String[] args) {

  }

  public static String numToWords(Integer myNum) {
    HashMap<Integer, String> alphaNumbers = new HashMap<Integer, String>();
    alphaNumbers.put(1, "one");
    alphaNumbers.put(2, "two");
    alphaNumbers.put(3, "three");
    alphaNumbers.put(4, "four");
    alphaNumbers.put(5, "five");
    alphaNumbers.put(6, "six");
    alphaNumbers.put(7, "seven");
    alphaNumbers.put(8, "eight");
    alphaNumbers.put(9, "nine");
    alphaNumbers.put(10, "ten");
    alphaNumbers.put(11, "eleven");
    alphaNumbers.put(12, "twelve");
    alphaNumbers.put(13, "thirteen");
    alphaNumbers.put(14, "fourteen");
    alphaNumbers.put(15, "fifteen");
    alphaNumbers.put(16, "sixteen");
    alphaNumbers.put(17, "seventeen");
    alphaNumbers.put(18, "eighteen");
    alphaNumbers.put(19, "nineteen");
    return alphaNumbers.get(myNum);
  }
}
