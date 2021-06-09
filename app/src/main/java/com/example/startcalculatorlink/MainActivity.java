package com.example.startcalculatorlink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.launch).setOnClickListener(v -> {
            Uri uri = Uri.parse("intentstest://calc");
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(browserIntent,null));
        });
    }
}