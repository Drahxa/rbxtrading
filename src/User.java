/*
 * Programmer: Richard S. Ress
 * Date: October 25th, 2023
 * Purpose: Fun
 */


import java.util.Timer;
import java.util.TimerTask;


public class User {

    //instance Variable
    String username;
    int userid;
    double userrobux;

    double robux_per_sec = 1;
    int gain_delay = 1000;




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

                userrobux += robux_per_sec;
                System.out.println(userrobux);

                }

        };
        timer.scheduleAtFixedRate(task, 0,gain_delay);
    }

    //Commands



    //SHOWS AMOUNT OF CURRENT ROBUX
    public void wallet(){
        System.out.println("Wallet: " + userrobux);
    }
    //Upgrades







}
