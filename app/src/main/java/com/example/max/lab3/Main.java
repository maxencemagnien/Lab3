package com.example.max.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Main extends AppCompatActivity {

    EditText LogText, PassText;
    String  Login, Password;
    Intent intent1;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogText= (EditText) findViewById(R.id.editText2);
        PassText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                intent1= new Intent(Main.this, Activity2.class);


                Login= LogText.getText().toString();
                Password = PassText.getText().toString();

                intent1.putExtra("EXTRA_PASSWORD", Login );
                intent1.putExtra("EXTRA_NAME", Password);

                startActivity(intent1);
            }
        });

    }
}
