import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter the number #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("========= results =========");

        for (int i = 0; i < count; i++) {
            System.out.println("Number #" + (i + 1) + ": " + numbers[i]);
        }
    }
}