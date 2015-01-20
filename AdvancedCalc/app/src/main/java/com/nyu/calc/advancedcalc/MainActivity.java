package com.nyu.calc.advancedcalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, equal,clr;
    EditText res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        res = (EditText) findViewById(R.id.res);

    }

    public void display(View v)
    {
        String prev = res.getText().toString();
        res.setError(null);//clear previous error message
        Button btnvalue = (Button) findViewById(v.getId());
        String val=btnvalue.getText().toString();



        if (prev.trim().length() == 0 && (val== "+"||val=="/"||val=="*"))
            res.setError("Invalid input");
        else   if (prev.trim().length() == 0)
            res.setText(btnvalue.getText().toString());
        else
            res.setText(prev+btnvalue.getText().toString());
        if(val== "C")
            res.setText("");

    }
    public void delete(View v)
    {
        String str=res.getText().toString();
        if(str.length() == 0)
            res.setError("Deletion operation cannot be performed");
        else
            res.setText(str.substring(0,str.length()-1));
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
