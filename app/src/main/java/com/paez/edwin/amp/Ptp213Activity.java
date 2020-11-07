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

public class Ptp213Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp213);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb495 = (RadioButton) findViewById(R.id.ptp34);
        RadioButton rb496 = (RadioButton) findViewById(R.id.ptp35);
        RadioButton rb497 = (RadioButton) findViewById(R.id.ptp36);



        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp34:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb495.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb496.setTypeface(null, Typeface.NORMAL);
                rb497.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent495 = new Intent(Ptp213Activity.this,
                        MainActivity.class);
                startActivity(intent495);


                Toast toast495 =
                        Toast.makeText(Ptp213Activity.this, "Código Falla: PTP34 - Criticidad: 1", Toast.LENGTH_LONG);
                toast495.show();
                break;

            case R.id.ptp35:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb496.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb495.setTypeface(null, Typeface.NORMAL);
                rb497.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent496 = new Intent(Ptp213Activity.this,
                        MainActivity.class);
                startActivity(intent496);


                Toast toast496 =
                        Toast.makeText(Ptp213Activity.this, "Código Falla: PTP35 - Criticidad: 2", Toast.LENGTH_LONG);
                toast496.show();
                break;

            case R.id.ptp36:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb497.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb495.setTypeface(null, Typeface.NORMAL);
                rb496.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent497 = new Intent(Ptp213Activity.this,
                        MainActivity.class);
                startActivity(intent497);


                Toast toast497 =
                        Toast.makeText(Ptp213Activity.this, "Código Falla: PTP36 - Criticidad: 3", Toast.LENGTH_LONG);
                toast497.show();
                break;

        }
    }
}
