package com.example.a623j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a623j.managers.PrefsManager;
import com.example.a623j.models.Member;

public class MainActivity extends AppCompatActivity {

    EditText fullname,age;
    Button save;
    SharedPreferences sharedPreferences;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);


    }
    public void initViews() {
        fullname = findViewById(R.id.fullname_id);
        age = findViewById(R.id.age_id);


        save = findViewById(R.id.button_save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveD();
            }
        });

    }

    public void saveD() {
        String getFullname = fullname.getText().toString().trim();
        String getAge = age.getText().toString().trim();

        Member member = new Member();
        member.setFullname(getFullname);
        member.setAge(getAge);


        new PrefsManager(sharedPreferences,context).saveData(member);


    }
}