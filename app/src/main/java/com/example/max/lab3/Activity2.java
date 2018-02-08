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


    Context context = getApplicationContext();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        TextView ChildTV = (TextView) findViewById(R.id.editText3);

        String targetPassword, targetName;

        Intent targetIntent = getIntent();
        targetPassword = targetIntent.getStringExtra("EXTRA_PASSWORD");
        targetName = targetIntent.getStringExtra("EXTRA_NAME");

        if (targetPassword== "Lab03" && targetName== "Max"){
            Toast aToast = new Toast(context);

            aToast.makeText(context, "Password OK ! ", Toast.LENGTH_LONG).show();

        }

        else{

            ChildTV.setText("Wrong!");

            AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);

            DialogConf.setTitle("Alert");
            DialogConf.setMessage("Password not OK");
            DialogConf.setIcon(R.mipmap.ic_launcher);
            DialogConf.setNeutralButton("Retry",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(context, "You closed the dialog.", Toast.LENGTH_LONG).show();

                            Intent childIntent= new Intent(Activity2.this, Main.class);



                            startActivity(childIntent);
                        }
                    });

            AlertDialog MyDialog = DialogConf.create();
            MyDialog.show();
        }

    }
}
