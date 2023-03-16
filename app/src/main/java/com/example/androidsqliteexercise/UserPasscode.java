package com.example.androidsqliteexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserPasscode extends AppCompatActivity {
    EditText etName;
    EditText etPasscode;
    Button btnAction;
    RecyclerView rvUserList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_passcode);
        etName = findViewById(R.id.etName);
        etPasscode = findViewById(R.id.etPasscode);
        btnAction = findViewById(R.id.btnAction);
        rvUserList = findViewById(R.id.rvUserList);

        btnAction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    UserModel user = new UserModel(-1,etName.getText().toString(),Integer.parseInt(etPasscode.getText().toString()));
                    Toast.makeText(UserPasscode.this,user.toString(), Toast.LENGTH_SHORT).show();
                }catch(Exception e){
                    Toast.makeText(UserPasscode.this,"Error executing action.", Toast.LENGTH_SHORT).show();
                }

            }
        });//btnAction

    }
}