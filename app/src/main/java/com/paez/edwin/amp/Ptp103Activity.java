package com.paez.edwin.amp;

/**
 * Created by PC on 25/11/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp103Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp103);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb473 = (RadioButton) findViewById(R.id.ptp09);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp09:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb473.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent473 = new Intent(Ptp103Activity.this,
                        MainActivity.class);
                startActivity(intent473);


                Toast toast473 =
                        Toast.makeText(Ptp103Activity.this, "Código Falla: PTP09 - Criticidad: 3", Toast.LENGTH_LONG);
                toast473.show();
                break;




        }
    }
}
