package com.example.hellologcatapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "My_App";
    Button btnError;
    Button btnWarning;
    Button btnInformation;
    Button btnDebug;
    Button btnVerbose;
    private int data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = 10;
        btnError = (Button) findViewById(R.id.btnError);
        btnWarning = (Button) findViewById(R.id.btnWarning);
        btnInformation = (Button) findViewById(R.id.btnInformation);
        btnDebug = (Button) findViewById(R.id.btnDebug);
        btnVerbose = (Button) findViewById(R.id.btnVerbose);
        btnError.setOnClickListener(this);
        btnWarning.setOnClickListener(this);
        btnInformation.setOnClickListener(this);
        btnDebug.setOnClickListener(this);
        btnVerbose.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        if(v == btnError){
            Toast.makeText( MainActivity.this, "Show Logcat Error",
                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data);
        }
        if(v == btnWarning){
            Toast.makeText( MainActivity.this, "Show Logcat Warning",
                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data);
        }
        if(v == btnInformation){
            Toast.makeText( MainActivity.this, "Show Logcat Information",
                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data);
        }
        if(v == btnDebug){
            Toast.makeText( MainActivity.this, "Show Logcat Debug",
                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data);
        }
        if(v == btnVerbose){
            Toast.makeText( MainActivity.this, "Show Logcat Verbose",
                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data);
        }

    }
}