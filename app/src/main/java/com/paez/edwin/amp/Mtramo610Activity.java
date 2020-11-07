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


public class Mtramo610Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo610);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb374 = (RadioButton) findViewById(R.id.ramo610_01);
        RadioButton rb375 = (RadioButton) findViewById(R.id.ramo610_02);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo610_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb374.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb375.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent374 = new Intent(Mtramo610Activity.this,
                        MainActivity.class);
                startActivity(intent374);


                Toast toast374 =
                        Toast.makeText(Mtramo610Activity.this, "Código Falla: RA145 - Criticidad: 1", Toast.LENGTH_LONG);
                toast374.show();
                break;

            case R.id.ramo610_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb375.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb374.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent375 = new Intent(Mtramo610Activity.this,
                        MainActivity.class);
                startActivity(intent375);


                Toast toast375 =
                        Toast.makeText(Mtramo610Activity.this, "Código Falla: RA146 - Criticidad: 2", Toast.LENGTH_LONG);
                toast375.show();
                break;
        }

    }
}