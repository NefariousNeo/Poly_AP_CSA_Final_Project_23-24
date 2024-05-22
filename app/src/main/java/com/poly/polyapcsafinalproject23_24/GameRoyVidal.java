package com.poly.polyapcsafinalproject23_24;

import android.view.View;

import com.poly.polyapcsafinalproject23_24.GameActivity;


public class GameRoyVidal extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


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



    public void run()
    {
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



        System.out.println("\nIts FINALLY Summer ");

        System.out.println("\nWhere would you like to go?");
        System.out.println("1.Stay in hotel \n2.Go swimming \n3.Go explore ");

        if (choice == 1)
        {
            stayInHotel();
        }
        else if (choice == 2)
        {
            goSwimming();
        }
        else if (choice == 3)
        {
            goExplore();
        }
    }
    //PATHS
    //OPTION 1 ____________________________________


    private void stayInHotel()
    {
        System.out.println("\nWhat would you like to do inside the hotel?");
        System.out.println("1.Leave your room\n2.Stay inside your room");

        if (choice == 1)
        {
            leaveRoom();
        }
        else if (choice == 2)
        {
            stayInRoom();
        }
    }

    private void leaveRoom()
    {
        System.out.println("\nWhat would u rather do, go outside or stay inside the lobby ?");
        System.out.println("1.Inside\n2.Outside");

        if (choice == 1)
        {
            inside();
        }
        else if (choice == 2)
        {
            outside();
        }
    }

    private void inside()
    {
        System.out.println("\nWhat would u rather do Inside the lobby ?");
        System.out.println("1.Play 8 Ball\n2.Play BlackJack");

        if (choice == 1)
        {
            eightBall();
        }
        else if (choice == 2)
        {
            blackJack();
        }
    }

    private void outside()
    {
        System.out.println("\nWhat would u rather do outside your room ?");
        System.out.println("1.Play Basketball\n2.Playfootball");

        if (choice == 1)
        {
            playBasketball();
        }
        else if (choice == 2)
        {
            playFootball();
        }
    }
    private void stayInRoom()
    {
        System.out.println("\nWhat would you like to do inside your hotel room?");
        System.out.println("1.Take melatonin and sleep \n2.Eat burgers and watch TV \n3. Talk to your girlfriend");

        if (choice == 1)
        {
            takeNap();
        }
        else if (choice == 2)
        {
            watchTv();
        }
        else if (choice == 3)
        {
            talkGf();
        }
    }

    private void talkGf()
    {
        System.out.println("\n You and your GirlFriend get into an argument. She shoots you because she is crazy.");
        defeat();
    }
    private void eightBall()
    {
        System.out.println("\n You beat everyone at 8ball, but start a bar fight for talking trash. You are thrown out.");
        defeat();
    }
    private void blackJack()
    {
        System.out.println("\n You get caught cheating in blackjack and are thrown out.");
        defeat();
    }


    private void playBasketball()
    {
        System.out.println("\n You play basketball and you get your ankles broken by lebron james. You can't continue your vacation.");
        defeat();
    }

    private void playFootball()
    {
        System.out.println("\n You play football and hit-sticked by Raw Lewis. You have a concussion and can't continue your vacation.");
        defeat();
    }

    private void takeNap()
    {
        System.out.println("\n You took too much melatonin and you are in a coma now. You can't continue your vacation.");
        defeat();
    }
    private void watchTv()
    {
        System.out.println("\n The Burgers werent cooked correctly, you now have a stomach virus and you can't continue your vacation.");
        defeat();
    }

    //OPTION 2 ________________________________________________________

    private void goSwimming()
    {
        System.out.println("\nWhere would you like to go swimming?");
        System.out.println("1.The hotel pool\n2.The Amazon River");

        if (choice == 1)
        {
            inHotel();
        }
        else if (choice == 2)
        {
            amazonRiver();
        }
    }

    private void inHotel()
    {
        System.out.println("\nWhat Time would you like to go swimming?");
        System.out.println("1.12PM\n2.9PM");

        if (choice == 1)
        {
            infinityPool();
        }
        else if (choice == 2)
        {
            mainPool();
        }
    }

    private void infinityPool()
    {
        System.out.println("\nWhat Time would you like to go swimming?");
        System.out.println("1.11AM\n2.10PM");

        if (choice == 1)
        {
            elevenAm();
        }
        else if (choice == 2)
        {
            tenPm();
        }
    }

    private void mainPool()
    {
        System.out.println("\nWhat Time would you like to go swimming?");
        System.out.println("1.12PM\n2.9PM");

        if (choice == 1)
        {
            twelvePm();
        }
        else if (choice == 2)
        {
            ninePm();
        }
    }

    private void amazonRiver()
    {
        System.out.println("\nWhat Time would you like to go swimming?");
        System.out.println("1.10AM\n2.1PM");

        if (choice == 1)
        {
            tenAm();
        }
        else if (choice == 2)
        {
            onePm();
        }
    }

    private void elevenAm()
    {
        System.out.println("\n There was too many people in the pool and You fall over the edge. You can't continue your vacation.");
        defeat();
    }

    private void tenPm()
    {
        System.out.println("\n People steal your items and you have no money to survive. It was to dark out to see anything. You can't continue your vacation.");
        defeat();
    }

    private void twelvePm()
    {
        System.out.println("\n There was too many people in the pool and you got stuck underwater and drowned. You can't continue your vacation.");
        defeat();
    }

    private void ninePm()
    {
        System.out.println("\n You Drown Because there was no lifeguard on duty this late. You can't continue your vacation.");
        defeat();
    }

    private void tenAm()
    {
        System.out.println("\nHunters rob you on the way to the river. You can't continue your vacation.");
        defeat();
    }

    private void onePm()
    {
        System.out.println("\nYou get attacked by piranhas in the amazon river. You can't continue your vacation.");
        defeat();
    }

    //OPTION 3 __________________________________________________________________

    private void goExplore()
    {
        System.out.println("\nWhere would you like to explore?");
        System.out.println("1.The Town\n2.The Forest\n3.The Zoo ");

        if (choice == 1)
        {
            goToTown();
        }
        else if (choice == 2)
        {
            goToRiver();
        }
        else if (choice == 3)
        {
            goToZoo();
        }
    }

    private void goToTown()
    {
        System.out.println("\nDO you want to go shopping or go to the amusement park?");
        System.out.println("1.$550\n2.$50");

        if (choice == 1)
        {
            goShop();
        }
        else if (choice == 2)
        {
            goAmusement();
        }
    }

    private void goShop()
    {
        System.out.println("\nHow much money would you like to bring to town?");
        System.out.println("1.$550\n2.$50");

        if (choice == 1)
        {
            bringExtra();
        }
        else if (choice == 2)
        {
            bringLess();
        }
    }
    private void goAmusement()
    {
        System.out.println("\nDo you want to get food at the Amusement Park?");
        System.out.println("1.Yes\n2.No");

        if (choice == 1)
        {
            getFood();
        }
        else if (choice == 2)
        {
            noFood();
        }
    }
    private void getFood()
    {
        System.out.println("\nHow much food do you want to eat. A Combo Meal or a snack?");
        System.out.println("1.Combo\n2.Snack");

        if (choice == 1)
        {
            getCombo();
        }
        else if (choice == 2)
        {
            getSnack();
        }
    }

    private void noFood()
    {
        System.out.println("\nDo you still want something to drink or no ?");
        System.out.println("1.Yes\n2.No");

        if (choice == 1)
        {
            getDrink();
        }
        else if (choice == 2)
        {
            getNoDrink();
        }
    }

    private void goToZoo()
    {
        System.out.println("\nDo you want to get food at the zoo or go straight to the bird exibit?");
        System.out.println("1.Food\n2.Birds");

        if (choice == 1)
        {
            getZooFood();
        }
        else if (choice == 2)
        {
            goToBirds();
        }
    }

    private void getZooFood()
    {
        System.out.println("\nDo you want to eat a chicken sandwhich or have a burger?");
        System.out.println("1.Chicken Sandwhich \n2.Burger");

        if (choice == 1)
        {
            getChicken();
        }
        else if (choice == 2)
        {
            getBurger();
        }
    }



    private void goToRiver()
    {
        System.out.println("\nWould you rather follow the trail ahead or go back?");
        System.out.println("1.Follow the trail\n2.Go back");

        if (choice == 1)
        {
            followTrail();
        }
        else if (choice == 2)
        {
            goBack();
        }
    }

    private void followTrail()
    {
        System.out.println("\nWould you rather go on a paid tour of the rainforest or go on your own?");
        System.out.println("1.Go hiking on your own \n2.Go on the paid tour");

        if (choice == 1)
        {
            youWin();
        }
        else if (choice == 2)
        {
            goOnTour();
        }
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