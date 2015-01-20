package com.nyu.calc.advancedcalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, equal,clr;
    EditText res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.plus);
        sub = (Button) findViewById(R.id.minus);
        mul = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.div);
        clr = (Button) findViewById(R.id.clr);
        equal = (Button) findViewById(R.id.equal);
        */
        res = (EditText) findViewById(R.id.res);

    }

    public void display(View v)
    {
        String prev = res.getText().toString();
        switch(v.getId())
        {
            case R.id.one:
                if (prev.trim().length() == 0)
                    res.setText("1");
                else
                    res.setText(prev+"1");
                break;
            case R.id.two:
                if (prev.trim().length() == 0)
                    res.setText("2");
                else
                    res.setText(prev+"2");

                break;
            case R.id.three:
                if (prev.trim().length() == 0)
                    res.setText("3");
                else
                    res.setText(prev+"3");

                break;
            case R.id.four:
                if (prev.trim().length() == 0)
                    res.setText("4");
                else
                    res.setText(prev+"4");

                break;
            case R.id.five:
                if (prev.trim().length() == 0)
                    res.setText("5");
                else
                    res.setText(prev+"5");

                break;
            case R.id.six:
                if (prev.trim().length() == 0)
                    res.setText("6");
                else
                    res.setText(prev+"6");

                break;
            case R.id.seven:
                if (prev.trim().length() == 0)
                    res.setText("7");
                else
                    res.setText(prev+"7");

                break;
            case R.id.eight:
                if (prev.trim().length() == 0)
                    res.setText("8");
                else
                    res.setText(prev+"8");

                break;
            case R.id.nine:
                if (prev.trim().length() == 0)
                    res.setText("9");
                else
                    res.setText(prev+"9");

                break;
            case R.id.zero:
                if (prev.trim().length() == 0)
                    res.setText("0");
                else
                    res.setText(prev+"0");

                break;
            case R.id.clr:
                res.setText("");

                break;
            case R.id.plus:
                if (prev.trim().length() == 0)
                    res.setError("Operation not allowed");
                else
                    res.setText(prev+"+");

                break;
            case R.id.minus:
                if (prev.trim().length() == 0)
                    res.setText("-");
                else
                    res.setText(prev+"-");

                break;
            case R.id.multiply:
                if (prev.trim().length() == 0)
                    res.setError("Operation not allowed");
                else
                    res.setText(prev+"*");

                break;
            case R.id.div:
                if (prev.trim().length() == 0)
                    res.setError("Operation not allowed");
                else
                    res.setText(prev+"/");

                break;

            default:
                break;
        }


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
