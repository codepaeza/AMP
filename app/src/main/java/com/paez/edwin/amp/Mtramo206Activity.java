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

public class Mtramo206Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo206);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb182 = (RadioButton) findViewById(R.id.ramo206_01);
        RadioButton rb183 = (RadioButton) findViewById(R.id.ramo206_02);
        RadioButton rb184 = (RadioButton) findViewById(R.id.ramo206_03);
        RadioButton rb185 = (RadioButton) findViewById(R.id.ramo206_04);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo206_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb182.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb183.setTypeface(null, Typeface.NORMAL);
                rb184.setTypeface(null, Typeface.NORMAL);
                rb185.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent182 = new Intent(Mtramo206Activity.this,
                        MainActivity.class);
                startActivity(intent182);


                Toast toast182 =
                        Toast.makeText(Mtramo206Activity.this, "Código Falla: RA28 - Criticidad: 1", Toast.LENGTH_LONG);
                toast182.show();
                break;

            case R.id.ramo206_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb183.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb182.setTypeface(null, Typeface.NORMAL);
                rb184.setTypeface(null, Typeface.NORMAL);
                rb185.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent183 = new Intent(Mtramo206Activity.this,
                        MainActivity.class);
                startActivity(intent183);


                Toast toast183 =
                        Toast.makeText(Mtramo206Activity.this, "Código Falla: RA29 - Criticidad: 2", Toast.LENGTH_LONG);
                toast183.show();
                break;

            case R.id.ramo206_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb184.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb182.setTypeface(null, Typeface.NORMAL);
                rb183.setTypeface(null, Typeface.NORMAL);
                rb185.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent184 = new Intent(Mtramo206Activity.this,
                        MainActivity.class);
                startActivity(intent184);


                Toast toast184 =
                        Toast.makeText(Mtramo206Activity.this, "Código Falla: RA30 - Criticidad: 3", Toast.LENGTH_LONG);
                toast184.show();
                break;

            case R.id.ramo206_04:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb185.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb182.setTypeface(null, Typeface.NORMAL);
                rb183.setTypeface(null, Typeface.NORMAL);
                rb184.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent185 = new Intent(Mtramo206Activity.this,
                        MainActivity.class);
                startActivity(intent185);


                Toast toast185 =
                        Toast.makeText(Mtramo206Activity.this, "Código Falla: RA29 - Criticidad: 2", Toast.LENGTH_LONG);
                toast185.show();
                break;
        }

    }
}