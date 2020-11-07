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

public class Ptp409Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp409);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb525 = (RadioButton) findViewById(R.id.ptp82);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp82:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb525.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent525 = new Intent(Ptp409Activity.this,
                        MainActivity.class);
                startActivity(intent525);


                Toast toast525 =
                        Toast.makeText(Ptp409Activity.this, "Código Falla: PTP82 - Criticidad: 1", Toast.LENGTH_LONG);
                toast525.show();
                break;


        }
    }
}
