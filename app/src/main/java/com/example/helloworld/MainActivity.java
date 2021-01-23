package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //User can tap a button to change the text color of the label.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.pink));
            }
        });
        // background color changes
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.teal_200));
            }
        });

        //button to change the text in the hello text
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android Is Awesome!");
            }
        });


            //tap the  background and reset to Def
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //reset to hello from youssef @id/text
                ((TextView) findViewById(R.id.text)).setText("Hello from Youssef!");
                    // reset to text color - black -- @id/text
                textView.setTextColor(getResources().getColor(R.color.black));
                    // reset the background color to R.color.myPurple
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.myPurple));
            }
        });
        findViewById(R.id.changeCustomText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //user can enter text using keyboard
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (userEnteredText.isEmpty()){
                    textView.setText("Enter Your Own Text");
                } else {
                    textView.setText(userEnteredText);
                }

            }
        });



    }
}