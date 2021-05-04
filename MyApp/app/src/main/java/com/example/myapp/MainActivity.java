package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener((view) -> {
            TextView textView = findViewById(R.id.text_value);
            String textString = textView.getText().toString();
            int value = Integer.parseInt(textString);
            int newValue = MyMethod.doubleValue(value);

            textView.setText(Integer.toString(newValue));
            System.out.println(MyMethod.doubleValue(value));


            Snackbar.make(view, String.format("Minha vida: " + newValue), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        });

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView textView = findViewById(R.id.text_value);
//                String textString = textView.getText().toString();
//                int value = Integer.parseInt(textString);
//                int newValue = MyMethod.doubleValue(value);
//
//                textView.setText(Integer.toString(newValue));
//                System.out.println(MyMethod.doubleValue(value));
//
//
//                Snackbar.make(view, String.format("Minha vida: " + newValue), Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//            }
//        });
    }
}