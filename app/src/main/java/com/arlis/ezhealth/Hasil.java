package com.arlis.ezhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {
    TextView txtBb, txtTb, txtBmi, txtKet;
    String hasil,ket;
    double bb,tb,bmi;
    double defaultValue = 0;
    Button bok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        txtBb=(TextView)findViewById(R.id.tv2);
        txtTb=(TextView)findViewById(R.id.tv1);
        txtBmi=(TextView)findViewById(R.id.tv3);
        txtKet=(TextView)findViewById(R.id.tv4);
        bok = (Button)findViewById(R.id.bOk);
        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Hasil.this, Home.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        bb = intent.getDoubleExtra("EXTRA_BB",defaultValue);
        tb = intent.getDoubleExtra("EXTRA_TB",defaultValue);
        bmi = intent.getDoubleExtra("EXTRA_BMI",defaultValue);
        hasil = intent.getStringExtra("EXTRA_HASIL");
        ket = intent.getStringExtra("EXTRA_KET");

        txtBb.   setText("Berat Badani : "+bb);
        txtTb.   setText("Tinggi Badan : "+tb);
        txtBmi.  setText("BMI : "+bmi);
        txtKet.  setText("Keterangan : "+ket);



    }

}

