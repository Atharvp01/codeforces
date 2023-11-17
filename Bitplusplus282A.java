import java.util.Scanner;

public class Bitplusplus282A {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int res = 0;
       while(n-->0){
           String currString = in.next();
           for(int i=0; i<currString.length(); i++) {
               if (currString.charAt(i) == '+') {
                   res++;
                   break;
               }
               if (currString.charAt(i) == '-') {
                   res--;
                   break;
               }
           }
       }
        System.out.println(res);
    }
}
