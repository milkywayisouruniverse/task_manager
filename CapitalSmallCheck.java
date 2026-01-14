import java.util.Scanner;

public class CapitalSmallCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            }
        }

        if (hasUpper && hasLower) {
            System.out.println("String contains at least one CAPITAL and one small letter");
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}
