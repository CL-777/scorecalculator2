package com.example.scorecalculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView score1 =(TextView)findViewById(R.id.score1);
        final Button p3 = findViewById(R.id.p3);
        final Button p2 = findViewById(R.id.p2);
        final Button p1 = findViewById(R.id.p1);
        //final Button reset1 = findViewById(R.id.reset1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score1.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 1;
                score1.setText(""+a);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score1.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 2;
                score1.setText(""+a);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score1.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 3;
                score1.setText(""+a);
            }
        });
//        reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                score.setText(""+0);
//            }
//        });
        final TextView score2 =(TextView)findViewById(R.id.score1);
        final Button p6 = findViewById(R.id.p3);
        final Button p5 = findViewById(R.id.p2);
        final Button p4 = findViewById(R.id.p1);
        //final Button reset1 = findViewById(R.id.reset1);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score2.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 1;
                score2.setText(""+a);
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score2.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 2;
                score2.setText(""+a);
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=score2.getText().toString();
                Integer a = Integer.parseInt(str);
                a = a + 3;
                score2.setText(""+a);
            }
        });
//        reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                score.setText(""+0);
//            }
//        });

    }
}
