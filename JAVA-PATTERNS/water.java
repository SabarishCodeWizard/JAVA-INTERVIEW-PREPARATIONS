import java.util.*;

public class water {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if (s.length() % 2 == 0) {
            System.out.println("even");
        } else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (i == j || i + j == s.length() - 1) {
                        System.out.print(s.charAt(j));
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
    }
}