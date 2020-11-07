package com.paez.edwin.amp;

/**
 * Created by PC on 8/12/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp214Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp214);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb498 = (RadioButton) findViewById(R.id.ptp37);
        RadioButton rb499 = (RadioButton) findViewById(R.id.ptp38);
        RadioButton rb500 = (RadioButton) findViewById(R.id.ptp39);



        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp37:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb498.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb499.setTypeface(null, Typeface.NORMAL);
                rb500.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent498 = new Intent(Ptp214Activity.this,
                        MainActivity.class);
                startActivity(intent498);


                Toast toast498 =
                        Toast.makeText(Ptp214Activity.this, "Código Falla: PTP37 - Criticidad: 1", Toast.LENGTH_LONG);
                toast498.show();
                break;

            case R.id.ptp38:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb499.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb498.setTypeface(null, Typeface.NORMAL);
                rb500.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent499 = new Intent(Ptp214Activity.this,
                        MainActivity.class);
                startActivity(intent499);


                Toast toast499 =
                        Toast.makeText(Ptp214Activity.this, "Código Falla: PTP38 - Criticidad: 2", Toast.LENGTH_LONG);
                toast499.show();
                break;

            case R.id.ptp39:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb500.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb498.setTypeface(null, Typeface.NORMAL);
                rb499.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent500 = new Intent(Ptp214Activity.this,
                        MainActivity.class);
                startActivity(intent500);


                Toast toast500 =
                        Toast.makeText(Ptp214Activity.this, "Código Falla: PTP39 - Criticidad: 3", Toast.LENGTH_LONG);
                toast500.show();
                break;

        }
    }
}
