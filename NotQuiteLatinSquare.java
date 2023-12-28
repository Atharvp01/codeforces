import java.util.Scanner;

public class NotQuiteLatinSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            for(int i=0; i<3; i++){
                String str = in.next();
                int ascii_sum = 0;
                for(int j=0; j<3; j++){
                    ascii_sum+=str.charAt(j);
                }
                if(ascii_sum==195) {
                    System.out.println('B');
                    continue;
                }
                else if(ascii_sum==196){
                    System.out.println('A');
                    continue;
                }else if(ascii_sum==194){
                    System.out.println('C');
                    continue;
                }else{
                    continue;
                }
            }
        }
    }
}
