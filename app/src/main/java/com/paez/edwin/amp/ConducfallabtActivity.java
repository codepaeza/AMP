package com.paez.edwin.amp;

/**
 * Created by PC on 14/01/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ConducfallabtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conducfalla_bt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class

        RadioButton rb1018 = (RadioButton) findViewById(R.id.bt_b007);
        RadioButton rb1019 = (RadioButton) findViewById(R.id.bt_b008);
        RadioButton rb1020 = (RadioButton) findViewById(R.id.bt_b009);
        RadioButton rb1021 = (RadioButton) findViewById(R.id.bt_b010);
        RadioButton rb1022 = (RadioButton) findViewById(R.id.bt_b011);
        RadioButton rb1023 = (RadioButton) findViewById(R.id.bt_b014);
        RadioButton rb1024 = (RadioButton) findViewById(R.id.bt_b044);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.bt_b007:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1018.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1019.setTypeface(null, Typeface.NORMAL);
                rb1020.setTypeface(null, Typeface.NORMAL);
                rb1021.setTypeface(null, Typeface.NORMAL);
                rb1022.setTypeface(null, Typeface.NORMAL);
                rb1023.setTypeface(null, Typeface.NORMAL);
                rb1024.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1018 =
                        Toast.makeText(ConducfallabtActivity.this, "Has seleccionado: B007 ", Toast.LENGTH_LONG);
                toast1018.show();
                break;

            case R.id.bt_b008:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1019.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1018.setTypeface(null, Typeface.NORMAL);
                rb1020.setTypeface(null, Typeface.NORMAL);
                rb1021.setTypeface(null, Typeface.NORMAL);
                rb1022.setTypeface(null, Typeface.NORMAL);
                rb1023.setTypeface(null, Typeface.NORMAL);
                rb1024.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1019 =
                        Toast.makeText(ConducfallabtActivity.this, "Has seleccionado: B008 ", Toast.LENGTH_LONG);
                toast1019.show();
                break;

            case R.id.bt_b009:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1020.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1018.setTypeface(null, Typeface.NORMAL);
                rb1019.setTypeface(null, Typeface.NORMAL);
                rb1021.setTypeface(null, Typeface.NORMAL);
                rb1022.setTypeface(null, Typeface.NORMAL);
                rb1023.setTypeface(null, Typeface.NORMAL);
                rb1024.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1020 =
                        Toast.makeText(ConducfallabtActivity.this, "Has seleccionado: B009 ", Toast.LENGTH_LONG);
                toast1020.show();
                break;

            case R.id.bt_b010:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1021.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1018.setTypeface(null, Typeface.NORMAL);
                rb1019.setTypeface(null, Typeface.NORMAL);
                rb1020.setTypeface(null, Typeface.NORMAL);
                rb1022.setTypeface(null, Typeface.NORMAL);
                rb1023.setTypeface(null, Typeface.NORMAL);
                rb1024.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1021 =
                        Toast.makeText(ConducfallabtActivity.this, "Has seleccionado: B010 ", Toast.LENGTH_LONG);
                toast1021.show();
                break;

            case R.id.bt_b011:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1022.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1018.setTypeface(null, Typeface.NORMAL);
                rb1019.setTypeface(null, Typeface.NORMAL);
                rb1020.setTypeface(null, Typeface.NORMAL);
                rb1021.setTypeface(null, Typeface.NORMAL);
                rb1023.setTypeface(null, Typeface.NORMAL);
                rb1024.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1022 =
                        Toast.makeText(ConducfallabtActivity.this, "Has seleccionado: B011 ", Toast.LENGTH_LONG);
                toast1022.show();
                break;

            case R.id.bt_b014:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1023.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1018.setTypeface(null, Typeface.NORMAL);
                rb1019.setTypeface(null, Typeface.NORMAL);
                rb1020.setTypeface(null, Typeface.NORMAL);
                rb1021.setTypeface(null, Typeface.NORMAL);
                rb1022.setTypeface(null, Typeface.NORMAL);
                rb1024.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1023 =
                        Toast.makeText(ConducfallabtActivity.this, "Has seleccionado: B014 ", Toast.LENGTH_LONG);
                toast1023.show();
                break;

            case R.id.bt_b044:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1024.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1018.setTypeface(null, Typeface.NORMAL);
                rb1019.setTypeface(null, Typeface.NORMAL);
                rb1020.setTypeface(null, Typeface.NORMAL);
                rb1021.setTypeface(null, Typeface.NORMAL);
                rb1022.setTypeface(null, Typeface.NORMAL);
                rb1023.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1024 =
                        Toast.makeText(ConducfallabtActivity.this, "Has seleccionado: B044 ", Toast.LENGTH_LONG);
                toast1024.show();
                break;
        }
    }
}
