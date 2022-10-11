package com.example.a623j.managers;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.a623j.models.Member;
import com.google.gson.Gson;

public class PrefsManager {
    SharedPreferences sharedPreferences;
    Context context;

    public PrefsManager(SharedPreferences sharedPreferences, Context context) {
        this.sharedPreferences = sharedPreferences;
        this.context = context;
    }
    public void saveData(Member member){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(member);
        editor.putString("data", json);
        editor.apply();
    }
}
