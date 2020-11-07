package com.paez.edwin.amp;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.paez.edwin.amp", appContext.getPackageName());
    }

    public static class TipoActivity extends ActionBarActivity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.clase_amp);
        }

        public void onRadioButtonClicked(View v) {
            //require to import the RadioButton class
            RadioButton rb11 = (RadioButton) findViewById(R.id.ramo);
            RadioButton rb12 = (RadioButton) findViewById(R.id.ptp);
            RadioButton rb13 = (RadioButton) findViewById(R.id.cabina);

            //is the current radio button now checked?
            boolean checked = ((RadioButton) v).isChecked();

            //now check which radio button is selected
            //android switch statement
            switch (v.getId()) {

                case R.id.ramo:
                    if (checked)
                        //if windows phone programming book is selected
                        //set the checked radio button's text style bold italic
                        rb11.setTypeface(null, Typeface.BOLD_ITALIC);
                    //set the other two radio buttons text style to default
                    rb12.setTypeface(null, Typeface.NORMAL);
                    rb13.setTypeface(null, Typeface.NORMAL);

                    // Starting new intent
                    //Intent intent11 = new Intent(TipoActivity.this,
                    // RamoActivity.class);
                    // startActivity(intent11);


                    Toast toast11 =
                            Toast.makeText (TipoActivity.this, "Has seleccionado: Ramo", Toast.LENGTH_LONG);
                    toast11.show();
                    break;

                case R.id.ptp:
                    if (checked)
                        //if ios programming book is selected
                        //set the checked radio button's text style bold italic
                        rb12.setTypeface(null, Typeface.BOLD_ITALIC);
                    //set the other two radio buttons text style to default

                    rb11.setTypeface(null, Typeface.NORMAL);
                    rb13.setTypeface(null, Typeface.NORMAL);
                    // Starting new intent
                    //Intent intent12 = new Intent(ClaseActivity.this,
                    //CentroPosteActivity.class);
                    //startActivity(intent12);

                    Toast toast12 =
                            Toast.makeText(TipoActivity.this, "Has seleccionado: Centro Transformación en Poste", Toast.LENGTH_LONG);
                    toast12.show();
                    break;

                case R.id.cabina:
                    if (checked)
                        //if ios programming book is selected
                        //set the checked radio button's text style bold italic
                        rb13.setTypeface(null, Typeface.BOLD_ITALIC);
                    //set the other two radio buttons text style to default

                    rb11.setTypeface(null, Typeface.NORMAL);
                    rb12.setTypeface(null, Typeface.NORMAL);
                    // Starting new intent
                    //Intent intent13 = new Intent(ClaseActivity.this,
                    //CabinaActivity.class);
                    // startActivity(intent13);

                    Toast toast13 =
                            Toast.makeText(TipoActivity.this, "Has seleccionado: Cabina", Toast.LENGTH_LONG);
                    toast13.show();
                    break;

            }
        }
    }
}
