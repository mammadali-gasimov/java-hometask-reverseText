import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ------ Task - 1 ------
        System.out.println("Task - 1");
        System.out.println("Enter the word or sentence:");
        String sentence = scanner.nextLine();
        String reverseSentence = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            reverseSentence += sentence.charAt(i);
        }
        System.out.println(reverseSentence);

        // ------ Task - 2 -----
        System.out.println("Task - 2");
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        while (length < 1) {
            System.out.println("Enter the length of the array:");
            length = scanner.nextInt();
        }

        int[] numbers = new int[length];
        int counter = 0;
        int temp;
        int sum = 0;
        while (counter < length) {
            System.out.println("Enter number sum of digits of which is odd:");
            int num = scanner.nextInt();
            temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum % 2 != 1) {
                sum = 0;
                continue;
            }

            numbers[counter] = num;
            counter++;
            sum = 0;
        }

        System.out.println(Arrays.toString(numbers));
    }
}