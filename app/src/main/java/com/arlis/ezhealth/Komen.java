package com.arlis.ezhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Komen extends AppCompatActivity {

    private Button btnSubmit;
    private EditText nama , komen , nohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komen);
        nama = (EditText) findViewById(R.id.txtName);
        komen = (EditText) findViewById(R.id.txtKomen);
        nohp = (EditText) findViewById(R.id.txtnohp);

        btnSubmit = (Button) findViewById(R.id.btnSend);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Komen.this, Rincian.class);
                intent.putExtra("nama", nama.getText());
                intent.putExtra("Komentar" , komen.getText());
                intent.putExtra("No Hp", nohp.getText());
                startActivity(intent);
            }
        });
    }
}
