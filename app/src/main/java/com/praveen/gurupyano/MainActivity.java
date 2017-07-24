package com.praveen.gurupyano;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Thread1 t1 = new Thread1();
    private SoundPool soundPool;
    Button play, stop;
    EditText et;
    int a1, a1s, b1, c1, c1s, c2, d1, d1s, e1, f1, f1s, g1, g1s, sa, sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (Button) findViewById(R.id.play);
        stop = (Button) findViewById(R.id.stop);
        et = (EditText) findViewById(R.id.et);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }


        a1 = soundPool.load(this, R.raw.a1, 1);
        a1s = soundPool.load(this, R.raw.a1s, 1);
        b1 = soundPool.load(this, R.raw.b1, 1);
        c1 = soundPool.load(this, R.raw.c1, 1);
        c1s = soundPool.load(this, R.raw.c1s, 1);
        c2 = soundPool.load(this, R.raw.c2, 1);
        d1 = soundPool.load(this, R.raw.d1, 1);
        e1 = soundPool.load(this, R.raw.e1, 1);
        f1 = soundPool.load(this, R.raw.f1, 1);
        f1s = soundPool.load(this, R.raw.f1s, 1);
        g1 = soundPool.load(this, R.raw.g1, 1);
        g1s = soundPool.load(this, R.raw.g1s, 1);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = et.getText().toString();
                if (str.length() > 1) {
                    String[] spl = str.split("\\s");
                    for (int i = 0; i < spl.length; i++) {
                        if (spl[i].equals(".")) {
                            t1.start();
                        } else if (spl[i].equals("a1")) {
                            soundPool.play(a1, 1, 1, 14, 0, 1);

                        } else if (spl[i].equals("a1s")) {
                            soundPool.play(a1s, 1, 1, 12, 0, 1);

                        } else if (spl[i].equals("b1")) {
                            soundPool.play(b1, 1, 1, 11, 0, 1);
                        } else if (spl[i].equals("c1")) {
                            soundPool.play(c1, 1, 1, 10, 0, 1);
                        } else if (spl[i].equals("c1s")) {
                            soundPool.play(c1s, 1, 1, 9, 0, 1);
                        } else if (spl[i].equals("c2")) {
                            soundPool.play(c2, 1, 1, 0, 0, 1);
                        } else if (spl[i].equals("d1")) {
                            soundPool.play(d1, 1, 1, 0, 0, 1);
                        } else if (spl[i].equals("d1s")) {
                            soundPool.play(d1s, 1, 1, 0, 0, 1);
                        } else if (spl[i].equals("e1")) {
                            soundPool.play(e1, 1, 1, 0, 0, 1);
                        } else if (spl[i].equals("f1")) {
                            soundPool.play(f1, 1, 1, 0, 0, 1);
                        } else if (spl[i].equals("f1s")) {
                            soundPool.play(f1s, 1, 1, 0, 0, 1);
                        } else if (spl[i].equals("g1")) {
                            soundPool.play(g1, 1, 1, 0, 0, 1);
                        } else if (spl[i].equals("g1s")) {
                            soundPool.play(g1s, 1, 1, 0, 0, 1);
                        }
                    }
                }

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.stop(5);
            }
        });
    }
}

class Thread1 extends Thread {
    public void run() {

        Thread s = Thread.currentThread();
        //  System.out.println("Child :"+i);
        try {
            s.sleep(500);              // these are the three types of way i called sleep method
            //
        } catch (Exception e) {

        }

    }
}