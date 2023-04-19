import java.util.*;

public class WarCardGame {
    public static int cardCounter = 0;
    public static int checkRules = 0;
    public static String userCompletedReadingRules;
    public static String userReadingRules;
    public static Boolean displayRules;

    // this section displays the rules if needed
    public static void showRules() {
        while (displayRules == true) {
            System.out.println("The rules of war are fairly simple.You and the other player both draw a card and flip them over at the same time, and whichever card is higher wins");
            try {
                Scanner completedReadingRules = new Scanner(System.in);
                System.out.println("Are you finished reading the rules? Type yes or hit <enter> when you are ready to continue to the game.");
                WarCardGame.userCompletedReadingRules = completedReadingRules.nextLine();
            }
            catch (Exception f) {
                System.out.println("Invalid entry recorded, please enter yes to continue.");
            }
            switch(WarCardGame.userCompletedReadingRules) {
                case "yes":
                    WarCardGame.displayRules = false;
                    break;
                case "":
                    WarCardGame.displayRules = false;
                    break;
                default:
                    System.out.println("Invalid entry, please enter yes to continue.");
            }
        }
    }
    
    // this section checks to see if the user wants to view the rules.
    public static void rulesCheck() {
        System.out.println("\nWelcome to the War Card Game!");

        while (checkRules == 0) {
            try {
                Scanner ruleChecker = new Scanner(System.in);
                System.out.println("Would you like to view the rules of War before playing?\n\nEnter yes or no to continue.\n");
                String userReadingRules = ruleChecker.nextLine();

                switch(userReadingRules) {
                    case "yes":
                        WarCardGame.checkRules = 1;
                        WarCardGame.displayRules = true;
                        showRules();
                        break;
                    case "":
                        WarCardGame.checkRules = 1;
                        WarCardGame.displayRules = false;
                        break;
                    case "no":
                        WarCardGame.checkRules = 1;
                        WarCardGame.displayRules = false;
                        break;
                    default:
                        System.out.println("Invalid entry, please enter yes to continue.");
                }
                mainGame();
            }
            catch (Exception e){
                System.out.println("\nInvalid entry, please enter yes or no.\n");
            }
        }
    }

    public static void mainGame() {
        System.out.println("Welcome to the main game");
    }
    public static void main(String[] args) {
        rulesCheck();
        System.out.println("First try");
    }
}