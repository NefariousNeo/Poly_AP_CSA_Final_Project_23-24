package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameBinghamDaniel extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)

    public void run()
    {
        //initialize number of lives
        numLives = 4;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        String text = """
    Summer vacation in Japan
    You've finished your freshman year of college and decide to treat yourself to a nice summer vacation. You decide to go to Japan because you've always wanted to visit there. What happens next is up to you. Good luck!
    """;
        System.out.println(text);
        Util.pauseConsole();
        start();
    }

    private void start()
    {
        Util.clearConsole();
        System.out.println("Summer Vacation in Japan - Dumb Version");
        System.out.println("\nTime to visit Japan, where do you want to go visit?");
        System.out.println("1. Visit Tokyo\n2. Visit Osaka\n3. Visit Kyoto");
        int choice = Util.enterInt(1, 3);

        if (choice == 1)
        {
            goToTokyo();
        }
        else if (choice == 2)
        {
            goToOsaka();
        }
        else if (choice == 3)
        {
            goToKyoto();
        }
    }

    //___Tokyo 東京 Path___
    private void goToTokyo()
    {
        Util.clearConsole();
        System.out.println("What do you want to do while you are in Tokyo?");
        System.out.println("1. Head to Akihabara\n2. Go to Tokyo Disneyland\n3. Head to Senso-Ji");
        int choice = Util.enterInt(1, 3);

        if (choice == 1)
        {
            akihabara();
        }
        else if (choice == 2)
        {
            disneyLand();
        }
        else if (choice == 3)
        {
            sensoJi();
        }
    }

    //Akihabara Branch
    private void akihabara()
    {
        Util.clearConsole();
        System.out.println("What do you do in Akihabara?");
        System.out.println("1. Go to a cat cafe\n2. Go to a maid cafe\n3. Embrace your inner otaku/weeb");
        int choice = Util.enterInt(1, 3);

        if (choice == 1)
        {
            catCafe();
        }
        else if (choice == 2)
        {
            maidCafe();
        }
        else if (choice == 3)
        {
            beGaijin();
        }
    }

    private void catCafe()
    {
        Util.clearConsole();
        System.out.println("You have a great time and feel very wholesome petting cats. 猫も可愛いし漫画も読めます");
        Util.pauseConsole();
        start();
    }

    private void maidCafe()
    {
        Util.clearConsole();
        System.out.println("You feel like you've committed a great sin, but you did have fun. メイドさんは可愛いすぎて、罪が重ねたかもしれないよ");
        Util.pauseConsole();
        defeat();
    }

    private void beGaijin()
    {
        Util.clearConsole();
        System.out.println("You embrace your inner otaku/weeb:");
        System.out.println("1. Another tourist calls you out for cultural appropriation\n2. You decide to buy some manga");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            whereItHurts();
        }
        else if (choice == 2)
        {
            collectionBigger();
        }
    }

    private void whereItHurts()
    {
        Util.clearConsole();
        System.out.println("You end up punching them in the face, accidentally (right?)");
        Util.pauseConsole();
        goToTokyo();
    }

    private void collectionBigger()
    {
        Util.clearConsole();
        System.out.println("You bought so many manga that you can't read, job well done. ただ僕は読めますから安心してね。いつか日本語上手になるはずだ");
        Util.pauseConsole();
        start();
    }

    //Disneyland Branch
    private void disneyLand()
    {
        Util.clearConsole();
        System.out.println("What are you going to do at Disneyland Tokyo?");
        System.out.println("1. Commit a Johnny Somali\n2. Be a normal tourist (or whatever)");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            actLikeSomali();
        }
        else if (choice == 2)
        {
            beTourist();
        }
    }

    private void actLikeSomali()
    {
        Util.clearConsole();
        String text = """
    You have two options, time to choose your fate:
    1. Knocked out and arrested?
    2. You escape but...
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            madaMada();
        }
        else if (choice == 2)
        {
            surviveAnotherDay();
        }
    }

    private void madaMada()
    {
        Util.clearConsole();
        System.out.println("As expected, an angry Japanese person knocks you out and you are later arrested for being a public disturbance. まだまだですね");
        Util.pauseConsole();
        defeat();
    }

    private void surviveAnotherDay()
    {
        Util.clearConsole();
        System.out.println("Although you are punched in the face, you manage to barely escape. Unfortunately for you, as you are escaping someone trips you and a whole gang of angry people beat you up anyways.");
        Util.pauseConsole();
        defeat();
    }

    private void beTourist()
    {
        Util.clearConsole();
        System.out.println("You have the time of your life and feel you made a really good decision.");
        Util.pauseConsole();
        start();
    }

    //Senso-Ji Branch
    private void sensoJi()
    {
        Util.clearConsole();
        String text = """
    You head over to the extremely famous Senso-Ji temple in Tokyo and...
    1. You are overwhelmed by the crowd
    2. You eat some food and take pictures
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);
        if (choice == 1)
        {
            famousTemple();
        }
        else if (choice == 2)
        {
            streetStall();
        }
    }

    private void famousTemple()
    {
        Util.clearConsole();
        System.out.println("Overwhelmed by the sheer amount of people present there, you decide to head back to the hotel because you didn't sign up for this.");
        Util.pauseConsole();
        defeat();
    }

    private void streetStall()
    {
        Util.clearConsole();
        System.out.println("You head to the plethora of street vendors and stalls available near the temple and buy and eat some good food. You take a bunch of pictures and even make an offering at the temple, unfortunately there are way too many people. Either way, you feel like it was a pretty fruitful experience");
        Util.pauseConsole();
        start();
    }

    //___Osaka 大阪 Path___
    private void goToOsaka()
    {
        Util.clearConsole();
        String text = """
    Alright, what do you want to do in Osaka?
    1. Go to Dotonbori District
    2. Go to Shinsaibashi-suji Shopping Street
    3. Go to Universal Studios Japan
    4. Go to Osaka Castle
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 4);

        if (choice == 1)
        {
            dotonbori();
        }
        else if (choice == 2)
        {
            shinsaibashi();
        }
        else if (choice == 3)
        {
            universal();
        }
        else if (choice == 4)
        {
            coolCastle();
        }
    }

    //Dotonbori District Branch
    private void dotonbori()
    {
        Util.clearConsole();
        String text = """
    Ok, what do you want to do in Dotonbori?
    1. Walk around
    2. Eat some good food and buy some stuff
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            takeAStroll();
        }
        else if (choice == 2)
        {
            consumer();
        }
    }

    private void takeAStroll()
    {
        Util.clearConsole();
        System.out.println("You walk around taking in the sights and thinking about life and your vacation so far. Before you can think too much though...");
        Util.pauseConsole();
        streetInterview();
    }
    private void streetInterview()
    {
        Util.clearConsole();
        String text = """
    You encounter a wild street interviewer, what do you do?
    1. Use your never before seen skills in the Japanese language
    2. Ignore them and live another day
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            hiddenLinguist();
        }
        else if (choice == 2)
        {
            chad();
        }
    }

    private void hiddenLinguist()
    {
        Util.clearConsole();
        System.out.println("You use your crazy Japanese to wow and please the interviewer");
        Util.pauseConsole();
        timeSkip();
    }
    private void timeSkip()
    {
        Util.clearConsole();
        String text = """
    The interviewer is seriously interested and impressed, unfortunately you are basically stuck answering a million questions. You feel you must escape, what do you do? 4 hours later...
    1. You use rasengan on the interviewer to escape
    2. You slap them like Will Smith to escape
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            pissedOff();
        }
        else if (choice == 2)
        {
            meltingPoint();
        }
    }
    private void pissedOff()
    {
        Util.clearConsole();
        System.out.println("Having had enough of the interviewer's endless ramblings you use 螺旋丸, it is effective and the interviewer retreats! I think we can consider this a victory, time to head back to the hotel...");
        Util.pauseConsole();
        goToOsaka();
    }
    private void meltingPoint()
    {
        Util.clearConsole();
        System.out.println("You've had enough and you land a solid slap on the interviewer's face, Will Smith would be proud. The interviewer and their cameraman quickly retreat, job well done! Time to head back...");
        Util.pauseConsole();
        goToOsaka();
    }

    private void chad()
    {
        Util.clearConsole();
        System.out.println("You've seen enough interview videos on YouTube to know where this is going to go, you choose to fight another day. Very wise...");
        Util.pauseConsole();
        goToOsaka();
    }

    //Shinsaibashi Branch
    private void shinsaibashi()
    {
        Util.clearConsole();
        String text = """
    よし, what do you do in Shinsaibashi-suji?
    1. Walk around
    2. Eat some good food and buy lots of stuff
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            takeAStroll();
        }
        else if (choice == 2)
        {
            consumer();
        }
    }

    private void consumer()
    {
        Util.clearConsole();
        System.out.println("You eat some good food and buy a few things along the way. Reality hits like a truck though...");
        Util.pauseConsole();
        wentTooFar();
    }
    private void wentTooFar()
    {
        Util.clearConsole();
        System.out.println("You spent too much money even though the food and the stuff you bought was good. I guess this is just a bit of a skill issue problem.");
        Util.pauseConsole();
        defeat();
    }

    //Universal Studios Japan Branch
    private void universal()
    {
        Util.clearConsole();
        String text = """
    到着しました, now that you're here, what do you do?
    1. Buy a bunch of souvenirs and merch
    2. Ride the rides and check out the attractions
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            obsessedFan();
        }
        else if (choice == 2)
        {
            feetDead();
        }
    }

    private void obsessedFan()
    {
        Util.clearConsole();
        String text = """
    Ok, you basically buy every plushie and thing you can see because why the heck not, then you realize...
    1. How much money you just spent
    2. That money is not important, happiness is
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            ohCrap();
        }
        else if (choice == 2)
        {
            revelation();
        }
    }

    private void ohCrap()
    {
        Util.clearConsole();
        System.out.println("You realize that you just exceeded your budget twofold on this trip, unfortunately that means you will be walking more from here on out.");
        Util.pauseConsole();
        defeat();
    }
    private void revelation()
    {
        Util.clearConsole();
        System.out.println("You realize that money hardly matters when you're having fun so you decide to just go along with the flow. Broke as you may be, it's a simple as pressing restart");
        Util.pauseConsole();
        start();
    }

    private void feetDead()
    {
        Util.clearConsole();
        System.out.println("Waiting in lines for hours on end doesn't really make up for the rides, but they were fun so all's good, right? You put in more steps today than you have done in months back home, maybe you lost a few pounds too, wait...");
        Util.pauseConsole();
        defeat();
    }

    //Osaka Castle Branch
    private void coolCastle()
    {
        Util.clearConsole();
        String text = """
    Oh brave soul, what do you do at Osaka Castle?
    1. Take pictures, leaving as quickly as possible
    2. Spend as much time as possible there
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            trueIntrovert();
        }
        else if (choice == 2)
        {
            extrovert();
        }
    }

    private void trueIntrovert()
    {
        Util.clearConsole();
        System.out.println("As an introvert, you avoid spending too much time in this popular place with people everywhere. Who knows if an interviewer will show up out of nowhere or lest you see a popular YouTuber livestreaming");
        Util.pauseConsole();
        start();
    }

    private void extrovert()
    {
        Util.clearConsole();
        System.out.println("You summon your inner courage 勇気 and truly enjoy the sights before you, even a Johnny Somali impersonator/copycat couldn't faze you. What a fulfilling day, now off to your next adventure...");
        Util.pauseConsole();
        start();
    }

    //___Kyoto 京都 Path___
    private void goToKyoto()
    {
        Util.clearConsole();
        String text = """
    Now that you're in Kyoto, what are you going to do?
    1. Go to Gion District
    2. Go to Fushimi Inari-taisha Shrine
    3. Go to Kyoumizu-dera Temple
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 3);

        if (choice == 1)
        {
            gion();
        }
        else if (choice == 2)
        {
            omgShrine();
        }
        else if (choice == 3)
        {
            anotherTemple();
        }
    }

    //Gion Branch
    private void gion()
    {
        Util.clearConsole();
        String text = """
    You know the drift, now what are you gonna do?
    1. Find a geisha
    2. Walk around and admire the views
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            geisha();
        }
        else if (choice == 2)
        {
            stunned();
        }
    }

    private void geisha()
    {
        Util.clearConsole();
        String text = """
    Ok, so you found a geisha, what are you going to do?
    1. Take a billion pictures
    2. Walk right past
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            pictureBomb();
        }
        else if (choice == 2)
        {
            chadOrIdiot();
        }
    }

    private void pictureBomb()
    {
        Util.clearConsole();
        System.out.println("You procede to take a bunch of pictures, unfortunately you didn't know that you need to get the person's consent first. People around you give you the stare and a nearby police officer notices you...oh crap.");
        Util.pauseConsole();
        defeat();
    }
    private void chadOrIdiot()
    {
        Util.clearConsole();
        System.out.println("Ok, I've had enough with all this encapsulation; so many methods. I guess that's why you also just walked past the geisha after looking at them for a few seconds. Not that big of a deal I suppose, feels nice...");
        Util.pauseConsole();
        goToKyoto();
    }

    private void stunned()
    {
        Util.clearConsole();
        String text = """
    "Wow" is the only thing on your mind, so much so that you feel...
    1. You're about to awaken something previously inert inside you
    2. Japan is so much better than your home country
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            awakening();
        }
        else if (choice == 2)
        {
            ahMan();
        }
    }

    private void awakening()
    {
        Util.clearConsole();
        String text = """
    You undergo an epic transformation, what do you awaken?
    1. Filthy Frank
    2. Master Oogway
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            filthyWho();
        }
        else if (choice == 2)
        {
            believe();
        }
    }

    private void filthyWho()
    {
        Util.clearConsole();
        System.out.println("You unintentionally wreak havoc as you turn into Filthy Frank. Is this a good or bad thing? I don't even know at this point.");
        Util.pauseConsole();
        goToKyoto();
    }
    private void believe()
    {
        Util.clearConsole();
        System.out.println("Taking inspiration from Master Oogway, you find a suitable place to transcend this plane of existence and turn into flower blossoms. Goodbye world, goodbye cruel world. Wait, that doesn't sound quite right");
        Util.pauseConsole();
        defeat();
    }

    private void ahMan()
    {
        Util.clearConsole();
        System.out.println("You realize you would really like to live in Japan because it is so nice. Is this where the poor college student saga ends? No, this is only the beginning, you can't fall here.");
        Util.pauseConsole();
        start();
    }

    //Fushimi Inari-taisha Shrine Branch
    private void omgShrine()
    {
        Util.clearConsole();
        String text = """
    Wow, what a nice shrine, what are you going to do here though?
    1. Walk around and take pictures
    2. Use rasengan on unsuspecting passersby
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            classicTourist();
        }
        else if (choice == 2)
        {
            rasengan();
        }
    }

    private void classicTourist()
    {
        Util.clearConsole();
        System.out.println("Nothing quite like just being a regular ol' tourist and walking through and experiencing beautiful places. That's a win in my book, onto the next adventure...");
        Util.pauseConsole();
        start();
    }
    private void rasengan()
    {
        Util.clearConsole();
        System.out.println("You've had enough of this bulls**t and you use 螺旋丸 on unsuspecting people nearby. Not a good idea since other rasengan users are also present. They all proceed to unleash their rasengan at the same time at you. Utterly defeated, you pack up and head home.");
        Util.pauseConsole();
        defeat();
    }

    //Kiyomizu-dera Temple Branch
    private void anotherTemple()
    {
        Util.clearConsole();
        String text = """
    Now that you're at this fine temple on a hill, what do you do?
    1. Evolve into a Pokemon (don't question it)
    2. Take pictures and then glide down
    """;
        System.out.println(text);
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            evolution();
        }
        else if (choice == 2)
        {
            showOff();
        }
    }

    private void evolution()
    {
        Util.clearConsole();
        System.out.println("At this point, you just decide to evolve into a Pokemon, who knows which one but you've seen enough to know which one. You no longer have the ability to speak but hey, you can shoot fireballs and stuff. やばい、これは終わりかもしれないですね");
        Util.pauseConsole();
        defeat();
    }
    private void showOff()
    {
        Util.clearConsole();
        System.out.println("So you take some pictures and then pull out this crazy wind glider and fly down and away from everyone and everything. You should have seen the looks on people's faces, it was hysterical. What a show-off, eh? I guess it's off to the next destination now.");
        Util.pauseConsole();
        start();
    }

    //END OF THE ADVENTURE (良かった、ホントに疲れたんだ)

    private void defeat()
    {
        //run method when defeated

        //lose a life
        numLives--;

        //clear console, display text, etc
        Util.clearConsole();
        System.out.println("Looks like you lost big time, 大間違いですね, try to be more careful.");
        Util.pauseConsole();

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else if (numLives == 0)
        {
            //print game over message
            System.out.println("GAME OVER, 弱いすぎて笑笑");
        }
    }
}