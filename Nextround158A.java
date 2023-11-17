import java.util.Scanner;

public class Nextround158A {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int participants = in.nextInt();
       int highestFinisher = in.nextInt();
       int res = 0;
       int arr[] = new int[participants];
       for(int i=0; i<arr.length; i++){
           int currNum = in.nextInt();
           arr[i] = currNum;
       }
       for(int item : arr){
           if(item>=arr[highestFinisher-1] && item>0){
              res++;
           }
       }
        System.out.println(res);
    }
}
