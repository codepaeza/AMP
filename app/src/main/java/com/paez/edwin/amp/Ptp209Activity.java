package com.paez.edwin.amp;

/**
 * Created by PC on 27/11/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp209Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp209);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb487 = (RadioButton) findViewById(R.id.ptp25);
        RadioButton rb488 = (RadioButton) findViewById(R.id.ptp26);
        RadioButton rb489 = (RadioButton) findViewById(R.id.ptp27);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp25:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb487.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb488.setTypeface(null, Typeface.NORMAL);
                rb489.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent487 = new Intent(Ptp209Activity.this,
                        MainActivity.class);
                startActivity(intent487);


                Toast toast487 =
                        Toast.makeText(Ptp209Activity.this, "Código Falla: PTP25 - Criticidad: 1", Toast.LENGTH_LONG);
                toast487.show();
                break;

            case R.id.ptp26:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb488.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb487.setTypeface(null, Typeface.NORMAL);
                rb489.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent488 = new Intent(Ptp209Activity.this,
                        MainActivity.class);
                startActivity(intent488);


                Toast toast488 =
                        Toast.makeText(Ptp209Activity.this, "Código Falla: PTP26 - Criticidad: 2", Toast.LENGTH_LONG);
                toast488.show();
                break;

            case R.id.ptp27:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb489.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb487.setTypeface(null, Typeface.NORMAL);
                rb488.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent489 = new Intent(Ptp209Activity.this,
                        MainActivity.class);
                startActivity(intent489);


                Toast toast489 =
                        Toast.makeText(Ptp209Activity.this, "Código Falla: PTP27 - Criticidad: 3", Toast.LENGTH_LONG);
                toast489.show();
                break;

        }
    }
}
