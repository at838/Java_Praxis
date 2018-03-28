import java.util.Locale;
import java.util.Scanner;

public class TripPlanner {

    public static void main(String[] args) {

        greeting();
        travel_time_budget();
        time_difference();

    }

    private static void greeting(){
        System.out.print("Welcome to Trip Planner");
        System.out.print("\nWhat is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Nice to meet you" + " " +name+ ", where are you travelling to?");
        String city = input.next();
        System.out.println("\nGreat! " +city+ " sounds like a great trip");
        System.out.println("****************");
    }

    private static void travel_time_budget(){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("How many days are you going to spend travelling?");
        int days = input.nextInt();
        System.out.print("How much money in USD are you planning to spend?");
        double money_usd = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination?");
        String currency = input.next();
        System.out.print("How many "+currency+" are there in 1 USD?");
        double exchange = input.nextDouble();
        double conv_currency;
        conv_currency = money_usd * exchange;
        int hours;
        int mins;
        hours = days * 24;
        mins = hours * 60;

        System.out.printf("\nIf you are travelling for %d days that is the same as %d hours or %d minutes",days,hours,mins);
        System.out.printf("\nIf you are going to spend $%.2f USD that means per day you can spend up to $%.2f",money_usd,money_usd/days);
        System.out.printf("\nYour total budget in %s is %.2f %s, which per day is %.2f "+currency,currency,conv_currency,currency,conv_currency/days);
        System.out.println("\n*************");
    }

    private static void time_difference(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nWhat is the time difference, in hours, between your home and your destination?");
        double hour_difference = input.nextDouble();
        int hours_dest, mins_dest;
        hours_dest = (int)(hour_difference);

        System.out.println("That means when it is midnight at home it will be ");
    }

}
