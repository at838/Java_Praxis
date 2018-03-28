import java.util.*;

public class TripPlanner {
    public static void main(String[] args) {
        System.out.println("Welcome to Trip Planner");
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Nice to meet you" + " " + name + ", where are you travelling to?");
        String city = input.next();
        System.out.println("Great! " + city + " sounds like a great trip");
        System.out.println("****************");

    }
}
