package com.example.burnersclone_v1.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    private Button button;

    private Button hackeratibutton;

    private TextView textView;

    private TextView logomessage;

    private DisplayTextHandler displayTextHandler;

    private DisplayDisappearingText displayDisappearingText;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.myButton);
        textView = (TextView) findViewById(R.id.myTextView);
        hackeratibutton = (Button) findViewById(R.id.logoImageButton);
        logomessage = (TextView) findViewById(R.id.isAwesomeText);

        displayTextHandler = new DisplayTextHandler();

        displayDisappearingText = new DisplayDisappearingText();

        button.setOnClickListener(new OnClickListener() {



            @Override

            public void onClick(View view) {

                String displayText = displayTextHandler.getDisplayText();

                textView.setText(displayText);

            }



        });

        hackeratibutton.setOnClickListener(new OnClickListener() {



            @Override

            public void onClick(View view) {

                String displayText = displayDisappearingText.getDisplayText();

                logomessage.setText(displayText);



            }



        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }








}


