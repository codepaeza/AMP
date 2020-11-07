package com.paez.edwin.amp;

/**
 * Created by PC on 3/12/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp211Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp211);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb490 = (RadioButton) findViewById(R.id.ptp28);
        RadioButton rb491 = (RadioButton) findViewById(R.id.ptp29);
        RadioButton rb492 = (RadioButton) findViewById(R.id.ptp30);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp28:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb490.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb491.setTypeface(null, Typeface.NORMAL);
                rb492.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent490 = new Intent(Ptp211Activity.this,
                        MainActivity.class);
                startActivity(intent490);


                Toast toast490 =
                        Toast.makeText(Ptp211Activity.this, "Código Falla: PTP28 - Criticidad: 1", Toast.LENGTH_LONG);
                toast490.show();
                break;

            case R.id.ptp29:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb491.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb490.setTypeface(null, Typeface.NORMAL);
                rb492.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent491 = new Intent(Ptp211Activity.this,
                        MainActivity.class);
                startActivity(intent491);


                Toast toast491 =
                        Toast.makeText(Ptp211Activity.this, "Código Falla: PTP29 - Criticidad: 2", Toast.LENGTH_LONG);
                toast491.show();
                break;

            case R.id.ptp30:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb492.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb490.setTypeface(null, Typeface.NORMAL);
                rb491.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent492 = new Intent(Ptp211Activity.this,
                        MainActivity.class);
                startActivity(intent492);


                Toast toast492 =
                        Toast.makeText(Ptp211Activity.this, "Código Falla: PTP30 - Criticidad: 3", Toast.LENGTH_LONG);
                toast492.show();
                break;

        }
    }
}
