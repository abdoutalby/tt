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
import com.example.tt.utils.Abonnement;
import com.example.tt.utils.DBHelper;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Abonement#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Abonement extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private Button save;
    private EditText nom ;
    private EditText prenom ;
    private EditText dn ;
    private EditText adr ;
    private EditText emp;
    private EditText vo;
    private EditText va ;
    private EditText cp ;
    private EditText email ;
    private EditText tt;
    private EditText tel ;



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Abonement( ) {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment sub.
     */
    // TODO: Rename and change types and number of parameters
    public static Abonement newInstance(String param1, String param2) {
        Abonement fragment = new Abonement();
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
        return inflater.inflate(R.layout.abonement, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        save = view.findViewById(R.id.saveabonementbtn);

        nom = view.findViewById(R.id.AbEtNom);
        prenom = view.findViewById(R.id.AbEtPrenom);
        dn  = view .findViewById(R.id.AbEtDn);
        adr = view.findViewById(R.id.AbEtAdr);
        email = view.findViewById(R.id.AbEtEmail);
        emp = view.findViewById(R.id.AbEtemp);
        vo = view.findViewById(R.id.AbEtorigin);
        va = view.findViewById(R.id.AbEtVilleact);
        cp = view.findViewById(R.id.AbEtcodeposte);
        tt = view.findViewById(R.id.AbEttt);
        tel = view.findViewById(R.id.AbEttel);
        CheckBox homme = view.findViewById(R.id.abhommechekc);

        CheckBox femme = view.findViewById(R.id.abfemmecheck);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(getContext());
                 String sex = "";
                 if(homme.isChecked()){
                     sex = "homme";
                 }else if (femme.isChecked()){
                     sex = "femme";
                 }
              boolean res =  dbHelper.addAbonnement(
                      new Abonnement(
                      sex ,
                      nom.getText().toString(),
                      prenom.getText().toString(),
                      dn.getText().toString(),
                      adr.getText().toString(),
                      emp.getText().toString(),
                      vo.getText().toString(),
                      va.getText().toString(),
                      cp.getText().toString(),
                      tel.getText().toString(),
                      email.getText().toString(),
                      tt.getText().toString())
              );
            Toast.makeText(getContext(),  res?"saved ": "oops" , Toast.LENGTH_LONG).show();
            }
        });
    }
}