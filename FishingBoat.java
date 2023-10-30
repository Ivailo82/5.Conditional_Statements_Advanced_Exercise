package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberMen = Integer.parseInt(scanner.nextLine());
        double boatRent = 0.0;
        if(season.equals("Spring")) {
            boatRent = 3000.0;
        }
        else if (season.equals("Summer") || season.equals("Autumn")) {
            boatRent = 4200.0;
        }
        else if (season.equals("Winter")) {
            boatRent = 2600.0;
        }
        if(numberMen <= 6){
            boatRent = boatRent * 0.90;
        }
        if (numberMen >= 7 && numberMen <= 11){
            boatRent = boatRent * 0.85;
        }else if (numberMen > 12){
            boatRent = boatRent * 0.75;
        }
        if(!(season.equals("Autumn")) && numberMen % 2 == 0){
            boatRent = boatRent * 0.95;
        }
        double differ = Math.abs(budget - boatRent);
        if (budget >= boatRent){
            System.out.printf("Yes! You have %.2f leva left.",differ);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",differ);
        }
    }
}
