package com.paez.edwin.amp;

/**
 * Created by PC on 9/05/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class CategoriamtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoria_mt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb21 = (RadioButton) findViewById(R.id.accemt);
        RadioButton rb22 = (RadioButton) findViewById(R.id.conducmt);
        RadioButton rb23 = (RadioButton) findViewById(R.id.aislamt);
        RadioButton rb24 = (RadioButton) findViewById(R.id.soportmt);
        RadioButton rb25 = (RadioButton) findViewById(R.id.cablemt);
        RadioButton rb26 = (RadioButton) findViewById(R.id.secciomt);
        RadioButton rb27 = (RadioButton) findViewById(R.id.teleconmt);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.accemt:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb21.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb22.setTypeface(null, Typeface.NORMAL);
                rb23.setTypeface(null, Typeface.NORMAL);
                rb24.setTypeface(null, Typeface.NORMAL);
                rb25.setTypeface(null, Typeface.NORMAL);
                rb26.setTypeface(null, Typeface.NORMAL);
                rb27.setTypeface(null, Typeface.NORMAL);

                 //Starting new intent
                 Intent intent21 = new Intent(CategoriamtActivity.this,
                 FallaraaccemtActivity.class);
                 startActivity(intent21);


                Toast toast21 =
                        Toast.makeText(CategoriamtActivity.this, "Has seleccionado: Accesibilidad", Toast.LENGTH_LONG);
                toast21.show();
                break;

            case R.id.conducmt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb22.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb21.setTypeface(null, Typeface.NORMAL);
                rb23.setTypeface(null, Typeface.NORMAL);
                rb24.setTypeface(null, Typeface.NORMAL);
                rb25.setTypeface(null, Typeface.NORMAL);
                rb26.setTypeface(null, Typeface.NORMAL);
                rb27.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent22 = new Intent(CategoriamtActivity.this,
                FallaracondmtActivity.class);
                startActivity(intent22);

                Toast toast22 =
                        Toast.makeText(CategoriamtActivity.this, "Has seleccionado: Conductores", Toast.LENGTH_LONG);
                toast22.show();
                break;

            case R.id.aislamt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb23.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb21.setTypeface(null, Typeface.NORMAL);
                rb22.setTypeface(null, Typeface.NORMAL);
                rb24.setTypeface(null, Typeface.NORMAL);
                rb25.setTypeface(null, Typeface.NORMAL);
                rb26.setTypeface(null, Typeface.NORMAL);
                rb27.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent23 = new Intent(CategoriamtActivity.this,
                FallaraaislemtActivity.class);
                startActivity(intent23);

                Toast toast23 =
                        Toast.makeText(CategoriamtActivity.this, "Has seleccionado: Aisladores", Toast.LENGTH_LONG);
                toast23.show();
                break;

            case R.id.soportmt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb24.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb21.setTypeface(null, Typeface.NORMAL);
                rb22.setTypeface(null, Typeface.NORMAL);
                rb23.setTypeface(null, Typeface.NORMAL);
                rb25.setTypeface(null, Typeface.NORMAL);
                rb26.setTypeface(null, Typeface.NORMAL);
                rb27.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
               Intent intent24 = new Intent(CategoriamtActivity.this,
                FallarasopormtActivity.class);
                startActivity(intent24);

                Toast toast24 =
                        Toast.makeText(CategoriamtActivity.this, "Has seleccionado: Soportes", Toast.LENGTH_LONG);
                toast24.show();
                break;


            case R.id.cablemt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb25.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb21.setTypeface(null, Typeface.NORMAL);
                rb22.setTypeface(null, Typeface.NORMAL);
                rb23.setTypeface(null, Typeface.NORMAL);
                rb24.setTypeface(null, Typeface.NORMAL);
                rb26.setTypeface(null, Typeface.NORMAL);
                rb27.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent25 = new Intent(CategoriamtActivity.this,
                FallaratermimtActivity.class);
                startActivity(intent25);

                Toast toast25 =
                        Toast.makeText(CategoriamtActivity.this, "Has seleccionado: Terminales y Cables", Toast.LENGTH_LONG);
                toast25.show();
                break;

            case R.id.secciomt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb26.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb21.setTypeface(null, Typeface.NORMAL);
                rb22.setTypeface(null, Typeface.NORMAL);
                rb23.setTypeface(null, Typeface.NORMAL);
                rb24.setTypeface(null, Typeface.NORMAL);
                rb25.setTypeface(null, Typeface.NORMAL);
                rb27.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent26 = new Intent(CategoriamtActivity.this,
                FallaraseccmtActivity.class);
                startActivity(intent26);

                Toast toast26 =
                        Toast.makeText(CategoriamtActivity.this, "Has seleccionado: Seccionadores", Toast.LENGTH_LONG);
                toast26.show();
                break;

            case R.id.teleconmt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb27.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb21.setTypeface(null, Typeface.NORMAL);
                rb22.setTypeface(null, Typeface.NORMAL);
                rb23.setTypeface(null, Typeface.NORMAL);
                rb24.setTypeface(null, Typeface.NORMAL);
                rb25.setTypeface(null, Typeface.NORMAL);
                rb26.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent27 = new Intent(CategoriamtActivity.this,
                FallaratelecmtActivity.class);
                startActivity(intent27);

                Toast toast27 =
                        Toast.makeText(CategoriamtActivity.this, "Has seleccionado: Telecontrol", Toast.LENGTH_LONG);
                toast27.show();
                break;




        }
    }
}
