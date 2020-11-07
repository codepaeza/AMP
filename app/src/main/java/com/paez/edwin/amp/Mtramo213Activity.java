package com.paez.edwin.amp;

/**
 * Created by PC on 20/08/2017.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo213Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo213);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1992 = (RadioButton) findViewById(R.id.ramo213_01);
        RadioButton rb1993 = (RadioButton) findViewById(R.id.ramo213_02);
        RadioButton rb1994 = (RadioButton) findViewById(R.id.ramo213_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo213_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1992.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1993.setTypeface(null, Typeface.NORMAL);
                rb1994.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent1992 = new Intent(Mtramo213Activity.this,
                        MainActivity.class);
                startActivity(intent1992);


                Toast toast1992 =
                        Toast.makeText(Mtramo213Activity.this, "Código Falla: RA49 - Criticidad: 1", Toast.LENGTH_LONG);
                toast1992.show();
                break;

            case R.id.ramo213_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1993.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1992.setTypeface(null, Typeface.NORMAL);
                rb1994.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent1993 = new Intent(Mtramo213Activity.this,
                        MainActivity.class);
                startActivity(intent1993);


                Toast toast1993 =
                        Toast.makeText(Mtramo213Activity.this, "Código Falla: RA49 - Criticidad: 1", Toast.LENGTH_LONG);
                toast1993.show();
                break;

            case R.id.ramo213_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1994.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1993.setTypeface(null, Typeface.NORMAL);
                rb1994.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent1994 = new Intent(Mtramo213Activity.this,
                        MainActivity.class);
                startActivity(intent1994);


                Toast toast1994 =
                        Toast.makeText(Mtramo213Activity.this, "Código Falla: RA49 - Criticidad: 1", Toast.LENGTH_LONG);
                toast1994.show();
                break;


        }

    }
}