package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ballImage;
    Button askButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ballImage = (ImageView) findViewById(R.id.ballImage);
        this.askButton = (Button) findViewById(R.id.askButton);

        this.ballImage.setImageResource(R.drawable.ball5);

        this.askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int upperLimit = 5;
                setBallImageForIndex(ballImage,rand.nextInt(upperLimit));
            }
        });

    }

    private void setBallImageForIndex(ImageView ball, int index) {
        if(index == 0){
            ball.setImageResource(R.drawable.ball1);
        }else if(index == 1){
            ball.setImageResource(R.drawable.ball2);
        }else if(index == 2){
            ball.setImageResource(R.drawable.ball3);
        }else if(index == 3){
            ball.setImageResource(R.drawable.ball4);
        }else if(index == 4){
            ball.setImageResource(R.drawable.ball5);
        }
    }
}
