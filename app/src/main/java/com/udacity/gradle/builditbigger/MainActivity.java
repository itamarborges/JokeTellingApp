package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.jokeviewer.Viewer;


public class MainActivity extends AppCompatActivity implements EndpointsAsyncTask.Done {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tellJoke(View view) {

        new EndpointsAsyncTask().execute(this);

    }

    @Override
    public void onDone(String result) {
        Intent intent = new Intent(this, Viewer.class);

        intent.putExtra(Viewer.INTENT_KEY_JOKE, result);

        startActivity(intent);
    }
}
