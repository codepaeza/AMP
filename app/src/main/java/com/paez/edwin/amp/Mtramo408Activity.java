
package com.paez.edwin.amp;

/**
 * Created by PC on 18/11/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo408Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo408);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb339 = (RadioButton) findViewById(R.id.ramo408_01);
        RadioButton rb340 = (RadioButton) findViewById(R.id.ramo408_02);
        RadioButton rb341 = (RadioButton) findViewById(R.id.ramo408_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo408_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb339.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb340.setTypeface(null, Typeface.NORMAL);
                rb341.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent339 = new Intent(Mtramo408Activity.this,
                        MainActivity.class);
                startActivity(intent339);


                Toast toast339 =
                        Toast.makeText(Mtramo408Activity.this, "Código Falla: RA82 - Criticidad: 1", Toast.LENGTH_LONG);
                toast339.show();
                break;

            case R.id.ramo408_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb340.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb339.setTypeface(null, Typeface.NORMAL);
                rb341.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent340 = new Intent(Mtramo408Activity.this,
                        MainActivity.class);
                startActivity(intent340);


                Toast toast340 =
                        Toast.makeText(Mtramo408Activity.this, "Código Falla: RA83 - Criticidad: 2", Toast.LENGTH_LONG);
                toast340.show();
                break;

            case R.id.ramo408_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb341.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb339.setTypeface(null, Typeface.NORMAL);
                rb340.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent341 = new Intent(Mtramo408Activity.this,
                        MainActivity.class);
                startActivity(intent341);


                Toast toast341 =
                        Toast.makeText(Mtramo408Activity.this, "Código Falla: RA83 - Criticidad: 2", Toast.LENGTH_LONG);
                toast341.show();
                break;


        }

    }
}