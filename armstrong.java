import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int sum = 0;

        // Step 1: count digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Step 2: calculate Armstrong sum
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Step 3: check
        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }

        sc.close();
    }
}
