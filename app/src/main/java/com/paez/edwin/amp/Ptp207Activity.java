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

public class Ptp207Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp207);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb482 = (RadioButton) findViewById(R.id.ptp19);
        RadioButton rb483 = (RadioButton) findViewById(R.id.ptp19_1);
        RadioButton rb484 = (RadioButton) findViewById(R.id.ptp20);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp19:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb482.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb483.setTypeface(null, Typeface.NORMAL);
                rb484.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent482 = new Intent(Ptp207Activity.this,
                        MainActivity.class);
                startActivity(intent482);


                Toast toast482 =
                        Toast.makeText(Ptp207Activity.this, "Código Falla: PTP19 - Criticidad: 1", Toast.LENGTH_LONG);
                toast482.show();
                break;

            case R.id.ptp19_1:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb483.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb482.setTypeface(null, Typeface.NORMAL);
                rb484.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent483 = new Intent(Ptp207Activity.this,
                        MainActivity.class);
                startActivity(intent483);


                Toast toast483 =
                        Toast.makeText(Ptp207Activity.this, "Código Falla: PTP19 - Criticidad: 1", Toast.LENGTH_LONG);
                toast483.show();
                break;

            case R.id.ptp20:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb484.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb482.setTypeface(null, Typeface.NORMAL);
                rb483.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent484 = new Intent(Ptp207Activity.this,
                        MainActivity.class);
                startActivity(intent484);


                Toast toast484 =
                        Toast.makeText(Ptp207Activity.this, "Código Falla: PTP20 - Criticidad: 2", Toast.LENGTH_LONG);
                toast484.show();
                break;
        }
    }
}
