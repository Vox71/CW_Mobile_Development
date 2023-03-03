package ru.mirea.volkovma.control_lesson1;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCounter = 0;
    Button btn;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button_class);
        txv = (TextView) findViewById(R.id.editTextNumber);

        ImageView img= (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.da8d4607c370e841d63b7ace62a4222e);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCounter ++;
                txv.setText (Integer.toString(mCounter));
            }
        });
    }

    public void onButtonClick(View view) {


    }
}