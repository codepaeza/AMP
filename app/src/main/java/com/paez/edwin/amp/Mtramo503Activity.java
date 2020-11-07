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


public class Mtramo503Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo503);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb353 = (RadioButton) findViewById(R.id.ramo503_01);
        RadioButton rb354 = (RadioButton) findViewById(R.id.ramo503_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo503_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb353.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb354.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent353 = new Intent(Mtramo503Activity.this,
                        MainActivity.class);
                startActivity(intent353);


                Toast toast353 =
                        Toast.makeText(Mtramo503Activity.this, "Código Falla: RA106 - Criticidad: 1", Toast.LENGTH_LONG);
                toast353.show();
                break;

            case R.id.ramo503_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb354.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb353.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent354 = new Intent(Mtramo503Activity.this,
                        MainActivity.class);
                startActivity(intent354);


                Toast toast354 =
                        Toast.makeText(Mtramo503Activity.this, "Código Falla: RA107 - Criticidad: 2", Toast.LENGTH_LONG);
                toast354.show();
                break;

        }

    }
}