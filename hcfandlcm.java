import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a, y = b;

        // Find HCF
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;
        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
