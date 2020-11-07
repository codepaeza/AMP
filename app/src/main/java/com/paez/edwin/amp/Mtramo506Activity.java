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


public class Mtramo506Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo506);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb358 = (RadioButton) findViewById(R.id.ramo506_01);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo506_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb358.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent358 = new Intent(Mtramo506Activity.this,
                        MainActivity.class);
                startActivity(intent358);


                Toast toast358 =
                        Toast.makeText(Mtramo506Activity.this, "Código Falla: RA117 - Criticidad: 3", Toast.LENGTH_LONG);
                toast358.show();
                break;


        }

    }
}