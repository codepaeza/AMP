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

public class Mtramo404Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo404);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb332 = (RadioButton) findViewById(R.id.ramo404_01);
        RadioButton rb333 = (RadioButton) findViewById(R.id.ramo404_02);
        RadioButton rb334 = (RadioButton) findViewById(R.id.ramo404_03);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo404_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb332.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb333.setTypeface(null, Typeface.NORMAL);
                rb334.setTypeface(null, Typeface.NORMAL);

                //Starting new intent
                Intent intent332 = new Intent(Mtramo404Activity.this,
                        MainActivity.class);
                startActivity(intent332);


                Toast toast332 =
                        Toast.makeText(Mtramo404Activity.this, "Código Falla: RA76 - Criticidad: 1", Toast.LENGTH_LONG);
                toast332.show();
                break;

            case R.id.ramo404_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb333.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb332.setTypeface(null, Typeface.NORMAL);
                rb334.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent333 = new Intent(Mtramo404Activity.this,
                        MainActivity.class);
                startActivity(intent333);


                Toast toast333 =
                        Toast.makeText(Mtramo404Activity.this, "Código Falla: RA77 - Criticidad: 2", Toast.LENGTH_LONG);
                toast333.show();
                break;

            case R.id.ramo404_03:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb334.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb332.setTypeface(null, Typeface.NORMAL);
                rb334.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent334 = new Intent(Mtramo404Activity.this,
                        MainActivity.class);
                startActivity(intent334);


                Toast toast334 =
                        Toast.makeText(Mtramo404Activity.this, "Código Falla: RA78 - Criticidad: 3", Toast.LENGTH_LONG);
                toast334.show();
                break;

        }

    }
}