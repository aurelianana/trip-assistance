package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    String username = "putu";
    String password = "putu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText inputUserName = (EditText) findViewById(R.id.inputUserName);
        EditText inputPassword = (EditText) findViewById(R.id.inputPassword);
        Button login = (Button) findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputUserName.getText().toString().equals(username)&&inputPassword.getText().toString().equals(password)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("UserName", inputUserName.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Data yang anda masukkan salah! Silahkan Diperiksa kembali", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}