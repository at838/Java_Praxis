import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {
    private static Scanner input = new Scanner(System.in).useLocale(Locale.US);
    private static Random rand = new Random();
    private static final String ODDS = "Odds";
    private static final String EVENS = "Evens";
    private static final String COMP = "Computer";

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
        else if((user.equals(EVENS))||(user.equals("E"))||(user.equals("e"))){
            user    = EVENS;
        }
        else{
            System.out.println("Invalid input");
        }
        //TODO: Should print only for valid input
        System.out.printf(COMP + "is %s , %s is %s \n",computer,name,user);

        System.out.println("How many fingers do you play?");
        int user_fingers = input.nextInt();
        int com_fingers = 1;
        com_fingers = com_fingers * rand.nextInt(10);
        System.out.printf(COMP+" played %d fingers\n",com_fingers);
        System.out.printf("You entered %d\n",user_fingers);
        boolean total_fingers;
        int fingers = user_fingers + com_fingers;
        fingers %=2;
        if (fingers == 0){
            total_fingers = true;
        }
        else{
            total_fingers = false;
        }
        String winner;
        if(total_fingers)
        {
            winner= user.equals(EVENS)?name:COMP;
        }
        else
        {
            winner = user.equals(ODDS)?name:COMP;
        }
        System.out.printf("total fingers is %b\n",total_fingers);
        System.out.printf("Winner is %s",winner);
    }
}
