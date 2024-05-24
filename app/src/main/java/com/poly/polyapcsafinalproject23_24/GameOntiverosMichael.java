package com.poly.polyapcsafinalproject23_24;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

public class GameOntiverosMichael extends GameActivity {

    /**
     * Player in game
     */
    private TextView tvHealthVal, tvSleepVal, tvText;
    private ImageView ivPicture;
    private Button btnSleep, btnStayUp;
    private boolean isWon;
    private OntiverosWokePerson player;

    /**
     * Method that runs the game. Calls createPlayer() and runSleeper()
     */
    public void run()
    {
        tvHealthVal = findViewById(R.id.tv_health_val);
        tvSleepVal = findViewById(R.id.tv_time_val);
        tvText = findViewById(R.id.tv_main);
        ivPicture = findViewById(R.id.iv_main);
        btnSleep = findViewById(R.id.btn_sleep);
        btnStayUp = findViewById(R.id.btn_stay_up);


        createPlayer();
        runSleeper();
    }

    /**
     * Method that creates the player. Method asks for users nam and uses
     * its to create sleepers
     */
    private void createPlayer()
    {

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
        String text =
                player.getName() +
                        "\nYour Health:\t\t " + player.getHealth() +
                        "\nTime you sleep:\t\t " + player.getTimeHasSleep();
        System.out.println(text);


    }

    private void chooseOption()
    {
        String text = """
      What do you want to do now?
      1. Go to sleep
      2. Stay up
      """;
        System.out.println(text);
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
        System.out.println("Woah you slept " + player.getTimeHasSleep() + " those are rookie numbers");
        System.out.println("Do you want to sleep?\n1 Yea, I'm not a loser\n2. Nah, I called it wraps");
        {
            player = new WokePerson(player.getName(),100, 0);
            runSleeper();
        }
    }













}