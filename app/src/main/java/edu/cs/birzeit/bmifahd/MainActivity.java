package edu.cs.birzeit.bmifahd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView w ;
    private TextView h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w = findViewById(R.id.w);
        h = findViewById(R.id.h);
    }

    public void click(View view) {
        String we = w.getText().toString();
        String he = h.getText().toString();
        double result = Double.parseDouble(we) / (Double.parseDouble(he) * Double.parseDouble(he));
        Toast.makeText(this, "BMI is : " + String.valueOf(result), Toast.LENGTH_LONG).show();
    }
}