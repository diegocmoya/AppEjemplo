package pueblo.ejemplo.com.appejemplo.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import pueblo.ejemplo.com.appejemplo.R;
import pueblo.ejemplo.com.appejemplo.RegistroUsuarioActivity;

/**
 * Created by Diego castro on 23/10/2015.
 */
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        hiloSplash();

    }

    public void hiloSplash (){

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException exeption){
                    exeption.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(Splash.this,RegistroUsuarioActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
