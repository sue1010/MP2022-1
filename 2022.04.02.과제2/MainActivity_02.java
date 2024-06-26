package com.example.samplescrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    int imageIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable)  res.getDrawable(R.drawable.image01);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
    public void onButton1Clicked(View v){
        changeImage();
    }

    private void changeImage(){
        Resources res = getResources();
        int bitmapWidth = bitmap.getIntrinsicWidth();;
        int bitmapHeight = bitmap.getIntrinsicHeight();

        if(imageIndex == 0){
            bitmap = (BitmapDrawable)  res.getDrawable(R.drawable.image01);
            imageIndex = 1;
        } else if(imageIndex == 1){
            bitmap = (BitmapDrawable)  res.getDrawable(R.drawable.image02);
            imageIndex = 0;
        }
        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

}