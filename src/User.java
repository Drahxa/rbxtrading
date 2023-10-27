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
    Random rand = new Random();
    //instance Variable


    //User
    String username;
    int userid;
    double userrobux;

    //Stats
    double robux_per_sec = 1;
    double robux_multiplier = 1;
    final int gain_delay = 1000;
    int sold_items = 0;
    int shirt_amount = 0;

    //Upgrades


    int shirtCost = 100;
    int multiply_Cost = 5000;
    //int gameCost = 1000;

    int time_played = 0;


    //default constructor
    public User(){
        username = "N/A";
        userid = 0;
        userrobux = 0.0;
        robux_per_sec = 1;
    }


    public User(String name, int id){
        username = name;
        userid = id;
        userrobux = 0;
        robux_per_sec = 1;
    }





    ////Methods////


    //GIVES ROBUX
    public void gainRobux(){


        Timer timer = new Timer();

        TimerTask task = new TimerTask(){


            public void run(){

                int shirtChance = rand.nextInt(shirt_amount + 1);

                if (shirtChance >= 1 && sold_items > 0) {
                    userrobux += (robux_per_sec + 5) * robux_multiplier;
                    time_played ++;
                }else{
                    userrobux += robux_per_sec * robux_multiplier;
                    time_played ++;
                }


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
        System.out.println("\nRobux: " + userrobux);
        System.out.println("Robux Per Sec: " + robux_per_sec);
        System.out.println("Robux Multiplier: " + robux_multiplier);
        System.out.println("Sold Items: " + sold_items);
        System.out.println("Shirts Made: " + shirt_amount);
        System.out.println("Time Played: " + time_played/3600+"h:" + (time_played%3600) / 60+"m:" + time_played%60+"s");

    }

    public void store(){
        String picks;


        System.out.println("Make Shirt($"+ shirtCost +"(s))\nMultiplier Upgrade($"+ multiply_Cost +"(m))\n\nEnter: s or m");// or a game($"+gameCost+")  ( s / g )");
        picks = in.nextLine();


        //BUY SHIRT
        if (Objects.equals(picks , "s") && userrobux >= shirtCost){
            System.out.println("Shirt has been bought");
            shirt_amount += 1;
            userrobux -= shirtCost;

        }else if(Objects.equals(picks , "s") && userrobux <= shirtCost) {
            System.out.println("You don't have enough Robux");

            //MULTIPLIER UPGRADE
        }else if(Objects.equals(picks , "m") && userrobux >= multiply_Cost){
            System.out.println("Multiplier upgrade has been bought");
            multiply_Cost *= 2;
            robux_multiplier ++;

        }else if(Objects.equals(picks , "m") && userrobux <= multiply_Cost){
                System.out.println("You don't have enough Robux");


        } else {
            System.out.println("ERROR");
        }








//        }
//        MAKE GAME
//        else if(Objects.equals(picks , "g")&& userrobux >= 500){
//            System.out.println("");
//
//        }else if(Objects.equals(picks, "g") && userrobux <= 500){
//            System.out.println("You dont have enough Robux");

//        System.out.println("Would you like to upgrade multiplier to " + robux_multiplier + 1 + "? ( y / n )");
//        picks = in.nextLine();
//
//        if (Objects.equals(multi_choice, "y") && (userrobux >= upg_cost){

        }


    //Upgrades









}
