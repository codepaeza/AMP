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

public class PtppatActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptp_pat);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb466 = (RadioButton) findViewById(R.id.ptp501);
        RadioButton rb467 = (RadioButton) findViewById(R.id.ptp502);
        RadioButton rb468 = (RadioButton) findViewById(R.id.ptp503);
        RadioButton rb469 = (RadioButton) findViewById(R.id.ptp504);
        RadioButton rb470 = (RadioButton) findViewById(R.id.ptp505);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp501:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb466.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb467.setTypeface(null, Typeface.NORMAL);
                rb468.setTypeface(null, Typeface.NORMAL);
                rb469.setTypeface(null, Typeface.NORMAL);
                rb470.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent466 = new Intent(PtppatActivity.this,
                Ptp501Activity.class);
                startActivity(intent466);


                Toast toast466 =
                        Toast.makeText(PtppatActivity.this, "Has seleccionado: 501 PTP", Toast.LENGTH_LONG);
                toast466.show();
                break;

            case R.id.ptp502:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb467.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb466.setTypeface(null, Typeface.NORMAL);
                rb468.setTypeface(null, Typeface.NORMAL);
                rb469.setTypeface(null, Typeface.NORMAL);
                rb470.setTypeface(null, Typeface.NORMAL);
                                // Starting new intent
                Intent intent467 = new Intent(PtppatActivity.this,
                Ptp502Activity.class);
                startActivity(intent467);

                Toast toast467 =
                        Toast.makeText(PtppatActivity.this, "Has seleccionado: 502 PTP", Toast.LENGTH_LONG);
                toast467.show();
                break;

            case R.id.ptp503:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb468.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb466.setTypeface(null, Typeface.NORMAL);
                rb467.setTypeface(null, Typeface.NORMAL);
                rb469.setTypeface(null, Typeface.NORMAL);
                rb470.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent468 = new Intent(PtppatActivity.this,
                Ptp503Activity.class);
                startActivity(intent468);

                Toast toast468 =
                        Toast.makeText(PtppatActivity.this, "Has seleccionado: 503 PTP", Toast.LENGTH_LONG);
                toast468.show();
                break;

            case R.id.ptp504:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb469.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb466.setTypeface(null, Typeface.NORMAL);
                rb467.setTypeface(null, Typeface.NORMAL);
                rb468.setTypeface(null, Typeface.NORMAL);
                rb470.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent469 = new Intent(PtppatActivity.this,
                Ptp504Activity.class);
                startActivity(intent469);

                Toast toast469 =
                        Toast.makeText(PtppatActivity.this, "Has seleccionado: 504 PTP", Toast.LENGTH_LONG);
                toast469.show();
                break;

            case R.id.ptp505:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb470.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb466.setTypeface(null, Typeface.NORMAL);
                rb467.setTypeface(null, Typeface.NORMAL);
                rb468.setTypeface(null, Typeface.NORMAL);
                rb470.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent470 = new Intent(PtppatActivity.this,
                Ptp505Activity.class);
                startActivity(intent470);

                Toast toast470 =
                        Toast.makeText(PtppatActivity.this, "Has seleccionado: 505 PTP", Toast.LENGTH_LONG);
                toast470.show();
                break;



        }
    }
}
