package com.example.tt;

import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Login extends AppCompatActivity {

    private Button login ;

    private EditText username ;
    private  EditText pwd ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.loginbtn);
        username = findViewById(R.id.username);
        pwd= findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().toString().equals("ranym") && pwd.getText().toString().equals("55434873")){

                    Intent intent = new Intent(getApplicationContext() , Home.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "Wrong credantials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}