package com.example.android1_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    String operation= "";
    float num1=0;
    float num2=0;
    float result=0;
    TextView textView;
    int [] numId=new int[]{R.id.one, R.id.two, R.id.three, R.id.four, R.id.five, R.id.six, R.id.seven, R.id.eight, R.id.nine, R.id.zero, R.id.one, R.id.one,};
    int [] actionsId=new int[]{
            R.id.percent,
            R.id.AC, R.id.comma, R.id.divide, R.id.minus, R.id.plus, R.id.equals, R.id.multiply, R.id.increment,};
    private Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text); }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.one:
                textView.append("1");
                break;
            case R.id.two:
                textView.append("2");
                break;
            case R.id.three:
                textView.append("3");
                break;
            case R.id.four:
                textView.append("4");
                break;
            case R.id.five:
                textView.append("5");
                break;
            case R.id.six:
                textView.append("6");
                break;


                case R.id.seven:
                textView.append("7");
                break;
            case R.id.eight:
                textView.append("8");
                break;
            case R.id.nine:
                textView.append("9");
                break;
            case R.id.zero:
                textView.append("0");
                break;
            case R.id. minus:
                textView.append("-");
                break;
            case R.id.plus:
                textView.append("+");
                break;
            case R.id.multiply:
                textView.append("*");
                break;
            case R.id.divide:
                textView.append("/");
                break;
            case R.id.equals:
                textView.append("=");




//                switch ()
//            case R.id.percent:
//                textView.append("%");
//                break;
//            case R.id.AC:
//                textView.clearComposingText();
//                break;
//            case R.id.comma:
//                textView.setText(",");
//                break;
//            case R.id. increment:
//                textView.append("+/-");
//                break; }
//        switch (view.getId()){
//            case R.id.plus:
//                operation= "+";
//                result=num1+num2;
//                textView.setText((int) result);
//                break;
//            case R.id.minus:
//                operation="-";
//                result=num1-num2;
//                break;
//            case R.id.divide:
//                operation= "/";
//                result=num1/num2;
//                break;
//            case R.id.multiply:
//                operation="*";
//                result=num1*num2;
//            case R.id.AC:
//                default:
//                    break;
      }
    }
}

