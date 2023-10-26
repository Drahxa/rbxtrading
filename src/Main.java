/* TUTORIAL
    Create a character by typing:
    user (Variable name) = new user ("Name", (Id number for future changes));

    Start game by using (Variable name).gainRobux();

    Run & Go to console to continue

    COMMANDS:
    .wallet (Shows Current Money)


 */
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String command = "Continue"; //MAIN VARIABLE FOR INPUT

        //_______________________________________________
        User richard = new User("Richard", 001);
        richard.gainRobux();
        //-----------------------------------------------|
        //User rupa = new User("Rupawr", 002);
        //rupa.gainRobux();


        System.out.println("Welcome, You'll gain Robux every second, how many can you get? (Type: END, to finish your section)\n\n\n");

        while (command != "END") {

            //ASK FOR COMMAND
            System.out.println("\n\nCommand: ");
            command = in.nextLine();

            //WALLET
            if (Objects.equals(command, ".wallet")) {
                richard.wallet();


                //MULTIPLIERS
            }else if (Objects.equals(command, ".stats")){
                richard.multipliers();



                // FINISH PROGRAM
            } else if (Objects.equals(command, "END")) {
                command = "END";

            }
        }

    }
}