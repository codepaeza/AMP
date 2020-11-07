package com.paez.edwin.amp;

/**
 * Created by PC on 24/12/2017.
 */


import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp308Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp308);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb506 = (RadioButton) findViewById(R.id.ptp46);
        RadioButton rb507 = (RadioButton) findViewById(R.id.ptp47);
        RadioButton rb508 = (RadioButton) findViewById(R.id.ptp48);



        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp46:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb506.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb507.setTypeface(null, Typeface.NORMAL);
                rb508.setTypeface(null, Typeface.NORMAL);
                //Starting new intent
                Intent intent506 = new Intent(Ptp308Activity.this,
                        MainActivity.class);
                startActivity(intent506);


                Toast toast506 =
                        Toast.makeText(Ptp308Activity.this, "Código Falla: PTP46 - Criticidad: 1", Toast.LENGTH_LONG);
                toast506.show();
                break;

            case R.id.ptp47:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb507.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb506.setTypeface(null, Typeface.NORMAL);
                rb508.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent507 = new Intent(Ptp308Activity.this,
                        MainActivity.class);
                startActivity(intent507);


                Toast toast507 =
                        Toast.makeText(Ptp308Activity.this, "Código Falla: PTP46 - Criticidad: 1", Toast.LENGTH_LONG);
                toast507.show();
                break;

            case R.id.ptp48:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb508.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb506.setTypeface(null, Typeface.NORMAL);
                rb507.setTypeface(null, Typeface.NORMAL);


                //Starting new intent
                Intent intent508 = new Intent(Ptp308Activity.this,
                        MainActivity.class);
                startActivity(intent508);


                Toast toast508 =
                        Toast.makeText(Ptp308Activity.this, "Código Falla: PTP48 - Criticidad: 3", Toast.LENGTH_LONG);
                toast508.show();
                break;


        }
    }
}
