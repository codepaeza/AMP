package com.paez.edwin.amp;

/**
 * Created by PC on 10/07/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo201Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo201);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb172 = (RadioButton) findViewById(R.id.ramo201_01);
        RadioButton rb173 = (RadioButton) findViewById(R.id.ramo201_02);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo201_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb172.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb173.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent172 = new Intent(Mtramo201Activity.this,
                        MainActivity.class);
                startActivity(intent172);


                Toast toast171 =
                        Toast.makeText(Mtramo201Activity.this, "Código Falla: RA10 - Criticidad: 1", Toast.LENGTH_LONG);
                toast171.show();
                break;


            case R.id.ramo201_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb173.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb172.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent173 = new Intent(Mtramo201Activity.this,
                        MainActivity.class);
                startActivity(intent173);


                Toast toast173 =
                        Toast.makeText(Mtramo201Activity.this, "Código Falla: RA11 - Criticidad: 2", Toast.LENGTH_LONG);
                toast173.show();
                break;


        }

    }
}
