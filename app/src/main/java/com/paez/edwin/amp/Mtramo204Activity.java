package com.paez.edwin.amp;

/**
 * Created by PC on 20/07/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo204Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo204);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb178 = (RadioButton) findViewById(R.id.ramo204_01);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo204_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb178.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent178 = new Intent(Mtramo204Activity.this,
                        MainActivity.class);
                startActivity(intent178);


                Toast toast178 =
                        Toast.makeText(Mtramo204Activity.this, "Código Falla: RA22 - Criticidad: 1", Toast.LENGTH_LONG);
                toast178.show();
                break;


        }

    }
}