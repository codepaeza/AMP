package com.paez.edwin.amp;

/**
 * Created by PC on 4/06/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class FallaratermimtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falla_raterminmt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb501 = (RadioButton) findViewById(R.id.ramo501);
        RadioButton rb503 = (RadioButton) findViewById(R.id.ramo503);
        RadioButton rb504 = (RadioButton) findViewById(R.id.ramo504);
        RadioButton rb505 = (RadioButton) findViewById(R.id.ramo505);
        RadioButton rb506 = (RadioButton) findViewById(R.id.ramo506);
        RadioButton rb511 = (RadioButton) findViewById(R.id.ramo511);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo501:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb501.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb503.setTypeface(null, Typeface.NORMAL);
                rb504.setTypeface(null, Typeface.NORMAL);
                rb505.setTypeface(null, Typeface.NORMAL);
                rb506.setTypeface(null, Typeface.NORMAL);
                rb511.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                Intent intent501 = new Intent(FallaratermimtActivity.this,
                Mtramo501Activity.class);
                startActivity(intent501);


                Toast toast501 =
                        Toast.makeText(FallaratermimtActivity.this, "Has seleccionado: 501 RAMO", Toast.LENGTH_LONG);
                toast501.show();
                break;

            case R.id.ramo503:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb503.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb501.setTypeface(null, Typeface.NORMAL);
                rb504.setTypeface(null, Typeface.NORMAL);
                rb505.setTypeface(null, Typeface.NORMAL);
                rb506.setTypeface(null, Typeface.NORMAL);
                rb511.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent503 = new Intent(FallaratermimtActivity.this,
                Mtramo503Activity.class);
                startActivity(intent503);

                Toast toast503 =
                        Toast.makeText(FallaratermimtActivity.this, "Has seleccionado: 503 RAMO", Toast.LENGTH_LONG);
                toast503.show();
                break;

            case R.id.ramo504:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb504.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb501.setTypeface(null, Typeface.NORMAL);
                rb503.setTypeface(null, Typeface.NORMAL);
                rb505.setTypeface(null, Typeface.NORMAL);
                rb506.setTypeface(null, Typeface.NORMAL);
                rb511.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent504 = new Intent(FallaratermimtActivity.this,
                Mtramo504Activity.class);
                startActivity(intent504);

                Toast toast504=
                        Toast.makeText(FallaratermimtActivity.this, "Has seleccionado: 504 RAMO", Toast.LENGTH_LONG);
                toast504.show();
                break;

            case R.id.ramo505:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb505.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb501.setTypeface(null, Typeface.NORMAL);
                rb503.setTypeface(null, Typeface.NORMAL);
                rb504.setTypeface(null, Typeface.NORMAL);
                rb506.setTypeface(null, Typeface.NORMAL);
                rb511.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent505 = new Intent(FallaratermimtActivity.this,
                Mtramo505Activity.class);
                startActivity(intent505);

                Toast toast505 =
                        Toast.makeText(FallaratermimtActivity.this, "Has seleccionado: 505 RAMO", Toast.LENGTH_LONG);
                toast505.show();
                break;

            case R.id.ramo506:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb506.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb501.setTypeface(null, Typeface.NORMAL);
                rb503.setTypeface(null, Typeface.NORMAL);
                rb504.setTypeface(null, Typeface.NORMAL);
                rb505.setTypeface(null, Typeface.NORMAL);
                rb511.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent506 = new Intent(FallaratermimtActivity.this,
                Mtramo506Activity.class);
                startActivity(intent506);

                Toast toast506 =
                        Toast.makeText(FallaratermimtActivity.this, "Has seleccionado: 506 RAMO", Toast.LENGTH_LONG);
                toast506.show();
                break;


            case R.id.ramo511:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb511.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb501.setTypeface(null, Typeface.NORMAL);
                rb503.setTypeface(null, Typeface.NORMAL);
                rb504.setTypeface(null, Typeface.NORMAL);
                rb505.setTypeface(null, Typeface.NORMAL);
                rb506.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent511 = new Intent(FallaratermimtActivity.this,
                Mtramo511Activity.class);
                startActivity(intent511);

                Toast toast511 =
                        Toast.makeText(FallaratermimtActivity.this, "Has seleccionado: 511 RAMO", Toast.LENGTH_LONG);
                toast511.show();
                break;



        }
    }
}

