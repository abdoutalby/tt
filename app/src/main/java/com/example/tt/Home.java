package com.example.tt;

import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.tt.databinding.ActivityHomeBinding;

public class Home extends AppCompatActivity {


    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        changeView(new Abonement());
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.porta:
                    changeView(new portabilite());
                    break;
                case R.id.reclam:
                    changeView(new Reclamation());
                    break;
                case R.id.abonement: changeView(new Abonement());
                    break;
            }
            return  true;
         });
    }


    private void changeView(Fragment view){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction =manager.beginTransaction();

        transaction.replace(R.id.mainView, view);
        transaction.commit();
    }
}