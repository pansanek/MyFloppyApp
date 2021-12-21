package com.potemkinas.floppy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.potemkinas.floppy.Profile.ProfilePage;

public class LoginIn extends AppCompatActivity {
    private Button forward;
    private EditText name;
    public static String UserName;
    private EditText lastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
    }

    public void OnClickAddUserInfo(View view) {
        EditText nameText = findViewById(R.id.name);
        UserName= nameText.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}