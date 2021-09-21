package com.hienqp.rotate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewRotate;
    ImageView imageViewRotateBell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewRotateBell = (ImageView) findViewById(R.id.imageView_bell);
        imageViewRotate = (ImageView) findViewById(R.id.imageView_rotate);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);
        Animation animation1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate_shake);

        imageViewRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation);
            }
        });

        imageViewRotateBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation1);
            }
        });
    }
}