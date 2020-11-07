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

public class Ptp310Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp310);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb511 = (RadioButton) findViewById(R.id.ptp52);
        RadioButton rb512 = (RadioButton) findViewById(R.id.ptp53);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp52:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb511.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb512.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent511 = new Intent(Ptp310Activity.this,
                        MainActivity.class);
                startActivity(intent511);


                Toast toast511 =
                        Toast.makeText(Ptp310Activity.this, "Código Falla: PTP52 - Criticidad: 1", Toast.LENGTH_LONG);
                toast511.show();
                break;

            case R.id.ptp53:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb512.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb511.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent512 = new Intent(Ptp310Activity.this,
                        MainActivity.class);
                startActivity(intent512);


                Toast toast512 =
                        Toast.makeText(Ptp310Activity.this, "Código Falla: PTP53 - Criticidad: 2", Toast.LENGTH_LONG);
                toast512.show();
                break;
        }
    }
}
