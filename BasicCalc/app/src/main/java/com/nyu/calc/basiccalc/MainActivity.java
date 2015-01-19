package com.nyu.calc.basiccalc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    EditText Number1,Number2,Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1 = (EditText)findViewById(R.id.num1);
        Number2 = (EditText)findViewById(R.id.num2);
        Res=(EditText)findViewById(R.id.Res);

        Button div = (Button)findViewById(R.id.divBtn);

        div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (Number1.getText().toString().trim().length() == 0) {
                    Number1.requestFocus();
                    Number1.setError("Value Missing");
                } else if (Number2.getText().toString().trim().length() == 0) {
                    Number2.requestFocus();
                    Number2.setError("Value Missing");
                    }
                else {
                    int val1 = Integer.parseInt(Number1.getText().toString()) / Integer.parseInt(Number2.getText().toString());
                    Res.setText(Integer.toString(val1));
                    Toast.makeText(getApplicationContext(), "Division completed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    public void add(View view)
    {

        if (Number1.getText().toString().trim().length() == 0) {
            Number1.requestFocus();
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("BasicCalc");
            alertDialog.setMessage("Value missing");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Add code for the button here.
                }
            });

            alertDialog.show();
        } else if (Number2.getText().toString().trim().length() == 0) {
            Number2.requestFocus();
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("BasicCalc");
            alertDialog.setMessage("Value missing");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Add code for the button here.
                }
            });

            alertDialog.show();
        } else {
            int val = Integer.parseInt(Number1.getText().toString()) + Integer.parseInt(Number2.getText().toString());
            Res.setText(Integer.toString(val));
            Toast.makeText(getApplicationContext(), "Addition completed", Toast.LENGTH_SHORT).show();
        }
    }



    public void clear(View view)
    {

        Number1.setText("");
        Number2.getText().clear();
        Res.setText("");
        Toast.makeText(getApplicationContext(),"Cleared Text",Toast.LENGTH_SHORT).show();

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
