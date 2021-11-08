package com.example.mid_work3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        txv = findViewById(R.id.txv);
    }

    public void transfer(View v){
        double C =Double.parseDouble(editText.getText().toString());
        double F= C* 9 / 5 + 32;
        txv.setText(F+"度F");
    }
}

