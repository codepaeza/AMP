package com.paez.edwin.amp;

/**
 * Created by PC on 19/11/2017.
 */


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class Mtramo511Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo511);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb359 = (RadioButton) findViewById(R.id.ramo511_01);
        RadioButton rb360 = (RadioButton) findViewById(R.id.ramo511_02);
        RadioButton rb361 = (RadioButton) findViewById(R.id.ramo511_03);
        RadioButton rb362 = (RadioButton) findViewById(R.id.ramo511_04);
        RadioButton rb363 = (RadioButton) findViewById(R.id.ramo511_05);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo511_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb359.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb360.setTypeface(null, Typeface.NORMAL);
                rb361.setTypeface(null, Typeface.NORMAL);
                rb362.setTypeface(null, Typeface.NORMAL);
                rb363.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent359 = new Intent(Mtramo511Activity.this,
                        MainActivity.class);
                startActivity(intent359);


                Toast toast359 =
                        Toast.makeText(Mtramo511Activity.this, "Código Falla: RA118 - Criticidad: 1", Toast.LENGTH_LONG);
                toast359.show();
                break;

            case R.id.ramo511_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb360.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb359.setTypeface(null, Typeface.NORMAL);
                rb361.setTypeface(null, Typeface.NORMAL);
                rb362.setTypeface(null, Typeface.NORMAL);
                rb363.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent360 = new Intent(Mtramo511Activity.this,
                        MainActivity.class);
                startActivity(intent360);


                Toast toast360 =
                        Toast.makeText(Mtramo511Activity.this, "Código Falla: RA118 - Criticidad: 1", Toast.LENGTH_LONG);
                toast360.show();
                break;

            case R.id.ramo511_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb361.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb359.setTypeface(null, Typeface.NORMAL);
                rb360.setTypeface(null, Typeface.NORMAL);
                rb362.setTypeface(null, Typeface.NORMAL);
                rb363.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent361 = new Intent(Mtramo511Activity.this,
                        MainActivity.class);
                startActivity(intent361);


                Toast toast361 =
                        Toast.makeText(Mtramo511Activity.this, "Código Falla: RA119 - Criticidad: 2", Toast.LENGTH_LONG);
                toast361.show();
                break;

            case R.id.ramo511_04:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb362.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb359.setTypeface(null, Typeface.NORMAL);
                rb360.setTypeface(null, Typeface.NORMAL);
                rb361.setTypeface(null, Typeface.NORMAL);
                rb363.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent362 = new Intent(Mtramo511Activity.this,
                        MainActivity.class);
                startActivity(intent362);


                Toast toast362 =
                        Toast.makeText(Mtramo511Activity.this, "Código Falla: RA119 - Criticidad: 2", Toast.LENGTH_LONG);
                toast362.show();
                break;

            case R.id.ramo511_05:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb363.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb359.setTypeface(null, Typeface.NORMAL);
                rb360.setTypeface(null, Typeface.NORMAL);
                rb361.setTypeface(null, Typeface.NORMAL);
                rb362.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent363 = new Intent(Mtramo511Activity.this,
                        MainActivity.class);
                startActivity(intent363);


                Toast toast363 =
                        Toast.makeText(Mtramo511Activity.this, "Código Falla: RA120 - Criticidad: 3", Toast.LENGTH_LONG);
                toast363.show();
                break;
        }

    }
}