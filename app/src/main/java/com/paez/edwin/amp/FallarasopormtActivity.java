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

public class FallarasopormtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falla_rasopormt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb401 = (RadioButton) findViewById(R.id.ramo401);
        RadioButton rb403 = (RadioButton) findViewById(R.id.ramo403);
        RadioButton rb404 = (RadioButton) findViewById(R.id.ramo404);
        RadioButton rb405 = (RadioButton) findViewById(R.id.ramo405);
        RadioButton rb408 = (RadioButton) findViewById(R.id.ramo408);
        RadioButton rb410 = (RadioButton) findViewById(R.id.ramo410);
        RadioButton rb412 = (RadioButton) findViewById(R.id.ramo412);
        RadioButton rb413 = (RadioButton) findViewById(R.id.ramo413);
        RadioButton rb416 = (RadioButton) findViewById(R.id.ramo416);
        RadioButton rb417 = (RadioButton) findViewById(R.id.ramo417);
        RadioButton rb418 = (RadioButton) findViewById(R.id.ramo418);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo401:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb401.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);



                //Starting new intent
                Intent intent401 = new Intent(FallarasopormtActivity.this,
                Mtramo401Activity.class);
                startActivity(intent401);


                Toast toast401 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 401 RAMO", Toast.LENGTH_LONG);
                toast401.show();
                break;

            case R.id.ramo403:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb403.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent403 = new Intent(FallarasopormtActivity.this,
                Mtramo403Activity.class);
                startActivity(intent403);

                Toast toast403 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 403 RAMO", Toast.LENGTH_LONG);
                toast403.show();
                break;

            case R.id.ramo404:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb404.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent404 = new Intent(FallarasopormtActivity.this,
                Mtramo404Activity.class);
                startActivity(intent404);

                Toast toast404=
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 404 RAMO", Toast.LENGTH_LONG);
                toast404.show();
                break;

            case R.id.ramo405:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb405.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent405 = new Intent(FallarasopormtActivity.this,
                Mtramo405Activity.class);
                startActivity(intent405);

                Toast toast405 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 405 RAMO", Toast.LENGTH_LONG);
                toast405.show();
                break;

            case R.id.ramo408:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb408.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent408 = new Intent(FallarasopormtActivity.this,
                Mtramo408Activity.class);
                startActivity(intent408);

                Toast toast408 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 408 RAMO", Toast.LENGTH_LONG);
                toast408.show();
                break;


            case R.id.ramo410:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb410.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent410 = new Intent(FallarasopormtActivity.this,
                Mtramo410Activity.class);
                startActivity(intent410);

                Toast toast410 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 410 RAMO", Toast.LENGTH_LONG);
                toast410.show();
                break;


            case R.id.ramo412:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb412.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent412 = new Intent(FallarasopormtActivity.this,
                Mtramo412Activity.class);
                startActivity(intent412);

                Toast toast412 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 412 RAMO", Toast.LENGTH_LONG);
                toast412.show();
                break;

            case R.id.ramo413:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb413.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent413 = new Intent(FallarasopormtActivity.this,
                Mtramo413Activity.class);
                startActivity(intent413);

                Toast toast413 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 413 RAMO", Toast.LENGTH_LONG);
                toast413.show();
                break;


            case R.id.ramo416:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb416.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent416 = new Intent(FallarasopormtActivity.this,
                Mtramo416Activity.class);
                startActivity(intent416);

                Toast toast416 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 416 RAMO", Toast.LENGTH_LONG);
                toast416.show();
                break;

            case R.id.ramo417:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb417.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb418.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent417 = new Intent(FallarasopormtActivity.this,
                Mtramo417Activity.class);
                startActivity(intent417);

                Toast toast417 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 417 RAMO", Toast.LENGTH_LONG);
                toast417.show();
                break;

            case R.id.ramo418:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb418.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb401.setTypeface(null, Typeface.NORMAL);
                rb403.setTypeface(null, Typeface.NORMAL);
                rb404.setTypeface(null, Typeface.NORMAL);
                rb405.setTypeface(null, Typeface.NORMAL);
                rb408.setTypeface(null, Typeface.NORMAL);
                rb410.setTypeface(null, Typeface.NORMAL);
                rb412.setTypeface(null, Typeface.NORMAL);
                rb413.setTypeface(null, Typeface.NORMAL);
                rb416.setTypeface(null, Typeface.NORMAL);
                rb417.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent418 = new Intent(FallarasopormtActivity.this,
                Mtramo418Activity.class);
                startActivity(intent418);

                Toast toast418 =
                        Toast.makeText(FallarasopormtActivity.this, "Has seleccionado: 418 RAMO", Toast.LENGTH_LONG);
                toast418.show();
                break;
        }
    }
}

