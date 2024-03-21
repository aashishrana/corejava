import java.util.Scanner;

public class L6Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
