import java.util.HashMap;
import java.util.Scanner;

public class ProblemsolvingLog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            HashMap<Character, Integer> map = new HashMap<>();
            int n = in.nextInt();
            String log = in.next();
            int count = 0;
            for(int i=0; i<n; i++){
                if(map.containsKey(log.toLowerCase().charAt(i))){
                    map.put(log.toLowerCase().charAt(i), map.get(log.toLowerCase().charAt(i))+1);
                }else {
                    map.put(log.toLowerCase().charAt(i), 0);
                }
            }
            for (HashMap.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() >= entry.getKey() - 'a') count++;
            }
            System.out.println(count);
        }
    }
}
