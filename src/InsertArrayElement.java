import java.util.Scanner;

public class InsertArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Integer numbers before: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();
        System.out.println("Enter a number: ");
        int x = input.nextInt();
        System.out.println("Enter position (From 0 to N): ");
        int index = input.nextInt();
        if (index <= 1 || index >= numbers.length - 1) {
            System.out.println("Can't Insert Element!");
        } else {
            for (int j = numbers.length - 1; j > index; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[index] = x;
        }

        System.out.println("Integer numbers after: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }
}
