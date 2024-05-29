package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameLeangThong extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("Which pill will you take?");
        numLives = 5;
        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }



    public void start()
    {

        isWon = false;

        ivStory.setImageResource(R.drawable.im_laborday_title);
        playAudio(R.raw.audio_laborday_bass);

        tvStoryText.setText("You're a freshmen at a college frat party, a senior offers you three pills. A red, a blue, and a black pill. Which pill will you take?");
        setAllBtnsVisible();
        btn1.setText("Red Pill");
        btn2.setText("Blue Pill");
        btn3.setText("Black Pill");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mountain();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                island();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                war();
            }
        });

    }

    //________Red Pill________
    public void mountain()
    {
        //mountain adventure
        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("You wake on a desolated rocky mountain, and find a piece of paper in your hand. You read it and it says, Reach the top and a reward awaits you.");

        setAllBtnsVisible();

        setAllBtnsVisible();
        btn1.setText("Hike up a path");
        btn2.setText("Climb the mountain");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hike();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                climb();
            }
        });


    }

    public void hike()
    {
        tvStoryText.setText("While you hike up the colossal mountain you encounter a mountain lion. What do you do?");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Fight");
        btn2.setText("Make a run for it");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fight();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runAway();
            }
        });

    }

    public void runAway()
    {
        tvStoryText.setText("You're not that guy pal... the mountain lion mauls you.");

        ivStory.setImageResource(R.drawable.im_laborday_swimming);

        setAllBtnsVisible();
        btn1.setText("Continue");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }

    public void fight()
    {
        double luckFight = Math.random();
        if (luckFight <= .5)
        {
            tvStoryText.setText("You're not that guy pal... the mountain lion beats you to a pulp.");

            ivStory.setImageResource(R.drawable.im_laborday_swimming);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        }
        else
        {
            tvStoryText.setText("You found a rocket launcher on the ground and blow up the fierce beast.");

            ivStory.setImageResource(R.drawable.im_laborday_swimming);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    bloodLossEnding();
                }
            });
        }
    }

    public void bloodLossEnding()
    {
        double luckFight = Math.random();
        if (luckFight > .5 && luckFight <= .75)
        {
            tvStoryText.setText("You survived the fight, but die to blood loss... womp womp");

            ivStory.setImageResource(R.drawable.im_laborday_swimming);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        }
        else
        {
            tvStoryText.setText("You managed to take out the lion without even a scratch");

            ivStory.setImageResource(R.drawable.im_laborday_swimming);

            setAllBtnsVisible();
            btn1.setText("Continue");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    topOfMountain();
                }
            });
        }
    }

    public void topOfMountain()
    {
        tvStoryText.setText("Congratulations Adventurer!!! Oh wait there's an alter with a purple drink on it. Do you drink it?");

        ivStory.setImageResource(R.drawable.im_laborday_arrive_at_beach);

        setAllBtnsVisible();
        btn1.setText("Drink the mysterious lean");
        btn2.setText("Don't drink it (Don't be a prune)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvStoryText.setText("You drink the lean, and black out once again. You wake back up at the party, and the senior offers you the pills again. Which will you take?");

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        start();
                    }
                });

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvStoryText.setText("Guess what... you died to oxygen deprivation (hahahhahahahahahahahhaahahahah)");

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        defeat();
                     }
                });
            }
        });

    }

    public void climb()
    {
        System.out.println("\nYou decided to scale the mountain");
        System.out.println("1. Take it nice and slow (slowpoke)\n2. Yolo it and rush the climb");

        tvStoryText.setText("You decided to scale the mountain");

        ivStory.setImageResource(R.drawable.im_laborday_arrive_at_beach);

        setAllBtnsVisible();
        btn1.setText("Take it nice and slow (slowpoke)");
        btn2.setText("Yolo it and rush the climb\"");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slowPoke();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { yoloClimb(); }
        });
    }

    public void slowPoke()
    {
        tvStoryText.setText("Well you're no fun, but after 37 hours of climbing slower than a grandma on the highway, you make it to the top.");

        ivStory.setImageResource(R.drawable.im_laborday_tan5hours);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topOfMountain();
            }
        });
    }

    public void yoloClimb()
    {
        tvStoryText.setText("You decided to ball out and speedrun climbing the mountain.");

        ivStory.setImageResource(R.drawable.im_laborday_tan5hours);
        double chance = Math.random();

        if (chance <= .5)
        {
            tvStoryText.setText("Well... that was a bad idea you fell and snap both your legs. And some rabid bunnies tickle you to death.");

            ivStory.setImageResource(R.drawable.im_laborday_tan5hours);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }
        else
        {
            tvStoryText.setText("Oh wow you survived the climb... You have reached the top of the mountain!!!");

            ivStory.setImageResource(R.drawable.im_laborday_tan5hours);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    topOfMountain();
                }
            });
        }
    }

    //________Blue Pill________
    public void island()
    {
        //island adventure
        tvStoryText.setText("You wake up in a plane seat of a plane that seemed to have crash on a beach and is also missing its front half. Well anyways you smell some oil and... booooommmmmmmm****, you get sent flying across the beach and slam into a palm tree. You regain consciousness after a few hours and it's about to be night so now you have to find shelter. Where do you go?");

        ivStory.setImageResource(R.drawable.im_laborday_whaley_park);

        setAllBtnsVisible();
        btn1.setText("Walk along the coast");
        btn2.setText("Venture into the forest");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coast();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forest();
            }
        });

    }

    public void forest()
    {
        tvStoryText.setText("You decided on venturing into the forest. The forest is loud and wet. Mosquitoes are going crazy and biting the living out of you. Itchy and afraid you start hearing some familar sounds. The sound of people, you begin rushing to the sound. As your about to reach the sound , you decided to hide in a bush to make sure they're friendly first of all. You see local natives of the natives in a small village living peacefully. Now what will you do?");

        ivStory.setImageResource(R.drawable.im_laborday_soccer_baby);

        setAllBtnsVisible();
        btn1.setText("Join them (boring) peacefully");
        btn2.setText("Pillage and plunder (embrace inner european)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                join();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exterminate();
            }
        });
    }

    public void exterminate()
    {
        tvStoryText.setText("Well aren't you a genocidal maniac... So how will you approach this massacre? ");

        ivStory.setImageResource(R.drawable.im_laborday_soccer_baby);

        setAllBtnsVisible();
        btn1.setText("Burn their village to the ground");
        btn2.setText("Fight them barefist");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arson();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigMan();
            }
        });
    }

    public void arson()
    {
        tvStoryText.setText("To top it off you're also a Pyromaniac. Well anyways you camp in the bush till night time. After all the villagers fell asleep you begin igniting all their wood houses. As you watch the inferno with the screams of the poor villagers. You seem to have overdone it and the fire is spreading to the trees, but anyways that ain't you're problem so you decide to call it a day and went to sleep.");

        ivStory.setImageResource(R.drawable.im_laborday_take_baby);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { helicoptor(); }
        });
    }

    public void helicoptor()
    {
        tvStoryText.setText("As you wake up from your beauty sleep and you hear the faint sounds of helicoptors, they seemed to have notice the notice the hellfire you caused last night. A helicoptor picks you up and you flies back to the main land. However, you see a familar face sitting next to you. It's the senior and he offers you the pills once again. Which will you take?");

        ivStory.setImageResource(R.drawable.im_laborday_take_baby);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { start(); }
        });
    }

    public void bigMan()
    {
        tvStoryText.setText("You leave the bush and get ready to massacre them all with your bare hands, when out came a 7ft tall and jacked up villager from the treelines, ready to throw hands.");

        ivStory.setImageResource(R.drawable.im_laborday_take_baby);

        double luckFight = Math.random();
        if (luckFight > .5)
        {
            tvStoryText.setText("The giant rams right into you at the speed of 50 mph, sending you ragdolling, as you barely get up he grabs you by the neck and tosses you into the air, then does a flying knee to your spine rendering you crippled. After all that he drags you to an active volcano and launches straight into the molten lava. X_X");

            ivStory.setImageResource(R.drawable.im_laborday_rain);

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }
        else
        {
            tvStoryText.setText("With the power of plot armor and the gun in your pocket you take out the giant man before he could even touched you. After that shortlived battle, the villagers were amazed by your skills and offer you a bowl filled with a purple liquid. Do you drink it?");

            ivStory.setImageResource(R.drawable.im_laborday_soccer_baby);

            setAllBtnsVisible();
            btn1.setText("Yes (gotta stay hydrated)");
            btn2.setText("No (What if it's poison?)");
            btn3.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    potion();
                }
            });

            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    noPotion();
                }
            });
        }
    }

    public void join()
    {
        tvStoryText.setText("You come out the bush hands in the air, and the natives start screaming and they start blowdarting you. As the 100 tranqs enter your system you immediately knock out. You slowly start waking up after a few days, your legs are completely paralyzed and you're being dragged by the natives. They bring you to a room and throw you into it. Now in front you lays a bowl full of a purple substance. Do you drink it?");

        ivStory.setImageResource(R.drawable.im_laborday_soccer_baby);

        setAllBtnsVisible();
        btn1.setText("Drink it...What's the worse that could happen?");
        btn2.setText("Don't take it (drugs are bad for you >_<)");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                potion();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noPotion();
            }
        });
    }

    public void potion()
    {
        tvStoryText.setText("You drink the mysterious purple substance, and black out once again. You wake back up at the party, and the senior offers you the pills again. Which will you take?");

        ivStory.setImageResource(R.drawable.im_laborday_take_baby);

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start();
            }
        });
    }

    public void noPotion()
    {
        System.out.println("Well you decided not take it. Afterwards, the villagers greeted you as one of their own and you live the rest of your meaningless life as one of them. Shortly after you died to some waterborne disease.");
        defeat();
    }

    public void coast()
    {
        System.out.println("While you walk along the coast, you spot something in the distance and run towards it, only to find a skinwalker eating a sea lion. As you try backing up the stench of your musty clothes gains the attention of the skinwalker and it starts chasing after you. What now?");
        System.out.println("1. Run for dear life \n2. Take your chances with the ocean");

        if (choice == 1)
        {
            keepOnRunning();
        }
        else if (choice == 2)
        {
            water();
        }
    }

    public void keepOnRunning()
    {
        double speed = Math.random();
        if (speed <= .5)
        {
            System.out.println("\nShouldn't have been a couch potato... the skinwalker catches you and chomps off your head. Then it procceeds to emote on you.");
            defeat();
        }
        else
        {
            System.out.println("\nYou somehow managed to outrun the skinwalker... joining the track team was a good decision on your part.");
            boat();
        }
    }
    public void boat()
    {
        System.out.println("\nAfter running for hours on end you find a boat house. You decide to finally rest after the day you had until you suddenly smell the scent of gas... kabooooommm**** (don't go in other people's houses.)");
        defeat();
    }
    public void water()
    {
        System.out.println("\nYou really thought that would work?... the skinwalker jumps on top of you and drowns you. Then it teabags on your corpse.");
        defeat();
    }

    //________Black Pill________
    public void war()
    {
        System.out.println("You wake up in a trench, you are in the middle of battle during a blitzkrieg. You also have no weapons on you except for your French uniform. You hear nazi soldiers closing in on you. You gotta make a move now, what will you do?");
        System.out.println("1. Play dead (Too Scawwyy >_<) \n2. Fight the war (BE A MAN) ");

        if (choice == 1)
        {
            playDead();
        }
        else if (choice == 2)
        {
            warFight();
        }
    }

    public void warFight()
    {
        System.out.println("Good job soldier, you made the right choice. Now what is your first line of action?");
        System.out.println("1. Loot a gun from a body (They aint gonna need it anymore) \n2. Hide in a bunker (chat is this guy serious rn) ");

        if (choice == 1)
        {
            loot();
        }
        else if (choice == 2)
        {
            coward();
        }
    }

    public void loot()
    {
        System.out.println("You let go of your morals and start looting some bodies. !!!!YOU FOUND A LUGER!!!! with one bullet in it only. What's the strategy now?");
        System.out.println("1. Camp (superior tactic) \n2. Get on the offensive");

        if (choice == 1)
        {
            camp();
        }
        else if (choice == 2)
        {
            shoot();
        }
    }

    public void shoot()
    {
        System.out.println("Now that you have yourself a weapon (1 bullet *_*) how are you going to go about winning the war?");
        System.out.println("1. Be strategic and plan first (nerd 0_0) \n2. Go out GUNS BLAZING!!! (One bullet one kill)");

        if (choice == 1)
        {
            sniped();
        }
        else if (choice == 2)
        {
            tank();
        }
    }

    public void sniped()
    {
        System.out.println("\nYou decided on making a plan, so to start you should get a view of your surroundings. You peak your head outside the trench... you're dead you just got headshotted by a sniper 10 miles away (skill issue).");
        defeat();
    }

    public void tank()
    {
        System.out.println("\nYou don't need a plan you're the main character, so with that you jump out of the trenches and start running across the battlefield, dodging stray bullets with the power of plot armor, and you come across a empty tank. You pilot it and go on a rampage deleting the enemy and your allies. After five filler episodes you finally finish the battle and come out on top.");
        victory();
    }

    public void victory()
    {
        System.out.println("As you celebrate your victory against the Nazis, a portal suddently opens below you sending you into a void of complete darkness, you shortly black out after loss of oxygen.");
        System.out.println("You wake back up at the party, and the senior offers you the pills again. Which will you take?");
        start();
    }

    public void camp()
    {
        System.out.println("You wait silently and patiently for a target to come by. As nazis pass by you take them out one by one then loot them and repeat. And after 4 hours of this process you manage to wipe out the whole enemy squadron leading your nation to victory. (Fortnite Zero Build) ");
        victory();
    }

    public void coward()
    {
        System.out.println("You decide to hide in a bunker till the blitzkriegs ends. (Well I take back what I said you darn sissy)");
        double chance = Math.random();

        if (chance <= .5)
        {
            gas();
        }
        else
        {
            allies();
        }
    }

    public void gas()
    {
        System.out.println("Well... that was a bad idea the Nazis leak some gas bombs inside and you suffocate. (L way to die) ");
        defeat();
    }

    public void allies()
    {
        System.out.println("Whats that... you hear the shooting from outside come to abrupt stop, as you peak your head outside you see that the nazis have left and your allies won. You get to live another day.");
        sike();
    }

    public void sike()
    {
        System.out.println("SIKKKEEEE. You got 360 no scoped by a sniper camping on a hill 5 miles away. X_x skill issue");
        defeat();
    }

    public void playDead()
    {
        double chance = Math.random();
        if (chance >= .5)
        {
            System.out.println("\nYou really thought that would work... the Nazis jump you and beat the living out of you, then they took you to one of their concentration camps");
            captured();
        }
        else
        {
            System.out.println("\nDue to your immense stealth skills, you managed to appear completely invisible to the soldiers, as they leave you alone, you see an opening to run to the treelines and desert the battle. As you run for dear life you hear your fellow comrades call you a dirty coward.");
            deserter();
        }
    }

    public void deserter()
    {
        System.out.println("You suddenly feel a hit of guilt as your about to desert the battle. Will you go back in the warzone?");
        System.out.println("1. Go back to the war \n2. Nah looking out for #1 only");

        if (choice == 1)
        {
            warFight();
        }
        else if (choice == 2)
        {
            woods();
        }
    }

    public void woods()
    {
        System.out.println("\nAs you flee into the forest you reach an abandoned house, and decide to rest on a bed for a sec. Then you started hearing some beeping under it ... kabboooooooommmmm X_X (the house was rigged with explosives >_<) ");
        defeat();
    }

    public void captured()
    {
        System.out.println("Well now you're a war prisoner of the Nazis. They put you in a cell room with an interrogator. They offer you a chance of freedom, if you rat out your comrades. What will you do?");
        System.out.println("1. Rat out your team \n2. Don't snitch on them ");

        if (choice == 1)
        {
            snitch();
        }
        else if (choice == 2)
        {
            dontSnitch();
        }
    }

    public void dontSnitch()
    {
        System.out.println("\nGood on you for staying loyal and not betraying your nation... however the Nazis didn't take it so well and they sent you to solitude confinement.");
        prisoner();
    }

    public void snitch()
    {
        double speed = Math.random();
        if (speed <= .5)
        {
            System.out.println("\nYou immediately rat out your whole nation without hesitation.");
            traitor();
        }
        else
        {
            System.out.println("\nWell you betrayed the nation, and even more you were gullible in thinking the nazis will set you free. The nazis drag you into soilitude confinement.");
            prisoner();
        }
    }

    public void prisoner()
    {
        System.out.println("\nWell well well, aren't you in a tough pickle now. Trapped in a prison cell waiting to starve to death. (you suck as this game)");
        defeat();
    }

    public void traitor()
    {
        System.out.println("\nWell not only did you betray your whole nation, but with your charismatic skills you convinced the Nazis to let you live by switching teams. *_*). However the bomb implanted into your French suit exploded immediately after detecting your act of betrayal.");
        defeat();
    }

    public void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println("...");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("GAME OVER LOSER");
        }

    }
}