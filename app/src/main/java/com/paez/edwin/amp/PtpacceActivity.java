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

public class PtpacceActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptp_acce);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb385 = (RadioButton) findViewById(R.id.ptp101);
        RadioButton rb386 = (RadioButton) findViewById(R.id.ptp102);
        RadioButton rb387 = (RadioButton) findViewById(R.id.ptp103);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp101:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb385.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb386.setTypeface(null, Typeface.NORMAL);
                rb387.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent385 = new Intent(PtpacceActivity.this,
                        Ptp101Activity.class);
                startActivity(intent385);


                Toast toast385 =
                        Toast.makeText(PtpacceActivity.this, "Has seleccionado: 101 PTP", Toast.LENGTH_LONG);
                toast385.show();
                break;

            case R.id.ptp102:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb386.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb385.setTypeface(null, Typeface.NORMAL);
                rb387.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent386 = new Intent(PtpacceActivity.this,
                        Ptp102Activity.class);
                startActivity(intent386);

                Toast toast386 =
                        Toast.makeText(PtpacceActivity.this, "Has seleccionado: 102 PTP", Toast.LENGTH_LONG);
                toast386.show();
                break;

            case R.id.ptp103:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb387.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb385.setTypeface(null, Typeface.NORMAL);
                rb386.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent387 = new Intent(PtpacceActivity.this,
                        Ptp103Activity.class);
                startActivity(intent387);

                Toast toast387 =
                        Toast.makeText(PtpacceActivity.this, "Has seleccionado: 103 PTP", Toast.LENGTH_LONG);
                toast387.show();
                break;


        }
    }
}

