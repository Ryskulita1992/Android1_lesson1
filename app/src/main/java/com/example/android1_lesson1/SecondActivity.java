package com.example.android1_lesson1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        result3 = findViewById(R.id.result2);

    }

    public void toCalculator(View view) {
        Intent intent=new Intent(SecondActivity.this,MainActivity.class);
        startActivityForResult(intent, 9 );
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==9 && resultCode==RESULT_OK){
            String result= data.getStringExtra("Saved");
            result3.setText(result);
        }

    }

    public void toTelegram(View view) {
        Intent appShare=new Intent();
        appShare.setAction(Intent.ACTION_SEND);
        appShare.putExtra(Intent.EXTRA_TEXT, "result3");
        appShare.setType("text/plain");
        if (appShare.resolveActivity(getPackageManager())!=null){
            startActivity(appShare);
        }

    }
}


