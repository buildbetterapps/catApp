package com.bba.catapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchText = findViewById(R.id.editText);
    }

    public void rabdomShow(View v) {
        Intent intent = new Intent(this, CatDetails.class);
        Random r = new Random();
        intent.putExtra("cat", r.nextInt(CatApplication.getCats().size()));
        startActivity(intent);
    }

    public void search(View v) {
        if (searchText.getText() == null || searchText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter text to search.", Toast.LENGTH_SHORT).show();
            return;
        }
        String search = searchText.getText().toString();
        Intent intent = new Intent(this, CatDetails.class);
        for (int i = 0; i < CatApplication.getCats().size(); i++) {
            if (CatApplication.getCats().get(i).toString().contains(search)) {
                // found
                intent.putExtra("cat", i);
                startActivity(intent);
                break;
            }
        }
        Toast.makeText(this, "No matching results found, Please search diffrent term.", Toast.LENGTH_SHORT).show();
    }
}
