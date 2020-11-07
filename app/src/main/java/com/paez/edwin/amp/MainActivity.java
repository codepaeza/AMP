package com.paez.edwin.amp;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            }

    public void onRadioButtonClicked(View v) {
        //require to import the RadioButton class
        RadioButton rb1 = (RadioButton) findViewById(R.id.baja_tension);
        RadioButton rb2 = (RadioButton) findViewById(R.id.media_tension);


        //is the current radio button now checked?
        boolean checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch (v.getId()) {

            case R.id.baja_tension:
                if (checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb2.setTypeface(null, Typeface.NORMAL);


                // Starting new intent
                Intent intent1 = new Intent(MainActivity.this,
                        ClasebtActivity.class);
                startActivity(intent1);


                Toast toast1 =
                        Toast.makeText(MainActivity.this, "Has seleccionado: AMP Baja Tensión", Toast.LENGTH_LONG);
                toast1.show();
                break;

            case R.id.media_tension:
                if (checked)
                    //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb2.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1.setTypeface(null, Typeface.NORMAL);

                // Starting new intent
                Intent intent2 = new Intent(MainActivity.this, TipoActivity.class);
                startActivity(intent2);

                Toast toast2 =
                        Toast.makeText(MainActivity.this, "Has seleccionado: AMP Media Tensión", Toast.LENGTH_LONG);
                toast2.show();
                break;

        }
    }
}

//public class MainActivity extends AppCompatActivity {

   // @Override
   // protected void onCreate(Bundle savedInstanceState) {
       // super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
            //}
        //});
   // }

    //@Override
   // public boolean onCreateOptionsMenu(Menu menu) {
      //  // Inflate the menu; this adds items to the action bar if it is present.
     //   getMenuInflater().inflate(R.menu.menu_main, menu);
       // return true;
    //}

    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      //  int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
          //  return true;
        //}

        //return super.onOptionsItemSelected(item);
    //}
//}
