package com.paez.edwin.amp;

/**
 * Created by PC on 9/07/2017.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Mtramo103Activity  extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ramo103);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb171 = (RadioButton) findViewById(R.id.ramo103_02);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ramo103_02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb171.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent171 = new Intent(Mtramo103Activity.this,
                        MainActivity.class);
                startActivity(intent171);


                Toast toast171 =
                        Toast.makeText(Mtramo103Activity.this, "Código Falla: RA08 - Criticidad: 2", Toast.LENGTH_LONG);
                toast171.show();
                break;


        }

    }
}


