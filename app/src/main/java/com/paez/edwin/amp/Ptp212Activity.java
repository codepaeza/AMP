package com.paez.edwin.amp;

/**
 * Created by PC on 3/12/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp212Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp212);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb493 = (RadioButton) findViewById(R.id.ptp31);
        RadioButton rb494 = (RadioButton) findViewById(R.id.ptp32);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp31:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb493.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb494.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent493 = new Intent(Ptp212Activity.this,
                        MainActivity.class);
                startActivity(intent493);


                Toast toast493 =
                        Toast.makeText(Ptp212Activity.this, "Código Falla: PTP31 - Criticidad: 1", Toast.LENGTH_LONG);
                toast493.show();
                break;

            case R.id.ptp32:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb494.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb493.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent494 = new Intent(Ptp212Activity.this,
                        MainActivity.class);
                startActivity(intent494);


                Toast toast494 =
                        Toast.makeText(Ptp212Activity.this, "Código Falla: PTP32 - Criticidad: 2", Toast.LENGTH_LONG);
                toast494.show();
                break;


        }
    }
}
