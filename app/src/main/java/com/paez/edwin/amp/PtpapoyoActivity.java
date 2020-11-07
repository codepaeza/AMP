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

public class PtpapoyoActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptp_apoyo);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb388 = (RadioButton) findViewById(R.id.ptp201);
        RadioButton rb389 = (RadioButton) findViewById(R.id.ptp202);
        RadioButton rb390 = (RadioButton) findViewById(R.id.ptp206);
        RadioButton rb391 = (RadioButton) findViewById(R.id.ptp207);
        RadioButton rb392 = (RadioButton) findViewById(R.id.ptp208);
        RadioButton rb393 = (RadioButton) findViewById(R.id.ptp209);
        RadioButton rb394 = (RadioButton) findViewById(R.id.ptp211);
        RadioButton rb395 = (RadioButton) findViewById(R.id.ptp212);
        RadioButton rb396 = (RadioButton) findViewById(R.id.ptp213);
        RadioButton rb397 = (RadioButton) findViewById(R.id.ptp214);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp201:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb388.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent388 = new Intent(PtpapoyoActivity.this,
                Ptp201Activity.class);
                startActivity(intent388);


                Toast toast388 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 201 PTP", Toast.LENGTH_LONG);
                toast388.show();
                break;

            case R.id.ptp202:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb389.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent389 = new Intent(PtpapoyoActivity.this,
                Ptp202Activity.class);
                startActivity(intent389);

                Toast toast389 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 202 PTP", Toast.LENGTH_LONG);
                toast389.show();
                break;

            case R.id.ptp206:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb390.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent309 = new Intent(PtpapoyoActivity.this,
                Ptp206Activity.class);
                startActivity(intent309);

                Toast toast390 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 206 PTP", Toast.LENGTH_LONG);
                toast390.show();
                break;

            case R.id.ptp207:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb391.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent391 = new Intent(PtpapoyoActivity.this,
                Ptp207Activity.class);
                startActivity(intent391);

                Toast toast391 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 207 PTP", Toast.LENGTH_LONG);
                toast391.show();
                break;

            case R.id.ptp208:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb392.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent392 = new Intent(PtpapoyoActivity.this,
                Ptp208Activity.class);
                startActivity(intent392);

                Toast toast392 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 208 PTP", Toast.LENGTH_LONG);
                toast392.show();
                break;

                       case R.id.ptp209:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb393.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent393 = new Intent(PtpapoyoActivity.this,
                Ptp209Activity.class);
                startActivity(intent393);

                Toast toast393 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 209 PTP", Toast.LENGTH_LONG);
                toast393.show();
                break;

            case R.id.ptp211:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb394.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent394 = new Intent(PtpapoyoActivity.this,
                Ptp211Activity.class);
                startActivity(intent394);

                Toast toast394 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 211 PTP", Toast.LENGTH_LONG);
                toast394.show();
                break;

            case R.id.ptp212:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb395.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent395 = new Intent(PtpapoyoActivity.this,
                Ptp212Activity.class);
                startActivity(intent395);

                Toast toast395 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 212 PTP", Toast.LENGTH_LONG);
                toast395.show();
                break;

            case R.id.ptp213:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb396.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb397.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent396 = new Intent(PtpapoyoActivity.this,
                Ptp213Activity.class);
                startActivity(intent396);

                Toast toast396 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 213 PTP", Toast.LENGTH_LONG);
                toast396.show();
                break;

            case R.id.ptp214:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb397.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb388.setTypeface(null, Typeface.NORMAL);
                rb389.setTypeface(null, Typeface.NORMAL);
                rb390.setTypeface(null, Typeface.NORMAL);
                rb391.setTypeface(null, Typeface.NORMAL);
                rb392.setTypeface(null, Typeface.NORMAL);
                rb393.setTypeface(null, Typeface.NORMAL);
                rb394.setTypeface(null, Typeface.NORMAL);
                rb395.setTypeface(null, Typeface.NORMAL);
                rb396.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent397 = new Intent(PtpapoyoActivity.this,
                Ptp214Activity.class);
                startActivity(intent397);

                Toast toast397 =
                        Toast.makeText(PtpapoyoActivity.this, "Has seleccionado: 214 PTP", Toast.LENGTH_LONG);
                toast397.show();
                break;

        }
    }
}

