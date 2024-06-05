package com.example.amirbarbershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        SharedPreferences dbinfo = getSharedPreferences("myDb", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = dbinfo.edit();

        CheckBox checkBox1 = findViewById(R.id.checkBoxpuksazi);
        CheckBox checkBox2 = findViewById(R.id.checkBoxferkardan);
        CheckBox checkBox3 = findViewById(R.id.checkBoxkotahi);
        CheckBox checkBox4 = findViewById(R.id.checkBox1001);
        CheckBox checkBox5 = findViewById(R.id.checkBox1002);
        CheckBox checkBox6 = findViewById(R.id.checkBox1003);
        EditText editName = findViewById(R.id.editTextTextname);
        EditText editNumber = findViewById(R.id.editTextNumbershomare);
        CheckBox checkBox7 = findViewById(R.id.checkBoxtaied);
        Button btn1 = findViewById(R.id.buttonsave);

        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox7.isChecked()){
                    btn1.setEnabled(true);
                }
                else{
                    btn1.setEnabled(false);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sName = editName.getText().toString();
                String sNumber = editNumber.getText().toString();

                String sPuksazi = null;
                if (checkBox1.isChecked()) {
                    sPuksazi = checkBox1.getText().toString();

                }
                String sFerkardan = null;
                if (checkBox2.isChecked()) {
                    sFerkardan = checkBox2.getText().toString();

                }
                String sKotahi = null;
                if (checkBox3.isChecked()) {
                    sKotahi = checkBox3.getText().toString();

                }
                String s1001 = null;
                if (checkBox4.isChecked()) {
                    s1001 = checkBox4.getText().toString();

                }
                String s1002 = null;
                if (checkBox5.isChecked()) {
                    s1002 = checkBox5.getText().toString();

                }
                String s1003 = null;
                if (checkBox6.isChecked()) {
                    s1003 = checkBox6.getText().toString();

                }

                editor.putString("name",sName);
                editor.putString("number",sNumber);
                editor.putString("puksazi", sPuksazi);
                editor.putString("ferkardan", sFerkardan);
                editor.putString("kotahi", sKotahi);
                editor.putString("d1", s1001);
                editor.putString("d2", s1002);
                editor.putString("d3", s1003);
                editor.apply();
                Toast.makeText(MainActivity3.this, "اطلاعات شما با موفقیت ذخیره شد", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
                finish();

                intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("name", sName);
                intent.putExtra("number", sNumber);
                intent.putExtra("puksazi", sPuksazi);
                intent.putExtra("ferkardan", sFerkardan);
                intent.putExtra("kotahi", sKotahi);
                intent.putExtra("d1", s1001);
                intent.putExtra("d2", s1002);
                intent.putExtra("d3", s1003);
                startActivity(intent);





//


            }
        });
    }
}