package pueblo.ejemplo.com.appejemplo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import controlador.ManejoRegistro;

public class RegistroUsuarioActivity extends AppCompatActivity {

    private EditText eTextNombre;
    private EditText eTextApellido;
    private EditText eTextPassword;
    private EditText eTextCorreo;

    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        eTextNombre= (EditText)findViewById((R.id.edit_text_nombre));
        eTextApellido= (EditText)findViewById(R.id.edit_text_apellidos);
        eTextCorreo= (EditText) findViewById(R.id.edit_text_correo);
        eTextPassword= (EditText)findViewById(R.id.edit_text_correo);
        btnRegistrar= (Button)findViewById(R.id.btn_registrar);
        btnRegistrar.setOnClickListener(new ManejoRegistro(this));
    }

    public boolean verificarCorreo(String correo){
        return correo.contains("@");
    }

    public boolean verificarContraseña(String password){
        return password.length()>=8;
    }

    public EditText geteTextNombre() {
        return eTextNombre;
    }

    public EditText geteTextApellido() {
        return eTextApellido;
    }

    public EditText geteTextPassword() {
        return eTextPassword;
    }

    public EditText geteTextCorreo() {
        return eTextCorreo;
    }

    public Button getBtnRegistrar() {
        return btnRegistrar;
    }
}
