package controlador;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;

import pueblo.ejemplo.com.appejemplo.RegistroUsuarioActivity;

/**
 * Created by Diego castro on 6/11/2015.
 */
public class ManejoRegistro implements View.OnClickListener {

    private RegistroUsuarioActivity usuarioActivity;

    public ManejoRegistro(RegistroUsuarioActivity usuarioActivity){
        this.usuarioActivity=usuarioActivity;
    }

    @Override
    public void onClick(View view) {
        String password= usuarioActivity.geteTextPassword().getText().toString();
        String correo= usuarioActivity.geteTextCorreo().getText().toString();

        if(!TextUtils.isEmpty(correo)&&!usuarioActivity.verificarCorreo(correo)){
            usuarioActivity.geteTextCorreo().setError("Correo Invalido");
        }
        else if(!TextUtils.isEmpty(correo)){
            usuarioActivity.geteTextCorreo().setError("Campo Obligatorio");
        }

        if(!TextUtils.isEmpty(password)&&!usuarioActivity.verificarContraseña(password)){

            usuarioActivity.geteTextPassword().setError("Minimo 8 caracteres");
        }
        else if (!TextUtils.isEmpty(password)){

            usuarioActivity.geteTextPassword().setError("campo Obligatorio");
        }

    }
}
