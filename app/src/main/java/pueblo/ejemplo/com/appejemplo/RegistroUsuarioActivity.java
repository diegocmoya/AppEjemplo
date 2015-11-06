package pueblo.ejemplo.com.appejemplo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
    }

}
