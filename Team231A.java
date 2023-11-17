import java.util.Scanner;
public class Team231A {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int problems = in.nextInt();
       int res = 0;
       while(problems-->0){
           int currNumber = 0;
           for(int i=0; i<=2; i++){
               currNumber += in.nextInt();
           }
           if(currNumber>=2){
               res+=1;
           }
       }
        System.out.println(res);
    }
}
