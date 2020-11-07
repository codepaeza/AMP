package com.paez.edwin.amp;

/**
 * Created by PC on 20/08/2017.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo214Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo214);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1995 = (RadioButton) findViewById(R.id.ramo214_01);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo214_01:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1995.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent1995 = new Intent(Mtramo214Activity.this,
                        MainActivity.class);
                startActivity(intent1995);


                Toast toast1995 =
                        Toast.makeText(Mtramo214Activity.this, "Código Falla: RA53 - Criticidad: 2", Toast.LENGTH_LONG);
                toast1995.show();
                break;



        }

    }
}