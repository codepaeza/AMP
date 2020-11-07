package com.paez.edwin.amp;

/**
 * Created by PC on 21/08/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo305Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo305);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb326 = (RadioButton) findViewById(R.id.ramo305_01);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo305_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb326.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent326 = new Intent(Mtramo305Activity.this,
                        MainActivity.class);
                startActivity(intent326);


                Toast toast326 =
                        Toast.makeText(Mtramo305Activity.this, "Código Falla: RA65 - Criticidad: 2", Toast.LENGTH_LONG);
                toast326.show();
                break;


        }

    }
}