package com.example.haekalsyahefiransmp7c.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //todo 1 deklarisasi view yang di buat
    EditText nilai1, nilai2;
    TextView hasil;
    Button plus, minus, kali, bagi, hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // todo 2 inisialisasi view yang di buat
        nilai1 = findViewById(R.id.nilai);
        nilai2 = findViewById(R.id.nilai2);
        hasil = findViewById(R.id.hasil);
        plus = findViewById(R.id.tambah);
        minus = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
        hapus = findViewById(R.id.hapus);


        //todo 8 atur button untuk masing - masing operator

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkin Dong!!!!" , Toast.LENGTH_SHORT).show();
                }else {
                    plus();
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkin Dong!!!!" , Toast.LENGTH_SHORT).show();
                }else {
                    minus();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkin Dong!!!!" , Toast.LENGTH_SHORT).show();
                }else {
                    kali();
                }

            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkin Dong!!!!" , Toast.LENGTH_SHORT).show();
                }else {
                    bagi();
                }

            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hapus();

            }
        });


        }

    //todo 3 buat method namanya plus
    //todo 4 buat method namanya minus
    //todo 5 buat method namanya kali
    //todo 6 buat method namanya bagi
    //todo 7 buat method namanya hapus

    void plus(){
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 + angka2;
        hasil.setText(String.valueOf(total));
    }

    void minus() {
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 - angka2;
        hasil.setText(String.valueOf(total));
    }

    void kali() {
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 * angka2;
        hasil.setText(String.valueOf(total));
    }

    void bagi() {
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 / angka2;
        hasil.setText(String.valueOf(total));
    }

    void hapus() {
        nilai1.setText("");
        nilai2.setText("");
    }

    }
