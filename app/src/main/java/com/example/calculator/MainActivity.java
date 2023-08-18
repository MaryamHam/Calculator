package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    float x,y,z;
    String result;
    TextView txtResult;
    TextView txtSolution;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7,btn8, btn9, btn0,btnp, btndiv, btnmult, btnsub, btnadd, btnC,btnequ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult =findViewById(R.id.txtresult);
        txtSolution = findViewById(R.id.txtsolution);

        assignId(btn1, R.id.btn1);
        assignId(btn2, R.id.btn2);
        assignId(btn3, R.id.btn3);
        assignId(btn4, R.id.btn4);
        assignId(btn5, R.id.btn5);
        assignId(btn6, R.id.btn6);
        assignId(btn7, R.id.btn7);
        assignId(btn8, R.id.btn8);
        assignId(btn9, R.id.btn9);
        assignId(btn0, R.id.btn0);
        assignId(btndiv, R.id.btndiv);
        assignId(btnmult, R.id.btnmult);
        assignId(btnsub, R.id.btnsub);
        assignId(btnadd, R.id.btnadd);
        assignId(btnC, R.id.btnC);
        assignId(btnp, R.id.btnp);
        assignId(btnequ, R.id.btnequ);


//        btn1 = findViewById(R.id.btn1);
//        btn2 = findViewById(R.id.btn2);
//        btn3 = findViewById(R.id.btn3);
//        btn4 = findViewById(R.id.btn4);
//        btn5 = findViewById(R.id.btn5);
//        btn6 = findViewById(R.id.btn6);
//        btn7 = findViewById(R.id.btn7);
//        btn8 = findViewById(R.id.btn8);
//        btn9 = findViewById(R.id.btn9);
//        btn0 = findViewById(R.id.btn0);
//        btndiv = findViewById(R.id.btndiv);
//        btnmult = findViewById(R.id.btnmult);
//        btnsub = findViewById(R.id.btnsub);
//        btnadd = findViewById(R.id.btnadd);
//        btnC = findViewById(R.id.btnC);


    }


        void assignId(Button btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) v;
                String buttonText = button.getText().toString();
                String getData = txtSolution.getText().toString();

                result ="0";

                if(buttonText.equals("=")){
                    txtSolution.setText(txtResult.getText());
                    return;
                }
                if (buttonText.equals("C")){
                    getData = getData.substring(0, getData.length()-1);
                }else {
                    getData = getData + buttonText;

                    if (buttonText.equals("*")){
                       z = x * y;

                    } else if (buttonText.equals("/")) {
                        z = x / y;
                    }else if (buttonText.equals("+")) {
                        z = x + y;
                    }else if (buttonText.equals("-")) {
                        z = x - y;
                }

                }

                txtSolution.setText(getData);
            }
        });
        }



}