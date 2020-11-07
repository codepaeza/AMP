package com.paez.edwin.amp;

/**
 * Created by PC on 27/12/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class AcategbtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acateg_bt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1003 = (RadioButton) findViewById(R.id.alineabt);
        RadioButton rb1004 = (RadioButton) findViewById(R.id.aconducbt);
        RadioButton rb1005 = (RadioButton) findViewById(R.id.apostebt);
        RadioButton rb1006 = (RadioButton) findViewById(R.id.atermibt);
        RadioButton rb1007 = (RadioButton) findViewById(R.id.apatbt);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.alineabt:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1003.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1004.setTypeface(null, Typeface.NORMAL);
                rb1005.setTypeface(null, Typeface.NORMAL);
                rb1006.setTypeface(null, Typeface.NORMAL);
                rb1007.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent1003 = new Intent(AcategbtActivity.this,
                        SecfallabtActivit.class);
               startActivity(intent1003);


                Toast toast1003 =
                        Toast.makeText(AcategbtActivity.this, "Has seleccionado: Sección Línea BT", Toast.LENGTH_LONG);
                toast1003.show();
                break;

            case R.id.aconducbt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1004.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1003.setTypeface(null, Typeface.NORMAL);
                rb1005.setTypeface(null, Typeface.NORMAL);
                rb1006.setTypeface(null, Typeface.NORMAL);
                rb1007.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent1004 = new Intent(AcategbtActivity.this,
                  ConducfallabtActivity.class);
                startActivity(intent1004);

                Toast toast1004 =
                        Toast.makeText(AcategbtActivity.this, "Has seleccionado: Conductores", Toast.LENGTH_LONG);
                toast1004.show();
                break;

            case R.id.apostebt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1005.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1003.setTypeface(null, Typeface.NORMAL);
                rb1004.setTypeface(null, Typeface.NORMAL);
                rb1006.setTypeface(null, Typeface.NORMAL);
                rb1007.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent33 = new Intent(CategptpActivity.this,
                 //       PtpseccActivity.class);
               // startActivity(intent33);

                Toast toast1005 =
                        Toast.makeText(AcategbtActivity.this, "Has seleccionado: Apoyo/Poste", Toast.LENGTH_LONG);
                toast1005.show();
                break;

            case R.id.atermibt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1006.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1003.setTypeface(null, Typeface.NORMAL);
                rb1004.setTypeface(null, Typeface.NORMAL);
                rb1005.setTypeface(null, Typeface.NORMAL);
                rb1007.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent34 = new Intent(CategptpActivity.this,
                  //      PtptrafoActivity.class);
               // startActivity(intent34);

                Toast toast1006 =
                        Toast.makeText(AcategbtActivity.this, "Has seleccionado: Conectores y Terminales", Toast.LENGTH_LONG);
                toast1006.show();
                break;


            case R.id.apatbt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1007.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1003.setTypeface(null, Typeface.NORMAL);
                rb1004.setTypeface(null, Typeface.NORMAL);
                rb1005.setTypeface(null, Typeface.NORMAL);
                rb1006.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent35 = new Intent(AcategbtActivity.this,
                  //      PtppatActivity.class);
               // startActivity(intent35);

                Toast toast1007 =
                        Toast.makeText(AcategbtActivity.this, "Has seleccionado: Puesta a Tierra", Toast.LENGTH_LONG);
                toast1007.show();
                break;


        }
    }
}

