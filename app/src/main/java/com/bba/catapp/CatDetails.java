package com.bba.catapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CatDetails extends AppCompatActivity {

    private TextView name, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_details);
        name = findViewById(R.id.textName);
        description = findViewById(R.id.textDescription);

        if (getIntent().getIntExtra("cat", -1) !=  -1) {
            int index = getIntent().getIntExtra("cat", 0);
            name.setText(CatApplication.getCats().get(index).getName());
            description.setText(CatApplication.getCats().get(index).getDescription());
        }
    }
}
