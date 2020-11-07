package com.paez.edwin.amp;

/**
 * Created by PC on 25/11/2017.
 */


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Mtramo703Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo703);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb378 = (RadioButton) findViewById(R.id.ramo703_01);
        RadioButton rb379 = (RadioButton) findViewById(R.id.ramo703_02);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo703_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb378.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb379.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent378 = new Intent(Mtramo703Activity.this,
                        MainActivity.class);
                startActivity(intent378);


                Toast toast378 =
                        Toast.makeText(Mtramo703Activity.this, "Código Falla: RA151 - Criticidad: 1", Toast.LENGTH_LONG);
                toast378.show();
                break;

            case R.id.ramo703_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb379.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb378.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent379 = new Intent(Mtramo703Activity.this,
                        MainActivity.class);
                startActivity(intent379);


                Toast toast379 =
                        Toast.makeText(Mtramo703Activity.this, "Código Falla: RA152 - Criticidad: 2", Toast.LENGTH_LONG);
                toast379.show();
                break;
        }

    }
}