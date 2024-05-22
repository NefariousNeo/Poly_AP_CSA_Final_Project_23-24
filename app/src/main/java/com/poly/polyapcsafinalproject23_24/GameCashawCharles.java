package com.poly.polyapcsafinalproject23_24;



public class GameCashawCharles extends GameActivity {

    //create variables up here

    /**
     *  gymhead in game
     */
    private GymHead gymhead;

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;

    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    /**
     * method that starts the workout. Calls createGymhead() and runWorkout()
     */
    @Override
    public void run()
    {
        setContentView(R.layout.activity_game_4_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        tvTitle.setText("WORKOUT");
        tvSubtitle.setText("");
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
        String text = """
      What exercise do you want to do?
      1. Pull up
      2. Push up
      3. Squat
      4. Sit up
      """;
        System.out.println(text);
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

        System.out.println("Congratulations, you did " + gymhead.getPullUps() + " pull ups " + gymhead.getPushUps() + " push ups " + gymhead.getSquats() + " squats and " + gymhead.getSitUps() + " sit ups ");

        System.out.println("Workout again?\n1. YES\n2. NO!");

        if (option == 1)
        {
            gymhead = new GymHead(gymhead.getName());
            runWorkout();
        }
    }


}