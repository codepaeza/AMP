package com.paez.edwin.amp;

/**
 * Created by PC on 26/11/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp201Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp201);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb474 = (RadioButton) findViewById(R.id.ptp10);
        RadioButton rb475 = (RadioButton) findViewById(R.id.ptp11);
        RadioButton rb476 = (RadioButton) findViewById(R.id.ptp12);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp10:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb474.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb475.setTypeface(null, Typeface.NORMAL);
                rb476.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent474 = new Intent(Ptp201Activity.this,
                        MainActivity.class);
                startActivity(intent474);


                Toast toast474 =
                        Toast.makeText(Ptp201Activity.this, "Código Falla: PTP10 - Criticidad: 1", Toast.LENGTH_LONG);
                toast474.show();
                break;

            case R.id.ptp11:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb475.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb474.setTypeface(null, Typeface.NORMAL);
                rb476.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent475 = new Intent(Ptp201Activity.this,
                        MainActivity.class);
                startActivity(intent475);


                Toast toast475 =
                        Toast.makeText(Ptp201Activity.this, "Código Falla: PTP11 - Criticidad: 2", Toast.LENGTH_LONG);
                toast475.show();
                break;

            case R.id.ptp12:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb476.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb474.setTypeface(null, Typeface.NORMAL);
                rb475.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent476 = new Intent(Ptp201Activity.this,
                        MainActivity.class);
                startActivity(intent476);


                Toast toast476 =
                        Toast.makeText(Ptp201Activity.this, "Código Falla: PTP12 - Criticidad: 3", Toast.LENGTH_LONG);
                toast476.show();
                break;
        }
    }
}
