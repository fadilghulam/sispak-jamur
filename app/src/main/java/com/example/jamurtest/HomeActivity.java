package com.example.jamurtest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    Button btnProceed;
    Spinner fitur1, fitur2, fitur3,fitur4, fitur5,
            fitur6, fitur7, fitur8, fitur9, fitur10,
            fitur11, fitur12, fitur13, fitur14, fitur15,
            fitur16, fitur17, fitur18, fitur19, fitur20,
            fitur21, fitur22,K;

    public double fiturCiri1, fiturCiri2, fiturCiri3, fiturCiri4, fiturCiri5, fiturCiri6, fiturCiri7, fiturCiri8, fiturCiri9, fiturCiri10, fiturCiri11;
    public double fiturCiri12, fiturCiri13, fiturCiri14, fiturCiri15, fiturCiri16, fiturCiri17, fiturCiri18, fiturCiri19, fiturCiri20, fiturCiri21, fiturCiri22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home2);

        setTitle("Pilih Ciri-Ciri Jamur");

        int hidingItemIndex = 0;

        //INISIALISASI FITUR BENTUK TUDUNG
        fitur1 = findViewById(R.id.bentukTudung);

        List<String> list = Arrays.asList(getResources().getStringArray(R.array.bentukTudung));
        CustomAdapter dataAdapter = new CustomAdapter(this, android.R.layout.simple_spinner_item, list, hidingItemIndex);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur1.setAdapter(dataAdapter);

        fitur1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri1 = 0.11;
                            break;
                        case 2:
                            fiturCiri1 = 1;
                            break;
                        case 3:
                            fiturCiri1 = 0.47;
                            break;
                        case 4:
                            fiturCiri1 = 0.49;
                            break;
                        case 5:
                            fiturCiri1 = 0.72;
                            break;
                        case 6:
                            fiturCiri1 = 0;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur2 = findViewById(R.id.permukaanTudung);
        List<String> list2 = Arrays.asList(getResources().getStringArray(R.array.permukaanTudung));
        CustomAdapter dataAdapter2 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list2, hidingItemIndex);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur2.setAdapter(dataAdapter2);

        fitur2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri2 = 0.33;
                            break;
                        case 2:
                            fiturCiri2 = 0;
                            break;
                        case 3:
                            fiturCiri2 = 0.54;
                            break;
                        case 4:
                            fiturCiri2 = 0.55;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur3 = findViewById(R.id.warnaTudung);
        List<String> list3 = Arrays.asList(getResources().getStringArray(R.array.warnaTudung));
        CustomAdapter dataAdapter3 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list3, hidingItemIndex);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur3.setAdapter(dataAdapter3);

        fitur3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri3 = 0.45;
                            break;
                        case 2:
                            fiturCiri3 = 0.71;
                            break;
                        case 3:
                            fiturCiri3 = 0.27;
                            break;
                        case 4:
                            fiturCiri3 = 0.44;
                            break;
                        case 5:
                        case 7:
                            fiturCiri3 = 0;
                            break;
                        case 6:
                            fiturCiri3 = 0.61;
                            break;
                        case 8:
                            fiturCiri3 = 0.58;
                            break;
                        case 9:
                            fiturCiri3 = 0.31;
                            break;
                        case 10:
                            fiturCiri3 = 0.63;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur4 = findViewById(R.id.kondisiJamur);
        List<String> list4 = Arrays.asList(getResources().getStringArray(R.array.kondisiJamur));
        CustomAdapter dataAdapter4 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list4, hidingItemIndex);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur4.setAdapter(dataAdapter4);

        fitur4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri4 = 0.18;
                            break;
                        case 2:
                            fiturCiri4 = 0.69;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur5 = findViewById(R.id.aromaJamur);
        List<String> list5 = Arrays.asList(getResources().getStringArray(R.array.aromaJamur));
        CustomAdapter dataAdapter5 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list5, hidingItemIndex);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur5.setAdapter(dataAdapter5);

        fitur5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                        case 2:
                        case 3:
                            fiturCiri5 = 0;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                            fiturCiri5 = 1;
                            break;
                        case 7:
                            fiturCiri5 = 0.03;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur6 = findViewById(R.id.pelakatanInsang);
        List<String> list6 = Arrays.asList(getResources().getStringArray(R.array.pelekatanInsang));
        CustomAdapter dataAdapter6 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list6, hidingItemIndex);
        dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur6.setAdapter(dataAdapter6);

        fitur6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri6 = 0.09;
                            break;
                        case 2:
                        case 4:
                            fiturCiri6 = 0;
                            break;
                        case 3:
                            fiturCiri6 = 0.49;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur7 = findViewById(R.id.kerapatanInsang);
        List<String> list7 = Arrays.asList(getResources().getStringArray(R.array.kerapatanGarisInsang));
        CustomAdapter dataAdapter7 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list7, hidingItemIndex);
        dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur7.setAdapter(dataAdapter7);

        fitur7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri7 = 0.56;
                            break;
                        case 2:
                            fiturCiri7 = 0.09;
                            break;
                        case 3:
                            fiturCiri7 = 0;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur8 = findViewById(R.id.ukuranInsang);
        List<String> list8 = Arrays.asList(getResources().getStringArray(R.array.ukuranInsang));
        CustomAdapter dataAdapter8 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list8, hidingItemIndex);
        dataAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur8.setAdapter(dataAdapter8);

        fitur8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri8 = 0.3;
                            break;
                        case 2:
                            fiturCiri8 = 0.89;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur9 = findViewById(R.id.warnaInsang);
        List<String> list9 = Arrays.asList(getResources().getStringArray(R.array.warnaInsang));
        CustomAdapter dataAdapter9 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list9, hidingItemIndex);
        dataAdapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur9.setAdapter(dataAdapter9);

        fitur9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri9 = 0.16;
                            break;
                        case 2:
                            fiturCiri9 = 0.11;
                            break;
                        case 3:
                        case 6:
                            fiturCiri9 = 1;
                            break;
                        case 4:
                            fiturCiri9 = 0.72;
                            break;
                        case 5:
                            fiturCiri9 = 0.67;
                            break;
                        case 7:
                        case 10:
                            fiturCiri9 = 0;
                            break;
                        case 8:
                            fiturCiri9 = 0.43;
                            break;
                        case 9:
                            fiturCiri9 = 0.1;
                            break;
                        case 11:
                            fiturCiri9 = 0.2;
                            break;
                        case 12:
                            fiturCiri9 = 0.26;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur10 = findViewById(R.id.bentukTangkai);
        List<String> list10 = Arrays.asList(getResources().getStringArray(R.array.bentukTangkai));
        CustomAdapter dataAdapter10 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list10, hidingItemIndex);
        dataAdapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur10.setAdapter(dataAdapter10);

        fitur10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri10 = 0.54;
                            break;
                        case 2:
                            fiturCiri10 = 0.44;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur11 = findViewById(R.id.bentukBawahTangkai);
        List<String> list11 = Arrays.asList(getResources().getStringArray(R.array.akarTangkai));
        CustomAdapter dataAdapter11 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list11, hidingItemIndex);
        dataAdapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur11.setAdapter(dataAdapter11);

        fitur11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri11 = 0.49;
                            break;
                        case 2:
                            fiturCiri11 = 0.08;
                            break;
                        case 3:
                        case 5:
                        case 6:
                            fiturCiri11 = 0;
                            break;
                        case 4:
                            fiturCiri11 = 0.23;
                            break;
                        case 7:
                            fiturCiri11 = 0.71;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur12 = findViewById(R.id.permukaanTangkaiAtasCincin);
        List<String> list12 = Arrays.asList(getResources().getStringArray(R.array.permukaanTangkaiAtasCincin));
        CustomAdapter dataAdapter12 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list12, hidingItemIndex);
        dataAdapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur12.setAdapter(dataAdapter12);

        fitur12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri12 = 0.26;
                            break;
                        case 2:
                            fiturCiri12 = 0.33;
                            break;
                        case 3:
                            fiturCiri12 = 0.94;
                            break;
                        case 4:
                            fiturCiri12 = 0.3;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur13 = findViewById(R.id.permukaanTangkaiBawahCincin);
        List<String> list13 = Arrays.asList(getResources().getStringArray(R.array.permukaanTangkaiBawahCincin));
        CustomAdapter dataAdapter13 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list13, hidingItemIndex);
        dataAdapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur13.setAdapter(dataAdapter13);

        fitur13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri13 = 0.24;
                            break;
                        case 2:
                            fiturCiri13 = 0.27;
                            break;
                        case 3:
                            fiturCiri13 = 0.94;
                            break;
                        case 4:
                            fiturCiri13 = 0.31;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur14 = findViewById(R.id.warnaTangkaiAtasCincin);
        List<String> list14 = Arrays.asList(getResources().getStringArray(R.array.warnaTangkaiAtasCincin));
        CustomAdapter dataAdapter14 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list14, hidingItemIndex);
        dataAdapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur14.setAdapter(dataAdapter14);

        fitur14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri14 = 0.96;
                            break;
                        case 2:
                        case 3:
                        case 9:
                            fiturCiri14 = 1;
                            break;
                        case 4:
                        case 5:
                        case 7:
                            fiturCiri14 = 0;
                            break;
                        case 6:
                            fiturCiri14 = 0.69;
                            break;
                        case 8:
                            fiturCiri14 = 0.38;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur15 = findViewById(R.id.warnaTangkaiBawahCincin);
        List<String> list15 = Arrays.asList(getResources().getStringArray(R.array.warnaTangkaiBawahCincin));
        CustomAdapter dataAdapter15 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list15, hidingItemIndex);
        dataAdapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur15.setAdapter(dataAdapter15);

        fitur15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri15 = 0.88;
                            break;
                        case 2:
                        case 3:
                        case 9:
                            fiturCiri15 = 1;
                            break;
                        case 4:
                        case 5:
                        case 7:
                            fiturCiri15 = 0;
                            break;
                        case 6:
                            fiturCiri15 = 0.69;
                            break;
                        case 8:
                            fiturCiri15 = 0.38;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur16 = findViewById(R.id.tipeMembranPembungkus);
        List<String> list16 = Arrays.asList(getResources().getStringArray(R.array.tipeMembranPembungkus));
        CustomAdapter dataAdapter16 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list16, hidingItemIndex);
        dataAdapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur16.setAdapter(dataAdapter16);

        fitur16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri16 = 0.48;
                            break;
                        case 2:
                            fiturCiri16 = 0;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur17 = findViewById(R.id.warnaMembranPembungkus);
        List<String> list17 = Arrays.asList(getResources().getStringArray(R.array.warnaMembranPembungkus));
        CustomAdapter dataAdapter17 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list17, hidingItemIndex);
        dataAdapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur17.setAdapter(dataAdapter17);

        fitur17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                        case 2:
                            fiturCiri17 = 0;
                            break;
                        case 3:
                            fiturCiri17 = 0.49;
                            break;
                        case 4:
                            fiturCiri17 = 1;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur18 = findViewById(R.id.banyakCincin);
        List<String> list18 = Arrays.asList(getResources().getStringArray(R.array.banyakCincin));
        CustomAdapter dataAdapter18 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list18, hidingItemIndex);
        dataAdapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur18.setAdapter(dataAdapter18);

        fitur18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri18 = 1;
                            break;
                        case 2:
                            fiturCiri18 = 0.51;
                            break;
                        case 3:
                            fiturCiri18 = 0.12;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur19 = findViewById(R.id.tipeCincin);
        List<String> list19 = Arrays.asList(getResources().getStringArray(R.array.tipeCincin));
        CustomAdapter dataAdapter19 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list19, hidingItemIndex);
        dataAdapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur19.setAdapter(dataAdapter19);

        fitur19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                        case 3:
                        case 7:
                        case 8:
                            fiturCiri19 = 0;
                            break;
                        case 2:
                            fiturCiri19 = 0.64;
                            break;
                        case 4:
                        case 5:
                            fiturCiri19 = 1;
                            break;
                        case 6:
                            fiturCiri19 = 0.21;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur20 = findViewById(R.id.warnaSpora);
        List<String> list20 = Arrays.asList(getResources().getStringArray(R.array.warnaSpore));
        CustomAdapter dataAdapter20 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list20, hidingItemIndex);
        dataAdapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur20.setAdapter(dataAdapter20);

        fitur20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri20 = 0.12;
                            break;
                        case 2:
                            fiturCiri20 = 0.11;
                            break;
                        case 3:
                        case 6:
                        case 7:
                        case 9:
                            fiturCiri20 = 0;
                            break;
                        case 4:
                            fiturCiri20 = 0.97;
                            break;
                        case 5:
                            fiturCiri20 = 1;
                            break;
                        case 8:
                            fiturCiri20 = 0.76;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur21 = findViewById(R.id.populasiJamur);
        List<String> list21 = Arrays.asList(getResources().getStringArray(R.array.populasiJamur));
        CustomAdapter dataAdapter21 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list21, hidingItemIndex);
        dataAdapter21.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur21.setAdapter(dataAdapter21);

        fitur21.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                        case 3:
                            fiturCiri21 = 0;
                            break;
                        case 2:
                            fiturCiri21 = 0.15;
                            break;
                        case 4:
                            fiturCiri21 = 0.29;
                            break;
                        case 5:
                            fiturCiri21 = 0.7;
                            break;
                        case 6:
                            fiturCiri21 = 0.38;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        fitur22 = findViewById(R.id.habitatJamur);
        List<String> list22 = Arrays.asList(getResources().getStringArray(R.array.habitatJamur));
        CustomAdapter dataAdapter22 = new CustomAdapter(this, android.R.layout.simple_spinner_item, list22, hidingItemIndex);
        dataAdapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fitur22.setAdapter(dataAdapter22);

        fitur22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    switch(position){
                        case 1:
                            fiturCiri22 = 0.34;
                            break;
                        case 2:
                            fiturCiri22 = 0.71;
                            break;
                        case 3:
                            fiturCiri22 = 0.12;
                            break;
                        case 4:
                            fiturCiri22 = 0.88;
                            break;
                        case 5:
                            fiturCiri22 = 0.74;
                            break;
                        case 6:
                            fiturCiri22 = 0;
                            break;
                        case 7:
                            fiturCiri22 = 0.4;
                            break;
                    }
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        btnProceed = findViewById(R.id.buttonDiagnose);
        btnProceed.setOnClickListener(view -> goDiagnose());
    }


    private void goDiagnose(){

        //Toast.makeText(this, String.valueOf(count), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(HomeActivity.this, HasilActivity.class);
        String x = fitur22.getSelectedItem().toString();
        intent.putExtra("fiturRG1", fiturCiri1);
        intent.putExtra("spinnerText", x);

        startActivity(intent);
    }

}

class CustomAdapter extends ArrayAdapter<String> {

    private int hidingItemIndex;

    public CustomAdapter(Context context, int textViewResourceId, List<String> objects, int hidingItemIndex) {
        super(context, textViewResourceId, objects);
        this.hidingItemIndex = hidingItemIndex;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v = null;
        if (position == hidingItemIndex) {
            TextView tv = new TextView(getContext());
            tv.setVisibility(View.GONE);
            v = tv;
        } else {
            v = super.getDropDownView(position, null, parent);
        }
        return v;
    }
}
