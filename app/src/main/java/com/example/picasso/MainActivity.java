package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Pablo_picasso_1.jpg/800px-Pablo_picasso_1.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        Picasso.get()
                .load(imageUrl)
                .into(imageView, new com.squareup.picasso.Callback() {
                    @Override
                  public void onSuccess() {
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                    @Override
                    public void onError(Exception e) {
                        progressBar.setVisibility(View.VISIBLE);
            }
        });
    }


}