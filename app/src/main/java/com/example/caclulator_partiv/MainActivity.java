package com.example.caclulator_partiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtInput;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnDot,btnPlus,btnMult,btnSub,btnDiv,btnSqrt,btnEqual;

    private String input1 = "0";
    private String input2 = "";
    private String operand = "+";
    private Boolean decimal = false;
    private Boolean equal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = (EditText) findViewById(R.id.txtInput);
        txtInput.addTextChangedListener(updateTextWatcher);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnSqrt = (Button) findViewById(R.id.btnSqrt);
        btnEqual = (Button) findViewById(R.id.btnEqual);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "1";
                    equal = false;
                }else {
                    input2 = input2 + '1';
                }
                txtInput.setText(input2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "2";
                    equal = false;
                }else {
                    input2 = input2 + '2';
                }
                txtInput.setText(input2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "3";
                    equal = false;
                }else {
                    input2 = input2 + '3';
                }
                txtInput.setText(input2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "4";
                    equal = false;
                }else {
                    input2 = input2 + '4';
                }
                txtInput.setText(input2);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "5";
                    equal = false;
                }else {
                    input2 = input2 + '5';
                }
                txtInput.setText(input2);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "6";
                    equal = false;
                }else {
                    input2 = input2 + '6';
                }
                txtInput.setText(input2);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "7";
                    equal = false;
                }else {
                    input2 = input2 + '7';
                }
                txtInput.setText(input2);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "8";
                    equal = false;
                }else {
                    input2 = input2 + '8';
                }
                txtInput.setText(input2);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "9";
                    equal = false;
                }else {
                    input2 = input2 + '9';
                }
                txtInput.setText(input2);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                    input2 = "0";
                    equal = false;
                }else {
                    input2 = input2 + '0';
                }
                txtInput.setText(input2);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(decimal==false) {
                    if(txtInput.getText().toString().equals("Cannot divide by 0") || equal==true){
                        input2 = "0.";
                        equal = false;
                    }else {
                        if(input2.equals("")){
                            input2 = "0.";
                        }else {
                            input2 = input2 + '.';
                        }
                    }
                    txtInput.setText(input2);
                    decimal = true;
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input2==""){
                    operand = "+";
                }else {
                    String output = calc(input1, input2, operand);
                    txtInput.setText(output);

                    if (output.equals("Cannot divide by 0")) {
                        input1 = "0";
                        operand = "+";
                    } else {
                        input1 = output;
                    }
                    input2 = "";
                    operand = "+";
                    decimal = false;
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input2 == "") {
                    operand = "*";
                } else {
                    String output = calc(input1, input2, operand);
                    txtInput.setText(output);
                    if (output.equals("Cannot divide by 0")) {
                        input1 = "0";
                        operand = "+";
                    } else {
                        input1 = output;
                        operand = "*";
                    }
                    input2 = "";
                    decimal = false;
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input2 == "") {
                    operand = "-";
                } else {
                    String output = calc(input1, input2, operand);
                    txtInput.setText(output);
                    if (output.equals("Cannot divide by 0")) {
                        input1 = "0";
                        operand = "+";
                    } else {
                        input1 = output;
                        operand = "-";
                    }
                    input2 = "";
                    decimal = false;
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input2 == "") {
                    operand = "\\";
                } else {
                    String output = calc(input1, input2, operand);
                    txtInput.setText(output);
                    if (output.equals("Cannot divide by 0")) {
                        input1 = "0";
                        operand = "+";
                    } else {
                        input1 = output;
                        operand = "\\";
                    }
                    input2 = "";
                    decimal = false;
                }
            }
        });
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String solution = Double.toString(Math.sqrt(Double.parseDouble(txtInput.getText().toString())));
                if(Double.parseDouble(txtInput.getText().toString()) < 0){
                    txtInput.setText("Can not SQRT negative values");
                }else {
                    txtInput.setText(solution);
                }
                input1 = "0";
                input2 = solution;
                operand = "+";
                decimal = false;
                equal = true;
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String output = calc(input1, input2, operand);
                txtInput.setText(output);
                input1 = "0";
                input2 = output;
                operand = "+";
                decimal = false;
                equal = true;
            }
        });

    }

    private TextWatcher updateTextWatcher = new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            input2 = s.toString();
        }
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void afterTextChanged(Editable s) {
        }
    };

    public String calc(String input1, String input2, String operand){
        if(operand.equals("\\") && input2.equals("0")){
            input1 = "0";
            input2 = "";
            operand = "+";
            decimal = false;
            return "Cannot divide by 0";
        }else {
            double solution = 0;

            switch (operand) {
                case "+":
                    solution = Double.parseDouble(input1) + Double.parseDouble(input2);
                    break;
                case "*":
                    solution = Double.parseDouble(input1) * Double.parseDouble(input2);
                    break;
                case "-":
                    solution = Double.parseDouble(input1) - Double.parseDouble(input2);
                    break;
                case "\\":
                    solution = Double.parseDouble(input1) / Double.parseDouble(input2);
                    break;
            }

            return Double.toString(solution);
        }
    }
}