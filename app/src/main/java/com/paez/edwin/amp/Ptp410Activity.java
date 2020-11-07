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

public class Ptp410Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp410);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb526 = (RadioButton) findViewById(R.id.ptp85);
        RadioButton rb527 = (RadioButton) findViewById(R.id.ptp86);
        RadioButton rb528 = (RadioButton) findViewById(R.id.ptp87);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp85:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb526.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb527.setTypeface(null, Typeface.NORMAL);
                rb528.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent526 = new Intent(Ptp410Activity.this,
                        MainActivity.class);
                startActivity(intent526);


                Toast toast526 =
                        Toast.makeText(Ptp410Activity.this, "Código Falla: PTP85 - Criticidad: 1", Toast.LENGTH_LONG);
                toast526.show();
                break;

            case R.id.ptp86:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb527.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb526.setTypeface(null, Typeface.NORMAL);
                rb528.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent527 = new Intent(Ptp410Activity.this,
                        MainActivity.class);
                startActivity(intent527);


                Toast toast527 =
                        Toast.makeText(Ptp410Activity.this, "Código Falla: PTP86 - Criticidad: 2", Toast.LENGTH_LONG);
                toast527.show();
                break;

            case R.id.ptp87:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb528.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb526.setTypeface(null, Typeface.NORMAL);
                rb527.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent528 = new Intent(Ptp410Activity.this,
                        MainActivity.class);
                startActivity(intent528);


                Toast toast528 =
                        Toast.makeText(Ptp410Activity.this, "Código Falla: PTP87 - Criticidad: 3", Toast.LENGTH_LONG);
                toast528.show();
                break;
        }
    }
}
