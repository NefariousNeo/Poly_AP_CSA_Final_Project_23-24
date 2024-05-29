package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameCashawCharles extends GameActivity {

    //create variables up here

    /**
     *  gymhead in game
     */
    private CashawGymhead gymhead;

    private TextView tvMain, tvPushUpVal, tvPullUpVal, tvSitUpVal, tvSquatVal;
    private ImageView ivMain;
    private Button btnPushUp, btnPullUp, btnSitUp, btnSquat;

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    /**
     * method that starts the workout. Calls createGymhead() and runWorkout()
     */
    @Override
    public void run()
    {
        setContentView(R.layout.activity_cashaw_main);

        tvMain = findViewById(R.id.tv_main);
        ivMain = findViewById(R.id.iv_main);
        btnPushUp = findViewById(R.id.btn_pushup);
        btnPullUp = findViewById(R.id.btn_pullup);
        btnSitUp = findViewById(R.id.btn_situp);
        btnSquat = findViewById(R.id.btn_squat);

        tvPushUpVal = findViewById(R.id.tv_pushup_value);
        tvPullUpVal = findViewById(R.id.tv_pullup_value);
        tvSitUpVal = findViewById(R.id.tv_situp_value);
        tvSquatVal = findViewById(R.id.tv_squat_value);

        createGymhead();
        runWorkout();
    }


    private void setAllBtnsVisisble()
    {
        btnPushUp.setVisibility(View.VISIBLE);
        btnPullUp.setVisibility(View.VISIBLE);
        btnSitUp.setVisibility(View.VISIBLE);
        btnSquat.setVisibility(View.VISIBLE);
    }


    /**
     * method creates the gymhead. method asks for user name and uses
     * it to create a gymhead
     */
    private void createGymhead()
    {
        System.out.println("Whats your name?");
        gymhead = new CashawGymhead("DEFAULT");
    }

    /**
     *  method that runs the workour. the workout runs in a loop where a gymhead
     *  either does push ups, pull ups, sit ups, or squats. the workour ends when the gymheads
     *  workour reaches 30
     */
    private void runWorkout()
    {
        if (gymhead.getWorkoutDone() < gymhead.getMaxWorkout())
        {
            displayStats();
            chooseOption();
        }
        else
        {
            endOfWorkout();
        }

    }


    /**
     *  Displays the gymheads workout stats
     */
    private void displayStats()
    {
        tvSquatVal.setText(""+gymhead.getSquats());
        tvPullUpVal.setText(""+gymhead.getPullUps());
        tvPushUpVal.setText(""+gymhead.getPushUps());
        tvSitUpVal.setText(""+gymhead.getSitUps());
        String text =
                gymhead.getName() +
                        "\nPull ups done:\t\t" + gymhead.getPullUps() +
                        "\nPush ups done:\t\t" + gymhead.getPushUps() +
                        "\nSquats done:\t\t" + gymhead.getSquats() +
                        "\nSit ups done:\t\t" + gymhead.getSitUps();
        System.out.println(text);
    }

    /**
     *  player chooses to do push ups, pull ups, sit ups, or squats
     */
    private void chooseOption()
    {
        setAllBtnsVisisble();
        btnPushUp.setText("pushup");
        btnPullUp.setText("pullup");
        btnSitUp.setText("sit-up");
        btnSquat.setText("squat");
        btnPushUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doPullUp();
                runWorkout();
            }
        });

        btnPullUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doPushUp();
                runWorkout();

            }
        });

        btnSitUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doSquats();
                runWorkout();

            }
        });

        btnSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead.doSitUps();
                runWorkout();

            }
        });
    }

    /**
     * after gymheads workout reaches 30 the workout is ended
     * player is told how many push ups, pull ups, sit ups, or squats they did
     *  may chose to play again
     */
    private void endOfWorkout()
    {

        btnPushUp.setVisibility(View.INVISIBLE);
        btnPullUp.setVisibility(View.INVISIBLE);
        btnSitUp.setVisibility(View.INVISIBLE);

        if (gymhead.getWorkoutDone() >= gymhead.getMaxWorkout())
        {
            System.out.println("Workout done!");
        }

        System.out.println("Congratulations, you did " + gymhead.getPullUps() + " pull ups " + gymhead.getPushUps() + " push ups " + gymhead.getSquats() + " squats and " + gymhead.getSitUps() + " sit ups ");

        System.out.println("Workout again?\n1. YES\n2. NO!");

        btnSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gymhead = new CashawGymhead(gymhead.getName());
                runWorkout();

            }
        });
    }


}