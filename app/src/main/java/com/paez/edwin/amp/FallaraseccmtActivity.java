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

public class FallaraseccmtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falla_raseccmt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb601 = (RadioButton) findViewById(R.id.ramo601);
        RadioButton rb603 = (RadioButton) findViewById(R.id.ramo603);
        RadioButton rb604 = (RadioButton) findViewById(R.id.ramo604);
        RadioButton rb605 = (RadioButton) findViewById(R.id.ramo605);
        RadioButton rb606 = (RadioButton) findViewById(R.id.ramo606);
        RadioButton rb607 = (RadioButton) findViewById(R.id.ramo607);
        RadioButton rb608 = (RadioButton) findViewById(R.id.ramo608);
        RadioButton rb610 = (RadioButton) findViewById(R.id.ramo610);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo601:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb601.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb603.setTypeface(null, Typeface.NORMAL);
                rb604.setTypeface(null, Typeface.NORMAL);
                rb605.setTypeface(null, Typeface.NORMAL);
                rb606.setTypeface(null, Typeface.NORMAL);
                rb607.setTypeface(null, Typeface.NORMAL);
                rb608.setTypeface(null, Typeface.NORMAL);
                rb610.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent601 = new Intent(FallaraseccmtActivity.this,
                Mtramo601Activity.class);
                startActivity(intent601);


                Toast toast601 =
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 601 RAMO", Toast.LENGTH_LONG);
                toast601.show();
                break;

            case R.id.ramo603:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb603.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb601.setTypeface(null, Typeface.NORMAL);
                rb604.setTypeface(null, Typeface.NORMAL);
                rb605.setTypeface(null, Typeface.NORMAL);
                rb606.setTypeface(null, Typeface.NORMAL);
                rb607.setTypeface(null, Typeface.NORMAL);
                rb608.setTypeface(null, Typeface.NORMAL);
                rb610.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent603 = new Intent(FallaraseccmtActivity.this,
               Mtramo603Activity.class);
                startActivity(intent603);

                Toast toast603 =
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 603 RAMO", Toast.LENGTH_LONG);
                toast603.show();
                break;

            case R.id.ramo604:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb604.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb601.setTypeface(null, Typeface.NORMAL);
                rb603.setTypeface(null, Typeface.NORMAL);
                rb605.setTypeface(null, Typeface.NORMAL);
                rb606.setTypeface(null, Typeface.NORMAL);
                rb607.setTypeface(null, Typeface.NORMAL);
                rb608.setTypeface(null, Typeface.NORMAL);
                rb610.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent604 = new Intent(FallaraseccmtActivity.this,
                Mtramo604Activity.class);
                startActivity(intent604);

                Toast toast604=
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 604 RAMO", Toast.LENGTH_LONG);
                toast604.show();
                break;

            case R.id.ramo605:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb605.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb601.setTypeface(null, Typeface.NORMAL);
                rb603.setTypeface(null, Typeface.NORMAL);
                rb604.setTypeface(null, Typeface.NORMAL);
                rb606.setTypeface(null, Typeface.NORMAL);
                rb607.setTypeface(null, Typeface.NORMAL);
                rb608.setTypeface(null, Typeface.NORMAL);
                rb610.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent605 = new Intent(FallaraseccmtActivity.this,
                Mtramo605Activity.class);
                startActivity(intent605);

                Toast toast605 =
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 605 RAMO", Toast.LENGTH_LONG);
                toast605.show();
                break;

            case R.id.ramo606:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb606.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb601.setTypeface(null, Typeface.NORMAL);
                rb603.setTypeface(null, Typeface.NORMAL);
                rb604.setTypeface(null, Typeface.NORMAL);
                rb605.setTypeface(null, Typeface.NORMAL);
                rb607.setTypeface(null, Typeface.NORMAL);
                rb608.setTypeface(null, Typeface.NORMAL);
                rb610.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent606 = new Intent(FallaraseccmtActivity.this,
                Mtramo606Activity.class);
                startActivity(intent606);

                Toast toast606 =
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 606 RAMO", Toast.LENGTH_LONG);
                toast606.show();
                break;


            case R.id.ramo607:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb607.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb601.setTypeface(null, Typeface.NORMAL);
                rb603.setTypeface(null, Typeface.NORMAL);
                rb604.setTypeface(null, Typeface.NORMAL);
                rb605.setTypeface(null, Typeface.NORMAL);
                rb606.setTypeface(null, Typeface.NORMAL);
                rb608.setTypeface(null, Typeface.NORMAL);
                rb610.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent607 = new Intent(FallaraseccmtActivity.this,
                Mtramo607Activity.class);
                startActivity(intent607);

                Toast toast607 =
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 607 RAMO", Toast.LENGTH_LONG);
                toast607.show();
                break;

            case R.id.ramo608:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb608.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb601.setTypeface(null, Typeface.NORMAL);
                rb603.setTypeface(null, Typeface.NORMAL);
                rb604.setTypeface(null, Typeface.NORMAL);
                rb605.setTypeface(null, Typeface.NORMAL);
                rb606.setTypeface(null, Typeface.NORMAL);
                rb607.setTypeface(null, Typeface.NORMAL);
                rb610.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent608 = new Intent(FallaraseccmtActivity.this,
                Mtramo608Activity.class);
                startActivity(intent608);

                Toast toast608 =
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 608 RAMO", Toast.LENGTH_LONG);
                toast608.show();
                break;


            case R.id.ramo610:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb610.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb601.setTypeface(null, Typeface.NORMAL);
                rb603.setTypeface(null, Typeface.NORMAL);
                rb604.setTypeface(null, Typeface.NORMAL);
                rb605.setTypeface(null, Typeface.NORMAL);
                rb606.setTypeface(null, Typeface.NORMAL);
                rb607.setTypeface(null, Typeface.NORMAL);
                rb608.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent610 = new Intent(FallaraseccmtActivity.this,
                Mtramo610Activity.class);
                startActivity(intent610);

                Toast toast610 =
                        Toast.makeText(FallaraseccmtActivity.this, "Has seleccionado: 610 RAMO", Toast.LENGTH_LONG);
                toast610.show();
                break;
        }
    }
}

