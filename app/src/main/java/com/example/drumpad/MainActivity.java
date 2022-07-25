package com.example.drumpad;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5,button6,button7,button8,button9;
    SoundPool soundPool;
    int sound,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC,0);
        sound = soundPool.load(this,R.raw.closed_hat4,1);
        sound2 = soundPool.load(this,R.raw.late_kick,1);
        sound3 = soundPool.load(this,R.raw.kick,1);
        sound4 = soundPool.load(this,R.raw.closed_hat2,1);
        sound5 = soundPool.load(this,R.raw.closed_hat3,1);
        sound6 = soundPool.load(this,R.raw.kick_snare,1);
        sound7 = soundPool.load(this,R.raw.open_hihat,1);
        sound8 = soundPool.load(this,R.raw.snare,1);
        sound9 = soundPool.load(this,R.raw.closed_hat1,1);
    }

    public void playSound(View view)
    {
        soundPool.play(sound,1,1,0,0,1);
    }

    public void playSound2(View view)
    {
        soundPool.play(sound2,1,1,0,0,1);
    }

    public void playSound3(View view)
    {
        soundPool.play(sound3,1,1,0,0,1);
    }

    public void playSound4(View view)
    {
        soundPool.play(sound4,1,1,0,0,1);
    }

    public void playSound5(View view)
    {
        soundPool.play(sound5,1,1,0,0,1);
    }

    public void playSound6(View view)
    {
        soundPool.play(sound6,1,1,0,0,1);
    }

    public void playSound7(View view)
    {
        soundPool.play(sound7,1,1,0,0,1);
    }

    public void playSound8(View view)
    {
        soundPool.play(sound8,1,1,0,0,1);
    }

    public void playSound9(View view)
    {
        soundPool.play(sound9,1,1,0,0,1);
    }

    public void onBackPressed()
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("Are you sure you want to leave?");
        alertDialog.setTitle("Closing activity");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.show();
    }
}