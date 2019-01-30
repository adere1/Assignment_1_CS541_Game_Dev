package com.example.hello;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final TextView label1 = findViewById(R.id.textView);
        final TextView label2 = findViewById(R.id.textView1);
        final EditText text1 = findViewById(R.id.editText);
        final EditText text2 = findViewById(R.id.editText1);
        final TextView label3 = findViewById(R.id.label3);
        final TextView label4 = findViewById(R.id.label4);
        final Button button = findViewById(R.id.button);
        final Button button1 = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                label1.setVisibility(View.INVISIBLE);
                label2.setVisibility(View.INVISIBLE);
                text1.setVisibility(View.INVISIBLE);
                text2.setVisibility(View.INVISIBLE);
                label3.setVisibility(View.VISIBLE);
                label3.setText("Welcome  to  CS541  "+text1.getText());
                label4.setVisibility(View.VISIBLE);
                label4.setText(text1.getText()+"  Likes  "+text2.getText());
                button1.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                label1.setVisibility(View.VISIBLE);
                label2.setVisibility(View.VISIBLE);
                text1.setVisibility(View.VISIBLE);
                text1.setText("");
                text2.setVisibility(View.VISIBLE);
                text2.setText("");
                label3.setVisibility(View.INVISIBLE);
                label4.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);
            }
        });

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
