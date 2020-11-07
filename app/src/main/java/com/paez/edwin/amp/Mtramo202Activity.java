package com.paez.edwin.amp;

/**
 * Created by PC on 11/07/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo202Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo202);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb175 = (RadioButton) findViewById(R.id.ramo202_01);
        RadioButton rb176 = (RadioButton) findViewById(R.id.ramo202_02);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo202_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb175.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb176.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent175 = new Intent(Mtramo202Activity.this,
                        MainActivity.class);
                startActivity(intent175);


                Toast toast175 =
                        Toast.makeText(Mtramo202Activity.this, "Código Falla: RA16 - Criticidad: 1", Toast.LENGTH_LONG);
                toast175.show();
                break;


            case R.id.ramo202_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb176.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb175.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent176 = new Intent(Mtramo202Activity.this,
                        MainActivity.class);
                startActivity(intent176);


                Toast toast176 =
                        Toast.makeText(Mtramo202Activity.this, "Código Falla: RA17 - Criticidad: 2", Toast.LENGTH_LONG);
                toast176.show();
                break;
        }

    }
}