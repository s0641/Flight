package com.app.fly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tv1;
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        tv1.setText("Terms and Conditions relating to pCloudy Applications General By clicking on the Accept button, " +
                "you are agreeing to be bound by these Terms and Conditions. Please review them carefully before giving acceptance. " +
                "This application (pCloudy Application) is owned and operated by pCloudy.com, whose registered office is at third floor, Nishvi Building, 2729, 16th Cross Rd, " +
                "PWD Quaters, 1st Sector, HSR Layout, Bengaluru, Karnataka 560102. We ,Our and Us refers to pCloudy.");

        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent x=new Intent(MainActivity.this, Register.class);
                startActivity(x);
            }
        });

        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,"It must accept the T&C for flight booking",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
