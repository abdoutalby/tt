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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Reclamation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Reclamation extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private EditText nom ;
    private EditText prenom ;
    private EditText adr ;
    private EditText cp;
    private EditText tel ;
    private EditText mail;
    private CheckBox mob ;
    private  CheckBox fixe ;
    private  CheckBox internet ;
    private  CheckBox wifi ;
    private EditText description ;

    private Button save ;

    public Reclamation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment frag.
     */
    // TODO: Rename and change types and number of parameters
    public static Reclamation newInstance(String param1, String param2) {
        Reclamation fragment = new Reclamation();
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
        return inflater.inflate(R.layout.reclamation, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        nom = view.findViewById(R.id.recnom);
        prenom = view.findViewById(R.id.recprenom);
        adr = view.findViewById(R.id.recadr);
        cp = view.findViewById(R.id.reccp);
        mail = view.findViewById(R.id.recmail);
        tel = view.findViewById(R.id.rectel);
        mob = view.findViewById(R.id.recMobch);
        fixe = view.findViewById(R.id.recFixCh);
        internet = view.findViewById(R.id.recinter);
        wifi = view.findViewById(R.id.recwifi);

        description = view.findViewById(R.id.recdesc);

        save = view.findViewById(R.id.recBtn);

        save.setOnClickListener(view1 -> {

          String type="" ;
          if (mob.isChecked()){
              type = "mobile";
          }else if (fixe.isChecked()){
              type ="fixe" ;
          }else if (internet.isChecked()){
              type = "internet";
          }else if(wifi.isChecked()){
              type = "wifi";
          }


            DBHelper dbHelper = new DBHelper(getContext());
         boolean res =  dbHelper.reclamer(new com.example.tt.utils.Reclamation(
                  nom.getText().toString(),
                  prenom.getText().toString() ,
                  adr.getText().toString(),
                  cp.getText().toString(),
                  mail.getText().toString(),
                  tel.getText().toString(),
                  type,
                  description.getText().toString()
                  ));
            Toast.makeText(getContext(), res?"saved ":"OOps", Toast.LENGTH_LONG).show();
        });
    }
}