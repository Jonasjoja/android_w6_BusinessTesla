package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Create handler
    public void goToPage2(View view)
    {
        //create intent
        //this for context, THIS class. Page2.class to tell android to create object of that class
        Intent intent = new Intent(this,Page2.class);
        startActivity(intent);

        //Code access to imageview
        ImageView imageView = findViewById(R.id.imageView);
        //Methods now with imageview. ...
    }

    //Lifecycle, can change what happens on state
    @Override
    protected void onResume() {
        super.onResume();
    }
}
