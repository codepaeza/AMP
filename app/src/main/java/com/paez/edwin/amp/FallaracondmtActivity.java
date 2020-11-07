package com.paez.edwin.amp;

/**
 * Created by PC on 15/05/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class FallaracondmtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falla_racondmt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb201 = (RadioButton) findViewById(R.id.ramo201);
        RadioButton rb217 = (RadioButton) findViewById(R.id.ramo217);
        RadioButton rb202 = (RadioButton) findViewById(R.id.ramo202);
        RadioButton rb203 = (RadioButton) findViewById(R.id.ramo203);
        RadioButton rb204 = (RadioButton) findViewById(R.id.ramo204);
        RadioButton rb205 = (RadioButton) findViewById(R.id.ramo205);
        RadioButton rb206 = (RadioButton) findViewById(R.id.ramo206);
        RadioButton rb207 = (RadioButton) findViewById(R.id.ramo207);
        RadioButton rb208 = (RadioButton) findViewById(R.id.ramo208);
        RadioButton rb209 = (RadioButton) findViewById(R.id.ramo209);
        RadioButton rb210 = (RadioButton) findViewById(R.id.ramo210);
        RadioButton rb211 = (RadioButton) findViewById(R.id.ramo211);
        RadioButton rb212 = (RadioButton) findViewById(R.id.ramo212);
        RadioButton rb213 = (RadioButton) findViewById(R.id.ramo213);
        RadioButton rb214 = (RadioButton) findViewById(R.id.ramo214);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo201:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb201.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent201 = new Intent(FallaracondmtActivity.this,
                Mtramo201Activity.class);
                startActivity(intent201);


                Toast toast201 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 201 RAMO", Toast.LENGTH_LONG);
                toast201.show();
                break;

            case R.id.ramo217:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb217.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
               Intent intent217 = new Intent(FallaracondmtActivity.this,
               Mtramo217Activity.class);
               startActivity(intent217);

                Toast toast217 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 217 RAMO", Toast.LENGTH_LONG);
                toast217.show();
                break;

            case R.id.ramo202:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb202.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent202 = new Intent(FallaracondmtActivity.this,
                Mtramo202Activity.class);
                startActivity(intent202);

                Toast toast202 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 202 RAMO", Toast.LENGTH_LONG);
                toast202.show();
                break;

            case R.id.ramo203:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb203.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent203 = new Intent(FallaracondmtActivity.this,
                Mtramo203Activity.class);
                startActivity(intent203);

                Toast toast203 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 203 RAMO", Toast.LENGTH_LONG);
                toast203.show();
                break;


            case R.id.ramo204:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb204.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent204 = new Intent(FallaracondmtActivity.this,
                Mtramo204Activity.class);
                startActivity(intent204);

                Toast toast204 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 204 RAMO", Toast.LENGTH_LONG);
                toast204.show();
                break;

            case R.id.ramo205:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb205.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent205 = new Intent(FallaracondmtActivity.this,
                Mtramo205Activity.class);
                startActivity(intent205);

                Toast toast205 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 205 RAMO", Toast.LENGTH_LONG);
                toast205.show();
                break;

            case R.id.ramo206:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb206.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent206 = new Intent(FallaracondmtActivity.this,
                Mtramo206Activity.class);
                startActivity(intent206);

                Toast toast206 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 206 RAMO", Toast.LENGTH_LONG);
                toast206.show();
                break;

            case R.id.ramo207:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb207.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent207 = new Intent(FallaracondmtActivity.this,
                Mtramo207Activity.class);
                startActivity(intent207);

                Toast toast207 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 207 RAMO", Toast.LENGTH_LONG);
                toast207.show();
                break;

            case R.id.ramo208:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb208.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent208 = new Intent(FallaracondmtActivity.this,
                Mtramo208Activity.class);
                startActivity(intent208);

                Toast toast208 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 208 RAMO", Toast.LENGTH_LONG);
                toast208.show();
                break;

            case R.id.ramo209:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb209.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent209 = new Intent(FallaracondmtActivity.this,
                Mtramo209Activity.class);
                startActivity(intent209);

                Toast toast209 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 209 RAMO", Toast.LENGTH_LONG);
                toast209.show();
                break;

            case R.id.ramo210:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb210.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent210 = new Intent(FallaracondmtActivity.this,
                Mtramo210Activity.class);
                startActivity(intent210);

                Toast toast210 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 210 RAMO", Toast.LENGTH_LONG);
                toast210.show();
                break;


            case R.id.ramo211:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb211.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent211 = new Intent(FallaracondmtActivity.this,
                Mtramo211Activity.class);
                startActivity(intent211);

                Toast toast211 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 211 RAMO", Toast.LENGTH_LONG);
                toast211.show();
                break;

            case R.id.ramo212:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb212.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent212 = new Intent(FallaracondmtActivity.this,
                Mtramo212Activity.class);
                startActivity(intent212);

                Toast toast212 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 212 RAMO", Toast.LENGTH_LONG);
                toast212.show();
                break;

            case R.id.ramo213:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb213.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb214.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent213 = new Intent(FallaracondmtActivity.this,
                Mtramo213Activity.class);
                startActivity(intent213);

                Toast toast213 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 213 RAMO", Toast.LENGTH_LONG);
                toast213.show();
                break;

            case R.id.ramo214:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb214.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb201.setTypeface(null, Typeface.NORMAL);
                rb217.setTypeface(null, Typeface.NORMAL);
                rb202.setTypeface(null, Typeface.NORMAL);
                rb203.setTypeface(null, Typeface.NORMAL);
                rb204.setTypeface(null, Typeface.NORMAL);
                rb205.setTypeface(null, Typeface.NORMAL);
                rb206.setTypeface(null, Typeface.NORMAL);
                rb207.setTypeface(null, Typeface.NORMAL);
                rb208.setTypeface(null, Typeface.NORMAL);
                rb209.setTypeface(null, Typeface.NORMAL);
                rb210.setTypeface(null, Typeface.NORMAL);
                rb211.setTypeface(null, Typeface.NORMAL);
                rb212.setTypeface(null, Typeface.NORMAL);
                rb213.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent214 = new Intent(FallaracondmtActivity.this,
                Mtramo214Activity.class);
                startActivity(intent214);

                Toast toast214 =
                        Toast.makeText(FallaracondmtActivity.this, "Has seleccionado: 214 RAMO", Toast.LENGTH_LONG);
                toast214.show();
                break;

        }
    }
}

