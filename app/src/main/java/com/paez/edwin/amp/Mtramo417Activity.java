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


public class Mtramo417Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo417);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb349 = (RadioButton) findViewById(R.id.ramo417_01);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo417_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb349.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent349 = new Intent(Mtramo417Activity.this,
                        MainActivity.class);
                startActivity(intent349);


                Toast toast349 =
                        Toast.makeText(Mtramo417Activity.this, "Código Falla: RA97 - Criticidad: 1", Toast.LENGTH_LONG);
                toast349.show();
                break;



        }

    }
}