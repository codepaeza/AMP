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

public class Ptp411Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp411);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb522 = (RadioButton) findViewById(R.id.ptp75);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp75:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb522.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent522 = new Intent(Ptp411Activity.this,
                        MainActivity.class);
                startActivity(intent522);


                Toast toast522 =
                        Toast.makeText(Ptp411Activity.this, "Código Falla: PTP75 - Criticidad: 3", Toast.LENGTH_LONG);
                toast522.show();
                break;


        }
    }
}
