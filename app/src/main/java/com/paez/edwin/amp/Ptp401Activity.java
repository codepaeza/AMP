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

public class Ptp401Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp401);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb513 = (RadioButton) findViewById(R.id.ptp55);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp55:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb513.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default


                //Starting new intent
                Intent intent513 = new Intent(Ptp401Activity.this,
                        MainActivity.class);
                startActivity(intent513);


                Toast toast513 =
                        Toast.makeText(Ptp401Activity.this, "Código Falla: PTP55 - Criticidad: 1", Toast.LENGTH_LONG);
                toast513.show();
                break;


        }
    }
}
