package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private static final String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtmsg2=findViewById(R.id.txtmsg2);
        txtmsg2.setText(R.string.Mgsg2);

       Log.i(TAG,"oncreate() invoked");
       //Log.i(tag,"lifecycle",msg:"oncreate() invoked");



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onstart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onresume() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}