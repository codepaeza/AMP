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

public class Mtramo309Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo309);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb324 = (RadioButton) findViewById(R.id.ramo309_01);
        RadioButton rb325 = (RadioButton) findViewById(R.id.ramo309_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo309_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb324.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb325.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent324 = new Intent(Mtramo309Activity.this,
                        MainActivity.class);
                startActivity(intent324);


                Toast toast324 =
                        Toast.makeText(Mtramo309Activity.this, "Código Falla: RA61 - Criticidad: 1", Toast.LENGTH_LONG);
                toast324.show();
                break;

            case R.id.ramo309_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb325.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb324.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent325 = new Intent(Mtramo309Activity.this,
                        MainActivity.class);
                startActivity(intent325);


                Toast toast325 =
                        Toast.makeText(Mtramo309Activity.this, "Código Falla: RA62 - Criticidad: 2", Toast.LENGTH_LONG);
                toast325.show();
                break;


        }

    }
}