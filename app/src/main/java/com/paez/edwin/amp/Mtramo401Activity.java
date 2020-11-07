package com.paez.edwin.amp;

/**
 * Created by PC on 18/11/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo401Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo401);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb326 = (RadioButton) findViewById(R.id.ramo401_01);
        RadioButton rb327 = (RadioButton) findViewById(R.id.ramo401_02);
        RadioButton rb328 = (RadioButton) findViewById(R.id.ramo401_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo401_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb326.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb327.setTypeface(null, Typeface.NORMAL);
                rb328.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent326 = new Intent(Mtramo401Activity.this,
                        MainActivity.class);
                startActivity(intent326);


                Toast toast326 =
                        Toast.makeText(Mtramo401Activity.this, "Código Falla: RA70 - Criticidad: 1", Toast.LENGTH_LONG);
                toast326.show();
                break;

            case R.id.ramo401_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb327.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb326.setTypeface(null, Typeface.NORMAL);
                rb328.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent327 = new Intent(Mtramo401Activity.this,
                        MainActivity.class);
                startActivity(intent327);


                Toast toast327 =
                        Toast.makeText(Mtramo401Activity.this, "Código Falla: RA70 - Criticidad: 1", Toast.LENGTH_LONG);
                toast327.show();
                break;

            case R.id.ramo401_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb328.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb326.setTypeface(null, Typeface.NORMAL);
                rb327.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent328 = new Intent(Mtramo401Activity.this,
                        MainActivity.class);
                startActivity(intent328);


                Toast toast328 =
                        Toast.makeText(Mtramo401Activity.this, "Código Falla: RA71 - Criticidad: 2", Toast.LENGTH_LONG);
                toast328.show();
                break;

        }

    }
}