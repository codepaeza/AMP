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
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo416Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo416);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb347 = (RadioButton) findViewById(R.id.ramo416_01);
        RadioButton rb348 = (RadioButton) findViewById(R.id.ramo416_02);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo416_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb347.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb348.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent347 = new Intent(Mtramo416Activity.this,
                        MainActivity.class);
                startActivity(intent347);


                Toast toast347 =
                        Toast.makeText(Mtramo416Activity.this, "Código Falla: RA94 - Criticidad: 1", Toast.LENGTH_LONG);
                toast347.show();
                break;


            case R.id.ramo416_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb348.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb347.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent348 = new Intent(Mtramo416Activity.this,
                        MainActivity.class);
                startActivity(intent348);


                Toast toast348 =
                        Toast.makeText(Mtramo416Activity.this, "Código Falla: RA95 - Criticidad: 2", Toast.LENGTH_LONG);
                toast348.show();
                break;

        }

    }
}