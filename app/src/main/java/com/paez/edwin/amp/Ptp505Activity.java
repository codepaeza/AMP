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

public class Ptp505Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp505);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb535 = (RadioButton) findViewById(R.id.ptp101);
        RadioButton rb536 = (RadioButton) findViewById(R.id.ptp102);
        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp101:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb535.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb536.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent535 = new Intent(Ptp505Activity.this,
                        MainActivity.class);
                startActivity(intent535);


                Toast toast535 =
                        Toast.makeText(Ptp505Activity.this, "Código Falla: PTP101 - Criticidad: 2", Toast.LENGTH_LONG);
                toast535.show();
                break;

            case R.id.ptp102:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb536.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb535.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent536 = new Intent(Ptp505Activity.this,
                        MainActivity.class);
                startActivity(intent536);


                Toast toast536 =
                        Toast.makeText(Ptp505Activity.this, "Código Falla: PTP102 - Criticidad: 3", Toast.LENGTH_LONG);
                toast536.show();
                break;
        }
    }
}
