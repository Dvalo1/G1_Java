import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int numb1 = numbers.nextInt();
        int numb2 = numbers.nextInt();
        int division = numb1 / numb2;
        int remainder = numb2 % numb1;
        System.out.println("First number divided by the second number: " + division);
        System.out.println("Remainder of second number divided by the first number: " + remainder);
    }
}
