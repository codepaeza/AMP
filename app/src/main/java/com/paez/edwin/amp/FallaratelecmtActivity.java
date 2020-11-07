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

public class FallaratelecmtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falla_ratelecmt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb701 = (RadioButton) findViewById(R.id.ramo701);
        RadioButton rb703 = (RadioButton) findViewById(R.id.ramo703);
        RadioButton rb704 = (RadioButton) findViewById(R.id.ramo704);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo701:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb701.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb703.setTypeface(null, Typeface.NORMAL);
                rb704.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent701 = new Intent(FallaratelecmtActivity.this,
                Mtramo701Activity.class);
                startActivity(intent701);


                Toast toast701 =
                        Toast.makeText(FallaratelecmtActivity.this, "Has seleccionado: 701 RAMO", Toast.LENGTH_LONG);
                toast701.show();
                break;

            case R.id.ramo703:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb703.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb701.setTypeface(null, Typeface.NORMAL);
                rb704.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent703 = new Intent(FallaratelecmtActivity.this,
                Mtramo703Activity.class);
                startActivity(intent703);

                Toast toast703 =
                        Toast.makeText(FallaratelecmtActivity.this, "Has seleccionado: 703 RAMO", Toast.LENGTH_LONG);
                toast703.show();
                break;

            case R.id.ramo704:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb704.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb701.setTypeface(null, Typeface.NORMAL);
                rb703.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                Intent intent704 = new Intent(FallaratelecmtActivity.this,
                Mtramo704Activity.class);
                startActivity(intent704);

                Toast toast704=
                        Toast.makeText(FallaratelecmtActivity.this, "Has seleccionado: 704 RAMO", Toast.LENGTH_LONG);
                toast704.show();
                break;


        }
    }
}

