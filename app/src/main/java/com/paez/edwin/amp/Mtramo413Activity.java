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

public class Mtramo413Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo413);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb346 = (RadioButton) findViewById(R.id.ramo413_01);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo413_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb346.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent346 = new Intent(Mtramo413Activity.this,
                        MainActivity.class);
                startActivity(intent346);


                Toast toast346 =
                        Toast.makeText(Mtramo413Activity.this, "Código Falla: RA93 - Criticidad: 3", Toast.LENGTH_LONG);
                toast346.show();
                break;



        }

    }
}