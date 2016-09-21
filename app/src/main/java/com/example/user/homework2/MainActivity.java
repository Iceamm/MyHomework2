package com.example.user.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.homework2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnt1 = (Button) findViewById(R.id.button_1);
        bnt1.setOnClickListener(this);

        Button bnt2 = (Button) findViewById(R.id.button_2);
        bnt2.setOnClickListener(this);

        Button bnt3 = (Button) findViewById(R.id.button_3);
        bnt3.setOnClickListener(this);

        Button bnt4 = (Button) findViewById(R.id.button_4);
        bnt4.setOnClickListener(this);

        Button bnt5 = (Button) findViewById(R.id.button_5);
        bnt5.setOnClickListener(this);

        Button bnt6 = (Button) findViewById(R.id.button_6);
        bnt6.setOnClickListener(this);

        Button bnt7 = (Button) findViewById(R.id.button_7);
        bnt7.setOnClickListener(this);

        Button bnt8 = (Button) findViewById(R.id.button_8);
        bnt8.setOnClickListener(this);

        Button bnt9 = (Button) findViewById(R.id.button_9);
        bnt9.setOnClickListener(this);

        Button bnt0 = (Button) findViewById(R.id.button_0);
        bnt0.setOnClickListener(this);

        Button bnt11 = (Button) findViewById(R.id.clear_button);
        bnt11.setOnClickListener(this);

    }
    String Num = "";

    @Override
    public void onClick(View v) {
        // Toast t = Toast.makeText(this,"  Hello ",Toast.LENGTH_LONG);
        // t.show();


        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        int id = v.getId();
        int test;

        if (id == R.id.button_1) {
            Num = Num+"1";
            tv.setText(Num);
        } else if (id == R.id.button_2) {
            Num = Num+"2";
            tv.setText(Num);
        } else if (id == R.id.button_3) {
            Num = Num+"3";
            tv.setText(Num);
        } else if (id == R.id.button_4) {
            Num = Num+"4";
            tv.setText(Num);
        } else if (id == R.id.button_5) {
            Num = Num+"5";
            tv.setText(Num);
        } else if (id == R.id.button_6) {
            Num = Num+"6";
            tv.setText(Num);
        } else if (id == R.id.button_7) {
            Num = Num+"7";
            tv.setText(Num);
        } else if (id == R.id.button_8) {
            Num = Num+"8";
            tv.setText(Num);
        } else if (id == R.id.button_9) {
            Num = Num+"9";
            tv.setText(Num);
        } else if (id == R.id.button_0) {
            Num = Num+"0";
            tv.setText(Num);
        } else if (id == R.id.clear_button) {
            Num = "";
            tv.setText(" ");
        }

    }
}
