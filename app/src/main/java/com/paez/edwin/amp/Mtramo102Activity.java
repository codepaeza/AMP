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

public class Mtramo102Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo102);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb161 = (RadioButton) findViewById(R.id.ramo102_02);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo102_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb161.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent161 = new Intent(Mtramo102Activity.this,
                        MainActivity.class);
                startActivity(intent161);


                Toast toast161 =
                        Toast.makeText(Mtramo102Activity.this, "Código Falla: RA04 - Criticidad: 1", Toast.LENGTH_LONG);
                toast161.show();
                break;


        }

    }
}


