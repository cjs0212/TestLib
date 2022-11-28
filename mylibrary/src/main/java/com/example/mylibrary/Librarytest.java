package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Librarytest {

    public static void showToast(Context context, String s){
        Toast.makeText(context,s, Toast.LENGTH_LONG).show();
    }
}
