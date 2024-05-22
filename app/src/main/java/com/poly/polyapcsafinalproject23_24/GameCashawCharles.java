package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameCashawCharles extends GameActivity {

    //create variables up here

    /**
     *  gymhead in game
     */
    private GymHead gymhead;

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    /**
     * method that starts the workout. Calls createGymhead() and runWorkout()
     */
    public void run()
    {
        createGymhead();
        runWorkout();
    }

    public void beginWorkout()
    {

    }


    /**
     * method creates the gymhead. method asks for user name and uses
     * it to create a gymhead
     */
    private void createGymhead()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scan.nextLine();
        gymhead = new GymHead(name);
    }

    /**
     *  method that runs the workour. the workout runs in a loop where a gymhead
     *  either does push ups, pull ups, sit ups, or squats. the workour ends when the gymheads
     *  workour reaches 30
     */
    private void runWorkout()
    {
        beginWorkout();
        while (gymhead.getWorkoutDone() < gymhead.getMaxWorkout() )
        {
            displayStats();
            chooseOption();
        }
        endOfWorkout();
    }


    /**
     *  Displays the gymheads workout stats
     */
    private void displayStats()
    {
        Util.clearConsole();
        String text =
                gymhead.getName() +
                        "\nPull ups done:\t\t" + gymhead.getPullUps() +
                        "\nPush ups done:\t\t" + gymhead.getPushUps() +
                        "\nSquats done:\t\t" + gymhead.getSquats() +
                        "\nSit ups done:\t\t" + gymhead.getSitUps();
        System.out.println(text);
        Util.pauseConsole();
    }

    /**
     *  player chooses to do push ups, pull ups, sit ups, or squats
     */
    private void chooseOption()
    {
        String text = """
      What exercise do you want to do?
      1. Pull up
      2. Push up
      3. Squat
      4. Sit up
      """;
        System.out.println(text);
        int option = Util.enterInt(1,4);
        if (option == 1)
        {
            gymhead.doPullUp();
        }
        else if (option == 2)
        {
            gymhead.doPushUp();
        }
        if (option == 3)
        {
            gymhead.doSquats();
        }
        else if (option == 4)
        {
            gymhead.doSitUps();
        }
    }

    /**
     * after gymheads workout reaches 30 the workout is ended
     * player is told how many push ups, pull ups, sit ups, or squats they did
     *  may chose to play again
     */
    private void endOfWorkout()
    {
        if (gymhead.getWorkoutDone() >= gymhead.getMaxWorkout())
        {
            System.out.println("Workout done!");
        }
        Util.pauseConsole();
        Util.clearConsole();
        System.out.println("Congratulations, you did " + gymhead.getPullUps() + " pull ups " + gymhead.getPushUps() + " push ups " + gymhead.getSquats() + " squats and " + gymhead.getSitUps() + " sit ups ");
        Util.pauseConsole();
        System.out.println("Workout again?\n1. YES\n2. NO!");
        int option = Util.enterInt(1,2);
        if (option == 1)
        {
            gymhead = new GymHead(gymhead.getName());
            runWorkout();
        }
    }


}