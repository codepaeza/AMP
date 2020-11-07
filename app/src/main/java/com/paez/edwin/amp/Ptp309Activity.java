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

public class Ptp309Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp309);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb509 = (RadioButton) findViewById(R.id.ptp49);
        RadioButton rb510 = (RadioButton) findViewById(R.id.ptp50);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp49:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb509.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb510.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent509 = new Intent(Ptp309Activity.this,
                        MainActivity.class);
                startActivity(intent509);


                Toast toast509 =
                        Toast.makeText(Ptp309Activity.this, "Código Falla: PTP49 - Criticidad: 1", Toast.LENGTH_LONG);
                toast509.show();
                break;

            case R.id.ptp50:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb510.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb509.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent510 = new Intent(Ptp309Activity.this,
                        MainActivity.class);
                startActivity(intent510);


                Toast toast510 =
                        Toast.makeText(Ptp309Activity.this, "Código Falla: PTP50 - Criticidad: 2", Toast.LENGTH_LONG);
                toast510.show();
                break;




        }
    }
}
