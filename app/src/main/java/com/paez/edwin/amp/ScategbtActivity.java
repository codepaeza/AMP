package com.paez.edwin.amp;

/**
 * Created by PC on 9/01/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ScategbtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scateg_bt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1010 = (RadioButton) findViewById(R.id.sublineabt);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.dconducbt:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1010.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1010 =
                        Toast.makeText(ScategbtActivity.this, "Has seleccionado: Sección de línea BT", Toast.LENGTH_LONG);
                toast1010.show();
                break;



        }
    }
}

