package com.paez.edwin.amp;

/**
 * Created by PC on 26/11/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp202Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp202);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb477 = (RadioButton) findViewById(R.id.ptp13);
        RadioButton rb478 = (RadioButton) findViewById(R.id.ptp14);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp13:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb477.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb478.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent477 = new Intent(Ptp202Activity.this,
                        MainActivity.class);
                startActivity(intent477);


                Toast toast477 =
                        Toast.makeText(Ptp202Activity.this, "Código Falla: PTP13 - Criticidad: 1", Toast.LENGTH_LONG);
                toast477.show();
                break;

            case R.id.ptp14:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb478.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb477.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent478 = new Intent(Ptp202Activity.this,
                        MainActivity.class);
                startActivity(intent478);


                Toast toast478 =
                        Toast.makeText(Ptp202Activity.this, "Código Falla: PTP14 - Criticidad: 2", Toast.LENGTH_LONG);
                toast478.show();
                break;


        }
    }
}
