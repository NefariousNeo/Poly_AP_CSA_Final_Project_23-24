package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameOntiverosMichael extends GameActivity {

    /**
     * Player in game
     */
    private OntiverosWokePerson player;

    /**
     * Method that runs the game. Calls createPlayer() and runSleeper()
     */
    public void run()
    {
        createPlayer();
        runSleeper();
    }

    /**
     * Method that creates the player. Method asks for users nam and uses
     * its to create sleepers
     */
    private void createPlayer()
    {
        Util.clearConsole();
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scan.nextLine();
        player = new WokePerson(name, 100, 0);
    }

    /**
     * Method that runs game. The game run in a loop again where player
     * sleep or does't. The sleeper end when the woke player
     * insanity reaches 100 or higher, or when their health is at least
     * to 0.
     */
    private void runSleeper()
    {
        beginToSleep();
        while (player.getInsanity() < 100 && player.getHealth() > 0)
        {
            displayStats();
            chooseOption();
        }
        endOfSleeper();
    }

    private void beginToSleep()
    {

    }

    /**
     * Displays player's stats at the beginning of each round
     */
    private void displayStats()
    {
        Util.clearConsole();
        String text =
                player.getName() +
                        "\nYour Health:\t\t " + player.getHealth() +
                        "\nTime you sleep:\t\t " + player.getTimeHasSleep();
        System.out.println(text);
        Util.pauseConsole();


    }

    private void chooseOption()
    {
        String text = """
      What do you want to do now?
      1. Go to sleep
      2. Stay up
      """;
        System.out.println(text);
        int option = Util.enterInt(1,2);
        if (option ==1)
        {
            player.goToSleep();
        }
        else if (option == 2)
        {
            player.stayUp();
        }
    }


    /**
     * After player's health is to 0, or when thier insanity reaches to
     * 100, the game ends. Messages are displayed to indicate why the
     * game ended. Player is told how much health they have, but not their
     * insanity. Player may choose to play again
     */
    private void endOfSleeper()
    {
        if (player.getHealth() == 0)
        {
            System.out.println("Your health is down");
        }
        if (player.getInsanity() == 100)
            Util.pauseConsole();
        Util.clearConsole();
        System.out.println("Woah you slept " + player.getTimeHasSleep() + " those are rookie numbers");
        Util.pauseConsole();
        System.out.println("Do you want to sleep?\n1 Yea, I'm not a loser\n2. Nah, I called it wraps");
        int option = Util.enterInt(1,2);
        {
            player = new WokePerson(player.getName(),100, 0);
            runSleeper();
        }
    }













}