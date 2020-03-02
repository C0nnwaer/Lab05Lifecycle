package com.chungbella.lab05_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.SharedPreferences;

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

        create += 1;

        if(!myPreferences.contains("create")){
            prefsEditor.putInt("create", 0);
        }
        prefsEditor.apply();

        total_create = myPreferences.getInt("create", -1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        start += 1;

        if(!myPreferences.contains("start")){
            prefsEditor.putInt("start", 0);
        }
        prefsEditor.apply();

        total_start = myPreferences.getInt("start", -1);
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume += 1;

        if(!myPreferences.contains("resume")){
            prefsEditor.putInt("resume", 0);
        }
        prefsEditor.apply();

        total_resume = myPreferences.getInt("resume", -1);
    }

    @Override
    protected void onPause() {
        super.onPause();
        pause += 1;

        if(!myPreferences.contains("pause")){
            prefsEditor.putInt("pause", 0);
        }
        prefsEditor.apply();

        total_pause = myPreferences.getInt("pause", -1);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stop += 1;

        if(!myPreferences.contains("stop")){
            prefsEditor.putInt("stop", 0);
        }
        prefsEditor.apply();

        total_stop = myPreferences.getInt("stop", -1);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart += 1;

        if(!myPreferences.contains("restart")){
            prefsEditor.putInt("restart", 0);
        }
        prefsEditor.apply();

        total_restart = myPreferences.getInt("restart", -1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy += 1;

        if(!myPreferences.contains("destroy")){
            prefsEditor.putInt("destroy", 0);
        }
        prefsEditor.apply();

        total_destroy = myPreferences.getInt("destroy", -1);
    }
}
