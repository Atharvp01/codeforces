import java.util.Scanner;
public class PreparingForTheContest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();

                int[] order = new int[n];

                for (int i = 0; i < n; i++) {
                    order[i] = i + 1;
                }

                for (int i = k; i < n; i++) {
                    int temp = order[i];
                    order[i] = order[n - 1];
                    order[n - 1] = temp;
                    n--;
                }

                for (int i = 0; i < order.length; i++) {
                    System.out.print(order[i] + " ");
                }
                System.out.println();
            }
        }

}
