package your.company.Presentacion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import your.company.Dominio.Cliente.GestorClienteMovil;
import your.company.Dominio.Cliente.Tapa;
import your.company.R;

/**
 * Created by user on 04/12/2015.
 */

public class Eliminar_tapa extends Activity {

    private int idtapa = -1, idbar = -1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eliminar_tapa_layout);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (heigth * .6));

        final EditText identificador = (EditText) this.findViewById(R.id.textIdentificador);
        final EditText bar = (EditText) this.findViewById(R.id.textBar);

        identificador.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!identificador.getText().toString().equals(""))
                    idtapa = Integer.parseInt(identificador.getText().toString());
            }
        });

        bar.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!bar.getText().toString().equals(""))
                    idbar = Integer.parseInt(bar.getText().toString());
            }
        });

        Button OK = (Button) this.findViewById(R.id.OK);

        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (idtapa != -1 && idbar != -1) {
                    GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();
//                    GestorCargarTapas gestorCargarTapas = new GestorCargarTapas();
//                    ArrayList<Tapa> tapas = gestorCargarTapas.consultarTapas();

                    Tapa tapa = new Tapa(null, idtapa, idbar, null, -1, -1);
                    if (gestorClienteMovil.eliminarTapa(tapa)) {
                        finish();
                    } else {
                        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Eliminar_tapa.this);
                        dialogo1.setTitle("Ha ocurrido un error");
                        dialogo1.setMessage("La tapa que desea eliminar no se ha encontrado");
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
