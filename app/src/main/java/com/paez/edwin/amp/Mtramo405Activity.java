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

public class Mtramo405Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo405);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb335 = (RadioButton) findViewById(R.id.ramo405_01);
        RadioButton rb336 = (RadioButton) findViewById(R.id.ramo405_02);
        RadioButton rb337 = (RadioButton) findViewById(R.id.ramo405_03);
        RadioButton rb338 = (RadioButton) findViewById(R.id.ramo405_04);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo405_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb335.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb336.setTypeface(null, Typeface.NORMAL);
                rb337.setTypeface(null, Typeface.NORMAL);
                rb338.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent335 = new Intent(Mtramo405Activity.this,
                        MainActivity.class);
                startActivity(intent335);


                Toast toast335 =
                        Toast.makeText(Mtramo405Activity.this, "Código Falla: RA79 - Criticidad: 1", Toast.LENGTH_LONG);
                toast335.show();
                break;

            case R.id.ramo405_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb336.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb335.setTypeface(null, Typeface.NORMAL);
                rb337.setTypeface(null, Typeface.NORMAL);
                rb338.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent336 = new Intent(Mtramo405Activity.this,
                        MainActivity.class);
                startActivity(intent336);


                Toast toast336 =
                        Toast.makeText(Mtramo405Activity.this, "Código Falla: RA80 - Criticidad: 2", Toast.LENGTH_LONG);
                toast336.show();
                break;

            case R.id.ramo405_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb337.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb335.setTypeface(null, Typeface.NORMAL);
                rb336.setTypeface(null, Typeface.NORMAL);
                rb338.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent337 = new Intent(Mtramo405Activity.this,
                        MainActivity.class);
                startActivity(intent337);


                Toast toast337 =
                        Toast.makeText(Mtramo405Activity.this, "Código Falla: RA80 - Criticidad: 2", Toast.LENGTH_LONG);
                toast337.show();
                break;

            case R.id.ramo405_04:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb338.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb335.setTypeface(null, Typeface.NORMAL);
                rb336.setTypeface(null, Typeface.NORMAL);
                rb337.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent338 = new Intent(Mtramo405Activity.this,
                        MainActivity.class);
                startActivity(intent338);


                Toast toast338 =
                        Toast.makeText(Mtramo405Activity.this, "Código Falla: RA81 - Criticidad: 3", Toast.LENGTH_LONG);
                toast338.show();
                break;

        }

    }
}