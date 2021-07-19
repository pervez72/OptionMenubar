package com.example.optionmenubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menulayout,menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.settingId){

            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();

        }

        if(item.getItemId()==R.id.About_usId){

            Toast.makeText(MainActivity.this, "AboutUs", Toast.LENGTH_SHORT).show();
        }
    if (item.getItemId()==R.id.FeedbackId){

            Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();

        }

        if(item.getItemId()==R.id.ShareId){

            Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);

    }
}