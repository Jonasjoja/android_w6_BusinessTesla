package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void goToPage3(View view)
    {
        //Create intent this, object of page3
        Intent intent = new Intent(this,Page3.class);

        //Starting activity
        startActivity(intent);

    }
}
