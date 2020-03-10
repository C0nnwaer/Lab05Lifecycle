package com.chungbella.lab05_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int create = 0;
    int total_create;
    int start = 0;
    int total_start;
    int resume = 0;
    int total_resume;
    int pause = 0;
    int total_pause;
    int stop = 0;
    int total_stop;
    int restart = 0;
    int total_restart;
    int destroy = 0;
    int total_destroy;

    SharedPreferences myPreferences;
    SharedPreferences.Editor prefsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myPreferences = getSharedPreferences("com.chungbella.lab05_lifecycle.sharedprefs",
                MODE_PRIVATE);
        prefsEditor = myPreferences.edit();

        create += 1;
        Log.i("create", "" + create);

        if(!myPreferences.contains("create")){
            prefsEditor.putInt("create", 0);
        }
        prefsEditor.apply();

        total_create = myPreferences.getInt("create", -1);
        prefsEditor.putInt("create", total_create + 1);
        prefsEditor.apply();

        Log.i("total_create", "" + total_create);
    }

    @Override
    protected void onStart() {
        super.onStart();
        start += 1;
        Log.i("start", "" + start);

        if(!myPreferences.contains("start")){
            prefsEditor.putInt("start", 0);
        }
        prefsEditor.apply();

        total_start = myPreferences.getInt("start", -1);
        prefsEditor.putInt("start", total_start + 1);
        prefsEditor.apply();

        Log.i("total_start", "" + total_start);
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume += 1;
        Log.i("resume", "" + resume);

        if(!myPreferences.contains("resume")){
            prefsEditor.putInt("resume", 0);
        }
        prefsEditor.apply();

        total_resume = myPreferences.getInt("resume", -1);
        prefsEditor.putInt("resume", total_resume + 1);
        prefsEditor.apply();

        Log.i("total_resume", "" + total_resume);
    }

    @Override
    protected void onPause() {
        super.onPause();
        pause += 1;
        Log.i("pause", "" + pause);

        if(!myPreferences.contains("pause")){
            prefsEditor.putInt("pause", 0);
        }
        prefsEditor.apply();

        total_pause = myPreferences.getInt("pause", -1);
        prefsEditor.putInt("pause", total_pause + 1);
        prefsEditor.apply();

        Log.i("total_pause", "" + pause);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stop += 1;
        Log.i("stop", "" + stop);

        if(!myPreferences.contains("stop")){
            prefsEditor.putInt("stop", 0);
        }
        prefsEditor.apply();

        total_stop = myPreferences.getInt("stop", -1);
        prefsEditor.putInt("stop", total_stop + 1);
        prefsEditor.apply();

        Log.i("total_stop", "" + total_stop);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart += 1;
        Log.i("restart", "" + restart);

        if(!myPreferences.contains("restart")){
            prefsEditor.putInt("restart", 0);
        }
        prefsEditor.apply();

        total_restart = myPreferences.getInt("restart", -1);
        prefsEditor.putInt("restart", total_restart + 1);
        prefsEditor.apply();

        Log.i("total_restart", "" + total_restart);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy += 1;
        Log.i("destroy", "" + destroy);

        if(!myPreferences.contains("destroy")){
            prefsEditor.putInt("destroy", 0);
        }
        prefsEditor.apply();

        total_destroy = myPreferences.getInt("destroy", -1);
        prefsEditor.putInt("destroy", total_destroy + 1);
        prefsEditor.apply();

        Log.i("total_destroy", "" + total_destroy);
    }
}
