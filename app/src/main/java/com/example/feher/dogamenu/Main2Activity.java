package com.example.feher.dogamenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button nextactivity, namechange, information, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();
        listeners();
    }

    public void init() {

        nextactivity = (Button) findViewById(R.id.nextactivity);
        namechange = (Button) findViewById(R.id.namechange);
        information = (Button) findViewById(R.id.information);
        exit = (Button) findViewById(R.id.exit);
    }

    public void listeners() {

        nextactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gonext = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(gonext);
                finish();
            }
        });

        namechange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gonext = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(gonext);
                finish();
            }
        });

        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
