package com.paez.edwin.amp;

/**
 * Created by PC on 20/08/2017.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo212Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo212);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb199 = (RadioButton) findViewById(R.id.ramo212_01);
        RadioButton rb1991 = (RadioButton) findViewById(R.id.ramo212_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo212_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb199.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1991.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent199 = new Intent(Mtramo212Activity.this,
                        MainActivity.class);
                startActivity(intent199);


                Toast toast199 =
                        Toast.makeText(Mtramo212Activity.this, "Código Falla: RA47 - Criticidad: 2", Toast.LENGTH_LONG);
                toast199.show();
                break;

            case R.id.ramo212_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1991.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb199.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent1991 = new Intent(Mtramo212Activity.this,
                        MainActivity.class);
                startActivity(intent1991);


                Toast toast1991 =
                        Toast.makeText(Mtramo212Activity.this, "Código Falla: RA48 - Criticidad: 3", Toast.LENGTH_LONG);
                toast1991.show();
                break;


        }

    }
}