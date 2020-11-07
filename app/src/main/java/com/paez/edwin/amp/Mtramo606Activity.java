package com.paez.edwin.amp;

/**
 * Created by PC on 20/11/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Mtramo606Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo606);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb370 = (RadioButton) findViewById(R.id.ramo606_01);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo606_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb370.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent370 = new Intent(Mtramo606Activity.this,
                        MainActivity.class);
                startActivity(intent370);


                Toast toast370 =
                        Toast.makeText(Mtramo606Activity.this, "Código Falla: RA135 - Criticidad: 3", Toast.LENGTH_LONG);
                toast370.show();
                break;


        }

    }
}