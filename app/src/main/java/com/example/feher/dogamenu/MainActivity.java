package com.example.feher.dogamenu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText teneved;
    private Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        listeners();
        SharedPreferences sharedPreferences = getSharedPreferences("Mydata",Context.MODE_PRIVATE);
        teneved.setText(sharedPreferences.getString("name", null));

    }

    public void init(){
        teneved = (EditText) findViewById(R.id.teneved);
        submit = (Button) findViewById(R.id.submit);
    }

    public void listeners() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name", teneved.getText().toString());
                editor.commit();
                Toast.makeText(MainActivity.this, "A neved mentve", Toast.LENGTH_SHORT).show();

                Intent vissza_menube = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(vissza_menube);

                finish();

            }
        });

    }

}
