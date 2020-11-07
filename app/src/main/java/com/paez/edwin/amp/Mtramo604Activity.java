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


public class Mtramo604Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo604);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb367 = (RadioButton) findViewById(R.id.ramo604_01);
        RadioButton rb368 = (RadioButton) findViewById(R.id.ramo604_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo604_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb367.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb368.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent367 = new Intent(Mtramo604Activity.this,
                        MainActivity.class);
                startActivity(intent367);


                Toast toast367 =
                        Toast.makeText(Mtramo604Activity.this, "Código Falla: RA127 - Criticidad: 1", Toast.LENGTH_LONG);
                toast367.show();
                break;

            case R.id.ramo604_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb368.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb367.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent368 = new Intent(Mtramo604Activity.this,
                        MainActivity.class);
                startActivity(intent368);


                Toast toast368 =
                        Toast.makeText(Mtramo604Activity.this, "Código Falla: RA128 - Criticidad: 2", Toast.LENGTH_LONG);
                toast368.show();
                break;
        }

    }
}