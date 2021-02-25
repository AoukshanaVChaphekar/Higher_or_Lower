package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r=new Random();
    Integer random=r.nextInt(20)+1;
    public void clickFunc(View v)
    {
        Log.i("Info","Button Pressed!");

        EditText guessText=(EditText)findViewById(R.id.guessText);
        Integer d=Integer.parseInt(guessText.getText().toString());
        if(d<1 || d>20)
        {
            String s="Enter number between specified range";
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();

        }
        else
        {
            if (d > random)
                Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
            else if (d < random)
                Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
            else {
                Toast.makeText(MainActivity.this, "That's Right! Play Again!!", Toast.LENGTH_SHORT).show();
                random = r.nextInt(20);
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}