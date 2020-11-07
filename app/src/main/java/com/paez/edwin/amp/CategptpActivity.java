package com.paez.edwin.amp;

/**
 * Created by PC on 14/05/2017.
 */

import android.content.Context;
        import android.content.Intent;
        import android.graphics.Typeface;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.view.View;
        import android.widget.RadioButton;
        import android.widget.Toast;

public class CategptpActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categ_ptp);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb31 = (RadioButton) findViewById(R.id.acceptp);
        RadioButton rb32 = (RadioButton) findViewById(R.id.apoyoptp);
        RadioButton rb33 = (RadioButton) findViewById(R.id.seccioptp);
        RadioButton rb34 = (RadioButton) findViewById(R.id.trafoptp);
        RadioButton rb35 = (RadioButton) findViewById(R.id.patptp);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.acceptp:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb31.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb32.setTypeface(null, Typeface.NORMAL);
                rb33.setTypeface(null, Typeface.NORMAL);
                rb34.setTypeface(null, Typeface.NORMAL);
                rb35.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent21 = new Intent(CategptpActivity.this,
                        PtpacceActivity.class);
                startActivity(intent21);


                Toast toast31 =
                        Toast.makeText(CategptpActivity.this, "Has seleccionado: Accesibilidad", Toast.LENGTH_LONG);
                toast31.show();
                break;

            case R.id.apoyoptp:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb32.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb31.setTypeface(null, Typeface.NORMAL);
                rb33.setTypeface(null, Typeface.NORMAL);
                rb34.setTypeface(null, Typeface.NORMAL);
                rb35.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent32 = new Intent(CategptpActivity.this,
                        PtpapoyoActivity.class);
                startActivity(intent32);

                Toast toast32 =
                        Toast.makeText(CategptpActivity.this, "Has seleccionado: Soportes/Apoyos", Toast.LENGTH_LONG);
                toast32.show();
                break;

            case R.id.seccioptp:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb33.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb31.setTypeface(null, Typeface.NORMAL);
                rb32.setTypeface(null, Typeface.NORMAL);
                rb34.setTypeface(null, Typeface.NORMAL);
                rb35.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent33 = new Intent(CategptpActivity.this,
                        PtpseccActivity.class);
                startActivity(intent33);

                Toast toast33 =
                        Toast.makeText(CategptpActivity.this, "Has seleccionado: Seccionador", Toast.LENGTH_LONG);
                toast33.show();
                break;

            case R.id.trafoptp:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb34.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb31.setTypeface(null, Typeface.NORMAL);
                rb32.setTypeface(null, Typeface.NORMAL);
                rb33.setTypeface(null, Typeface.NORMAL);
                rb35.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent34 = new Intent(CategptpActivity.this,
                        PtptrafoActivity.class);
                startActivity(intent34);

                Toast toast34 =
                        Toast.makeText(CategptpActivity.this, "Has seleccionado: Transformador", Toast.LENGTH_LONG);
                toast34.show();
                break;


            case R.id.patptp:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb35.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb31.setTypeface(null, Typeface.NORMAL);
                rb32.setTypeface(null, Typeface.NORMAL);
                rb33.setTypeface(null, Typeface.NORMAL);
                rb34.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent35 = new Intent(CategptpActivity.this,
                        PtppatActivity.class);
                startActivity(intent35);

                Toast toast35 =
                        Toast.makeText(CategptpActivity.this, "Has seleccionado: Puesta a Tierra", Toast.LENGTH_LONG);
                toast35.show();
                break;


        }
    }
}


