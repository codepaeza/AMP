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

public class Mtramo410Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo410);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb342 = (RadioButton) findViewById(R.id.ramo410_01);
        RadioButton rb343 = (RadioButton) findViewById(R.id.ramo410_02);
        RadioButton rb344 = (RadioButton) findViewById(R.id.ramo410_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo410_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb342.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb343.setTypeface(null, Typeface.NORMAL);
                rb344.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent342 = new Intent(Mtramo410Activity.this,
                        MainActivity.class);
                startActivity(intent342);


                Toast toast342 =
                        Toast.makeText(Mtramo410Activity.this, "Código Falla: RA85 - Criticidad: 1", Toast.LENGTH_LONG);
                toast342.show();
                break;

            case R.id.ramo410_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb343.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb342.setTypeface(null, Typeface.NORMAL);
                rb344.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent343 = new Intent(Mtramo410Activity.this,
                        MainActivity.class);
                startActivity(intent343);


                Toast toast343 =
                        Toast.makeText(Mtramo410Activity.this, "Código Falla: RA86 - Criticidad: 2", Toast.LENGTH_LONG);
                toast343.show();
                break;

            case R.id.ramo410_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb344.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb342.setTypeface(null, Typeface.NORMAL);
                rb343.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent344 = new Intent(Mtramo410Activity.this,
                        MainActivity.class);
                startActivity(intent344);


                Toast toast344 =
                        Toast.makeText(Mtramo410Activity.this, "Código Falla: RA87 - Criticidad: 3", Toast.LENGTH_LONG);
                toast344.show();
                break;


        }

    }
}