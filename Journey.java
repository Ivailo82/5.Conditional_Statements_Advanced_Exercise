package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String type = "";
        double spendMoney = 0.0;
        if (season.equals("summer")) {
            if (budget <= 100) {
                destination = "Bulgaria";
                spendMoney = budget * 0.3;
                type = "Camp";
            } else if (budget <= 1000) {
                destination = "Balkans";
                spendMoney = budget * 0.4;
                type = "Camp";
            } else if (budget > 1000) {
                destination = "Europe";
                spendMoney = budget * 0.9;
                type = "Hotel";
            }
        }
        else if (season.equals("winter")) {
            if (budget <= 100) {
                destination = "Bulgaria";
                spendMoney = budget * 0.7;
                type = "Hotel";

            } else if (budget <= 1000) {
                destination = "Balkans";
                spendMoney = budget * 0.8;
                type = "Hotel";
            } else if (budget > 1000) {
                destination = "Europe";
                spendMoney = budget * 0.9;
                type = "Hotel";
            }
        }
        System.out.printf("Somewhere in %s %n%s - %.2f",destination,type,spendMoney);

    }
}
