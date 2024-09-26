package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    private int counter;
    Textview counterTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        counter=10;
        TextView counterTextview = findViewById(R.id.textView_counter);
        counterTextview.setText(String.valueOf(counter));

    }

    public void knock(View view) {
        if(counter>0) {
            counter--;
            TextView counterTextview = findViewById(R.id.textView_counter);
            counterTextview.setText(String.valueOf(counter));

            if (counter == 0) {
                ImageView eggImageView = findViewById(R.id.imageview_egg);
                eggImageView.setImageResource(R.drawable.surprize);
            }
        }

    }

    public void reset(View view) {
        counter = 10;
        TextView counterTextview = findViewById(R.id.textView_counter);
        counterTextview.setText(String.valueOf(counter));
        ImageView eggImageView = findViewById(R.id.imageview_egg);
        eggImageView.setImageResource(R.drawable.greenegg2);
    }
}