package com.example.anjhiflash.mysignin_signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    private EditText PassInput;
    private CheckBox ShowPass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PassInput = findViewById(R.id.password);
        ShowPass = findViewById(R.id.showPass);

    }

    public void onClickSignUp(View view) {
        //Untuk pidah ke halaman SignUp
        Intent intent = new Intent(this, FormSignUpActivity.class);
        startActivity(intent);
    }

    public void onClickSignIn(View view) {
        //Untuk aksi Button Sign In
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    //Set onClickListener, untuk menangani kejadian saat Checkbox diklik
    public void onClickChecked(View view) {
        if (ShowPass.isChecked()) {
            //Saat Checkbox dalam keadaan Checked, maka password akan di tampilkan
            PassInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            //Jika tidak, maka password akan di sembuyikan
            PassInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }





}

