package com.example.jamurtest;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HasilActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAttr;
    TextView textFitur1,textFitur2,textFitur3,textFitur4,textFitur5,textFitur6,textFitur7,textFitur8,textFitur9,textFitur10,textFitur11,textFitur12,textFitur13,
            textFitur14,textFitur15,textFitur16,textFitur17,textFitur18,textFitur19,textFitur20,textFitur21,textFitur22,textViewHasil;

    View contHasil;

    public String fitur1, fitur2, fitur3, fitur4, fitur5, fitur6, fitur7, fitur8, fitur9, fitur10, fitur11, fitur12, fitur13,
            fitur14, fitur15, fitur16, fitur17, fitur18, fitur19, fitur20, fitur21, fitur22;
    private boolean viewGroup = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_diagnosis);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Hasil Klasifikasi Jamur");

        textFitur1 = findViewById(R.id.textFitur1);
        textFitur2 = findViewById(R.id.textFitur2);
        textFitur3 = findViewById(R.id.textFitur3);
        textFitur4 = findViewById(R.id.textFitur4);
        textFitur5 = findViewById(R.id.textFitur5);
        textFitur6 = findViewById(R.id.textFitur6);
        textFitur7 = findViewById(R.id.textFitur7);
        textFitur8 = findViewById(R.id.textFitur8);
        textFitur9 = findViewById(R.id.textFitur9);
        textFitur10 = findViewById(R.id.textFitur10);
        textFitur11 = findViewById(R.id.textFitur11);
        textFitur12 = findViewById(R.id.textFitur12);
        textFitur13 = findViewById(R.id.textFitur13);
        textFitur14 = findViewById(R.id.textFitur14);
        textFitur15 = findViewById(R.id.textFitur15);
        textFitur16 = findViewById(R.id.textFitur16);
        textFitur17 = findViewById(R.id.textFitur17);
        textFitur18 = findViewById(R.id.textFitur18);
        textFitur19 = findViewById(R.id.textFitur19);
        textFitur20 = findViewById(R.id.textFitur20);
        textFitur21 = findViewById(R.id.textFitur21);
        textFitur22 = findViewById(R.id.textFitur22);

        fitur1 = getIntent().getStringExtra("textCiri1");
        fitur2 = getIntent().getStringExtra("textCiri2");
        fitur3 = getIntent().getStringExtra("textCiri3");
        fitur4 = getIntent().getStringExtra("textCiri4");
        fitur5 = getIntent().getStringExtra("textCiri5");
        fitur6 = getIntent().getStringExtra("textCiri6");
        fitur7 = getIntent().getStringExtra("textCiri7");
        fitur8 = getIntent().getStringExtra("textCiri8");
        fitur9 = getIntent().getStringExtra("textCiri9");
        fitur10 = getIntent().getStringExtra("textCiri10");
        fitur11 = getIntent().getStringExtra("textCiri11");
        fitur12 = getIntent().getStringExtra("textCiri12");
        fitur13 = getIntent().getStringExtra("textCiri13");
        fitur14 = getIntent().getStringExtra("textCiri14");
        fitur15 = getIntent().getStringExtra("textCiri15");
        fitur16 = getIntent().getStringExtra("textCiri16");
        fitur17 = getIntent().getStringExtra("textCiri17");
        fitur18 = getIntent().getStringExtra("textCiri18");
        fitur19 = getIntent().getStringExtra("textCiri19");
        fitur20 = getIntent().getStringExtra("textCiri20");
        fitur21 = getIntent().getStringExtra("textCiri21");
        fitur22 = getIntent().getStringExtra("textCiri22");

        textFitur1.setText("Bentuk Tudung: " + fitur1);
        textFitur2.setText("Permukaan Tudung: " + fitur2);
        textFitur3.setText("Warna Tudung: " + fitur3);
        textFitur4.setText("Kondisi Jamur: " + fitur4);
        textFitur5.setText("Aroma Jamur: " + fitur5);
        textFitur6.setText("Pelekatan Insang: " + fitur6);
        textFitur7.setText("Kerapatan Insang: " + fitur7);
        textFitur8.setText("Ukuran Insang: " + fitur8);
        textFitur9.setText("Warna Insang: " + fitur9);
        textFitur10.setText("Bentuk Tangkai: " + fitur10);
        textFitur11.setText("Bentuk Bawah Tangkai: " + fitur11);
        textFitur12.setText("Permukaan Tangkai di atas Cincin: " + fitur12);
        textFitur13.setText("Permukaan Tangkai di bawah Cincin: " + fitur13);
        textFitur14.setText("Warna Tangkai di atas Cincin: " + fitur14);
        textFitur15.setText("Warna Tangkai di bawah Cincin: " + fitur15);
        textFitur16.setText("Tipe Membran Pembungkus: " + fitur16);
        textFitur17.setText("Warna Membran Pembungkus: " + fitur17);
        textFitur18.setText("Banyaknya Cincin: " + fitur18);
        textFitur19.setText("Tipe Cincin: " + fitur19);
        textFitur20.setText("Warna Spora: " + fitur20);
        textFitur21.setText("Populasi Jamur: " + fitur21);
        textFitur22.setText("Habitat Jamur: " + fitur22);

        String hasil = getIntent().getStringExtra("testing");
        textViewHasil = findViewById(R.id.textHasilKlasifikasi);
        textViewHasil.setText("Hasil Klasifikasi: " + hasil);

        contHasil = findViewById(R.id.containerHasil);
        buttonAttr = findViewById(R.id.showAttribute);
        buttonAttr.setOnClickListener(this);
    }

    @Override
    public void onClick(View button){
        if(viewGroup){
            contHasil.setVisibility(View.GONE);
            buttonAttr.setText("Show Attribute");
        } else{
            contHasil.setVisibility(View.VISIBLE);
            buttonAttr.setText("Hide Attribute");
        }

        viewGroup = !viewGroup;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

//        Toast.makeText(this, String.valueOf(fiturJ1), Toast.LENGTH_SHORT).show();