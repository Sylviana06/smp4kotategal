package com.example.smpn4kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DownloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
    }
    public void album1(View view){
        Intent intent=new Intent(DownloadActivity.this, album1Activity.class);
        startActivity(intent);
    }
    public void album2(View view){
        Intent intent=new Intent(DownloadActivity.this, album2Activity.class);
        startActivity(intent);
    }
    public void album3(View view){
        Intent intent=new Intent(DownloadActivity.this, album3Activity.class);
        startActivity(intent);
    }
    public void album4(View view){
        Intent intent=new Intent(DownloadActivity.this, album4Activity.class);
        startActivity(intent);
    }
    public void album5(View view){
        Intent intent=new Intent(DownloadActivity.this, album5Activity.class);
        startActivity(intent);
    }


}