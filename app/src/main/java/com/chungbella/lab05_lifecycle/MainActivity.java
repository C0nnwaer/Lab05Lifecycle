package com.chungbella.lab05_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int create = 0;
    TextView create_run;
    int total_create;
    TextView create_total;
    int start = 0;
    TextView start_run;
    int total_start;
    TextView start_total;
    int resume = 0;
    TextView resume_run;
    int total_resume;
    TextView resume_total;
    int pause = 0;
    TextView pause_run;
    int total_pause;
    TextView pause_total;
    int stop = 0;
    TextView stop_run;
    int total_stop;
    TextView stop_total;
    int restart = 0;
    TextView restart_run;
    int total_restart;
    TextView restart_total;
    int destroy = 0;
    TextView destroy_run;
    int total_destroy;
    TextView destroy_total;

    SharedPreferences myPreferences;
    SharedPreferences.Editor prefsEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create_run = findViewById(R.id.create_run);
        create_total = findViewById(R.id.create_total);
        create_total.setText("total count: " + total_create);
        resume_run = findViewById(R.id.resume_run);
        resume_total = findViewById(R.id.resume_total);
        resume_total.setText("total count: " + total_resume);
        pause_run = findViewById(R.id.pause_run);
        pause_total = findViewById(R.id.pause_total);
        pause_total.setText("total count: " + total_pause);
        stop_run = findViewById(R.id.stop_run);
        stop_total = findViewById(R.id.stop_total);
        stop_total.setText("total count: " + total_stop);
        restart_run = findViewById(R.id.restart_run);
        restart_total = findViewById(R.id.restart_total);
        restart_total.setText("total count: " + total_restart);
        start_run = findViewById(R.id.start_run);
        start_total = findViewById(R.id.start_total);
        start_total.setText("total count: " + total_start);
        destroy_run = findViewById(R.id.destroy_run);
        destroy_total = findViewById(R.id.destroy_total);
        destroy_total.setText("total count: " + total_destroy);

        myPreferences = getSharedPreferences("com.chungbella.lab05_lifecycle.sharedprefs",
                MODE_PRIVATE);
        prefsEditor = myPreferences.edit();

        create += 1;
        create_run.setText("run count: " + create);
        Log.i("create", "" + create);

        if(!myPreferences.contains("create")){
            prefsEditor.putInt("create", 0);
        }
        prefsEditor.apply();

        total_create = myPreferences.getInt("create", -1);
        prefsEditor.putInt("create", total_create + 1);
        prefsEditor.apply();

        create_total.setText("total count: " + total_create);
        Log.i("total_create", "" + total_create);
    }

    @Override
    protected void onStart() {
        super.onStart();
        start += 1;
        start_run.setText("run count: " + start);
        Log.i("start", "" + start);

        if(!myPreferences.contains("start")){
            prefsEditor.putInt("start", 0);
        }
        prefsEditor.apply();

        total_start = myPreferences.getInt("start", -1);
        prefsEditor.putInt("start", total_start + 1);
        prefsEditor.apply();

        start_total.setText("total count: " + total_start);
        Log.i("total_start", "" + total_start);
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume += 1;
        resume_run.setText("run count: " + resume);
        Log.i("resume", "" + resume);

        if(!myPreferences.contains("resume")){
            prefsEditor.putInt("resume", 0);
        }
        prefsEditor.apply();

        total_resume = myPreferences.getInt("resume", -1);
        prefsEditor.putInt("resume", total_resume + 1);
        prefsEditor.apply();

        resume_total.setText("total count: " + total_resume);
        Log.i("total_resume", "" + total_resume);
    }

    @Override
    protected void onPause() {
        super.onPause();
        pause += 1;
        pause_run.setText("run count: " + pause);
        Log.i("pause", "" + pause);

        if(!myPreferences.contains("pause")){
            prefsEditor.putInt("pause", 0);
        }
        prefsEditor.apply();

        total_pause = myPreferences.getInt("pause", -1);
        prefsEditor.putInt("pause", total_pause + 1);
        prefsEditor.apply();

        pause_total.setText("total count: " + total_pause);
        Log.i("total_pause", "" + pause);
    }

    @Override
    protected void onStop() {
        super.onStop();
        stop += 1;
        stop_run.setText("run count: " + stop);
        Log.i("stop", "" + stop);

        if(!myPreferences.contains("stop")){
            prefsEditor.putInt("stop", 0);
        }
        prefsEditor.apply();

        total_stop = myPreferences.getInt("stop", -1);
        prefsEditor.putInt("stop", total_stop + 1);
        prefsEditor.apply();

        stop_total.setText("total count: " + total_stop);
        Log.i("total_stop", "" + total_stop);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart += 1;
        restart_run.setText("run count: " + restart);
        Log.i("restart", "" + restart);

        if(!myPreferences.contains("restart")){
            prefsEditor.putInt("restart", 0);
        }
        prefsEditor.apply();

        total_restart = myPreferences.getInt("restart", -1);
        prefsEditor.putInt("restart", total_restart + 1);
        prefsEditor.apply();

        restart_total.setText("total count: " + total_restart);
        Log.i("total_restart", "" + total_restart);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        destroy += 1;
        destroy_run.setText("run count: " + destroy);
        Log.i("destroy", "" + destroy);

        if(!myPreferences.contains("destroy")){
            prefsEditor.putInt("destroy", 0);
        }
        prefsEditor.apply();

        total_destroy = myPreferences.getInt("destroy", -1);
        prefsEditor.putInt("destroy", total_destroy + 1);
        prefsEditor.apply();

        destroy_total.setText("total count: " + total_destroy);
        Log.i("total_destroy", "" + total_destroy);
    }
}
