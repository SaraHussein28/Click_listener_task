package com.example.clicklistenertask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView mText;
    ImageView mImage;
    Button mChangeTxt, mChangeImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setClicks ();
    }


    private void initViews() {
        mText = findViewById(R.id.text);
        mImage = findViewById(R.id.happy_img);
        mChangeTxt = findViewById(R.id.change_txt_btn);
        mChangeImage = findViewById(R.id.change_img_btn);
    }

    private void setClicks() {
    mChangeImage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        mImage.setImageResource(R.drawable.happy_2);
        }
    });

        mChangeTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText.setText("GOOD BYE");
            }
        });


    }

}