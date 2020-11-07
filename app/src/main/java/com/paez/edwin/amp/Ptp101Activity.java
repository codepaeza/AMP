package com.paez.edwin.amp;

/**
 * Created by PC on 25/11/2017.
 */



import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class Ptp101Activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt_ptp101);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb471 = (RadioButton) findViewById(R.id.ptp02);
                //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.ptp02:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb471.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                //Starting new intent
                Intent intent471 = new Intent(Ptp101Activity.this,
                MainActivity.class);
                startActivity(intent471);


                Toast toast471 =
                        Toast.makeText(Ptp101Activity.this, "Código Falla: PTP02 - Criticidad: 2", Toast.LENGTH_LONG);
                toast471.show();
                break;




        }
    }
}
