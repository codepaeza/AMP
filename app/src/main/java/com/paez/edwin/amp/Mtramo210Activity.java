package com.paez.edwin.amp;

/**
 * Created by PC on 20/08/2017.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo210Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo210);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb195 = (RadioButton) findViewById(R.id.ramo210_01);
        RadioButton rb196 = (RadioButton) findViewById(R.id.ramo210_02);
        RadioButton rb197 = (RadioButton) findViewById(R.id.ramo210_03);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo210_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb195.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb196.setTypeface(null, Typeface.NORMAL);
                rb197.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent195 = new Intent(Mtramo210Activity.this,
                        MainActivity.class);
                startActivity(intent195);


                Toast toast195 =
                        Toast.makeText(Mtramo210Activity.this, "Código Falla: RA40 - Criticidad: 1", Toast.LENGTH_LONG);
                toast195.show();
                break;

            case R.id.ramo210_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb196.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb195.setTypeface(null, Typeface.NORMAL);
                rb197.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent196 = new Intent(Mtramo210Activity.this,
                        MainActivity.class);
                startActivity(intent196);


                Toast toast196 =
                        Toast.makeText(Mtramo210Activity.this, "Código Falla: RA41 - Criticidad: 2", Toast.LENGTH_LONG);
                toast196.show();
                break;

            case R.id.ramo210_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb197.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb195.setTypeface(null, Typeface.NORMAL);
                rb196.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent197 = new Intent(Mtramo210Activity.this,
                        MainActivity.class);
                startActivity(intent197);


                Toast toast197 =
                        Toast.makeText(Mtramo210Activity.this, "Código Falla: RA42 - Criticidad: 3", Toast.LENGTH_LONG);
                toast197.show();
                break;



        }

    }
}