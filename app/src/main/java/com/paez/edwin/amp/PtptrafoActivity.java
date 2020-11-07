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

public class PtptrafoActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptp_trafo);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb455 = (RadioButton) findViewById(R.id.ptp401);
        RadioButton rb456 = (RadioButton) findViewById(R.id.ptp402);
        RadioButton rb457 = (RadioButton) findViewById(R.id.ptp403);
        RadioButton rb458 = (RadioButton) findViewById(R.id.ptp404);
        RadioButton rb459 = (RadioButton) findViewById(R.id.ptp405);
        RadioButton rb460 = (RadioButton) findViewById(R.id.ptp406);
        RadioButton rb461 = (RadioButton) findViewById(R.id.ptp411);
        RadioButton rb462 = (RadioButton) findViewById(R.id.ptp407);
        RadioButton rb463 = (RadioButton) findViewById(R.id.ptp408);
        RadioButton rb464 = (RadioButton) findViewById(R.id.ptp409);
        RadioButton rb465 = (RadioButton) findViewById(R.id.ptp410);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp401:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb455.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent455 = new Intent(PtptrafoActivity.this,
                Ptp401Activity.class);
                startActivity(intent455);


                Toast toast455 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 401 PTP", Toast.LENGTH_LONG);
                toast455.show();
                break;

            case R.id.ptp402:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb456.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent456 = new Intent(PtptrafoActivity.this,
                Ptp402Activity.class);
                startActivity(intent456);

                Toast toast456 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 402 PTP", Toast.LENGTH_LONG);
                toast456.show();
                break;

            case R.id.ptp403:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb457.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent457 = new Intent(PtptrafoActivity.this,
                Ptp403Activity.class);
                startActivity(intent457);

                Toast toast457 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 403 PTP", Toast.LENGTH_LONG);
                toast457.show();
                break;

            case R.id.ptp404:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb458.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent458 = new Intent(PtptrafoActivity.this,
                Ptp404Activity.class);
                startActivity(intent458);

                Toast toast458 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 404 PTP", Toast.LENGTH_LONG);
                toast458.show();
                break;

            case R.id.ptp405:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb459.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent459 = new Intent(PtptrafoActivity.this,
                Ptp405Activity.class);
                startActivity(intent459);

                Toast toast459 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 405 PTP", Toast.LENGTH_LONG);
                toast459.show();
                break;

            case R.id.ptp406:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb460.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent460 = new Intent(PtptrafoActivity.this,
                Ptp406Activity.class);
                startActivity(intent460);

                Toast toast460 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 406 PTP", Toast.LENGTH_LONG);
                toast460.show();
                break;

            case R.id.ptp411:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb461.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent461 = new Intent(PtptrafoActivity.this,
                Ptp411Activity.class);
                startActivity(intent461);

                Toast toast461 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 411 PTP", Toast.LENGTH_LONG);
                toast461.show();
                break;

            case R.id.ptp407:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb462.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent462 = new Intent(PtptrafoActivity.this,
                Ptp407Activity.class);
                startActivity(intent462);

                Toast toast462 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 407 PTP", Toast.LENGTH_LONG);
                toast462.show();
                break;

            case R.id.ptp408:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb463.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent463 = new Intent(PtptrafoActivity.this,
                Ptp408Activity.class);
                startActivity(intent463);

                Toast toast463 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 408 PTP", Toast.LENGTH_LONG);
                toast463.show();
                break;

            case R.id.ptp409:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb464.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb465.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent464 = new Intent(PtptrafoActivity.this,
                Ptp409Activity.class);
                startActivity(intent464);

                Toast toast464 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 409 PTP", Toast.LENGTH_LONG);
                toast464.show();
                break;

            case R.id.ptp410:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb465.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb455.setTypeface(null, Typeface.NORMAL);
                rb456.setTypeface(null, Typeface.NORMAL);
                rb457.setTypeface(null, Typeface.NORMAL);
                rb458.setTypeface(null, Typeface.NORMAL);
                rb459.setTypeface(null, Typeface.NORMAL);
                rb460.setTypeface(null, Typeface.NORMAL);
                rb461.setTypeface(null, Typeface.NORMAL);
                rb462.setTypeface(null, Typeface.NORMAL);
                rb463.setTypeface(null, Typeface.NORMAL);
                rb464.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent465 = new Intent(PtptrafoActivity.this,
                Ptp410Activity.class);
                startActivity(intent465);

                Toast toast465 =
                        Toast.makeText(PtptrafoActivity.this, "Has seleccionado: 410 PTP", Toast.LENGTH_LONG);
                toast465.show();
                break;

        }
    }
}
