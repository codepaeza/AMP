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

public class Ptp206Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp206);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb479 = (RadioButton) findViewById(R.id.ptp16);
        RadioButton rb480 = (RadioButton) findViewById(R.id.ptp17);
        RadioButton rb481 = (RadioButton) findViewById(R.id.ptp18);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp16:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb479.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb480.setTypeface(null, Typeface.NORMAL);
                rb481.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent479 = new Intent(Ptp206Activity.this,
                        MainActivity.class);
                startActivity(intent479);


                Toast toast479 =
                        Toast.makeText(Ptp206Activity.this, "Código Falla: PTP16 - Criticidad: 1", Toast.LENGTH_LONG);
                toast479.show();
                break;

            case R.id.ptp17:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb480.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb479.setTypeface(null, Typeface.NORMAL);
                rb481.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent480 = new Intent(Ptp206Activity.this,
                        MainActivity.class);
                startActivity(intent480);


                Toast toast480 =
                        Toast.makeText(Ptp206Activity.this, "Código Falla: PTP17 - Criticidad: 2", Toast.LENGTH_LONG);
                toast480.show();
                break;

            case R.id.ptp18:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb481.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb479.setTypeface(null, Typeface.NORMAL);
                rb480.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent481 = new Intent(Ptp206Activity.this,
                        MainActivity.class);
                startActivity(intent481);


                Toast toast481 =
                        Toast.makeText(Ptp206Activity.this, "Código Falla: PTP18 - Criticidad: 3", Toast.LENGTH_LONG);
                toast481.show();
                break;
        }
    }
}
