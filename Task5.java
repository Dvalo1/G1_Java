import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        int number = numbers.nextInt();
        int sum = 0;
        String intToString = String.valueOf(number);

        for(int i = 0; i < intToString.length(); i++) {
            int backToInt = intToString.charAt((i)) - '0';
            sum = sum + backToInt;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
