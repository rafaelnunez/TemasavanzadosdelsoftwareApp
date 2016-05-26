package com.softwaresolutions.temasavanzadosdelsoftwareapp.Vista;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softwaresolutions.temasavanzadosdelsoftwareapp.R;

/**
 * Created by rn_dr on 25/05/16.
 */
public class Vista_Dialgo_Personalizado extends Dialog implements View.OnClickListener{

    Context context;
    private Button btn_recuperar_contrasena;
    private EditText et_correo;

    public Vista_Dialgo_Personalizado(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cambiar_contrasena);
        et_correo = (EditText) findViewById(R.id.et_correo);
        btn_recuperar_contrasena = (Button) findViewById(R.id.btn_recuperar_contrasena);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_recuperar_contrasena:

                break;
        }
    }
}
