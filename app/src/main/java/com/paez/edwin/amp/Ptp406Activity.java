package com.paez.edwin.amp;

/**
 * Created by PC on 25/12/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp406Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp406);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb520 = (RadioButton) findViewById(R.id.ptp70);
        RadioButton rb521 = (RadioButton) findViewById(R.id.ptp71);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp70:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb520.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb521.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent520 = new Intent(Ptp406Activity.this,
                        MainActivity.class);
                startActivity(intent520);


                Toast toast520 =
                        Toast.makeText(Ptp406Activity.this, "Código Falla: PTP70 - Criticidad: 1", Toast.LENGTH_LONG);
                toast520.show();
                break;

            case R.id.ptp71:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb521.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb520.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent521 = new Intent(Ptp406Activity.this,
                        MainActivity.class);
                startActivity(intent521);


                Toast toast521 =
                        Toast.makeText(Ptp406Activity.this, "Código Falla: PTP71 - Criticidad: 2", Toast.LENGTH_LONG);
                toast521.show();
                break;



        }
    }
}
