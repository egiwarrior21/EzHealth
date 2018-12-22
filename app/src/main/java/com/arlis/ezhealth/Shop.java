package com.arlis.ezhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Shop extends AppCompatActivity {
    ImageView gb1, gb2, gb3, gb4 , gb5, gb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        gb1 = (ImageView) findViewById(R.id.iv1);
        gb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Shop.this , Telepom.class);
                startActivity(intent);
            }
        });

        gb2 = (ImageView) findViewById(R.id.iv2);
        gb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Shop.this , Telepom.class);
                startActivity(intent);
            }
        });

        gb3 = (ImageView) findViewById(R.id.iv3);
        gb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Shop.this , Telepom.class);
                startActivity(intent);
            }
        });

        gb4 = (ImageView) findViewById(R.id.iv4);
        gb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Shop.this , Telepom.class);
                startActivity(intent);
            }
        });

        gb5 = (ImageView) findViewById(R.id.iv5);
        gb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Shop.this , Telepom.class);
                startActivity(intent);
            }
        });

        gb6 = (ImageView) findViewById(R.id.iv6);
        gb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Shop.this , Telepom.class);
                startActivity(intent);
            }
        });
    }
}
