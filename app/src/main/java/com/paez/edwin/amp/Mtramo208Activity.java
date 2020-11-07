package com.paez.edwin.amp;

/**
 * Created by PC on 20/07/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo208Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo208);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb188 = (RadioButton) findViewById(R.id.ramo208_01);
        RadioButton rb189 = (RadioButton) findViewById(R.id.ramo208_02);
        RadioButton rb190 = (RadioButton) findViewById(R.id.ramo208_03);
        RadioButton rb191 = (RadioButton) findViewById(R.id.ramo208_04);
        RadioButton rb192 = (RadioButton) findViewById(R.id.ramo208_05);
        RadioButton rb193 = (RadioButton) findViewById(R.id.ramo208_06);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo208_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb188.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb189.setTypeface(null, Typeface.NORMAL);
                rb190.setTypeface(null, Typeface.NORMAL);
                rb191.setTypeface(null, Typeface.NORMAL);
                rb192.setTypeface(null, Typeface.NORMAL);
                rb193.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent188 = new Intent(Mtramo208Activity.this,
                        MainActivity.class);
                startActivity(intent188);


                Toast toast188 =
                        Toast.makeText(Mtramo208Activity.this, "Código Falla: RA34 - Criticidad: 1", Toast.LENGTH_LONG);
                toast188.show();
                break;

            case R.id.ramo208_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb189.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb188.setTypeface(null, Typeface.NORMAL);
                rb190.setTypeface(null, Typeface.NORMAL);
                rb191.setTypeface(null, Typeface.NORMAL);
                rb192.setTypeface(null, Typeface.NORMAL);
                rb193.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent189 = new Intent(Mtramo208Activity.this,
                        MainActivity.class);
                startActivity(intent189);


                Toast toast189 =
                        Toast.makeText(Mtramo208Activity.this, "Código Falla: RA34 - Criticidad: 1", Toast.LENGTH_LONG);
                toast189.show();
                break;

            case R.id.ramo208_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb190.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb188.setTypeface(null, Typeface.NORMAL);
                rb189.setTypeface(null, Typeface.NORMAL);
                rb191.setTypeface(null, Typeface.NORMAL);
                rb192.setTypeface(null, Typeface.NORMAL);
                rb193.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent190 = new Intent(Mtramo208Activity.this,
                        MainActivity.class);
                startActivity(intent190);


                Toast toast190 =
                        Toast.makeText(Mtramo208Activity.this, "Código Falla: RA34 - Criticidad: 1", Toast.LENGTH_LONG);
                toast190.show();
                break;

            case R.id.ramo208_04:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb191.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb188.setTypeface(null, Typeface.NORMAL);
                rb189.setTypeface(null, Typeface.NORMAL);
                rb190.setTypeface(null, Typeface.NORMAL);
                rb192.setTypeface(null, Typeface.NORMAL);
                rb193.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent191 = new Intent(Mtramo208Activity.this,
                        MainActivity.class);
                startActivity(intent191);


                Toast toast191 =
                        Toast.makeText(Mtramo208Activity.this, "Código Falla: RA34 - Criticidad: 1", Toast.LENGTH_LONG);
                toast191.show();
                break;

            case R.id.ramo208_05:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb192.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb188.setTypeface(null, Typeface.NORMAL);
                rb189.setTypeface(null, Typeface.NORMAL);
                rb190.setTypeface(null, Typeface.NORMAL);
                rb191.setTypeface(null, Typeface.NORMAL);
                rb193.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent192 = new Intent(Mtramo208Activity.this,
                        MainActivity.class);
                startActivity(intent192);


                Toast toast192 =
                        Toast.makeText(Mtramo208Activity.this, "Código Falla: RA35 - Criticidad: 2", Toast.LENGTH_LONG);
                toast192.show();
                break;

            case R.id.ramo208_06:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb193.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb188.setTypeface(null, Typeface.NORMAL);
                rb189.setTypeface(null, Typeface.NORMAL);
                rb190.setTypeface(null, Typeface.NORMAL);
                rb191.setTypeface(null, Typeface.NORMAL);
                rb192.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent193 = new Intent(Mtramo208Activity.this,
                        MainActivity.class);
                startActivity(intent193);


                Toast toast193 =
                        Toast.makeText(Mtramo208Activity.this, "Código Falla: RA36 - Criticidad: 3", Toast.LENGTH_LONG);
                toast193.show();
                break;


        }

    }
}