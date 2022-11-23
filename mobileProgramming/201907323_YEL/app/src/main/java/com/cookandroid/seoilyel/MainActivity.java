package com.cookandroid.seoilyel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2, edit3, edit4;
    Button btnTotal, btnAv, btnScore, btnHigh, btnRst;
    TextView textResult;
    String javaScore, mobileScore;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("201907323 이예은 성적");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        edit3 = (EditText) findViewById(R.id.Edit3);
        edit4 = (EditText) findViewById(R.id.Edit4);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnTotal = (Button) findViewById(R.id.BtnTotal);
        btnAv = (Button) findViewById(R.id.BtnAv);
        btnScore = (Button) findViewById(R.id.BtnScore);
        btnHigh = (Button) findViewById(R.id.BtnHigh);
        btnRst = (Button) findViewById(R.id.BtnRst);

        btnTotal.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                javaScore = edit1.getText().toString();
                mobileScore = edit2.getText().toString();
                result = Integer.parseInt(javaScore) + Integer.parseInt(mobileScore);
                textResult.setText("출력 = " + result.toString());
                return false;

            }
        });

        btnAv.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent arg1) {
                  javaScore = edit1.getText().toString();
                  mobileScore = edit2.getText().toString();
                  result = Integer.parseInt(javaScore) + Integer.parseInt(mobileScore);
                  Integer result2 = result / 3;
                  textResult.setText("출력 = " + result2.toString());
                  return false;

            }
        });

       btnScore.setOnTouchListener(new View.OnTouchListener() {
           public boolean onTouch(View arg0, MotionEvent arg1) {
               if (result >= 90) {
                   textResult.setText("출력 = A");
               } else if (result >= 80) {
                   textResult.setText("출력 = B");
               } else if (result >= 70) {
                   textResult.setText("출력 = C");
               } else {
                   textResult.setText("출력 = D");
               }
               return false;

       }
    });

       btnHigh.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View arg0, MotionEvent arg1) {
               Integer javaScore1 = Integer.parseInt(javaScore);
               Integer mobileScore1 = Integer.parseInt(mobileScore);
               if(javaScore1 > mobileScore1) {
                   textResult.setText("출력 = " + javaScore.toString());
               } else {
                   textResult.setText("출력 = " + mobileScore.toString());
               }
               return false;
           }
       });

       btnRst.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View view, MotionEvent motionEvent) {
               edit1.setText("");
               edit2.setText("");
               edit3.setText("");
               edit4.setText("");
               javaScore = "";
               mobileScore = "";
               result = 0;
               textResult.setText("");
               return false;
           }
       });

    }
}