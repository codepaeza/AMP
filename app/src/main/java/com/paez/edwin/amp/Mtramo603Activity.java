package com.paez.edwin.amp;

/**
 * Created by PC on 19/11/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Mtramo603Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo603);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb365 = (RadioButton) findViewById(R.id.ramo603_01);
        RadioButton rb366 = (RadioButton) findViewById(R.id.ramo603_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo603_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb365.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb366.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent365 = new Intent(Mtramo603Activity.this,
                        MainActivity.class);
                startActivity(intent365);


                Toast toast365 =
                        Toast.makeText(Mtramo603Activity.this, "Código Falla: RA125 - Criticidad: 2", Toast.LENGTH_LONG);
                toast365.show();
                break;

            case R.id.ramo603_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb366.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb365.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent366 = new Intent(Mtramo603Activity.this,
                        MainActivity.class);
                startActivity(intent366);


                Toast toast366 =
                        Toast.makeText(Mtramo603Activity.this, "Código Falla: RA126 - Criticidad: 3", Toast.LENGTH_LONG);
                toast366.show();
                break;
        }

    }
}