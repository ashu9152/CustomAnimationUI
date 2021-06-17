package com.example.customanimationui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSet, btnTranslate, btnScale, btnRotate, btnAlpha, nextPage;
    ImageView image1;

    Animation animaTrans, animSet, animAlpha, animScale, animRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTranslate = (Button) findViewById(R.id.translate);
        btnSet = (Button)findViewById(R.id.set);
        btnAlpha =(Button) findViewById(R.id.alpha);
        btnScale =(Button) findViewById(R.id.scale);
        btnRotate =(Button) findViewById(R.id.rotate);
        nextPage = (Button) findViewById(R.id.nextPage) ;
        image1 = (ImageView) findViewById(R.id.img);

        btnTranslate.setOnClickListener(this);
        btnSet.setOnClickListener(this);
        btnAlpha.setOnClickListener(this);
        btnScale.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        nextPage.setOnClickListener(this);

        animaTrans = AnimationUtils.loadAnimation(this, R.anim.translate);
        animSet = AnimationUtils.loadAnimation(this, R.anim.set);
        animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        animScale = AnimationUtils.loadAnimation(this, R.anim.scale);
        animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

    }



    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.translate:
                image1.startAnimation(animaTrans);
                break;

            case R.id.set:
                image1.startAnimation(animSet);
                break;

            case R.id.alpha:
                image1.startAnimation(animAlpha);
                break;

            case R.id.scale:
                image1.startAnimation(animScale);
                break;

            case R.id.rotate:
                image1.startAnimation(animRotate);
                break;

            case R.id.nextPage:
                Intent send = new Intent(MainActivity.this, nextPage.class);
                startActivity(send);
        }
    }
}