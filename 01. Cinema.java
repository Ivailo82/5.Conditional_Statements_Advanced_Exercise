package S3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String showType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        double finalPrice = 0.0;

        switch (showType) {
            case "Premiere":
                finalPrice = 12.0 * seats;
                break;
            case "Normal":
                finalPrice = 7.50 * seats;
                break;
            case "Discount":
                finalPrice = 5.0 * seats;
                break;
        }

        System.out.printf("%.2f leva", finalPrice);

    }
}
