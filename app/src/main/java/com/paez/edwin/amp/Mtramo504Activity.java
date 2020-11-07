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


public class Mtramo504Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo504);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb355 = (RadioButton) findViewById(R.id.ramo504_01);
        RadioButton rb356 = (RadioButton) findViewById(R.id.ramo504_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo504_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb355.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb356.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent355 = new Intent(Mtramo504Activity.this,
                        MainActivity.class);
                startActivity(intent355);


                Toast toast355 =
                        Toast.makeText(Mtramo504Activity.this, "Código Falla: RA109 - Criticidad: 1", Toast.LENGTH_LONG);
                toast355.show();
                break;

            case R.id.ramo504_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb356.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb355.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent356 = new Intent(Mtramo504Activity.this,
                        MainActivity.class);
                startActivity(intent356);


                Toast toast356 =
                        Toast.makeText(Mtramo504Activity.this, "Código Falla: RA110 - Criticidad: 2", Toast.LENGTH_LONG);
                toast356.show();
                break;

        }

    }
}