package com.softwaresolutions.temasavanzadosdelsoftwareapp.Vista;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softwaresolutions.temasavanzadosdelsoftwareapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_ingresar, btn_olvido_contrasena;
    private EditText et_usuario, et_contrasena;
    private Vista_Dialgo_Personalizado dialogo_personalizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_usuario = (EditText) findViewById(R.id.et_usuario);
        et_contrasena = (EditText) findViewById(R.id.et_contraseña);
        btn_ingresar = (Button) findViewById(R.id.btn_ingresar);
        btn_olvido_contrasena = (Button) findViewById(R.id.btn_olvido_contrasena);

        btn_olvido_contrasena.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_ingresar:

                break;

            case R.id.btn_olvido_contrasena:
                dialogo_personalizado = new Vista_Dialgo_Personalizado(MainActivity.this);
                dialogo_personalizado.getWindow().setBackgroundDrawableResource(R.color.colorAccent);
                dialogo_personalizado.setTitle(R.string.msg_Bar_cambiar_contrasena);
                dialogo_personalizado.show();
                break;


        }
    }
}
