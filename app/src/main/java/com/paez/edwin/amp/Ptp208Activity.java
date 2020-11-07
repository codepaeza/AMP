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

public class Ptp208Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp208);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb485 = (RadioButton) findViewById(R.id.ptp22);
        RadioButton rb486 = (RadioButton) findViewById(R.id.ptp23);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp22:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb485.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb486.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent485 = new Intent(Ptp208Activity.this,
                        MainActivity.class);
                startActivity(intent485);


                Toast toast485 =
                        Toast.makeText(Ptp208Activity.this, "Código Falla: PTP22 - Criticidad: 1", Toast.LENGTH_LONG);
                toast485.show();
                break;

            case R.id.ptp23:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb486.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb485.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent486 = new Intent(Ptp208Activity.this,
                        MainActivity.class);
                startActivity(intent486);


                Toast toast486 =
                        Toast.makeText(Ptp208Activity.this, "Código Falla: PTP23 - Criticidad: 2", Toast.LENGTH_LONG);
                toast486.show();
                break;


        }
    }
}
