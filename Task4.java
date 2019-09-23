import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        int number = numbers.nextInt();
        String intToString = String.valueOf(number);

        for(int i = 0; i < intToString.length(); i++) {
            System.out.println(intToString.charAt(i));
        }
    }
}
