package com.example.tt;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.tt.utils.DBHelper;
import com.example.tt.utils.Portabilite;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link portabilite#newInstance} factory method to
 * create an instance of this fragment.
 */
public class portabilite extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private EditText nom ;
    private  EditText prenom ;
    private  EditText adr ;
    private  EditText email ;
    private CheckBox orange ;
    private CheckBox ooredoo ;
    private  EditText num ;

    private Button save ;


    public portabilite() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment portabilite.
     */
    // TODO: Rename and change types and number of parameters
    public static portabilite newInstance(String param1, String param2) {
        portabilite fragment = new portabilite();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portabilite, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nom = view.findViewById(R.id.portanom) ;
        prenom = view.findViewById(R.id.portaprenom);
        email = view.findViewById(R.id.portaemail);
        num = view.findViewById(R.id.portanumtt);
        adr = view.findViewById(R.id.portaadr);
        orange = view.findViewById(R.id.portaornage);
        ooredoo = view.findViewById(R.id.portaooredoo);
        save = view.findViewById(R.id.portabtnconfirmer);


        save.setOnClickListener(view1 -> {
            String operateur = "" ;
            if(orange.isChecked()){
                operateur = "orange" ;
            }else if (ooredoo.isChecked()){
                operateur = "ooredoo";
            }
            Portabilite dto = new Portabilite(
                    nom.getText().toString(),
                    prenom.getText().toString(),
                    adr.getText().toString(),
                    email.getText().toString(),
                    operateur ,
                    num.getText().toString()
                    );
            DBHelper dbHelper  = new DBHelper(getContext());
            boolean done = dbHelper.portabilite(dto);
            Toast.makeText(getContext(), done ? "saved ": "opps", Toast.LENGTH_LONG).show();

        });
    }
}