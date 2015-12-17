package your.company.Presentacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import your.company.Dominio.Cliente.*;
import your.company.R;

import java.util.ArrayList;

/**
 * Created by user on 02/12/2015.
 */
public class FragmentBuscarTapas extends Fragment implements View.OnClickListener{

    private ListView lv;
    private SearchView sv;
    private ArrayList<Bar> bares = cargarBares();
    private String[] nombres_bares = cargarNombresBares(bares);
    private static ArrayList<Tapa> tapas_consultables;

    private ArrayAdapter<String> adapter;
    private static GestorConsultarTapas gestorConsultarTapas = new GestorConsultarTapas();
    private static GestorClienteMovil gestorClienteMovil = new GestorClienteMovil();


    public View onCreateView(LayoutInflater inflater, ViewGroup conteiner, Bundle savedInstanceState){
        return inflater.inflate(R.layout.buscartapas_layout, conteiner, false);
    }

    public void onViewCreated(final View view, Bundle savedInstanceState) {

        lv= (ListView) getActivity().findViewById(R.id.listView);
        sv = (SearchView) getActivity().findViewById(R.id.searchView);

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,nombres_bares);
        lv.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                for(int i =0; i<bares.size();i++){
                    if(bares.get(i).getNombreBar().equals(arg0.getItemAtPosition(position))) {
                        tapas_consultables = gestorClienteMovil.consultarTapas(bares.get(i));
//                        tapas_consultables = gestorConsultarTapas.consultarTapas(bares[i]);
                        //Pasamos las tapas al activity que las muestra
//                        Intent intent = new Intent(getActivity(), Menu_MostrarTapas.class);
//                        startActivity(intent);
                        startActivity(new Intent(getActivity(), Menu_MostrarTapas.class));
                        break;
                    }
                }

//                Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.Votar_premium:
//                startActivity(new Intent(getActivity(), Menu_Votar.class));
////                getFragmentManager().beginTransaction()
////                        .replace(R.id.container, Menu_Votar.newInstance())
////                        .commit();
//                break;
//            case R.id.cerrar_sesion:
//
//                break;
//            default:
//                break;
//        }
    }

    private ArrayList<Bar> cargarBares() {
        GestorConsultarBares cb = new GestorConsultarBares();
        return cb.consultarBares();
    }

    private String[] cargarNombresBares(ArrayList<Bar> bares) {
        String[] nombres = new String[bares.size()];
        for(int i = 0;i<bares.size();i++){
            nombres[i]=bares.get(i).getNombreBar();
        }
        return nombres;
    }

    public ArrayList<Tapa> getTapasConsultables(){
        return tapas_consultables;
    }

}

