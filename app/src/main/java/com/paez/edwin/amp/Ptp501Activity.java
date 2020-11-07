package com.paez.edwin.amp;

/**
 * Created by PC on 25/12/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp501Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp501);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb529 = (RadioButton) findViewById(R.id.ptp88);
        RadioButton rb530 = (RadioButton) findViewById(R.id.ptp88_1);
        RadioButton rb531 = (RadioButton) findViewById(R.id.ptp89);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp88:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb529.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb530.setTypeface(null, Typeface.NORMAL);
                rb531.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent529 = new Intent(Ptp501Activity.this,
                        MainActivity.class);
                startActivity(intent529);


                Toast toast529 =
                        Toast.makeText(Ptp501Activity.this, "Código Falla: PTP88 - Criticidad: 1", Toast.LENGTH_LONG);
                toast529.show();
                break;

            case R.id.ptp88_1:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb530.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb529.setTypeface(null, Typeface.NORMAL);
                rb531.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent530 = new Intent(Ptp501Activity.this,
                        MainActivity.class);
                startActivity(intent530);


                Toast toast530 =
                        Toast.makeText(Ptp501Activity.this, "Código Falla: PTP88 - Criticidad: 1", Toast.LENGTH_LONG);
                toast530.show();
                break;

            case R.id.ptp89:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb531.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb529.setTypeface(null, Typeface.NORMAL);
                rb530.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent531 = new Intent(Ptp501Activity.this,
                        MainActivity.class);
                startActivity(intent531);


                Toast toast531 =
                        Toast.makeText(Ptp501Activity.this, "Código Falla: PTP89 - Criticidad: 2", Toast.LENGTH_LONG);
                toast531.show();
                break;
        }
    }
}
