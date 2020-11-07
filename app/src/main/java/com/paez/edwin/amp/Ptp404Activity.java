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

public class Ptp404Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp404);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb517 = (RadioButton) findViewById(R.id.ptp64);
        RadioButton rb518 = (RadioButton) findViewById(R.id.ptp66);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp64:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb517.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb518.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent517 = new Intent(Ptp404Activity.this,
                        MainActivity.class);
                startActivity(intent517);


                Toast toast517 =
                        Toast.makeText(Ptp404Activity.this, "Código Falla: PTP64 - Criticidad: 1", Toast.LENGTH_LONG);
                toast517.show();
                break;

            case R.id.ptp66:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb518.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb517.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent518 = new Intent(Ptp404Activity.this,
                        MainActivity.class);
                startActivity(intent518);


                Toast toast518 =
                        Toast.makeText(Ptp404Activity.this, "Código Falla: PTP66 - Criticidad: 3", Toast.LENGTH_LONG);
                toast518.show();
                break;


        }
    }
}
