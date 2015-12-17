package your.company.Presentacion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import your.company.Dominio.Cliente.GestorClienteMovil;
import your.company.R;


/**
 * Created by user on 29/11/2015.
 */
public class Menu_Votar extends Activity implements View.OnClickListener {

    private Button button, cerrar_sesion;
    private RatingBar puntuar;
    private EditText introducirCodigo;

    private float puntos = 100;
    private int codigo = -1;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.votando);

        puntuar = (RatingBar) findViewById(R.id.puntuar);
        button = (Button) findViewById(R.id.button);
//        cerrar_sesion = (Button) findViewById(R.id.cerrar_sesion);
        introducirCodigo = (EditText) findViewById(R.id.introducirCodigo);

        button.setOnClickListener(this);
//        cerrar_sesion.setOnClickListener(this);
        introducirCodigo.setOnClickListener(this);
        puntuar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                puntos = v;
            }
        });


        introducirCodigo.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            public void afterTextChanged(Editable editable) {
                if(!introducirCodigo.getText().toString().equals(""))
                    codigo = Integer.parseInt(introducirCodigo.getText().toString());
            }
        });

    }

    public void onPause() {
        super.onPause();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                System.out.println(codigo + " " + puntos);
                if (codigo != -1 && puntos != 100) {
                    GestorClienteMovil gcm = new GestorClienteMovil();
                    if (gcm.votar(/*tal vez se ponga aqui el codigo del bar*/0, codigo, puntos)) {
                        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Menu_Votar.this);
                        dialogo1.setTitle("Enhorabuena");
                        dialogo1.setMessage("La puntuacion ha sido registrada. Gracias por su consumicion");
                        dialogo1.setCancelable(false);
                        dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {
                                finish();
                            }
                        });
                        dialogo1.show();
                    } else {
                        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Menu_Votar.this);
                        dialogo1.setTitle("Ha ocurrido un error");
                        dialogo1.setMessage("No se ha registado ninguna tapa con ese codigo");
                        dialogo1.setCancelable(false);
                        dialogo1.setPositiveButton("Reintentar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {
                            }
                        });
                        dialogo1.show();
                    }
                }
//            case R.id.cerrar_sesion:
//                startActivity(new Intent(Menu_Votar.this, IU_Movil.class));
//                closeContextMenu();
//                break;
        }

    }
}
