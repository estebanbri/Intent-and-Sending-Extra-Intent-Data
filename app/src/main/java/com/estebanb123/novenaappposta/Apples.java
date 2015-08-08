//Intents tuto y Sending Extra Intent Data tutos
package com.estebanb123.novenaappposta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class Apples extends AppCompatActivity {
    //Como le meti la propiedad onClick directamente en el .xml no tengo que crear el listener me ahorro de escribir codigo en java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }

    public void onClick(View v) {
        //en los parametros le decis que desde esta activity launch Bacon class
        Intent i = new Intent(this, Bacon.class);
        final EditText applesEditTextOBJ = (EditText) findViewById(R.id.applesEditText);
        i.putExtra("mensajeApple", applesEditTextOBJ.getText().toString());
        startActivity(i);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_apples, menu);
        return true;
    }
}