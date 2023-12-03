package edu.ciromelody.microfono;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import edu.ciromelody.microfono.registraaudio.RecordWaveTask;

public class MainActivity extends AppCompatActivity {
RecordWaveTask registraAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //startActivity(new Intent(MainActivity.this, AudioRecordActivity.class));
        registraAudio= RecordWaveTask.getInstance(this);
        registraAudio.launchTask();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        registraAudio.stopTask();


    }
}