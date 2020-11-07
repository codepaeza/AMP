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

public class Mtramo205Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo205);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb179 = (RadioButton) findViewById(R.id.ramo205_01);
        RadioButton rb180 = (RadioButton) findViewById(R.id.ramo205_02);
        RadioButton rb181 = (RadioButton) findViewById(R.id.ramo205_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo205_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb179.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb180.setTypeface(null, Typeface.NORMAL);
                rb181.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent179 = new Intent(Mtramo205Activity.this,
                        MainActivity.class);
                startActivity(intent179);


                Toast toast179 =
                        Toast.makeText(Mtramo205Activity.this, "Código Falla: RA25 - Criticidad: 1", Toast.LENGTH_LONG);
                toast179.show();
                break;

            case R.id.ramo205_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb180.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb179.setTypeface(null, Typeface.NORMAL);
                rb181.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent180 = new Intent(Mtramo205Activity.this,
                        MainActivity.class);
                startActivity(intent180);


                Toast toast180 =
                        Toast.makeText(Mtramo205Activity.this, "Código Falla: RA25 - Criticidad: 1", Toast.LENGTH_LONG);
                toast180.show();
                break;

            case R.id.ramo205_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb181.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb179.setTypeface(null, Typeface.NORMAL);
                rb180.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent181 = new Intent(Mtramo205Activity.this,
                        MainActivity.class);
                startActivity(intent181);


                Toast toast181 =
                        Toast.makeText(Mtramo205Activity.this, "Código Falla: RA25 - Criticidad: 1", Toast.LENGTH_LONG);
                toast181.show();
                break;


        }

    }
}