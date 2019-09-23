import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int numb1 = numbers.nextInt();
        int numb2 = numbers.nextInt();
        int numb3 = numbers.nextInt();

        int sum = numb1 + numb2 + numb3;
        int multiplication = numb1 * numb2 * numb3;
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Multiplication of all numbers: " + multiplication);
    }
}
