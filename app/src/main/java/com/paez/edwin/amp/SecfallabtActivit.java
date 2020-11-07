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

public class SecfallabtActivit extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secfalla_bt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1011 = (RadioButton) findViewById(R.id.bt_b001);
        RadioButton rb1012 = (RadioButton) findViewById(R.id.bt_b002);
        RadioButton rb1013 = (RadioButton) findViewById(R.id.bt_b003);
        RadioButton rb1014 = (RadioButton) findViewById(R.id.bt_b004);
        RadioButton rb1015 = (RadioButton) findViewById(R.id.bt_b005);
        RadioButton rb1016 = (RadioButton) findViewById(R.id.bt_b006);
        RadioButton rb1017 = (RadioButton) findViewById(R.id.bt_b041);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.bt_b001:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1011.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1012.setTypeface(null, Typeface.NORMAL);
                rb1013.setTypeface(null, Typeface.NORMAL);
                rb1014.setTypeface(null, Typeface.NORMAL);
                rb1015.setTypeface(null, Typeface.NORMAL);
                rb1016.setTypeface(null, Typeface.NORMAL);
                rb1017.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1011 =
                        Toast.makeText(SecfallabtActivit.this, "Has seleccionado: B001 ", Toast.LENGTH_LONG);
                toast1011.show();
                break;

                       case R.id.bt_b002:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1012.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1011.setTypeface(null, Typeface.NORMAL);
                rb1013.setTypeface(null, Typeface.NORMAL);
                rb1014.setTypeface(null, Typeface.NORMAL);
                rb1015.setTypeface(null, Typeface.NORMAL);
                rb1016.setTypeface(null, Typeface.NORMAL);
                rb1017.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1012 =
                        Toast.makeText(SecfallabtActivit.this, "Has seleccionado: B002 ", Toast.LENGTH_LONG);
                toast1012.show();
                break;

            case R.id.bt_b003:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1013.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1011.setTypeface(null, Typeface.NORMAL);
                rb1012.setTypeface(null, Typeface.NORMAL);
                rb1014.setTypeface(null, Typeface.NORMAL);
                rb1015.setTypeface(null, Typeface.NORMAL);
                rb1016.setTypeface(null, Typeface.NORMAL);
                rb1017.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1013 =
                        Toast.makeText(SecfallabtActivit.this, "Has seleccionado: B003 ", Toast.LENGTH_LONG);
                toast1013.show();
                break;

            case R.id.bt_b004:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1014.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1011.setTypeface(null, Typeface.NORMAL);
                rb1012.setTypeface(null, Typeface.NORMAL);
                rb1013.setTypeface(null, Typeface.NORMAL);
                rb1015.setTypeface(null, Typeface.NORMAL);
                rb1016.setTypeface(null, Typeface.NORMAL);
                rb1017.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1014 =
                        Toast.makeText(SecfallabtActivit.this, "Has seleccionado: B004 ", Toast.LENGTH_LONG);
                toast1014.show();
                break;

            case R.id.bt_b005:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1015.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1011.setTypeface(null, Typeface.NORMAL);
                rb1012.setTypeface(null, Typeface.NORMAL);
                rb1013.setTypeface(null, Typeface.NORMAL);
                rb1014.setTypeface(null, Typeface.NORMAL);
                rb1016.setTypeface(null, Typeface.NORMAL);
                rb1017.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1015 =
                        Toast.makeText(SecfallabtActivit.this, "Has seleccionado: B005 ", Toast.LENGTH_LONG);
                toast1015.show();
                break;

            case R.id.bt_b006:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1016.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1011.setTypeface(null, Typeface.NORMAL);
                rb1012.setTypeface(null, Typeface.NORMAL);
                rb1013.setTypeface(null, Typeface.NORMAL);
                rb1014.setTypeface(null, Typeface.NORMAL);
                rb1015.setTypeface(null, Typeface.NORMAL);
                rb1017.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1016 =
                        Toast.makeText(SecfallabtActivit.this, "Has seleccionado: B006 ", Toast.LENGTH_LONG);
                toast1016.show();
                break;

            case R.id.bt_b041:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1017.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1011.setTypeface(null, Typeface.NORMAL);
                rb1012.setTypeface(null, Typeface.NORMAL);
                rb1013.setTypeface(null, Typeface.NORMAL);
                rb1014.setTypeface(null, Typeface.NORMAL);
                rb1015.setTypeface(null, Typeface.NORMAL);
                rb1016.setTypeface(null, Typeface.NORMAL);



                // Starting new intent
                //Intent intent1010 = new Intent(ScategbtActivity.this,
                //   PtpacceActivity.class);
                // startActivity(intent21);


                Toast toast1017 =
                        Toast.makeText(SecfallabtActivit.this, "Has seleccionado: B041 ", Toast.LENGTH_LONG);
                toast1017.show();
                break;
        }
    }
}

