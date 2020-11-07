package com.paez.edwin.amp;

/**
 * Created by PC on 20/07/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo207Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo207);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb186 = (RadioButton) findViewById(R.id.ramo207_01);
        RadioButton rb187 = (RadioButton) findViewById(R.id.ramo207_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo207_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb186.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb187.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent186 = new Intent(Mtramo207Activity.this,
                        MainActivity.class);
                startActivity(intent186);


                Toast toast186 =
                        Toast.makeText(Mtramo207Activity.this, "Código Falla: RA31 - Criticidad: 1", Toast.LENGTH_LONG);
                toast186.show();
                break;

            case R.id.ramo207_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb187.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb186.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent187 = new Intent(Mtramo207Activity.this,
                        MainActivity.class);
                startActivity(intent187);


                Toast toast187 =
                        Toast.makeText(Mtramo207Activity.this, "Código Falla: RA31 - Criticidad: 1", Toast.LENGTH_LONG);
                toast187.show();
                break;


        }

    }
}