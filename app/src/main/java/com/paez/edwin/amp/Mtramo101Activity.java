package com.paez.edwin.amp;

/**
 * Created by PC on 9/07/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo101Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo101);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb151 = (RadioButton) findViewById(R.id.ramo101_02);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo101_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb151.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent151 = new Intent(Mtramo101Activity.this,
                        MainActivity.class);
                startActivity(intent151);


                Toast toast151 =
                        Toast.makeText(Mtramo101Activity.this, "Código Falla: RA02 - Criticidad: 2", Toast.LENGTH_LONG);
                toast151.show();
                break;


        }

    }
}


