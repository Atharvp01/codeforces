import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int sumOfSquares = 0;
            for(int i=0; i<n; i++){
                int currentSquare = in.nextInt();
                sumOfSquares+=currentSquare;
            }
            double sqrt = Math.sqrt(sumOfSquares);
            if(!(sqrt ==Math.floor(sqrt))) System.out.println("no");
            else System.out.println("yes");
        }
    }
}
