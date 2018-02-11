package com.example.max.lab3;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Intent targetIntent;
    String Login,Password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        TextView ChildTV = (TextView) findViewById(R.id.editText3);



        targetIntent = getIntent();
        Password= targetIntent.getStringExtra("EXTRA_PASSWORD");
        Login = targetIntent.getStringExtra("EXTRA_NAME");

        if (Password.equals("Lab03")  && Login.equals("Max")){
            Context context= getApplicationContext();

            Toast aToast = new Toast(context);
            aToast.makeText(context, "Password/Login OK ! ", Toast.LENGTH_LONG).show();

        }

        else{

            ChildTV.setText("Wrong!");

            AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);

            DialogConf.setTitle("Alert");
            DialogConf.setMessage("Password/Login not OK");
            DialogConf.setIcon(R.mipmap.ic_launcher);
            DialogConf.setNeutralButton("Retry",
                            new DialogInterface.OnClickListener(){
                                public void onClick(DialogInterface dialog, int id){
                                    finish();
                                }


                    });

            AlertDialog MyDialog = DialogConf.create();
            MyDialog.show();
        }

    }
}
