package com.example.amirbarbershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        SharedPreferences dbinfo = getSharedPreferences("myDb", Context.MODE_PRIVATE);

        TextView txt1 = findViewById(R.id.textViewName);
        TextView txt2 = findViewById(R.id.textViewNumber);
        TextView txt3 = findViewById(R.id.textViewKar);
        TextView txt4 = findViewById(R.id.textViewDate);

        Intent reciveDate=getIntent();
        String sName = reciveDate.getStringExtra("name");
        String sNumber = reciveDate.getStringExtra("number");
        String sPuksazi = reciveDate.getStringExtra("puksazi");
        String sFerkardan = reciveDate.getStringExtra("ferkardan");
        String sKotahi = reciveDate.getStringExtra("kotahi");
        String s1001 = reciveDate.getStringExtra("d1");
        String s1002 = reciveDate.getStringExtra("d2");
        String s1003 = reciveDate.getStringExtra("d3");

        txt1.setText(sName);
        txt2.setText(sNumber);
        txt3.setText(sPuksazi+"-"+sFerkardan+"-"+sKotahi);
        txt4.setText(s1001+"-"+s1002+"-"+s1003);


        Button btn1 = findViewById(R.id.buttonvakeshi);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sName =  dbinfo.getString("name","-");
                String sNumber = dbinfo.getString("number","-");
                String sPuksazi= dbinfo.getString("puksazi","-");
                String sFerkardan = dbinfo.getString("ferkardan","-");
                String sKotahi = dbinfo.getString("kotahi","-");
                String s1001 = dbinfo.getString("d1","-");
                String s1002 = dbinfo.getString("d2","-");
                String s1003 = dbinfo.getString("d3","-");
                txt1.setText(sName);
                txt2.setText(sNumber);
                txt3.setText(sPuksazi+"-"+sFerkardan+"-"+sKotahi);
                txt4.setText(s1001+"-"+s1002+"-"+s1003);

            }
        });


        Button btn2 = findViewById(R.id.button6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}