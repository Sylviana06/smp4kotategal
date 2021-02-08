package com.example.smpn4kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void lokasi(View view){
        Intent intent=new Intent(MainActivity.this,LokasiActivity.class);
        startActivity(intent);
    }

    public void prestasi(View view){
        Intent intent=new Intent(MainActivity.this,PrestasiActivity.class);
        startActivity(intent);
    }

    public void ekstakulikuler(View view){
        Intent intent=new Intent(MainActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);
    }

    public void hubungi(View view){
        Intent intent=new Intent(MainActivity.this, HubungiActivity.class);
        startActivity(intent);
    }

    public void download(View view){
        Intent intent=new Intent(MainActivity.this, DownloadActivity.class);
        startActivity(intent);
    }
}