package com.example.tyapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tyapp.R;

public class LoginActivity<login> extends AppCompatActivity {

    Button login;
    EditText username,password;


    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (password.getText().toString().toUpperCase().equals("TEST1"))
                {
                    login_sukses();
                }else
                {
                    Toast.makeText(getApplicationContext(), "Salah Passwoard", Toast.LENGTH_SHORT);
                }
            }
        });

    }

    private void login_sukses() {


        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);

        i.putExtra("USERNAME", "Amelia Irsyada");
        startActivity(i);
    }
}
