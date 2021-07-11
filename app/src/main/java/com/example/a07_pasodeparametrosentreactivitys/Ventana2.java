package com.example.a07_pasodeparametrosentreactivitys;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Ventana2 extends AppCompatActivity {

    private TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        this.texto1 = (TextView) findViewById(R.id.txtRegistro);
        //Recogemos los parámetros enviados por el primer Activity  a través del método getExtras
        Bundle bundle=getIntent().getExtras();
        String dato1=bundle.getString("nombre");
        String dato2=bundle.getString("apellido");
        String dato3=bundle.getString("fecha");
        this.texto1.setText(Html.fromHtml("<p><h3>Registro Usuario:</h3></p>" + dato1 + "<br/>" + dato2 + "<br/>" + dato3)
                , TextView.BufferType.SPANNABLE);
    }

    public void cerrarVentana(View view) {
        finish();
    }
}
