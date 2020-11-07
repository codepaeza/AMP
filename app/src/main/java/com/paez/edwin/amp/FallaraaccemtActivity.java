package com.paez.edwin.amp;

/**
 * Created by PC on 4/06/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class FallaraaccemtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falla_raaccemt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb101 = (RadioButton) findViewById(R.id.ramo101);
        RadioButton rb102 = (RadioButton) findViewById(R.id.ramo102);
        RadioButton rb103 = (RadioButton) findViewById(R.id.ramo103);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo101:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb101.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb102.setTypeface(null, Typeface.NORMAL);
                rb103.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent101 = new Intent(FallaraaccemtActivity.this,
                Mtramo101Activity.class);
                startActivity(intent101);


                Toast toast101 =
                        Toast.makeText(FallaraaccemtActivity.this, "Has seleccionado: 101 RAMO", Toast.LENGTH_LONG);
                toast101.show();
                break;

            case R.id.ramo102:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb102.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb101.setTypeface(null, Typeface.NORMAL);
                rb103.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent102 = new Intent(FallaraaccemtActivity.this,
                Mtramo102Activity.class);
                startActivity(intent102);

                Toast toast102 =
                        Toast.makeText(FallaraaccemtActivity.this, "Has seleccionado: 102 RAMO", Toast.LENGTH_LONG);
                toast102.show();
                break;

            case R.id.ramo103:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb103.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb101.setTypeface(null, Typeface.NORMAL);
                rb102.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent103 = new Intent(FallaraaccemtActivity.this,
                Mtramo103Activity.class);
                startActivity(intent103);

                Toast toast103 =
                        Toast.makeText(FallaraaccemtActivity.this, "Has seleccionado: 103 RAMO", Toast.LENGTH_LONG);
                toast103.show();
                break;


        }
    }
}

