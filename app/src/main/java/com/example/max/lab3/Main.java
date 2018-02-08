package com.example.max.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mTV = (EditText) findViewById(R.id.editText);


        EditText mTV1 = (EditText) findViewById(R.id.editText2);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1= new Intent(Main.this, Activity2.class);

                String input = mTV.getText().toString();
                String input1 = mTV1.getText().toString();

                intent1.putExtra("EXTRA_PASSWORD", input);
                intent1.putExtra("EXTRA_NAME", input1);

                startActivity(intent1);
            }
        });

    }
}
