import java.util.HashMap;

public class App {
  public static void main(String[] args) {

  }

  public static String numToWords(Integer myNum) {
    HashMap<Integer, String> alphaNumbers = new HashMap<Integer, String>();
    alphaNumbers.put(1, "one");
    return alphaNumbers.get(myNum);
  }
}
