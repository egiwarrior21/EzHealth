package com.arlis.ezhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button bt1, bt2, bt3, bt4, bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bt1 = (Button) findViewById(R.id.b1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent (Home.this , bmi.class);
                startActivity(intent)
                ;

            }
        });

        bt2 = (Button) findViewById(R.id.b2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent (Home.this , Video.class);
                startActivity(intent)
                ;

            }
        });

        bt3 = (Button) findViewById(R.id.b3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent (Home.this , Maps.class);
                startActivity(intent)
                ;

            }
        });

        bt4 = (Button) findViewById(R.id.b4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent (Home.this , Shop.class);
                startActivity(intent)
                ;

            }
        });

        bt5 = (Button) findViewById(R.id.b5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent (Home.this , Komen.class);
                startActivity(intent)
                ;

            }
        });
    }
}
