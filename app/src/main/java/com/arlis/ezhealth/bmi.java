package com.arlis.ezhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
    EditText  BB, TB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setTitle("Hitung BMI Ideal");
        BB = (EditText)findViewById(R.id.etBB);
        TB = (EditText)findViewById(R.id.etTB);
    }

    public void cekHasil(View view) {
        String sBeratBadan = BB.getText().toString().trim();
        String sTinggiBadan = TB.getText().toString().trim();
        String hasil;
        String ket;

        if(BB.getText().toString().equals("")||TB.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"Mohon untuk melengkapi data",Toast.LENGTH_SHORT).show();
        }
        else{
            double beratBadan = Double.parseDouble(sBeratBadan);
            double tinggiBadan = Double.parseDouble(sTinggiBadan);

            //BMI = Berat Badan kg/ (Tinggi Badan m * Tinggi Badan m)
            double bmi = beratBadan/(tinggiBadan*tinggiBadan*0.0001);
            Log.d("tag","bmi = "+bmi+"");
            if (bmi<18.5){
                hasil="Under Weight/Kurus";
                ket = "Sebaiknya mulai menambah berat badan dan mengkonsumsi makanan berkarbohidrat di imbangi dengan olah raga dan anda di wajibkan untuk mengikuti diet detoks untuk membantu menambhakan berat badan agar tidak berlebih dan jadwalnya bisa di liat di bawah ini";
            }
            else if(bmi>=18.5&&bmi<25){
                hasil="Normal Weight/Normal";
                ket = "Bagus, berat badan anda termasuk kategori ideal dan jika anda ingin menggunkan diet detoks untuk kesahatan terdapat jadwal yang baik untuk anda ";
            }
            else if (bmi>=25&&bmi<30){
                hasil = "Over Weight/Kegemukan";
                ket = "Anda sudah masuk kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali dan di wajibkan untuk mengikuti jadwal diet detoks di bwah ini ";
            }
            else{
                hasil="Obesitas";
                ket = "Sebaiknya segera membuat program menurunkan berat badan karena anda termasuk kategori obesitas/ terlalu gemuk dan tidak baik bagi kesehatan dan diet detok bagus untuk mempercepat turun berat badan membuang racun - racun yang terdapat di dalam tubuh anda dan jadwal diet detok anda ada di bwah ";
            }
            Log.d("tag","bmi = "+bmi+"\n"+"hasil : "+hasil+"\nket : "+ket+"\n");


            Intent intent = new Intent(bmi.this,Hasil.class);
            intent.putExtra("EXTRA_BB",beratBadan);
            intent.putExtra("EXTRA_TB",tinggiBadan);
            intent.putExtra("EXTRA_BMI",bmi);
            intent.putExtra("EXTRA_HASIL",hasil);
            intent.putExtra("EXTRA_KET",ket);
            startActivity(intent);
        }

    }
}
