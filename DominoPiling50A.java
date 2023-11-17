import java.util.Scanner;

public class DominoPiling50A {
    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int squares = m*n;
        res = squares/2;
        System.out.println(res);
    }
}
