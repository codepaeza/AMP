package com.paez.edwin.amp;

/**
 * Created by PC on 21/08/2017.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo302Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo302);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb321 = (RadioButton) findViewById(R.id.ramo302_01);
        RadioButton rb322 = (RadioButton) findViewById(R.id.ramo302_02);
        RadioButton rb323 = (RadioButton) findViewById(R.id.ramo302_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo302_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb321.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb322.setTypeface(null, Typeface.NORMAL);
                rb323.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent321 = new Intent(Mtramo302Activity.this,
                        MainActivity.class);
                startActivity(intent321);


                Toast toast321 =
                        Toast.makeText(Mtramo302Activity.this, "Código Falla: RA58 - Criticidad: 1", Toast.LENGTH_LONG);
                toast321.show();
                break;

            case R.id.ramo302_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb322.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb321.setTypeface(null, Typeface.NORMAL);
                rb323.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent322 = new Intent(Mtramo302Activity.this,
                        MainActivity.class);
                startActivity(intent322);


                Toast toast322 =
                        Toast.makeText(Mtramo302Activity.this, "Código Falla: RA59 - Criticidad: 2", Toast.LENGTH_LONG);
                toast322.show();
                break;

            case R.id.ramo302_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb323.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb322.setTypeface(null, Typeface.NORMAL);
                rb323.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent323 = new Intent(Mtramo302Activity.this,
                        MainActivity.class);
                startActivity(intent323);


                Toast toast323 =
                        Toast.makeText(Mtramo302Activity.this, "Código Falla: RA59 - Criticidad: 2", Toast.LENGTH_LONG);
                toast323.show();
                break;
        }

    }
}