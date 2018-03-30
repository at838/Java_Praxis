import java.util.Locale;
import java.util.Scanner;

public class OddsAndEvens {
    private static Scanner input = new Scanner(System.in).useLocale(Locale.US);
    private static final String ODDS = "Odds";
    private static final String EVENS = "Evens";
    public static void main(String[] args) {

        start();
    }
    private static void start(){
        System.out.println("Let's play a game called Odds and Evens!!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.printf("Welcome %s . Choose (O)dds or (E)vens\n",name);
        String user = input.nextLine();
        String computer= ODDS;
        if((user.equals(ODDS))||(user.equals("O")||(user.equals("o")))){
            computer = EVENS;
            user = ODDS;
        }
        else if((user.equals(EVENS))||(user.equals('E'))||(user.equals('e'))){
            user    = EVENS;
        }
        else{
            System.out.println("Invalid input");
        }
        //TODO: Should print only for valid input
        System.out.printf("Computer is %s , %s is %s \n",computer,name,user);
    }

}
