import java.util.HashMap;

public class App {
  public static void main(String[] args) {

  }

  public static String numToWords(Integer myNumber) {
    HashMap<Integer, String> underTwenties = new HashMap<Integer, String>();
    underTwenties.put(1, "one");
    underTwenties.put(2, "two");
    underTwenties.put(3, "three");
    underTwenties.put(4, "four");
    underTwenties.put(5, "five");
    underTwenties.put(6, "six");
    underTwenties.put(7, "seven");
    underTwenties.put(8, "eight");
    underTwenties.put(9, "nine");
    underTwenties.put(10, "ten");
    underTwenties.put(11, "eleven");
    underTwenties.put(12, "twelve");
    underTwenties.put(13, "thirteen");
    underTwenties.put(14, "fourteen");
    underTwenties.put(15, "fifteen");
    underTwenties.put(16, "sixteen");
    underTwenties.put(17, "seventeen");
    underTwenties.put(18, "eighteen");
    underTwenties.put(19, "nineteen");


    HashMap<Integer, String> tens = new HashMap<Integer, String>();
    tens.put(20, "twenty");
    tens.put(30, "thirty");
    tens.put(40, "forty");
    tens.put(50, "fifty");
    tens.put(60, "sixty");
    tens.put(70, "seventy");
    tens.put(80, "eighty");
    tens.put(90, "ninety");


    if (myNumber < 20) {
      return underTwenties.get(myNumber);
    } else {
      return tens.get(myNumber - myNumber%10) + underTwenties.get(myNumber%10);
    }
  }
}
