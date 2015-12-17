package your.company.Presentacion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import your.company.Dominio.Cliente.Tapa;
import your.company.R;

import java.util.ArrayList;

//import android.support.v7.widget.ThemedSpinnerAdapter;

/**
 * Created by user on 02/12/2015.
 */
public class Menu_MostrarTapas extends Activity {

    private ArrayList<Tapa> tapas;
    private ListView lista_tapas;
    private ArrayAdapter<String> adapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrartapas_poplayout);

        FragmentBuscarTapas fbt = new FragmentBuscarTapas();
        fbt.getTapasConsultables();

        tapas = fbt.getTapasConsultables();

        //cosas que no tienen na que ver
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (heigth * .6));
        //fin de cosas que no tienen na que ver

        String[] nombres_tapas = new String[tapas.size()];
//        System.out.println("size "+tapas.size()+" nombres "+nombres_tapas.length);
        for(int i = 0;i<nombres_tapas.length;i++)
            nombres_tapas[i]=tapas.get(i).getNombreTapa();

        ListView lv= (ListView) this.findViewById(R.id.lista_tapas);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombres_tapas);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                for(int j =0; j<tapas.size();j++){
                    if(tapas.get(j).getNombreTapa()== adapterView.getItemAtPosition(i)) {

                        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Menu_MostrarTapas.this);
                        dialogo1.setTitle(tapas.get(j).getNombreTapa());
                        if(tapas.get(j).getOverall()==0)
                            dialogo1.setMessage(tapas.get(j).getDescripcion() + "" +
                                    "\nAun no ha sido puntuada");
                        else
                            dialogo1.setMessage(tapas.get(j).getDescripcion() + "" +
                                    "\nPuntuacion de los usuarios: " + tapas.get(j).getOverall());

                        dialogo1.setCancelable(false);
                        dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {
                            }
                        });
                        dialogo1.show();
                    }
//                        tapas_consultables = gestorClienteMovil.consultarTapas(bares[i]);
////                        tapas_consultables = gestorConsultarTapas.consultarTapas(bares[i]);
//                        //Pasamos las tapas al activity que las muestra
////                        Intent intent = new Intent(getActivity(), Menu_MostrarTapas.class);
////                        startActivity(intent);
//                        startActivity(new Intent(getActivity(), Menu_MostrarTapas.class));
//                        break;
                    }
            }
        });


//        tapa.addTextChangedListener(new TextWatcher() {
//
//            public void afterTextChanged(Editable s) {
//                user = usuario.getText().toString();
//            }
//
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//        });
//
//        password.addTextChangedListener(new TextWatcher() {
//
//            public void afterTextChanged(Editable s) {
//                pass = password.getText().toString();
//            }
//
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//            }
//
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//            }
//        });

//        Button OK = (Button)this.findViewById(R.id.OK);
//
//        OK.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                if (!pass.equals("-1") && !user.equals("-1")) {
//                    GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();
//                    gestorClienteMovil.autenticar(user, pass);
//                    Intent returnIntent = new Intent();
//                    returnIntent.putExtra("usuario", user);
//                    setResult(Activity.RESULT_OK, returnIntent);
//                    finish();
//                }
//            }
//        });

    }
}
