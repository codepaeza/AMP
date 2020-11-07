package com.paez.edwin.amp;

/**
 * Created by PC on 4/06/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class FallaraaislemtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falla_raaislemt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb301 = (RadioButton) findViewById(R.id.ramo301);
        RadioButton rb302 = (RadioButton) findViewById(R.id.ramo302);
        RadioButton rb309 = (RadioButton) findViewById(R.id.ramo309);
        RadioButton rb305 = (RadioButton) findViewById(R.id.ramo305);
        RadioButton rb306 = (RadioButton) findViewById(R.id.ramo306);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo301:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb301.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb302.setTypeface(null, Typeface.NORMAL);
                rb309.setTypeface(null, Typeface.NORMAL);
                rb305.setTypeface(null, Typeface.NORMAL);
                rb306.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent301 = new Intent(FallaraaislemtActivity.this,
                Mtramo301Activity.class);
                startActivity(intent301);


                Toast toast301 =
                        Toast.makeText(FallaraaislemtActivity.this, "Has seleccionado: 301 RAMO", Toast.LENGTH_LONG);
                toast301.show();
                break;

            case R.id.ramo302:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb302.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb301.setTypeface(null, Typeface.NORMAL);
                rb309.setTypeface(null, Typeface.NORMAL);
                rb305.setTypeface(null, Typeface.NORMAL);
                rb306.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent302 = new Intent(FallaraaislemtActivity.this,
                Mtramo302Activity.class);
                startActivity(intent302);

                Toast toast302 =
                        Toast.makeText(FallaraaislemtActivity.this, "Has seleccionado: 302 RAMO", Toast.LENGTH_LONG);
                toast302.show();
                break;

            case R.id.ramo309:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb309.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb301.setTypeface(null, Typeface.NORMAL);
                rb302.setTypeface(null, Typeface.NORMAL);
                rb305.setTypeface(null, Typeface.NORMAL);
                rb306.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent309 = new Intent(FallaraaislemtActivity.this,
                Mtramo309Activity.class);
                startActivity(intent309);

                Toast toast309 =
                        Toast.makeText(FallaraaislemtActivity.this, "Has seleccionado: 309 RAMO", Toast.LENGTH_LONG);
                toast309.show();
                break;

            case R.id.ramo305:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb305.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb301.setTypeface(null, Typeface.NORMAL);
                rb302.setTypeface(null, Typeface.NORMAL);
                rb309.setTypeface(null, Typeface.NORMAL);
                rb306.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent305 = new Intent(FallaraaislemtActivity.this,
                Mtramo305Activity.class);
                startActivity(intent305);

                Toast toast305 =
                        Toast.makeText(FallaraaislemtActivity.this, "Has seleccionado: 305 RAMO", Toast.LENGTH_LONG);
                toast305.show();
                break;

            case R.id.ramo306:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb306.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb301.setTypeface(null, Typeface.NORMAL);
                rb302.setTypeface(null, Typeface.NORMAL);
                rb309.setTypeface(null, Typeface.NORMAL);
                rb305.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent306 = new Intent(FallaraaislemtActivity.this,
                Mtramo306Activity.class);
                startActivity(intent306);

                Toast toast306 =
                        Toast.makeText(FallaraaislemtActivity.this, "Has seleccionado: 306 RAMO", Toast.LENGTH_LONG);
                toast306.show();
                break;


        }
    }
}

