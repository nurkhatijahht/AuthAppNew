
package com.example.authapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class editprofile extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private EditText name_edit, age_edit;
    private Button edit_btn, back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        name_edit = (EditText) findViewById(R.id.name_edit);

        age_edit = (EditText) findViewById(R.id.age_edit);

        mDatabase = FirebaseDatabase.getInstance().getReference("Users");

        edit_btn = (Button) findViewById(R.id.edit_btn);

        back_btn = (Button) findViewById(R.id.back_button);

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullnameedit = name_edit.getText().toString().trim();
                String ageedit = age_edit.getText().toString().trim();
                mDatabase.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("fullname").setValue(fullnameedit);
                mDatabase.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("age").setValue(ageedit);

            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(editprofile.this, ProfileActivity.class));
            }
        });


    }
}