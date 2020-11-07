package com.paez.edwin.amp;

/**
 * Created by PC on 20/08/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo211Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo211);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb198 = (RadioButton) findViewById(R.id.ramo211_01);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo211_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb198.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent198 = new Intent(Mtramo211Activity.this,
                        MainActivity.class);
                startActivity(intent198);


                Toast toast198 =
                        Toast.makeText(Mtramo211Activity.this, "Código Falla: RA43 - Criticidad: 1", Toast.LENGTH_LONG);
                toast198.show();
                break;


        }

    }
}