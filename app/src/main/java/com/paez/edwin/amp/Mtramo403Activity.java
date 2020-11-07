package com.paez.edwin.amp;

/**
 * Created by PC on 18/11/2017.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo403Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo403);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb329 = (RadioButton) findViewById(R.id.ramo403_01);
        RadioButton rb330 = (RadioButton) findViewById(R.id.ramo403_02);
        RadioButton rb331 = (RadioButton) findViewById(R.id.ramo403_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo403_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb329.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb330.setTypeface(null, Typeface.NORMAL);
                rb331.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent329 = new Intent(Mtramo403Activity.this,
                        MainActivity.class);
                startActivity(intent329);


                Toast toast329 =
                        Toast.makeText(Mtramo403Activity.this, "Código Falla: RA73 - Criticidad: 1", Toast.LENGTH_LONG);
                toast329.show();
                break;

            case R.id.ramo403_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb330.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb329.setTypeface(null, Typeface.NORMAL);
                rb331.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent330 = new Intent(Mtramo403Activity.this,
                        MainActivity.class);
                startActivity(intent330);


                Toast toast330 =
                        Toast.makeText(Mtramo403Activity.this, "Código Falla: RA74 - Criticidad: 2", Toast.LENGTH_LONG);
                toast330.show();
                break;

            case R.id.ramo403_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb331.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb329.setTypeface(null, Typeface.NORMAL);
                rb330.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent331 = new Intent(Mtramo403Activity.this,
                        MainActivity.class);
                startActivity(intent331);


                Toast toast331 =
                        Toast.makeText(Mtramo403Activity.this, "Código Falla: RA75 - Criticidad: 3", Toast.LENGTH_LONG);
                toast331.show();
                break;

        }

    }
}