import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input birthdate
        System.out.print("Enter birthdate (yyyy-MM-dd): ");
        String input = sc.nextLine();

        // Convert input to LocalDate
        LocalDate birthDate = LocalDate.parse(input);

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Calculate age
        int age = Period.between(birthDate, currentDate).getYears();

        // Output
        System.out.println("Age: " + age);

        sc.close();
    }
}
