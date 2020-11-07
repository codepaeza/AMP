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

public class Ptp102Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp102);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb472 = (RadioButton) findViewById(R.id.ptp06);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp06:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb472.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent472 = new Intent(Ptp102Activity.this,
                        MainActivity.class);
                startActivity(intent472);


                Toast toast471 =
                        Toast.makeText(Ptp102Activity.this, "Código Falla: PTP06 - Criticidad: 3", Toast.LENGTH_LONG);
                toast471.show();
                break;




        }
    }
}
