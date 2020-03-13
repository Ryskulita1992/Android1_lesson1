package com.example.android1_lesson1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity {
    private String operation = "";
    private float num1 = 0, num2 = 0;
    private float result = 0;
    TextView textView;
    String saveString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.editText);
        if (savedInstanceState!= null)
        saveString = savedInstanceState.getString("saved_String");
        textView.setText(saveString);
        Log.d("savedString", "Null" + saveString );
    }




    public void onClick(View view) {
        switch (view.getId()) {
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
            case R.id.increment:
                textView.setText("-" + textView.getText());
                break;
            case R.id.minus:
                operation = "-";
                textView.append("-");
                break;
            case R.id.plus:
                operation = "+";
                textView.append("+");
                break;
            case R.id.multiply:
                operation = "*";
                textView.append("*");
                break;
            case R.id.divide:
                operation = "/";
                textView.append("/");
                break;
            case R.id.equals:
                if (textView.length()==0){
                    textView.setText(""); }
                else {
                String[] values = textView.getText().toString().split(Pattern.quote(operation));
                num1 = Integer.valueOf(values[0]);
                num2 = Integer.valueOf(values[1]);
                textView.append("=");
                equal();}
                break;
            case R.id.percent:
                operation = "%";
                textView.append("%");
                break;
            case R.id.AC:
                textView.setText("");
                break;
            case R.id.comma:
                if (textView.length()==0){
                textView.setText("");
            }else {
                textView.setText(",");
                break;}}}
    private void equal()
    { try {
            if (operation == "+") {
                result = num1 + num2;
            } else if (operation.equals("*") ) {
                result = num1 * num2;
            }else if(operation.equals(" * 0")){
                    result=0;
            } else if (operation.equals("-")) {
                result = num1 - num2;
            } else if (operation.equals("/")) {
                result = num1 / num2;
            }else if (operation.equals("/0")){
                result=0;
            }else if (operation.equals("*")) {
                result = num1 * num2;
            } else if (operation.equals("%")) {
                result = (num1 / 100) * num2; }
            textView.append(String.valueOf(result));
        } catch (Exception e) { e.printStackTrace(); } }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("start", "onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop", "onStop"); }
    @Override
    protected void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);
       //saveString=textView.getText().toString();
       outState.putString("saved_String", textView.getText().toString());
        Log.d("savedString", "Saved_Text" );
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("end", "onDestroy");
    }

    public void save(View view) {
        String brrr = textView.getText().toString();
        Intent save =new Intent();
        save.putExtra("Saved", brrr);
        setResult(RESULT_OK, save);
        finish();


    }
}