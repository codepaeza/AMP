package com.paez.edwin.amp;

/**
 * Created by PC on 23/12/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp306Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp306);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb501 = (RadioButton) findViewById(R.id.ptp40);
        RadioButton rb502 = (RadioButton) findViewById(R.id.ptp41);
        RadioButton rb503 = (RadioButton) findViewById(R.id.ptp42);



        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp40:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb501.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb502.setTypeface(null, Typeface.NORMAL);
                rb503.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent501 = new Intent(Ptp306Activity.this,
                        MainActivity.class);
                startActivity(intent501);


                Toast toast501 =
                        Toast.makeText(Ptp306Activity.this, "Código Falla: PTP40 - Criticidad: 1", Toast.LENGTH_LONG);
                toast501.show();
                break;

            case R.id.ptp41:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb502.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb501.setTypeface(null, Typeface.NORMAL);
                rb503.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent502 = new Intent(Ptp306Activity.this,
                        MainActivity.class);
                startActivity(intent502);


                Toast toast502 =
                        Toast.makeText(Ptp306Activity.this, "Código Falla: PTP41 - Criticidad: 2", Toast.LENGTH_LONG);
                toast502.show();
                break;

            case R.id.ptp42:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb503.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb501.setTypeface(null, Typeface.NORMAL);
                rb502.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent503 = new Intent(Ptp306Activity.this,
                        MainActivity.class);
                startActivity(intent503);


                Toast toast503 =
                        Toast.makeText(Ptp306Activity.this, "Código Falla: PTP42 - Criticidad: 3", Toast.LENGTH_LONG);
                toast503.show();
                break;

        }
    }
}
