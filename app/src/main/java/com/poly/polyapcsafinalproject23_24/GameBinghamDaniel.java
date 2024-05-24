package com.poly.polyapcsafinalproject23_24;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameBinghamDaniel extends GameActivity {

    //instance variables
    //variables you plan to use throughout the game
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4;
    private boolean isWon;
    private int numLives;

    @SuppressLint("SetTextI18n")
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

        tvTitle.setText("Summer Vacation in Japan");
        tvSubtitle.setText("Dumb Version");

        //initialize number of lives
        numLives = 4;

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description

        tvStoryText.setText("You've finished your freshman year of college and decide to treat yourself to a nice summer vacation. " +
                      "You decide to go to Japan because you've always wanted to visit there. What happens next is up to you. Good luck!");
        //System.out.println(text);
        start();
    }

    @SuppressLint("SetTextI18n")
    private void start()
    {
        tvStoryText.setText("Time to visit Japan, where do you want to go visit?");
        //tvSubtitle.setText("1. Visit Tokyo\n2. Visit Osaka\n3. Visit Kyoto");
        //System.out.println("Time to visit Japan, where do you want to go visit?");
        btn1.setText("Visit Tokyo");
        btn2.setText("Visit Osaka");
        btn3.setText("Visit Kyoto");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTokyo();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToOsaka();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToKyoto();
            }
        });
    }

    //___Tokyo 東京 Path___
    private void goToTokyo()
    {
        tvTitle.setText("Tokyo (東京) Path");
        tvStoryText.setText("What do you want to do while you are in Tokyo?");
        //System.out.println("What do you want to do while you are in Tokyo?");
        //System.out.println("1. Head to Akihabara\n2. Go to Tokyo Disneyland\n3. Head to Senso-Ji");
        int choice =

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
        tvSubtitle.setText("Akihabara Branch");
        tvStoryText.setText("What do you do in Akihabara?");
        //System.out.println("What do you do in Akihabara?");
        //System.out.println("1. Go to a cat cafe\n2. Go to a maid cafe\n3. Embrace your inner otaku/weeb");
        int choice =

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
        tvStoryText.setText("You have a great time and feel very wholesome petting cats. 猫も可愛いし漫画も読めます");
        //System.out.println("You have a great time and feel very wholesome petting cats. 猫も可愛いし漫画も読めます");
        start();
    }

    private void maidCafe()
    {
        tvStoryText.setText("You feel like you've committed a great sin, but you did have fun. メイドさんは可愛いすぎて、罪が重ねたかもしれないよ");
        //System.out.println("You feel like you've committed a great sin, but you did have fun. メイドさんは可愛いすぎて、罪が重ねたかもしれないよ");
        defeat();
    }

    private void beGaijin()
    {
        tvStoryText.setText("You embrace your inner otaku/weeb but then...");
        //System.out.println("You embrace your inner otaku/weeb but then...");
        //System.out.println("1. Another tourist calls you out for cultural appropriation\n2. You decide to buy some manga");
        int choice =

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
        System.out.println("You end up punching them in the face, accidentally (right?)");
        goToTokyo();
    }

    private void collectionBigger()
    {
        System.out.println("You bought so many manga that you can't read, job well done. ただ僕は読めますから安心してね。いつか日本語上手になるはずだ");
        start();
    }

    //Disneyland Branch
    private void disneyLand()
    {
        System.out.println("What are you going to do at Disneyland Tokyo?");
        System.out.println("1. Commit a Johnny Somali\n2. Be a normal tourist (or whatever)");
        int choice =

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
        String text = "You have two options, time to choose your fate:\n" +
                      "1. Knocked out and arrested?\n" +
                      "2. You escape but...\n";
        System.out.println(text);
        int choice =

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
        System.out.println("As expected, an angry Japanese person knocks you out and you are later arrested for being a public disturbance. まだまだですね");
        defeat();
    }

    private void surviveAnotherDay()
    {
        System.out.println("Although you are punched in the face, you manage to barely escape. Unfortunately for you, as you are escaping someone trips you and a whole gang of angry people beat you up anyways.");
        defeat();
    }

    private void beTourist()
    {
        System.out.println("You have the time of your life and feel you made a really good decision.");
        start();
    }

    //Senso-Ji Branch
    private void sensoJi()
    {
        String text = "You head over to the extremely famous Senso-Ji temple in Tokyo and...\n" +
                      "1. You are overwhelmed by the crowd\n" +
                      "2. You eat some food and take pictures\n";
        System.out.println(text);
        int choice =
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
        System.out.println("Overwhelmed by the sheer amount of people present there, you decide to head back to the hotel because you didn't sign up for this.");
        defeat();
    }

    private void streetStall()
    {
        System.out.println("You head to the plethora of street vendors and stalls available near the temple and buy and eat some good food. You take a bunch of pictures and even make an offering at the temple, unfortunately there are way too many people. Either way, you feel like it was a pretty fruitful experience");
        start();
    }

    //___Osaka 大阪 Path___
    private void goToOsaka()
    {
        String text = "Alright, what do you want to do in Osaka?\n" +
                      "1. Go to Dotonbori District\n" +
                      "2. Go to Shinsaibashi-suji Shopping Street\n" +
                      "3. Go to Universal Studios Japan\n" +
                      "4. Go to Osaka Castle\n";
        System.out.println(text);
        int choice =

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
        String text = "Ok, what do you want to do in Dotonbori?\n" +
                      "1. Walk around\n" +
                      "2. Eat some good food and buy some stuff\n";
        System.out.println(text);
        int choice =

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
        System.out.println("You walk around taking in the sights and thinking about life and your vacation so far. Before you can think too much though...");
        streetInterview();
    }
    private void streetInterview()
    {
        String text = "You encounter a wild street interviewer, what do you do?\n" +
                      "1. Use your never before seen skills in the Japanese language\n" +
                      "2. Ignore them and live another day\n";
        System.out.println(text);
        int choice =

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
        System.out.println("You use your crazy Japanese to wow and please the interviewer");
        timeSkip();
    }
    private void timeSkip()
    {
        String text = "The interviewer is seriously interested and impressed, unfortunately you are basically stuck answering a million questions. You feel you must escape, what do you do? 4 hours later...\n" +
                      "1. You use rasengan on the interviewer to escape\n" +
                      "2. You slap them like Will Smith to escape\n";
        System.out.println(text);
        int choice =

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
        System.out.println("Having had enough of the interviewer's endless ramblings you use 螺旋丸, it is effective and the interviewer retreats! I think we can consider this a victory, time to head back to the hotel...");
        goToOsaka();
    }
    private void meltingPoint()
    {
        System.out.println("You've had enough and you land a solid slap on the interviewer's face, Will Smith would be proud. The interviewer and their cameraman quickly retreat, job well done! Time to head back...");
        goToOsaka();
    }

    private void chad()
    {
        System.out.println("You've seen enough interview videos on YouTube to know where this is going to go, you choose to fight another day. Very wise...");
        goToOsaka();
    }

    //Shinsaibashi Branch
    private void shinsaibashi()
    {
        String text = "よし, what do you do in Shinsaibashi-suji?\n" +
                      "1. Walk around\n" +
                      "2. Eat some good food and buy lots of stuff\n";
        System.out.println(text);
        int choice =

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
        System.out.println("You eat some good food and buy a few things along the way. Reality hits like a truck though...");
        wentTooFar();
    }
    private void wentTooFar()
    {
        System.out.println("You spent too much money even though the food and the stuff you bought was good. I guess this is just a bit of a skill issue problem.");
        defeat();
    }

    //Universal Studios Japan Branch
    private void universal()
    {
        String text = "到着しました, now that you're here, what do you do?\n" +
                      "1. Buy a bunch of souvenirs and merch\n" +
                      "2. Ride the rides and check out the attractions\n";
        System.out.println(text);
        int choice =

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
        String text = "Ok, you basically buy every plushie and thing you can see because why the heck not, then you realize...\n" +
                      "1. How much money you just spent\n" +
                      "2. That money is not important, happiness is\n";
        System.out.println(text);
        int choice =

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
        System.out.println("You realize that you just exceeded your budget twofold on this trip, unfortunately that means you will be walking more from here on out.");
        defeat();
    }
    private void revelation()
    {
        System.out.println("You realize that money hardly matters when you're having fun so you decide to just go along with the flow. Broke as you may be, it's a simple as pressing restart");
        start();
    }

    private void feetDead()
    {
        System.out.println("Waiting in lines for hours on end doesn't really make up for the rides, but they were fun so all's good, right? You put in more steps today than you have done in months back home, maybe you lost a few pounds too, wait...");
        defeat();
    }

    //Osaka Castle Branch
    private void coolCastle()
    {
        String text = "Oh brave soul, what do you do at Osaka Castle?\n" +
                      "1. Take pictures, leaving as quickly as possible\n" +
                      "2. Spend as much time as possible there\n";
        System.out.println(text);
        int choice =

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
        System.out.println("As an introvert, you avoid spending too much time in this popular place with people everywhere. Who knows if an interviewer will show up out of nowhere or lest you see a popular YouTuber livestreaming");
        start();
    }

    private void extrovert()
    {
        System.out.println("You summon your inner courage 勇気 and truly enjoy the sights before you, even a Johnny Somali impersonator/copycat couldn't faze you. What a fulfilling day, now off to your next adventure...");
        start();
    }

    //___Kyoto 京都 Path___
    private void goToKyoto()
    {
        String text = "Now that you're in Kyoto, what are you going to do?\n" +
                      "1. Go to Gion District\n" +
                      "2. Go to Fushimi Inari-taisha Shrine\n" +
                      "3. Go to Kyoumizu-dera Temple\n";
        System.out.println(text);
        int choice =

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
        String text = "You know the drift, now what are you gonna do?\n" +
                      "1. Find a geisha\n" +
                      "2. Walk around and admire the views\n";
        System.out.println(text);
        int choice =

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
        String text = "Ok, so you found a geisha, what are you going to do?\n" +
                      "1. Take a billion pictures\n" +
                      "2. Walk right past\n";
        System.out.println(text);
        int choice =

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
        System.out.println("You procede to take a bunch of pictures, unfortunately you didn't know that you need to get the person's consent first. People around you give you the stare and a nearby police officer notices you...oh crap.");
        defeat();
    }
    private void chadOrIdiot()
    {
        System.out.println("Ok, I've had enough with all this encapsulation; so many methods. I guess that's why you also just walked past the geisha after looking at them for a few seconds. Not that big of a deal I suppose, feels nice...");
        goToKyoto();
    }

    private void stunned()
    {
        String text = "\"Wow\" is the only thing on your mind, so much so that you feel...\n" +
                      "1. You're about to awaken something previously inert inside you\n" +
                      "2. Japan is so much better than your home country\n";
        System.out.println(text);
        int choice =

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
        String text = "You undergo an epic transformation, what do you awaken?\n" +
                      "1. Filthy Frank\n" +
                      "2. Master Oogway\n";
        System.out.println(text);
        int choice =

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
        System.out.println("You unintentionally wreak havoc as you turn into Filthy Frank. Is this a good or bad thing? I don't even know at this point.");
        goToKyoto();
    }
    private void believe()
    {
        System.out.println("Taking inspiration from Master Oogway, you find a suitable place to transcend this plane of existence and turn into flower blossoms. Goodbye world, goodbye cruel world. Wait, that doesn't sound quite right");
        defeat();
    }

    private void ahMan()
    {
        System.out.println("You realize you would really like to live in Japan because it is so nice. Is this where the poor college student saga ends? No, this is only the beginning, you can't fall here.");
        start();
    }

    //Fushimi Inari-taisha Shrine Branch
    private void omgShrine()
    {
        String text = "Wow, what a nice shrine, what are you going to do here though?\n" +
                      "1. Walk around and take pictures\n" +
                      "2. Use rasengan on unsuspecting passersby\n";
        System.out.println(text);
        int choice =

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
        System.out.println("Nothing quite like just being a regular ol' tourist and walking through and experiencing beautiful places. That's a win in my book, onto the next adventure...");
        start();
    }
    private void rasengan()
    {
        System.out.println("You've had enough of this bulls**t and you use 螺旋丸 on unsuspecting people nearby. Not a good idea since other rasengan users are also present. They all proceed to unleash their rasengan at the same time at you. Utterly defeated, you pack up and head home.");
        defeat();
    }

    //Kiyomizu-dera Temple Branch
    private void anotherTemple()
    {
        String text = "Now that you're at this fine temple on a hill, what do you do?\n" +
                      "1. Evolve into a Pokemon (don't question it)\n" +
                      "2. Take pictures and then glide down\n";
        System.out.println(text);
        int choice =

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
        System.out.println("At this point, you just decide to evolve into a Pokemon, who knows which one but you've seen enough to know which one. You no longer have the ability to speak but hey, you can shoot fireballs and stuff. やばい、これは終わりかもしれないですね");
        defeat();
    }
    private void showOff()
    {
        System.out.println("So you take some pictures and then pull out this crazy wind glider and fly down and away from everyone and everything. You should have seen the looks on people's faces, it was hysterical. What a show-off, eh? I guess it's off to the next destination now.");
        start();
    }

    //END OF THE ADVENTURE (良かった、ホントに疲れたんだ)

    private void defeat()
    {
        //run method when defeated

        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println("Looks like you lost big time, 大間違いですね, try to be more careful.");

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