package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mount = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double suitePrice = 0.0;

        if (mount.equals("May") || mount.equals("October")) {
            studioPrice = nights * 50;
            suitePrice =nights * 65;

            if (nights > 7 && nights <= 14){
                studioPrice =studioPrice * 0.95;
            }else if (nights > 14){
                studioPrice = studioPrice * 0.70;
                suitePrice = suitePrice * 0.90;
            }
        }
        else if (mount.equals("June") || mount.equals("September")){
            studioPrice = nights * 75.20;
            suitePrice = nights * 68.70;
            if (nights > 14){
                studioPrice = studioPrice * 0.80;
                suitePrice = suitePrice * 0.90;
            }
        }else if (mount.equals("July") || mount.equals("August")){
            studioPrice = nights * 76.00;
            suitePrice = nights * 77.00;


            if (nights > 14){
                suitePrice = suitePrice * 0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",suitePrice,studioPrice);
    }
 }

