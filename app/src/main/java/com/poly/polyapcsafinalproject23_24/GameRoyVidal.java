package com.poly.polyapcsafinalproject23_24;

import android.view.View;

import com.poly.polyapcsafinalproject23_24.GameActivity;


public class GameRoyVidal extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)




    public void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1):
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("VACATION");
        tvSubtitle.setText("PLANNER");


        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        System.out.println("VACATION - THE AMAZON FOREST");
        System.out.println("You and your friends take a trip to the amazon. There are many wrong paths, but the right path will change your life!");

        start();
    }

    private void start()
    {
        //start adventure here _________________________



        ivStory.setImageResource(R.drawable.im_laborday_title);



        setAllBtnsVisible();
        btn1.setText("Stay In Hotel");
        btn2.setText("Go swimming");
        btn3.setText("Go explore");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayInHotel();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSwimming();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goExplore();
            }
        });

    }
    //PATHS
    //OPTION 1 ____________________________________


    private void stayInHotel()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What would you like to do inside the hotel?");

        setAllBtnsVisible();
        btn1.setText("leaveRoom");
        btn2.setText("stayInRoom");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaveRoom();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayInRoom();
            }
        });
    }

    private void leaveRoom()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What would you rather do, go outside or stay inside the lobby ?");

        setAllBtnsVisible();
        btn1.setText("inside");
        btn2.setText("outside");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inside();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outside();
            }
        });
    }

    private void inside()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What would you rather do inside the lobby ?");

        setAllBtnsVisible();
        btn1.setText("eightBall");
        btn2.setText("blackJack");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { eightBall();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { blackJack();}
        });
    }

    private void outside()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What would you rather do outside ?");

        setAllBtnsVisible();
        btn1.setText("playBasketball");
        btn2.setText("playFootball");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBasketball();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFootball();
            }
        });
    }
    private void stayInRoom()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What would you rather do, go outside or stay inside the lobby ?");

        setAllBtnsVisible();
        btn1.setText("takeNap");
        btn2.setText("watchTv");
        btn3.setVisibility("talkGf");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeNap();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchTv();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                talkGf();
            }
        });
    }

    private void talkGf()
    {
        isWon = false;
        tvStoryText.setText("You and your crazy Grilfriend get into an argument." +
                " She shoots you because she is crazy. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void eightBall()
    {
        isWon = false;
        tvStoryText.setText("You beat everyone at 8ball, but start a bar fight for talking trash. " +
                "You are thrown out");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void blackJack()
    {
        isWon = false;
        tvStoryText.setText("You get caught cheating in blackjack and are thrown out");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }


    private void playBasketball()
    {
        isWon = false;
        tvStoryText.setText("You play basketball and you get your ankles broken by lebron james" +
                "You can't continue your vacation");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void playFootball()
    {
        isWon = false;
        tvStoryText.setText("You play football and get hit-sticked by Raw Lewis. " +
                "You have a concussion. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void takeNap()
    {
        isWon = false;
        tvStoryText.setText("You took too much melatonin and you are in a coma now. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }
    private void watchTv()
    {
        isWon = false;
        tvStoryText.setText("The burgers werent cooked correctly, you now " +
                "have a stomach virus. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    //OPTION 2 ________________________________________________________

    private void goSwimming()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Where would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("inHotel");
        btn2.setText("amazonRiver");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { inHotel();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { amazonRiver();}
        });
    }

    private void inHotel()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Which pool would you like to swim in  ?");

        setAllBtnsVisible();
        btn1.setText("infinityPool");
        btn2.setText("mainPool");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { infinityPool();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { mainPool();}
        });
    }

    private void infinityPool()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What time would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("elevenAm");
        btn2.setText("tenPm");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { elevenAm();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { tenPm();}
        });
    }

    private void mainPool()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What time would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("twelevePm");
        btn2.setText("ninePm");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { twelvePm();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { ninePm(); }
        });
    }

    private void amazonRiver()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("What time would you like to go swimming ?");

        setAllBtnsVisible();
        btn1.setText("tenAm");
        btn2.setText("onePm");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { tenAm();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onePm(); }
        });
    }

    private void elevenAm()
    {
        isWon = false;
        tvStoryText.setText("There is too many people in the pool at this time and you " +
                "fall over the edge. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void tenPm()
    {
        isWon = false;
        tvStoryText.setText("people steal your items and you have no money to survive. " +
                "It was to dark to see anything. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void twelvePm()
    {
        isWon = false;
        tvStoryText.setText("There was to many people in the pool and you got stuck " +
                "underwater and drowned Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void ninePm()
    {
        isWon = false;
        tvStoryText.setText("You drown because there is no lifeguard on duty this late Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void tenAm()
    {
        isWon = false;
        tvStoryText.setText("Hunters rob you on the way to the river" +
                " Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    private void onePm()
    {
        isWon = false;
        tvStoryText.setText("You get attacked by piranhas in the amazon river. Game over.");

        ivStory.setImageResource(R.drawable.im_laborday_tan20);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end();
            }
        });
    }

    //OPTION 3 __________________________________________________________________

    private void goExplore()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Where would you like to explore?");

        setAllBtnsVisible();
        btn1.setText("goToTown");
        btn2.setText("goToRiver");
        btn3.setVisibility("goToZoo");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goToTown();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goToRiver(); }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goToZoo(); }
        });
    }

    private void goToTown()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Do you want to go shopping or go to the amusment park ?");

        setAllBtnsVisible();
        btn1.setText("goShop");
        btn2.setText("goAmusement");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { tenAm();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onePm(); }
        });
    }

    private void goShop()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("How much money would you like to bring to town ?");

        setAllBtnsVisible();
        btn1.setText("bringExtra");
        btn2.setText("bringLess");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { bringExtra();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { bringLess();  }
        });
    }
    private void goAmusement()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Do you want to get food at the Amusement park ?");

        setAllBtnsVisible();
        btn1.setText("getFood");
        btn2.setText("noFood");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { getFood();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { noFood(); }
        });
    }
    private void getFood()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("How much food do you want to eat ?");

        setAllBtnsVisible();
        btn1.setText("getCombo");
        btn2.setText("getSnack");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {getCombo (); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { getSnack (); }
        });
    }

    private void noFood()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Do you still want something to drink or no?");

        setAllBtnsVisible();
        btn1.setText("getDrink");
        btn2.setText("getNoDrink");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { getDrink(); }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { getNoDrink (); }
        });
    }

    private void goToZoo()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Do you want to get food at the zoo or go straight to the bird exibit");

        setAllBtnsVisible();
        btn1.setText("getZooFood");
        btn2.setText("goToBirds");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { getZooFood();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goToBirds();}
        });
    }

    private void getZooFood()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Do you want to eat a chicken sandwhich or have a burger?");

        setAllBtnsVisible();
        btn1.setText("getChicken");
        btn2.setText("getBurger");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { getChicken();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { getBurger();}
        });
    }



    private void goToRiver()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Would you rather follow the trail ahead or go back?");

        setAllBtnsVisible();
        btn1.setText("followTrail");
        btn2.setText("goBack");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { followTrail();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goBack();}
        });
    }

    private void followTrail()
    {
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("Would you rather go on a paid tour of the rainforest or go on your own?");

        setAllBtnsVisible();
        btn1.setText("On Your Own");
        btn2.setText("goOnTour");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { youWin();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goOnTour();}
        });
    }

    private void getCombo()
    {
        System.out.println("\nYou eat too much and throw up on the rollercoaster. You are sick and can't continuew your vacation.");
        defeat();
    }
    private void getSnack()
    {
        System.out.println("\nYou did not have enough food and starve to death. You can't continue your vacation.");
        defeat();
    }
    private void getDrink()
    {
        System.out.println("\nSomeone Spiked your drink and you pass out. You can't continue your vacation.");
        defeat();
    }
    private void getNoDrink()
    {
        System.out.println("\n You have not been drinking enough water and have died of thirst. You can't continue your vacation.");
        defeat();
    }
    private void goToBirds()
    {
        System.out.println("\nA giant bird bird picks you up and drops you down a cliff. You die and can't continue your vacation.");
        defeat();
    }
    private void getChicken()
    {
        System.out.println("\nYou get attacked by a hungry fox and loose your food.");
        defeat();
    }
    private void getBurger()
    {
        System.out.println("\nA Lion escapes its cage and attacks you for your burger. He kills you and you can't continue your vacation.");
        defeat();
    }
    private void goBack()
    {
        System.out.println("\nYour friends call you scared and leave you in the middle of the forest. You are now lost and cant continue your vacation.");
        defeat();
    }


    private void bringExtra()
    {
        System.out.println("\nYou get robbed for all of your money. You can't continue your vacation.");
        defeat();
    }

    private void  bringLess()
    {
        System.out.println("\n You run out of money and cant afford the bus home. You are stranded. You can't continue your vacation.");
        defeat();
    }



    private void  goOnTour()
    {
        System.out.println("\n Your tour gets robbed by an amazon village with guns. You get shot for not complying. You can't continue your vacation.");
        defeat();
    }




  /*
  //lose a life


  //numLives--;

  //clear console, display text, etc

  //System.out.println(...)

  //determine if player gets to play again
  if (numLives > 0)
  {
    //if you still have lives, return to start()
    start();
  }
  else
  {
    //print game over message
  }
  */

    private void youWin()
    {
        System.out.println("You win, you have found hidden treasure on your hike and are now the richest person alive. You buy a private jet and fly home.");
        run();
    }
    private void defeat()
    {
        //run method when defeated

        numLives--;

        System.out.println("You made too many wrong descions! Either try again or quit.");

        if (numLives > 0 )

        {
            start();
        }
        else
        {

            System.out.println("GAMEOVER");
        }


    }
}