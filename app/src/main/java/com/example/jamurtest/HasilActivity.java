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
    View contHasil;
    private boolean viewGroup = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_diagnosis);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Hasil Klasifikasi Jamur");
        
        //int fiturJ1 = getIntent().getIntExtra("fiturRG1", 0);
        String fiturJ1 = getIntent().getStringExtra("spinnerText");
        TextView textHasil = findViewById(R.id.textFitur1);
        textHasil.setText("Habitat Jamur" + fiturJ1);


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