package com.paez.edwin.amp;

/**
 * Created by PC on 7/01/2018.
 */


import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class DcategbtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dcateg_bt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1008 = (RadioButton) findViewById(R.id.dconducbt);
        RadioButton rb1009 = (RadioButton) findViewById(R.id.dcajaconbt);



        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.dconducbt:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1008.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1009.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent21 = new Intent(CategptpActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1008 =
                        Toast.makeText(DcategbtActivity.this, "Has seleccionado: Conductores", Toast.LENGTH_LONG);
                toast1008.show();
                break;

            case R.id.dcajaconbt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1009.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1008.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                //Intent intent32 = new Intent(CategptpActivity.this,
                //      PtpapoyoActivity.class);
                //startActivity(intent32);

                Toast toast1009 =
                        Toast.makeText(DcategbtActivity.this, "Has seleccionado: Caja de conexión", Toast.LENGTH_LONG);
                toast1009.show();
                break;


        }
    }
}

