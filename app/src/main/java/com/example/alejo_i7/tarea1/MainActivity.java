package com.example.alejo_i7.tarea1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        toolbar.setTitle("Agenda Telefonica");
        toolbar.setLogo(R.mipmap.ic_launcher);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void nuevoContacto(View view) {
        setContentView(R.layout.activity_splash);
        int TIME = 1000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.page2);
            }
        }, TIME);

    }

    public void MostrarDatos(View view) {
        setContentView(R.layout.activity_splash);
        int TIME = 1000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                setContentView(R.layout.page3);
            }
        }, TIME);
    }

    public void Editar(View view) {
        Toast.makeText(MainActivity.this, "Datos Editados", Toast.LENGTH_SHORT).show();
    }

    public void Eliminar(View view) {
        Toast.makeText(MainActivity.this, "Datos Eliminados", Toast.LENGTH_SHORT).show();
    }
}
