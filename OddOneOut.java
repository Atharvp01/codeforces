import java.util.Scanner;
public class OddOneOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int one = in.nextInt();
            int two = in.nextInt();
            int three = in.nextInt();
            if(one!=two && one!=three){
                System.out.println(one);
                continue;
            }
            if(two!=three && two!=one){
                System.out.println(two);
                continue;
            }
            System.out.println(three);
        }
    }
}
