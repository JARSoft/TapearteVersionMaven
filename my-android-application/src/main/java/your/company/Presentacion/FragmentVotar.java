package your.company.Presentacion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import your.company.R;

/**
 * Created by user on 02/12/2015.
 */
public class FragmentVotar extends Fragment implements View.OnClickListener{


    private TextView userID;

    public View onCreateView(LayoutInflater inflater, ViewGroup conteiner, Bundle savedInstanceState){
        return inflater.inflate(R.layout.votar_layout, conteiner, false);
    }

    public void onViewCreated(final View view, Bundle savedInstanceState) {
        IU_Movil iu = new IU_Movil();
        userID = (TextView) getActivity().findViewById(R.id.UserID);
        userID.setText(iu.getUserID(), TextView.BufferType.EDITABLE);
        userID.setVisibility(View.VISIBLE);
        userID.setTextColor(Color.BLACK);

        view.findViewById(R.id.Votar_premium).setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Votar_premium:
                startActivity(new Intent(getActivity(), Menu_Votar.class));
//                getFragmentManager().beginTransaction()
//                        .replace(R.id.container, Menu_Votar.newInstance())
//                        .commit();
                break;
            default:
                break;
        }
    }
}
