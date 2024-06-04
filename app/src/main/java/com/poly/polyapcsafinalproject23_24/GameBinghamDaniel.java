package com.poly.polyapcsafinalproject23_24;

import android.annotation.SuppressLint;
import android.content.Intent;
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

        ivStory.setImageResource(R.drawable.im_binghamdaniel_plane);
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

    private void setAllBtnsVisible() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
    }

    @SuppressLint("SetTextI18n")
    private void start()
    {
        isWon = false;

        ivStory.setImageResource(R.drawable.im_binghamdaniel_map);
        tvStoryText.setText("Time to visit Japan, where do you want to go visit?");

        setAllBtnsVisible();
        btn1.setText("Visit Tokyo");
        btn2.setText("Visit Osaka");
        btn3.setText("Visit Kyoto");
        btn4.setVisibility(View.INVISIBLE);
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
        ivStory.setImageResource(R.drawable.im_binghamdaniel_akiba);
        tvStoryText.setText("What do you want to do while you are in Tokyo?");

        setAllBtnsVisible();
        btn1.setText("Head to Akihabara");
        btn2.setText("Go to Tokyo Disneyland");
        btn3.setText("Head to Senso-Ji");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                akihabara();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disneyLand();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sensoJi();
            }
        });
    }

    //Akihabara Branch
    private void akihabara()
    {
        tvSubtitle.setText("Akihabara Branch");
        ivStory.setImageResource(R.drawable.im_binghamdaniel_akiba2);
        tvStoryText.setText("What do you do in Akihabara?");

        setAllBtnsVisible();
        btn1.setText("Go to a cat cafe");
        btn2.setText("Go to a maid cafe");
        btn3.setText("Embrace your inner otaku/weeb");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                catCafe();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maidCafe();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beGaijin();
            }
        });
    }

    private void catCafe()
    {
        tvStoryText.setText("You have a great time and feel very wholesome petting cats. 猫も可愛いし漫画も読めます");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_catcafe);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void maidCafe()
    {
        ivStory.setImageResource(R.drawable.im_binghamdaniel_maidcafe);
        tvStoryText.setText("You feel like you've committed a great sin, but you did have fun. メイドさんは可愛いすぎて、罪が重ねたかもしれないよ");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void beGaijin()
    {
        tvStoryText.setText("You embrace your inner otaku/weeb but then...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_weeb);
        setAllBtnsVisible();
        btn1.setText("Another tourist calls you out for cultural appropriation");
        btn2.setText("You decide to buy some manga");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                whereItHurts();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collectionBigger();
            }
        });
    }

    private void whereItHurts()
    {
        tvStoryText.setText("You end up punching them in the face, accidentally (right?)");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_punch);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTokyo();
            }
        });
    }

    private void collectionBigger()
    {
        tvStoryText.setText("You bought so many manga that you can't read, job well done. ただ僕は読めますから安心してね。いつか日本語上手になるはずだ");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_manga);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //Disneyland Branch
    private void disneyLand()
    {
        tvSubtitle.setText("Disneyland Branch");
        tvStoryText.setText("What are you going to do at Disneyland Tokyo?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_disney);
        setAllBtnsVisible();
        btn1.setText("Commit a Johnny Somali");
        btn2.setText(" Be a normal tourist (or whatever)");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actLikeSomali();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beTourist();
            }
        });
    }

    private void actLikeSomali()
    {
        tvStoryText.setText("You have two options, time to choose your fate:");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_somali);
        setAllBtnsVisible();
        btn1.setText("Knocked out and arrested?");
        btn2.setText("You escape but...");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                madaMada();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                surviveAnotherDay();
            }
        });
    }

    private void madaMada()
    {
        tvStoryText.setText("As expected, an angry Japanese person knocks you out and you are later arrested for being a public disturbance. まだまだですね");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_somali2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void surviveAnotherDay()
    {
        tvStoryText.setText("Although you are punched in the face, you manage to barely escape. Unfortunately for you, as you are escaping someone trips you and a whole gang of angry people beat you up anyways.");

        ivStory.setImageResource(R.drawable.im_danielbingham_beatdown);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void beTourist()
    {
        tvStoryText.setText("You have the time of your life and feel you made a really good decision.");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_disneytourist);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //Senso-Ji Branch
    private void sensoJi()
    {
        tvSubtitle.setText("Senso-Ji Branch");
        tvStoryText.setText("You head over to the extremely famous Senso-Ji temple in Tokyo and...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_sensoji);
        setAllBtnsVisible();
        btn1.setText("You are overwhelmed by the crowd");
        btn2.setText("You eat some food and take pictures");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                famousTemple();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                streetStall();
            }
        });
    }

    private void famousTemple()
    {
        tvStoryText.setText("Overwhelmed by the sheer amount of people present there, you decide to head back to the hotel because you didn't sign up for this.");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_crowdedtemple);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void streetStall()
    {
        tvStoryText.setText("You head to the plethora of street vendors and stalls available near the temple and buy and eat some good food. You take a bunch of pictures and even make an offering at the temple, unfortunately there are way too many people. Either way, you feel like it was a pretty fruitful experience");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_streetfood);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //___Osaka 大阪 Path___
    private void goToOsaka()
    {
        tvTitle.setText("Osaka (大阪) Path");
        tvStoryText.setText("Alright, what do you want to do in Osaka?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_osaka);
        setAllBtnsVisible();
        btn1.setText("Go to Dotonbori District");
        btn2.setText("Go to Shinsaibashi-suji Shopping Street");
        btn3.setText("Go to Universal Studios Japan");
        btn4.setText("Go to Osaka Castle");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dotonbori();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shinsaibashi();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                universal();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coolCastle();
            }
        });
    }

    //Dotonbori District Branch
    private void dotonbori()
    {
        tvSubtitle.setText("Dotonbori District Branch");
        tvStoryText.setText("Ok, what do you want to do in Dotonbori?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_dotonbori);
        setAllBtnsVisible();
        btn1.setText("Walk around");
        btn2.setText("Eat some good food and buy some stuff");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeAStroll();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                consumer();
            }
        });
    }

    private void takeAStroll()
    {
        tvStoryText.setText("You walk around taking in the sights and thinking about life and your vacation so far. Before you can think too much though...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_dotonbori2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                streetInterview();
            }
        });
    }
    private void streetInterview()
    {
        tvStoryText.setText("You encounter a wild street interviewer, what do you do?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_streetinterview);
        setAllBtnsVisible();
        btn1.setText("Use your never before seen skills in the Japanese language");
        btn2.setText("Ignore them and live another day");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hiddenLinguist();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chad();
            }
        });
    }

    private void hiddenLinguist()
    {
        tvStoryText.setText("You use your crazy Japanese to wow and please the interviewer");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_japanese);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timeSkip();
            }
        });
    }
    private void timeSkip()
    {
        tvStoryText.setText("The interviewer is seriously interested and impressed, unfortunately you are basically stuck answering a million questions. You feel you must escape, what do you do? 4 hours later...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_impatient);
        setAllBtnsVisible();
        btn1.setText("You use rasengan on the interviewer to escape");
        btn2.setText("You slap them like Will Smith to escape");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pissedOff();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                meltingPoint();
            }
        });
    }
    private void pissedOff()
    {
        tvStoryText.setText("Having had enough of the interviewer's endless ramblings you use 螺旋丸, it is effective and the interviewer retreats! I think we can consider this a victory, time to head back to the hotel...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_boilingpoint);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOsaka();
            }
        });
    }
    private void meltingPoint()
    {
        tvStoryText.setText("You've had enough and you land a solid slap on the interviewer's face, Will Smith would be proud. The interviewer and their cameraman quickly retreat, job well done! Time to head back...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_slap);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOsaka();
            }
        });
    }

    private void chad()
    {
        tvStoryText.setText("You've seen enough interview videos on YouTube to know where this is going to go, you choose to fight another day. The street interviewer is pissed to say the least. Very wise...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_anotherday);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOsaka();
            }
        });
    }

    //Shinsaibashi Branch
    private void shinsaibashi()
    {
        tvSubtitle.setText("Shinsaibashi Branch");
        tvStoryText.setText("よし, what do you do in Shinsaibashi-suji?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_shinsaibashi);
        setAllBtnsVisible();
        btn1.setText("Walk around");
        btn2.setText("Eat some good food and buy lots of stuff");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeAStroll();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                consumer();
            }
        });
    }

    private void consumer()
    {
        tvStoryText.setText("You eat some good food and buy a few things along the way. Reality hits like a truck though...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_kaimono);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wentTooFar();
            }
        });
    }
    private void wentTooFar()
    {
        tvStoryText.setText("You spent too much money even though the food and the stuff you bought was good. I guess this is just a bit of a skill issue problem.");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_broke);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    //Universal Studios Japan Branch
    private void universal()
    {
        tvSubtitle.setText("Universal Studios Japan Branch");
        tvStoryText.setText("到着しました, now that you're here, what do you do?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_universal);
        setAllBtnsVisible();
        btn1.setText("Buy a bunch of souvenirs and merch");
        btn2.setText("Ride the rides and check out the attractions");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obsessedFan();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feetDead();
            }
        });
    }

    private void obsessedFan()
    {
        tvStoryText.setText("OK, you basically buy every plushie and thing you can see because why the heck not, then you realize...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_merch);
        setAllBtnsVisible();
        btn1.setText("How much money you just spent.");
        btn2.setText("That money is not important, happiness is.");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ohCrap();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                revelation();
            }
        });
    }

    private void ohCrap()
    {
        tvStoryText.setText("You realize that you just exceeded your budget twofold on this trip, unfortunately that means you will be walking more from here on out.");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_broke2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }
    private void revelation()
    {
        tvStoryText.setText("You realize that money hardly matters when you're having fun so you decide to just go along with the flow. Broke as you may be, it's a simple as pressing restart");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_reset);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void feetDead()
    {
        tvStoryText.setText("Waiting in lines for hours on end doesn't really make up for the rides, but they were fun so all's good, right? You put in more steps today than you have done in months back home, maybe you lost a few pounds too, wait...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_universal2);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    //Osaka Castle Branch
    private void coolCastle()
    {
        tvSubtitle.setText("Osaka Castle Branch");
        tvStoryText.setText("Oh brave soul, what do you do at Osaka Castle?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_osakacastle);
        setAllBtnsVisible();
        btn1.setText("Take pictures, leaving as quickly as possible");
        btn2.setText("That money is not important, happiness is.");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trueIntrovert();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                extrovert();
            }
        });
    }

    private void trueIntrovert()
    {
        tvStoryText.setText("As an introvert, you avoid spending too much time in this popular place with people everywhere. Who knows if an interviewer will show up out of nowhere or lest you see a popular YouTuber livestreaming");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_castleintrovert);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    private void extrovert()
    {
        tvStoryText.setText("You summon your inner courage 勇気 and truly enjoy the sights before you, even a Johnny Somali impersonator/copycat couldn't faze you. What a fulfilling day, now off to your next adventure...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_castle_extrovert);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //___Kyoto 京都 Path___
    private void goToKyoto()
    {
        tvTitle.setText("Kyoto (京都) Path");
        tvStoryText.setText("Now that you're in Kyoto, what are you going to do?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_kyoto);
        setAllBtnsVisible();
        btn1.setText("Go to Gion District");
        btn2.setText("Go to Fushimi Inari-taisha Shrine");
        btn3.setText("Go to Kyoumizu-dera Temple");
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gion();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                omgShrine();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anotherTemple();
            }
        });
    }

    //Gion Branch
    private void gion()
    {
        tvSubtitle.setText("Gion Branch");
        tvStoryText.setText("You know the drift, now what are you gonna do?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_gion);
        setAllBtnsVisible();
        btn1.setText("Find a geisha");
        btn2.setText("Walk around and admire the views");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geisha();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stunned();
            }
        });
    }

    private void geisha()
    {
        tvStoryText.setText("Ok, so you found a geisha, what are you going to do?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_geisha);
        setAllBtnsVisible();
        btn1.setText("Take a billion pictures");
        btn2.setText("Walk right past");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pictureBomb();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chadOrIdiot();
            }
        });
    }

    private void pictureBomb()
    {
        tvStoryText.setText("You procede to take a bunch of pictures, unfortunately you didn't know that you need to get the person's consent first. People around you give you the stare and a nearby police officer notices you...oh crap.");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_nosy_tourist);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }
    private void chadOrIdiot()
    {
        tvStoryText.setText("Ok, I've had enough with all this encapsulation; so many methods. I guess that's why you also just walked past the geisha after looking at them for a few seconds. Not that big of a deal I suppose, feels nice...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_cool_tourist);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToKyoto();
            }
        });
    }

    private void stunned()
    {
        tvStoryText.setText("\"Wow\" is the only thing on your mind, so much so that you feel...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_amazed_tourist);
        setAllBtnsVisible();
        btn1.setText("You're about to awaken something previously inert inside you");
        btn2.setText("Japan is so much better than your home country");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                awakening();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ahMan();
            }
        });
    }

    private void awakening()
    {
        tvStoryText.setText("You undergo an epic transformation, what do you awaken?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_transformation);
        setAllBtnsVisible();
        btn1.setText("Filthy Frank");
        btn2.setText("Master Oogway");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filthyWho();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                believe();
            }
        });
    }

    private void filthyWho()
    {
        tvStoryText.setText("You unintentionally wreak havoc as you turn into Filthy Frank. Is this a good or bad thing? I don't even know at this point.");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_filthy_frank);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToKyoto();
            }
        });
    }
    private void believe()
    {
        tvStoryText.setText("Taking inspiration from Master Oogway, you find a suitable place to transcend this plane of existence and turn into flower blossoms. Goodbye world, goodbye cruel world. Wait, that doesn't sound quite right");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_ascending);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void ahMan()
    {
        tvStoryText.setText("You realize you would really like to live in Japan because it is so nice. Is this where the poor college student saga ends? No, this is only the beginning, you can't fall here.");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_reset);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //Fushimi Inari-taisha Shrine Branch
    private void omgShrine()
    {
        tvStoryText.setText("Wow, what a nice shrine, what are you going to do here though?");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_fushimi_shrine);
        setAllBtnsVisible();
        btn1.setText("Walk around and take pictures");
        btn2.setText("Use rasengan on unsuspecting passersby");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                classicTourist();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rasengan();
            }
        });
    }

    private void classicTourist()
    {
        tvStoryText.setText("Nothing quite like just being a regular ol' tourist and walking through and experiencing beautiful places. That's a win in my book, onto the next adventure...");

        ivStory.setImageResource(R.drawable.im_binghamdaniel_reset_shrine);
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }
    private void rasengan()
    {
        tvStoryText.setText("You've had enough of this bulls**t and you use 螺旋丸 on unsuspecting people nearby. Not a good idea since other rasengan users are also present. They all proceed to unleash their rasengan at the same time at you. Utterly defeated, you pack up and head home.");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    //Kiyomizu-dera Temple
    private void anotherTemple()
    {
        tvSubtitle.setText("Kiyomizu-dera Temple Branch");
        tvStoryText.setText("Now that you're at this fine temple on a hill, what do you do?");

        setAllBtnsVisible();
        btn1.setText("Evolve into a Pokemon (don't question it)");
        btn2.setText("Take pictures and then glide down");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                evolution();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOff();
            }
        });
    }

    private void evolution()
    {
        tvStoryText.setText("At this point, you just decide to evolve into a Pokemon, who knows which one but you've seen enough to know which one. You no longer have the ability to speak but hey, you can shoot fireballs and stuff. やばい、これは終わりかもしれないですね");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }
    private void showOff()
    {
        tvStoryText.setText("So you take some pictures and then pull out this crazy wind glider and fly down and away from everyone and everything. You should have seen the looks on people's faces, it was hysterical. What a show-off, eh? I guess it's off to the next destination now.");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    //END OF THE ADVENTURE (良かった、ホントに疲れたんだ)

    private void defeat()
    {
        //run method when defeated

        //lose a life
        numLives--;

        //clear console, display text, etc
        tvStoryText.setText("Looks like you lost a life, 大間違いですね, try to be more careful.");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else if (numLives == 0)
        {
            //print game over message
            tvStoryText.setText("GAME OVER, 弱いすぎて笑笑");
            btn1.setText("Back to menu");

            //ivStory.setImageResource(R.drawable.im_laborday_high_school_over);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameBinghamDaniel.this, MainActivity.class));
                }
            });
        }
    }
}