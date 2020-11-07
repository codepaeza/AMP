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

public class PtpseccActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptp_secc);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb450 = (RadioButton) findViewById(R.id.ptp306);
        RadioButton rb451 = (RadioButton) findViewById(R.id.ptp307);
        RadioButton rb452 = (RadioButton) findViewById(R.id.ptp308);
        RadioButton rb453 = (RadioButton) findViewById(R.id.ptp309);
        RadioButton rb454 = (RadioButton) findViewById(R.id.ptp310);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp306:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb450.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb451.setTypeface(null, Typeface.NORMAL);
                rb452.setTypeface(null, Typeface.NORMAL);
                rb453.setTypeface(null, Typeface.NORMAL);
                rb454.setTypeface(null, Typeface.NORMAL);



                //Starting new intent
                Intent intent450 = new Intent(PtpseccActivity.this,
                Ptp306Activity.class);
                startActivity(intent450);


                Toast toast450 =
                        Toast.makeText(PtpseccActivity.this, "Has seleccionado: 306 PTP", Toast.LENGTH_LONG);
                toast450.show();
                break;

            case R.id.ptp307:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb451.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb450.setTypeface(null, Typeface.NORMAL);
                rb452.setTypeface(null, Typeface.NORMAL);
                rb453.setTypeface(null, Typeface.NORMAL);
                rb454.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent451 = new Intent(PtpseccActivity.this,
                Ptp307Activity.class);
                startActivity(intent451);

                Toast toast451 =
                        Toast.makeText(PtpseccActivity.this, "Has seleccionado: 307 PTP", Toast.LENGTH_LONG);
                toast451.show();
                break;

            case R.id.ptp308:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb452.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb450.setTypeface(null, Typeface.NORMAL);
                rb451.setTypeface(null, Typeface.NORMAL);
                rb453.setTypeface(null, Typeface.NORMAL);
                rb454.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent452 = new Intent(PtpseccActivity.this,
                Ptp308Activity.class);
                startActivity(intent452);

                Toast toast452 =
                        Toast.makeText(PtpseccActivity.this, "Has seleccionado: 308 PTP", Toast.LENGTH_LONG);
                toast452.show();
                break;

            case R.id.ptp309:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb453.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb450.setTypeface(null, Typeface.NORMAL);
                rb451.setTypeface(null, Typeface.NORMAL);
                rb452.setTypeface(null, Typeface.NORMAL);
                rb454.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent453 = new Intent(PtpseccActivity.this,
                Ptp309Activity.class);
                startActivity(intent453);

                Toast toast453 =
                        Toast.makeText(PtpseccActivity.this, "Has seleccionado: 309 PTP", Toast.LENGTH_LONG);
                toast453.show();
                break;

            case R.id.ptp310:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb454.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb450.setTypeface(null, Typeface.NORMAL);
                rb451.setTypeface(null, Typeface.NORMAL);
                rb452.setTypeface(null, Typeface.NORMAL);
                rb453.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent454 = new Intent(PtpseccActivity.this,
                Ptp310Activity.class);
                startActivity(intent454);

                Toast toast454 =
                        Toast.makeText(PtpseccActivity.this, "Has seleccionado: 310 PTP", Toast.LENGTH_LONG);
                toast454.show();
                break;



        }
    }
}
