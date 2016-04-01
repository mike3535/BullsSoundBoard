/**********************************************************************
 * Michael Rizza
 *
 * This is a play on the classic fart app. It starts with a SplashActivity
 * showing what the app is. It then has six buttons the play sounds of
 * the Chicago Bulls when pressed.
 **********************************************************************/



package edu.niu.cs.mikerizza.bullssoundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity

{

    private MediaPlayer stewieMP, dougMP, driveMP, higherMP,noahMP, scalMP;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create the media players
        stewieMP = new MediaPlayer();
        stewieMP = MediaPlayer.create(this, R.raw.stewie);

        dougMP = new MediaPlayer();
        dougMP = MediaPlayer.create(this, R.raw.doug);

        driveMP = new MediaPlayer();
        driveMP = MediaPlayer.create(this, R.raw.drive);

        higherMP = new MediaPlayer();
        higherMP = MediaPlayer.create(this, R.raw.higher);

        noahMP = new MediaPlayer();
        noahMP = MediaPlayer.create(this, R.raw.noah);

        scalMP = new MediaPlayer();
        scalMP = MediaPlayer.create(this, R.raw.scal);


    }//end of onCreate


    /************************************************************************
     These functions are called when the corresponding picture is clicked. They
     first check if the media player clicked on is currently playing, and if so
     if will pause it. Next it checks if any other media player is playing and if
     so pauses it. It then starts the media player cliked on.
     **********************************************************************/
    public void doStewie(View view)
    {
        //if this  mp3 is playing, then it should be paused
        if(stewieMP.isPlaying())
        {
            stewieMP.pause();

        }
        //otherwise, this  mp3 is not playing
        //if anything else is playing pause it
        //start this mp3

        else {
            if (dougMP.isPlaying()) {
                dougMP.pause();
            } else if (driveMP.isPlaying()) {
                driveMP.pause();
            } else if (higherMP.isPlaying()) {
                higherMP.pause();
            } else if (noahMP.isPlaying()) {
                noahMP.pause();
            } else if (scalMP.isPlaying()) {
                scalMP.pause();
            }

            stewieMP.start();//start this mp3

        }
    }//end of doStewie


    public void doDoug(View view)

    {
        //if this  mp3 is playing, then it should be paused
        if(dougMP.isPlaying())
        {
            dougMP.pause();

        }
        //otherwise, this  mp3 is not playing
        //if anything else is playing pause it
        //start this mp3
else {
            if (stewieMP.isPlaying()) {
                stewieMP.pause();
            } else if (driveMP.isPlaying()) {
                driveMP.pause();
            } else if (higherMP.isPlaying()) {
                higherMP.pause();
            } else if (noahMP.isPlaying()) {
                noahMP.pause();
            } else if (scalMP.isPlaying()) {
                scalMP.pause();
            }

            dougMP.start();//start this mp3
        }
    }


    public void doNoah(View view)

    {
        //if this  mp3 is playing, then it should be paused
        if(noahMP.isPlaying())
        {
            noahMP.pause();

        }
        //otherwise, this  mp3 is not playing
        //if anything else is playing pause it
        //start this mp3

        else {
            if (dougMP.isPlaying()) {
                dougMP.pause();
            } else if (driveMP.isPlaying()) {
                driveMP.pause();
            } else if (higherMP.isPlaying()) {
                higherMP.pause();
            } else if (stewieMP.isPlaying()) {
                stewieMP.pause();
            } else if (scalMP.isPlaying()) {
                scalMP.pause();
            }

            noahMP.start();//start this mp3
        }
    }



    public void doScal(View view)
    {
        //if this  mp3 is playing, then it should be paused
        if(scalMP.isPlaying())
        {
            scalMP.pause();

        }
        //otherwise, this  mp3 is not playing
        //if anything else is playing pause it
        //start this mp3

        else {
            if (dougMP.isPlaying()) {
                dougMP.pause();
            } else if (driveMP.isPlaying()) {
                driveMP.pause();
            } else if (higherMP.isPlaying()) {
                higherMP.pause();
            } else if (noahMP.isPlaying()) {
                noahMP.pause();
            } else if (stewieMP.isPlaying()) {
                stewieMP.pause();
            }

            scalMP.start();//start this mp3
        }
    }

    public void doRose(View view)
    {
        //if this  mp3 is playing, then it should be paused
        if(higherMP.isPlaying())
        {
            higherMP.pause();

        }
        //otherwise, this  mp3 is not playing
        //if anything else is playing pause it
        //start this mp3

        else {
            if (dougMP.isPlaying()) {
                dougMP.pause();
            } else if (driveMP.isPlaying()) {
                driveMP.pause();
            } else if (stewieMP.isPlaying()) {
                stewieMP.pause();
            } else if (noahMP.isPlaying()) {
                noahMP.pause();
            } else if (scalMP.isPlaying()) {
                scalMP.pause();
            }

            higherMP.start();//start this mp3
        }
    }

    public void doTaj(View view)
    {
        //if this  mp3 is playing, then it should be paused
        if(driveMP.isPlaying())
        {
            driveMP.pause();


        }
        //otherwise, this  mp3 is not playing
        //if anything else is playing pause it
        //start this mp3

        else {
            if (dougMP.isPlaying()) {
                dougMP.pause();

            } else if (stewieMP.isPlaying()) {
                stewieMP.pause();

            } else if (higherMP.isPlaying()) {
                higherMP.pause();

            } else if (noahMP.isPlaying()) {
                noahMP.pause();

            } else if (scalMP.isPlaying()) {
                scalMP.pause();

            }

            driveMP.start();//start this mp3
        }
    }

}//end of MainActivity
