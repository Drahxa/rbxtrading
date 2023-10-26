/*
 * Programmer: Richard S. Ress
 * Date: October 25th, 2023
 * Purpose: Fun
 */
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class User {

    Scanner in = new Scanner(System.in);
    //instance Variable


    //User
    String username;
    int userid;
    double userrobux;

    //Stats
    double robux_per_sec = 1;
    int gain_delay = 1000;

    //Upgrades
    double robux_multiplier = 1;



    //default constructor
    public User(){
        username = "N/A";
        userid = 0;
        userrobux = 0.0;
        robux_per_sec = 1;
        gain_delay = 1000;
    }


    public User(String name, int id){
        username = name;
        userid = id;
        userrobux = 0;
        robux_per_sec = 1;
        gain_delay = 1000;
    }





    ////Methods////


    //GIVES ROBUX
    public void gainRobux(){


        Timer timer = new Timer();

        TimerTask task = new TimerTask(){


            public void run(){

                userrobux += robux_per_sec * robux_multiplier;
                //System.out.println(userrobux);

                }

        };
        timer.scheduleAtFixedRate(task, 0,gain_delay);
    }

    //Commands



    //SHOWS AMOUNT OF CURRENT ROBUX
    public void wallet(){
        System.out.println("Robux: " + userrobux);
    }

    //SHOW STATS
    public void stats(){
        System.out.println("");
    }

    public void store(){
        String picks;
        int upg_cost = 20;
        int sold_items = 0;

        System.out.println("Would you like to make a Shirt or a game  ( s / g )");
        picks = in.nextLine();
        if (Objects.equals(picks , "s"){
            System.out.println("$50, are you  sure? (y / n)");
            picks = in.nextLine();
            if (Objects.equals(picks , "s"){
        }

        }

        System.out.println("Would you like to upgrade multiplier to " + robux_multiplier + 1 + "? ( y / n )");
        picks = in.nextLine();

        if (Objects.equals(multi_choice, "y") && (userrobux >= upg_cost){

        }


    //Upgrades









}
