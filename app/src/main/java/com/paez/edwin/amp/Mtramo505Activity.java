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


public class Mtramo505Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo505);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb357 = (RadioButton) findViewById(R.id.ramo505_01);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo505_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb357.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent357 = new Intent(Mtramo505Activity.this,
                        MainActivity.class);
                startActivity(intent357);


                Toast toast357 =
                        Toast.makeText(Mtramo505Activity.this, "Código Falla: RA113 - Criticidad: 2", Toast.LENGTH_LONG);
                toast357.show();
                break;


        }

    }
}