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

public class Ptp402Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp402);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb514 = (RadioButton) findViewById(R.id.ptp59);
        RadioButton rb515 = (RadioButton) findViewById(R.id.ptp60);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp59:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb514.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb515.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent514 = new Intent(Ptp402Activity.this,
                        MainActivity.class);
                startActivity(intent514);


                Toast toast514 =
                        Toast.makeText(Ptp402Activity.this, "Código Falla: PTP59 - Criticidad: 2", Toast.LENGTH_LONG);
                toast514.show();
                break;

            case R.id.ptp60:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb515.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb514.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent515 = new Intent(Ptp402Activity.this,
                        MainActivity.class);
                startActivity(intent515);


                Toast toast515 =
                        Toast.makeText(Ptp402Activity.this, "Código Falla: PTP60 - Criticidad: 3", Toast.LENGTH_LONG);
                toast515.show();
                break;

        }
    }
}
