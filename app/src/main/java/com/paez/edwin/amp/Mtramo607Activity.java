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


public class Mtramo607Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo607);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb371 = (RadioButton) findViewById(R.id.ramo607_01);
        RadioButton rb372 = (RadioButton) findViewById(R.id.ramo607_02);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo607_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb371.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb372.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent371 = new Intent(Mtramo607Activity.this,
                        MainActivity.class);
                startActivity(intent371);


                Toast toast371 =
                        Toast.makeText(Mtramo607Activity.this, "Código Falla: RA136 - Criticidad: 1", Toast.LENGTH_LONG);
                toast371.show();
                break;

            case R.id.ramo607_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb372.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb371.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent372 = new Intent(Mtramo607Activity.this,
                        MainActivity.class);
                startActivity(intent372);


                Toast toast372 =
                        Toast.makeText(Mtramo607Activity.this, "Código Falla: RA137 - Criticidad: 2", Toast.LENGTH_LONG);
                toast372.show();
                break;
        }

    }
}