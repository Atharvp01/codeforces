import java.util.Scanner;

public class Elephant617A {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int remainder = in.nextInt();
      int steps = 0;
      for(int i=5; i>=1; i--) {
          if (remainder >= i) {
              steps += remainder / i;
              remainder %= i;
          }
      }
        System.out.println(steps);
    }
}
