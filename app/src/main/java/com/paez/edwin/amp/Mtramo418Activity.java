package com.paez.edwin.amp;

/**
 * Created by PC on 19/11/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Mtramo418Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo418);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb350 = (RadioButton) findViewById(R.id.ramo418_01);
        RadioButton rb351 = (RadioButton) findViewById(R.id.ramo418_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo418_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb350.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb351.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent350 = new Intent(Mtramo418Activity.this,
                        MainActivity.class);
                startActivity(intent350);


                Toast toast350 =
                        Toast.makeText(Mtramo418Activity.this, "Código Falla: RA101 - Criticidad: 2", Toast.LENGTH_LONG);
                toast350.show();
                break;

            case R.id.ramo418_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb351.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb350.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent351 = new Intent(Mtramo418Activity.this,
                        MainActivity.class);
                startActivity(intent351);


                Toast toast351 =
                        Toast.makeText(Mtramo418Activity.this, "Código Falla: RA102 - Criticidad: 3", Toast.LENGTH_LONG);
                toast351.show();
                break;

        }

    }
}