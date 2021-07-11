package com.example.a07_pasodeparametrosentreactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;




public class MainActivity extends AppCompatActivity {
    private EditText txtnombre,txtapellidos,txtfecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtnombre = (EditText)findViewById(R.id.txtNombre);
        this.txtapellidos = (EditText)findViewById(R.id.txtApe);
        this.txtfecha = (EditText)findViewById(R.id.txtFecha);
    }

    public void mostrarDatos(View view) {
        Intent i = new Intent(this, Ventana2.class );
        // Añadimos tres parámetros con el método putExtra
        i.putExtra("nombre", this.txtnombre.getText().toString());
        i.putExtra("apellido", this.txtapellidos.getText().toString());
        i.putExtra("fecha", this.txtfecha.getText().toString());

        startActivity(i);
    }
}


