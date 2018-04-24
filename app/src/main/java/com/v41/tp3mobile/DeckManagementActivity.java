package com.v41.tp3mobile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jo on 2018-04-24.
 */

public class DeckManagementActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private List<ImageView> imageViews;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck_management);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView4);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView2);

        imageViews = new LinkedList<>();
        imageViews.add(imageView);
        imageViews.add(imageView2);
        imageViews.add(imageView3);
        imageViews.add(imageView4);
        imageViews.add(imageView5);
    }

    public void onClickImageView(View view) {
        if (view.getId() == R.id.imageView) {
            Toast.makeText(this, "imageView 1 pressed", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.imageView2)
        {
            Toast.makeText(this, "imageView 2 pressed", Toast.LENGTH_SHORT).show();
        }
    }
}
