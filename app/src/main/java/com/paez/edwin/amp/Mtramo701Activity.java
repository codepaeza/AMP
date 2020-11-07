package com.paez.edwin.amp;

/**
 * Created by PC on 25/11/2017.
 */


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Mtramo701Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo701);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb376 = (RadioButton) findViewById(R.id.ramo701_01);
        RadioButton rb377 = (RadioButton) findViewById(R.id.ramo701_02);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo701_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb376.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb377.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent376 = new Intent(Mtramo701Activity.this,
                        MainActivity.class);
                startActivity(intent376);


                Toast toast376 =
                        Toast.makeText(Mtramo701Activity.this, "Código Falla: RA148 - Criticidad: 1", Toast.LENGTH_LONG);
                toast376.show();
                break;

            case R.id.ramo701_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb377.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb376.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent377 = new Intent(Mtramo701Activity.this,
                        MainActivity.class);
                startActivity(intent377);


                Toast toast377 =
                        Toast.makeText(Mtramo701Activity.this, "Código Falla: RA149 - Criticidad: 2", Toast.LENGTH_LONG);
                toast377.show();
                break;
        }

    }
}