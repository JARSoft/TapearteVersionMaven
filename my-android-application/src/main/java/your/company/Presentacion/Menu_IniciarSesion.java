package your.company.Presentacion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import your.company.Dominio.Cliente.GestorClienteMovil;
import your.company.R;


/**
 * Created by user on 01/12/2015.
 */
public class Menu_IniciarSesion extends Activity{

    private String user="-1";
    private String pass="-1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autenticar_poplayout);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (heigth * .6));

        final EditText usuario = (EditText)this.findViewById(R.id.textNombre);
        final EditText password = (EditText)this.findViewById(R.id.textBar);

        usuario.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                user = usuario.getText().toString();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        password.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
                pass = password.getText().toString();
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        Button OK = (Button)this.findViewById(R.id.OK);

        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!pass.equals("-1") && !user.equals("-1")) {
                    GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();
                    if(gestorClienteMovil.autenticar(user, pass)==0){//cliente
                        Intent returnIntent = new Intent();
                        returnIntent.putExtra("usuario", "cliente");
                        setResult(Activity.RESULT_OK, returnIntent);
                        finish();
                    }
                    else if(gestorClienteMovil.autenticar(user, pass)==1){//bar
                        Intent returnIntent = new Intent();
                        returnIntent.putExtra("usuario", "propietario");
                        setResult(Activity.RESULT_OK, returnIntent);
                        finish();
                    }
                    else{
                        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Menu_IniciarSesion.this);
                        dialogo1.setTitle("Ha ocurrido un error");
                        dialogo1.setMessage("El usuario o la contraseña introducidos no existen");
                        dialogo1.setCancelable(false);
                        dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {
                            }
                        });
                        dialogo1.show();
                    }

                }
            }
        });

    }
}
