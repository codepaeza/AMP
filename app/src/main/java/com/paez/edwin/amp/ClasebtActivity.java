package com.paez.edwin.amp;

/**
 * Created by PC on 27/12/2017.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class ClasebtActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clase_bt);
    }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1000 = (RadioButton) findViewById(R.id.aereadesnudabt);
        RadioButton rb1001 = (RadioButton) findViewById(R.id.aereaasiladobt);
        RadioButton rb1002 = (RadioButton) findViewById(R.id.subterraneobt);

        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.aereadesnudabt:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1000.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1001.setTypeface(null, Typeface.NORMAL);
                rb1002.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent1000 = new Intent(ClasebtActivity.this,
                        AcategbtActivity.class);
                startActivity(intent1000);


                Toast toast1000 =
                        Toast.makeText (ClasebtActivity.this, "Has seleccionado: Línea Aérea BT Conductor Desnudo", Toast.LENGTH_LONG);
                toast1000.show();
                break;

            case R.id.aereaasiladobt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1001.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1000.setTypeface(null, Typeface.NORMAL);
                rb1002.setTypeface(null, Typeface.NORMAL);
                // Starting new intent


               Intent intent1001 = new Intent(ClasebtActivity.this,
                       DcategbtActivity.class);
               startActivity(intent1001);

                Toast toast1001 =
                        Toast.makeText(ClasebtActivity.this, "Has seleccionado:Línea aérea BT Conductor Aislado", Toast.LENGTH_LONG);
                toast1001.show();
                break;

            case R.id.subterraneobt:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1002.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default

                rb1000.setTypeface(null, Typeface.NORMAL);
                rb1001.setTypeface(null, Typeface.NORMAL);
                // Starting new intent
                Intent intent1002 = new Intent(ClasebtActivity.this,
                ScategbtActivity.class);
                startActivity(intent1002);

                Toast toast1002 =
                        Toast.makeText(ClasebtActivity.this, "Has seleccionado: Línea en BT Conductor Subterráneo", Toast.LENGTH_LONG);
                toast1002.show();
                break;

        }
    }
}
