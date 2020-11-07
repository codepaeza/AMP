package com.paez.edwin.amp;

/**
 * Created by PC on 21/08/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo306Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo306);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb327 = (RadioButton) findViewById(R.id.ramo306_01);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo306_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb327.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent327 = new Intent(Mtramo306Activity.this,
                        MainActivity.class);
                startActivity(intent327);


                Toast toast327 =
                        Toast.makeText(Mtramo306Activity.this, "Código Falla: RA67 - Criticidad: 1", Toast.LENGTH_LONG);
                toast327.show();
                break;


        }

    }
}