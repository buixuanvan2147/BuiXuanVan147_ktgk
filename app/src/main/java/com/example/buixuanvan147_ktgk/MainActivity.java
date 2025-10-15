package com.example.buixuanvan147_ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtUser147, edtPass147;
    Button btnLogin147;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtUser147 = findViewById(R.id.edt_user);
        edtPass147 = findViewById(R.id.edt_pass);
        btnLogin147 = findViewById(R.id.btn_login);

        btnLogin147.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String user = edtUser147.getText().toString().trim();
                String pass = edtPass147.getText().toString().trim();
                if (user.equals("bxv") && pass.equals("147")){
                    Intent i = new Intent(MainActivity.this, Home.class);
                    i.putExtra("USERNAME",user);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Sai tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}