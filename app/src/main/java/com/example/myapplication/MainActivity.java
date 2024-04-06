package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button4 = findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imdbUrl = "https://listado.mercadolibre.com.co/winnie-the-pooh";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(imdbUrl));
                startActivity(intent);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String imdbUrl = "https://gtech.systems";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(imdbUrl));
                        startActivity(intent);
                                button4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        String imdbUrl = "https://www.tiendamusical.com.co/guitarras/";
                                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(imdbUrl));
                                        startActivity(intent);
                            }

                        });
                    }
                })
                ;
            }
        });
    }
}
