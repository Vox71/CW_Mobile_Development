package ru.mirea.volkovma.typelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMirea;
    private Button btnChangeMireaText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMirea = findViewById(R.id.textViewMirea);
        btnChangeMireaText = findViewById(R.id.buttonChangeMireaText);

    }
}