import java.util.Scanner;
public class Waytoolongwords71A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String inword = in.next();
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < inword.length(); i++) {
                if(inword.length()>10) {
                    if (i == 0) {
                        word.append(inword.charAt(i));
                    }
                    if (i == 1) {
                        word.append(inword.length() - 2);
                    }
                    if (i == inword.length() - 1) {
                        word.append(inword.charAt(inword.length() - 1));
                    }
                }else{
                    word.append(inword);
                    break;
                }
            }
            System.out.println(word);

        }
    }
}
