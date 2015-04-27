package com.livebythecode.dvn.eventhandling;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the button
        final Button clicked = (Button) findViewById(R.id.clickbutton);

        // add a click listener to the button
        clicked.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v){
                    // add the event
                    final TextView message = (TextView) findViewById(R.id.messsageTextView);
                    message.setText("Click!");
                }
            }
        );

        // add the long click listener
        clicked.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        // add the event
                        final TextView message = (TextView) findViewById(R.id.messsageTextView);
                        message.setText("Long Click!");

                        return true;
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
