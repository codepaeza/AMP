package com.paez.edwin.amp;

/**
 * Created by PC on 25/12/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp503Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp503);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb533 = (RadioButton) findViewById(R.id.ptp96);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp96:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb533.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent533 = new Intent(Ptp503Activity.this,
                        MainActivity.class);
                startActivity(intent533);


                Toast toast533 =
                        Toast.makeText(Ptp503Activity.this, "Código Falla: PTP96 - Criticidad: 3", Toast.LENGTH_LONG);
                toast533.show();
                break;


        }
    }
}
