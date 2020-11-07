package com.paez.edwin.amp;

/**
 * Created by PC on 23/12/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp307Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp307);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb504 = (RadioButton) findViewById(R.id.ptp43);
        RadioButton rb505 = (RadioButton) findViewById(R.id.ptp44);




        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp43:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb504.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb505.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent504 = new Intent(Ptp307Activity.this,
                        MainActivity.class);
                startActivity(intent504);


                Toast toast504 =
                        Toast.makeText(Ptp307Activity.this, "Código Falla: PTP43 - Criticidad: 1", Toast.LENGTH_LONG);
                toast504.show();
                break;

            case R.id.ptp44:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb505.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb504.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent505 = new Intent(Ptp307Activity.this,
                        MainActivity.class);
                startActivity(intent505);


                Toast toast505 =
                        Toast.makeText(Ptp307Activity.this, "Código Falla: PTP43 - Criticidad: 1", Toast.LENGTH_LONG);
                toast505.show();
                break;


        }
    }
}
